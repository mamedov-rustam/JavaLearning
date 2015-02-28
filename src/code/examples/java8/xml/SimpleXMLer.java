package code.examples.java8.xml;

import java.lang.reflect.*;

/**
 * Created by Rustam on 28.02.2015.
 */
public interface SimpleXMLer {
    static StringBuilder toXML(Object obj) throws IllegalAccessException{
        StringBuilder builder = new StringBuilder();
        Class objClass = obj.getClass();

        builder.append("<object class='" + objClass.getName() + "'>\n");

        Field[] fields = objClass.getDeclaredFields();
        for (Field field : fields) {
            builder.append("\t<field>\n");

            int modifiers = field.getModifiers();
            builder.append("\t\t").append(getFilledPattern("modifiers", Modifier.toString(modifiers)).append("\n"));
            builder.append("\t\t").append(getFilledPattern("type", field.getType().getName())).append("\n");
            builder.append("\t\t").append(getFilledPattern("name", field.getName())).append("\n");
            field.setAccessible(true);
            builder.append("\t\t").append(getFilledPattern("value", String.valueOf(field.get(obj))).append("\n"));
            field.setAccessible(false);

            builder.append("\t</field>\n");
        }

        Method[] methods = objClass.getDeclaredMethods();
        for (Method method : methods) {
            builder.append("\t<method>\n");

            int modifiers = method.getModifiers();
            builder.append("\t\t").append(getFilledPattern("modifiers", Modifier.toString(modifiers)).append("\n"));
            builder.append("\t\t").append(getFilledPattern("returnType", method.getReturnType().getName()).append("\n"));
            builder.append("\t\t").append(getFilledPattern("name", method.getName()).append("\n"));
            int paramCount = method.getParameterCount();
            if (paramCount == 0)
                builder.append("\t\t").append(getFilledPattern("params", "non").append("\n"));
            else {
                builder.append("\t\t").append("<params>").append("\n");
                Parameter[] parameters = method.getParameters();
                for (Parameter parameter : parameters) {
                    builder.append("\t\t\t").append(getFilledPattern("param", parameter.getType().getName())).append("\n");
                }
                builder.append("\t\t").append("</params>").append("\n");
            }


            builder.append("\t</method>\n");
        }

        builder.append("</object>");
        return builder;
    }

    default StringBuilder toXML() throws IllegalAccessException{
        return toXML(this);
    }

    static StringBuilder getFilledPattern(String tagName, Object value){
        StringBuilder builder = new StringBuilder();

        builder.append("<" + tagName + ">");
        builder.append(value);
        builder.append("</" + tagName + ">");

        return builder;
    }
}
