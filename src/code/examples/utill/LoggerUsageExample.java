package code.examples.utill;

import java.util.logging.Logger;

/**
 * Created by Rustam Mamedov on 26.02.2015.
 */

// Link for more details: http://habrahabr.ru/post/130195/
public class LoggerUsageExample {
    public static void main(String[] args) {
        Browser.open(new WebPage("<h1>Hello world!</h1>", "h1{size : 101px}", "alert(\"I'm javascript function!\")"));
    }
}

class WebPage{
    private static Logger logger = Logger.getLogger(WebPage.class.getSimpleName());
    private String html;
    private String css;
    private String js;

    WebPage(String html, String css, String js) {
        logger.severe("WebPage is constructing");
        this.html = html;
        this.css = css;
        this.js = js;
        logger.severe("WebPage have been constructed");
    }

    public String getHtml() {
        return html;
    }

    public String getCss() {
        return css;
    }

    public String getJs() {
        return js;
    }
}

class Browser{
    private static Logger logger = Logger.getLogger(Browser.class.getSimpleName());

    public static boolean open(WebPage page){
        if (page.getHtml() == null) {
            logger.severe("can't open the WebPage!");
            return false;
        }
        logger.severe("WebPage was opened");
        return true;
    }
}
