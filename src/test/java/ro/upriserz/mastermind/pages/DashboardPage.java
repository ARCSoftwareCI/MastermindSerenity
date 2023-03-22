package ro.upriserz.mastermind.pages;



import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://mastermind.upriserz.ro/mastermind")
public class DashboardPage extends BasePage{

    @FindBy(css = ".pagination .page-number.active")
    private WebElementFacade searchPageVerification;

    public void verifySearchPage() {
        if (searchPageVerification.isDisplayed()) {
            System.out.println("Search page is displayed");
        } else {
            System.out.println("Search page is not displayed");
        }
    }


}
