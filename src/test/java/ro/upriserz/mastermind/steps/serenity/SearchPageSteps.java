package ro.upriserz.mastermind.steps.serenity;

import net.thucydides.core.annotations.Step;
import ro.upriserz.mastermind.pages.SearchPage;

public class SearchPageSteps extends BaseSteps {

    private SearchPage searchPage;

   @Step
    public void goToSearchPage(){
        searchPage.clickSearchButtonFromHomepage();
    }

    @Step
    public void enterTextInSearchFieldFromGroupsSearch(String searchText){
        searchPage.enterSearchText(searchText);
    }

    @Step
    public void goToSpecificSearchPage(int pageNumber){
        searchPage.clickOnSearchPageNumberYouWant(pageNumber);
        waitTime(1000);
    }

    @Step
    public void clickOnSearchPageNumberTwo(){
        searchPage.clickSearchPageNumberTwo();
    }

    @Step
    public void clickOnFreeGroupFilterButton(){
        searchPage.clickFreeGroupButtonSearch();
        waitTime(1000);
    }

    @Step
    public void clickOnPaidGroupFilterButton(){
        searchPage.clickPaidGroupButtonSearch();
        waitTime(1000);
    }

    @Step
    public void clickOnRomanianLanguageFilterButton(){
        searchPage.clickRomanianLanguageButtonSearch();
        waitTime(1000);
    }

    @Step
    public void clickOnEnglishLanguageFilterButton(){
        searchPage.clickEnglishLanguageButtonSearch();
        waitTime(1000);
    }

    @Step
    public void verifyIfFilterIsDisplayed(String filterText){
        searchPage.verifyFilterIsDisplayed(filterText);
        waitTime(1000);
    }
    @Step
    public void clickOnResetFiltersButton(){
        searchPage.clickResetFiltersButton();
    }

    @Step
    public void clickOnRemoveButtonsFromFiltersByFilterText(String filterText){
       searchPage.removeButtonFilterByText(filterText);
    }

    @Step
    public void goToLastSearchPage(){
        searchPage.clickOnGoToSearchPageLastPage();
    }

    @Step
    public void goToFirstSearchPage(){
        searchPage.clickOnGoToSearchPageFirstPage();
    }

    @Step
    public void clickOnGoBackOneSearchPageButton(){
        searchPage.clickOnGoBackOneSearchPage();
    }

    @Step
    public void clickOnGoForwardOneSearchPageButton(){
        searchPage.clickOnGoForwardOneSearchPage();
    }


}
