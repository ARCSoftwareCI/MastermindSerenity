package ro.upriserz.mastermind.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

//

import java.util.List;


public class GroupsPage extends BasePage{



    @FindBy (css = ".hidden.sticky a:nth-child(2)")
    private WebElementFacade groupsButton;

    @FindBy (css = ".flex.items-center .bg-ms-orange-500")
    private WebElementFacade newGroupButton;

    @FindBy (css = ".mb-6 .border")
    private WebElementFacade groupName;

    @FindBy (css = ".justify-evenly label:first-child")
    private WebElementFacade freeGroupButton;

    @FindBy (css = ".justify-evenly label:last-child")
    private WebElementFacade paidGroupButton;

    @FindBy (css = ".bg-ms-orange-500.h-11.rounded.text-white.w-full")
    private WebElementFacade createGroupButton;

    @FindBy (id = "description")
    private WebElementFacade descriptionTextField;

    @FindBy (id = "max-members")
    private WebElementFacade maxAttendeeField;

    @FindBy (id = "goals")
    private WebElementFacade goalsTextField;

    @FindBy (css = ".col-span-2 .w-full .relative .bg-white")
    private WebElementFacade groupFrequency;

    @FindBy (css = "div.w-full.lg\\:col-span-2 > div:nth-child(5) .w-full .w-full .relative .bg-white")
    private WebElementFacade groupTimeZone;

    @FindBy (css = "div.w-full.lg\\:col-span-2 > div:nth-child(6) .w-full .w-full .relative .bg-white")
    private WebElementFacade groupLanguage;

    @FindBy (css = "div.w-full.lg\\:col-span-2 > div:nth-child(8) .w-full .w-full .relative .bg-white")
    private WebElementFacade groupAccess;

    @FindBy (css = ".mb-10 .h-7")
    private WebElementFacade groupIsActive;

    @FindBy (css = ".mb-9 .bottom-2")
    private WebElementFacade groupCoverPhoto;

    @FindBy (css = " nav > a:nth-child(3)")
    private WebElementFacade unsplashGroup;

    @FindBy (css = " div.flex.rounded-sm.mb-4 > input")
    private WebElementFacade unsplashSearchTextField;

    @FindBy (css = "div.flex.rounded-sm.mb-4 > button")
    private WebElementFacade searchButtonUnsplash;

    @FindBy (css = " div > div:nth-child(2) > div.flex.flex-wrap")
    private List<WebElementFacade> unsplashSearchResult;

    @FindBy (css = " div.overflow-y-scroll.max-w-7xl.mx-auto.py-2.px-4.sm\\:px-6.lg\\:px-8.mt-2 > div > div:nth-child(2) > div.flex.flex-wrap > div:nth-child(1) > img")
    private WebElementFacade firstCoverPicture;

    @FindBy (css = "div.max-w-1200.mx-auto.overflow-clip.w-full > div > div:nth-child(3)  button.lg\\:order-1")
    private WebElementFacade cancelButton;

    @FindBy (css = "div.max-w-1200.mx-auto.overflow-clip.w-full > div > div:nth-child(3)  button.lg\\:order-2")
    private WebElementFacade saveChangesButton;

    @FindBy (css = "#erLxErYs4 > div")
    private WebElementFacade saveChangesMessage;

    @FindBy (css = ".mb-9 .text-xs span ")
    private WebElementFacade coverPhotoNecessaryText;

    @FindBy (css = " div.w-full.lg\\:col-span-2 > div:nth-child(2) > div > p span")
    private WebElementFacade descriptionNecessaryText;

    @FindBy (css = " div:nth-child(2) > span > div.bg-white.border.border-ms-gray-300.flex.items-center.h-11.px-3.py-3.rounded.w-full")
    private WebElementFacade startDate;

    @FindBy (css = " div.vc-pane-layout > div > div.vc-header.align-center > div")
    private WebElementFacade startDateSelectionText;

    @FindBy (css = ".vc-arrow.is-right")
    private WebElementFacade rightArrowStartDateSelection;

    @FindBy (css =".vc-arrow.is-left")
    private WebElementFacade leftArrowStartDateSelection;

    @FindBy (css = "vc-weeks")
    private List<WebElementFacade> dateOptions;

    @FindBy (css = ".lg\\:col-span-3.lg\\:mb-0 > div:nth-child(2) > p span")
    private WebElementFacade endDate;

