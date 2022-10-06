package Day_38_Inharatance_Overriding.Browser;

public class OperaBrowser extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("Opening Opera Browser ");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Opera Browser");
    }
}
