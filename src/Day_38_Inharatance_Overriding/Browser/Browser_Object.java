package Day_38_Inharatance_Overriding.Browser;

public class Browser_Object {

    public static void main(String[] args) {

        ChromeBrowser chrome = new ChromeBrowser();
        FirefoxBrowser firefox = new FirefoxBrowser();
        OperaBrowser opera = new OperaBrowser();
        SafariBrowser safari = new SafariBrowser();

        chrome.openBrowser();
        firefox.openBrowser();
        opera.openBrowser();
        safari.openBrowser();

        System.out.println("---------------------------------");

        chrome.closeBrowser();
        firefox.closeBrowser();
        opera.closeBrowser();
        safari.closeBrowser();

        System.out.println("-----------------------------------");
    }
}