    @FindBy (css = ".lg\\:col-span-2 > div:nth-child(4) > div > p span")
    private WebElementFacade goalsText;

    @FindBy (css = ".lg\\:col-span-2 > div:nth-child(7) > div > p span")
    private WebElementFacade maxAttendee;

    @FindBy (css = ".text-yellow-700 p")
    private WebElementFacade priceGroupVerificationText;

    @FindBy (css = "div:nth-child(3) > div> button.bg-ms-orange-500")
    private WebElementFacade saveChangeButtonFromGroupDetails;

    @FindBy (css = "div:nth-child(3) > div > .p-2")
    private WebElementFacade cancelButtonFromGroupDetails;

    @FindBy (css = "div:nth-child(4) > div> button.bg-ms-orange-500")
    private WebElementFacade saveChangeButtonFromGroupRules;

    @FindBy (css = "div:nth-child(4) > div > .p-2")
    private WebElementFacade cancelButtonFromGroupRules;

    @FindBy (css = "li:nth-child(1) > .px-5")
    private WebElementFacade groupDetailsColumn;

    @FindBy (css = "li:nth-child(2) > .px-5")
    private WebElementFacade groupRulesColumn;

    @FindBy (css = "li:nth-child(3) > .px-5")
    private WebElementFacade groupJoinRequestColumn;

    @FindBy (css = "li:nth-child(4) > .px-5")
    private WebElementFacade groupPriceColumn;

    @FindBy (css = "li:nth-child(5) > .px-5")
    private WebElementFacade groupLegalColumn;

    @FindBy (css = "li:nth-child(6) > .px-5")
    private WebElementFacade groupAdministratorsColumn;

    @FindBy (css = "li:nth-child(7) > .px-5")
    private WebElementFacade groupGamificationColumn;

    @FindBy (css = "div > div> div > div > div > div:nth-child(4) > .text-lg")
    private WebElementFacade groupRulesColumnVerificationText;

    @FindBy (css = "div > div> div > div > div > div:nth-child(5) > .text-lg")
    private WebElementFacade groupJoinRequestFieldColumnVerificationText;

    @FindBy (css = "div > div> div > div > div > div:nth-child(7) > .text-lg")
    private WebElementFacade groupLegalColumnVerificationText;

    @FindBy (css = "div > div> div > div > div > div:nth-child(8) > .text-lg")
    private WebElementFacade getGroupAdministratorsColumnVerificationText;

    @FindBy (css = "#app > div > div > div > div > div > div:nth-child(4) > button" )
    private WebElementFacade addNewRuleButton;

    @FindBy (css = ".mb-8.lg\\:mb-5 textarea")
    private WebElementFacade newLastRuleFieldText;

    @FindBy (css = ".mb-8.lg\\:mb-5 .lg\\:mx-3")
    private WebElementFacade deleteLastRuleButton;

    @FindBy (css = ".mb-8.lg\\:mb-5 .sorting-handle svg")
    private WebElementFacade sortingLastRulesButton;

    @FindBy (css =  "ul > li:nth-child(2) > div > .sorting-handle svg")
    private WebElementFacade secondRule;
//    private int n;
//    @FindBy (css = GroupsPage.getSelector(this.n))
//    private WebElementFacade deleteButtonFromWhichRuleNumberYouSay;
//
//    public GroupsPage(int n) {
//        this.n = n;
//    }
//    public static String getSelector(int n) {
//        return "ul > li:nth-child(" + n + ") > div > .lg\\:mx-3";
//    }
//    public void moveToDelete(int n){
//        String selector = "ul > li:nth-child(" + n + ") > div > .lg\\:mx-3";
//        WebElement element = find(selector);
//
//        withAction().moveToElement(element).click();
//    }

    public void sortingLastRules(){
        withAction().dragAndDrop(sortingLastRulesButton,secondRule).build().perform();
//        withAction().moveToElement(sortingLastRulesButton)
//                .clickAndHold(sortingLastRulesButton)
//                .moveToElement(secondRule).build();

    }

    public void clickGroupsButton(){
        clickOn(groupsButton);
    }

    public void clickNewGroupButton(){
        clickOn(newGroupButton);
    }

    public void setGroupName(String name){
        typeInto(groupName,name);
    }

