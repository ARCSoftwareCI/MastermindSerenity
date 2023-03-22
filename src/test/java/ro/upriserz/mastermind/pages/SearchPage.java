package ro.upriserz.mastermind.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SearchPage extends BasePage{


    @FindBy (css = "div > div > div > div > a:nth-child(5)")
    private WebElementFacade searchButtonFromHomepage;

    @FindBy (css = "#upriserz-instant-search .ais-Search")
    private WebElementFacade searchFieldFromGroupsSearch;

    @FindBy (css = ".mb-3 .flex:nth-child(1) .ais-checkbox")
    private WebElementFacade freeGroupButtonSearch;

    @FindBy (css = ".mb-3 .flex:nth-child(2) .ais-checkbox")
    private WebElementFacade paidGroupButtonSearch;

    @FindBy (css =".ais-RefinementList:nth-child(2) .flex:nth-child(1) .ais-checkbox")
    private WebElementFacade romanianLanguageButtonSearch;

    @FindBy (css =".ais-RefinementList:nth-child(2) .flex:nth-child(2) .ais-checkbox")
    private WebElementFacade englishLanguageButtonSearch;

    @FindBy (css = ".ais-CurrentRefinements span.bg-white")
    private List<WebElementFacade> filterElements;

    @FindBy (css = ".ais-ClearRefinements .block")
    private WebElementFacade resetFiltersButton;

    @FindBy (css = ".ais-CurrentRefinements .flex-shrink-0")
    private List<WebElementFacade> removeButtonsFromFilters;

    @FindBy (css = ".pagination .page-number.active")
    private WebElementFacade searchPageNumberVerification;

    @FindBy (css = ".pagination .page-number:nth-of-type(%d)")
    private WebElementFacade searchPageNumber;

    @FindBy (css = ".pagination .page-number:nth-of-type(1)")
    private WebElementFacade searchPageNumberOne;

    @FindBy (css = ".pagination .page-number:nth-of-type(2)")
    private WebElementFacade searchPageNumberTwo;

    @FindBy (css = ".pagination .page-number:nth-of-type(3)")
    private WebElementFacade searchPageNumberThree;

    @FindBy (css = ".pagination :last-child .bg-white")
    private WebElementFacade goToSearchPageLastPage;

    @FindBy (css = ".pagination :first-child .bg-white")
    private WebElementFacade goToSearchPageFirstPage;

    @FindBy (css = ".pagination :nth-child(2) .bg-white")
    private WebElementFacade goBackOneSearchPage;

    @FindBy (css = ".pagination :nth-last-child(2) .bg-white")
    private WebElementFacade goForwardOneSearchPage;

    public void clickSearchButtonFromHomepage() {
        searchButtonFromHomepage.click();
    }

    public void enterSearchText(String searchText) {
        searchFieldFromGroupsSearch.type(searchText);
    }

    public void clickFreeGroupButtonSearch() {
        freeGroupButtonSearch.click();
    }

    public void clickPaidGroupButtonSearch() {
        paidGroupButtonSearch.click();
    }

    public void clickRomanianLanguageButtonSearch() {
        romanianLanguageButtonSearch.click();
    }

    public void clickEnglishLanguageButtonSearch() {
        englishLanguageButtonSearch.click();
    }

    public boolean verifyFilterIsDisplayed(String filterText) {
        for (WebElementFacade filterElement : filterElements) {
            if (filterElement.getText().contains(filterText) && filterElement.isCurrentlyVisible()) {
                System.out.println("Filter is displayed.");
                return true;
            }
        }

        System.out.println("Filter not found or not displayed.");
        return false;
    }

    public void clickResetFiltersButton() {
        resetFiltersButton.click();
    }

//    public void closeFilterByText(String filterText) {
//        for (WebElementFacade filter : filterElements) {
//            if (filter.getText().contains(filterText)) {
//                WebElementFacade removeButton = filter.find(removeButton);
//                removeButton.click();
//                break;
//            }
//        }
//    }

    public void removeButtonFilterByText(String filterText) {
        List<WebElementFacade> filterElements = this.filterElements;
        for (int i = 0; i < filterElements.size(); i++) {
            if (filterElements.get(i).getText().contains(filterText)) {
                removeButtonsFromFilters.get(i).click();
                break;
            }
        }
    }

    public boolean clickOnSearchPageNumberYouWant(int pageNumber) {
        String pageSelector = String.format(".pagination .page-number:nth-of-type(%d)", pageNumber);
        find(By.cssSelector(pageSelector)).click();
        WebElementFacade activePageNumber = find(By.cssSelector(".pagination .page-number.active"));
        return  activePageNumber.getText().equals(String.valueOf(pageNumber));

    }

    public boolean clickSearchPageNumberTwo(){
        searchPageNumberTwo.click();
        if(searchPageNumberVerification.isDisplayed()){
            System.out.println("Page number is displayed");
            return true;
        }else{
            System.out.println("Page number is not displayed");
            return false;
        }
    }

    public boolean clickSearchPageNumberThree(){
        searchPageNumberThree.click();
        if(searchPageNumberVerification.isDisplayed()){
            System.out.println("Page number is displayed");
            return true;
        }else{
            System.out.println("Page number is not displayed");
            return false;
        }
    }

    public void clickOnGoToSearchPageLastPage(){
        goToSearchPageLastPage.click();
        if (goToSearchPageFirstPage.isDisplayed() && goBackOneSearchPage.isDisplayed() && !goForwardOneSearchPage.isVisible() && !goToSearchPageLastPage.isVisible()) {
            System.out.println("You are on the last page");
        } else {
            System.out.println("You are not on the last page");
        }
    }

    public void clickOnGoToSearchPageFirstPage(){
        goToSearchPageFirstPage.click();
        if (goToSearchPageLastPage.isDisplayed() && goForwardOneSearchPage.isDisplayed() && !goBackOneSearchPage.isVisible() && !goToSearchPageFirstPage.isVisible()) {
            System.out.println("You are on the first page");
        } else {
            System.out.println("You are not on the first page");
        }
    }



    public void clickOnGoBackOneSearchPage(){
        goBackOneSearchPage.click();
        if (goToSearchPageLastPage.isDisplayed() && goForwardOneSearchPage.isDisplayed() && goBackOneSearchPage.isDisplayed() && goToSearchPageFirstPage.isDisplayed()){
            System.out.println("You are not on the first page or on the last page");
        } else {
            System.out.println("You are on the first page or on the last page");
        }

    }

    public void clickOnGoForwardOneSearchPage(){
        goForwardOneSearchPage.click();
        if (goToSearchPageLastPage.isDisplayed() && goForwardOneSearchPage.isDisplayed() && goBackOneSearchPage.isDisplayed() && goToSearchPageFirstPage.isDisplayed()){
            System.out.println("You are not on the first page or on the last page");
        } else {
            System.out.println("You are on the first page or on the last page");
        }
    }

}
