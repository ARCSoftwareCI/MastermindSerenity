package ro.upriserz.mastermind.features.search;

import org.junit.Test;
import ro.upriserz.mastermind.Utilities.Constants;

public class SearchPageTest extends BaseTests {

    @Test
    public void testSearchPage() {
        loginSteps.doLogin(Constants.TESTING_EMAIL,Constants.TESTING_PASSWORD);
        baseSteps.openMastermind();
        searchPageSteps.goToSearchPage();
        searchPageSteps.goToLastSearchPage();
        searchPageSteps.goToFirstSearchPage();
        searchPageSteps.clickOnGoForwardOneSearchPageButton();
        searchPageSteps.goToLastSearchPage();
        searchPageSteps.clickOnGoBackOneSearchPageButton();
    }

    @Test
    public void verifyFilers() {
        loginSteps.doLogin(Constants.TESTING_EMAIL,Constants.TESTING_PASSWORD);
        baseSteps.openMastermind();
        searchPageSteps.goToSearchPage();
        searchPageSteps.clickOnEnglishLanguageFilterButton();
        searchPageSteps.clickOnRomanianLanguageFilterButton();
        searchPageSteps.clickOnFreeGroupFilterButton();
        searchPageSteps.clickOnPaidGroupFilterButton();
        searchPageSteps.verifyIfFilterIsDisplayed("Paid");



    }







}