    public void clickFreeGroup(){
        clickOn(freeGroupButton);
    }

    public void clickPaidGroup(){
        clickOn(paidGroupButton);
    }

    public void clickCreateGroup(){
        clickOn(createGroupButton);
    }

    public void selectFrequency(String frequencyName){
        selectFromDropdown(groupFrequency,frequencyName);
    }

    public void selectTimeZone(String timeZone){
        selectFromDropdown(groupTimeZone,timeZone);
    }

    public void selectLanguage(String language){
        selectFromDropdown(groupLanguage,language);
    }

    public void selectAccess(String access){
        selectFromDropdown(groupAccess,access);
    }

    public void clickActiveGroup(){
        clickOn(groupIsActive);
    }

    public void clickChangeCoverPhoto(){
        clickOn(groupCoverPhoto);
    }

    public void clickSelectFromUnsplash(){
        waitFor(unsplashGroup).click();
    }

    public void completeUnsplashTextField(String search){
        typeInto(unsplashSearchTextField,search);
    }

    public void selectFirstResultUnsplash(){
        unsplashSearchResult.get(0).isVisible();
        cliick();
    }

    private void cliick() {
        cliick();
    }

    public void selectFirstCoverGroupPicture(){
        clickOn(firstCoverPicture);
    }

    public void clickCancelButton(){
        clickOn(cancelButton);
    }

    public void clickOnSaveChangesButton(){
        clickOn(saveChangesButton);
    }

    public void saveChangesGood(){
        saveChangesMessage.containsElements("Group updated!");
    }

    public void saveChangesError(){
        saveChangesMessage.containsElements("Error!");

    }

    public void changeCoverPhotoText(){
        coverPhotoNecessaryText.shouldContainOnlyText("Cover photo is mandatory!");
    }

    public void descriptionNecessaryText(){
        descriptionNecessaryText.shouldContainOnlyText("Description is mandatory!");
    }

    public void startDateNecessaryText(){
        startDate.shouldContainOnlyText("Start is mandatory!");
    }

    public void endDateNecessaryText(){
        endDate.shouldContainOnlyText("End is mandatory!");
    }

    public void goalsNecessaryText(){
        goalsText.shouldContainOnlyText("Goal is mandatory!");
    }

    public void maxNecessaryNumberOfAttendee(){
        maxAttendee.shouldContainOnlyText("Max attendee members is mandatory!");
    }

    public boolean paidGroupVerification(){
       String price = priceGroupVerificationText.getText();
        if (price.equalsIgnoreCase("You can activate the group only after you set the price for it.")){
            return true;
        }
             return false;
    }

    public boolean freeGroupVerification(){
        if (priceGroupVerificationText.isVisible()){
            return true;
        }else{
            System.out.println("Element not found!\n" +
                    "This is a free group");
        }
        return false;
    }

    public void clickOnSearchButtonFromUnsplash(){
        searchButtonUnsplash.click();
    }


    public void selectStartDate(String monthAndYearText, int day){
        startDate.click();
        int counter=0;
        int limit=12;
        while(!startDateSelectionText.getText().contains(monthAndYearText) && counter < limit){
            rightArrowStartDateSelection.click();
            counter++;

        }
        for (WebElementFacade dateOption : dateOptions) {
            if (dateOption.getText().equals(String.valueOf(day))) {
                dateOption.click();
                break;
            }
        }
    }

    public void completeTheDescription(String text){
        typeInto(descriptionTextField, text);
    }

    public void completeNumberOfAttendee(String numberAttendee){
        typeInto(maxAttendeeField, numberAttendee);

    }

    public void completeGoalsField(String goals){
        typeInto(goalsTextField, goals);
    }

    public void clickSaveChangesFromGroupDetails(){
        saveChangeButtonFromGroupDetails.click();
    }

    public void clickCancelButtonFromGroupDetails(){
        cancelButtonFromGroupDetails.click();
    }

    public void clickGroupRules(){
        groupRulesColumn.click();
    }

    public void deleteLastRule(){
        deleteLastRuleButton.click();
//        withAction().moveToElement(deleteRuleButton).build();
        waitABit(1000);
        getAlert().accept();
    }

    public void clickAddNewRule(){
        addNewRuleButton.click();
    }

    public void completeLastRuleField(String text){
        typeInto(newLastRuleFieldText,text);
    }









}

