package Day_38_Inharatance_Overriding.Browser;

public class SafariBrowser extends Browser {

    @Override
    public void openBrowser() {
        System.out.println("Opening Safari Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Safari Browser");
    }
}
