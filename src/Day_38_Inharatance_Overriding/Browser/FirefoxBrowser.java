package Day_38_Inharatance_Overriding.Browser;

public class FirefoxBrowser extends  Browser{

    @Override
    public void openBrowser() {
        System.out.println("Opening Firefox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox Browser");
    }
}
