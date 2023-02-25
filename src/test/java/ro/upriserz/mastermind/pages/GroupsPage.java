package ro.upriserz.mastermind.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import ro.upriserz.mastermind.Utilities.Constants;


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

    @FindBy (css = ".mb-12 > a")
    private WebElementFacade groupPreviewButton;

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

    @FindBy (css = ".mb-10 .h-7 .absolute")
    private WebElementFacade groupIsActiveText;

    @FindBy (css = ".mb-9 .bottom-2")
    private WebElementFacade groupCoverPhoto;

    @FindBy (css = ".inline-flex.sm\\:leading-5")
    private WebElementFacade closeButtonGroupPhoto;

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

    @FindBy (css = "#erLxErYs4 > div")
    private WebElementFacade saveChangesMessage;

    @FindBy (css = ".mb-9 .text-xs span ")
    private WebElementFacade coverPhotoNecessaryText;

    @FindBy (css = " div.w-full.lg\\:col-span-2 > div:nth-child(2) > div > p span")
    private WebElementFacade descriptionNecessaryText;

    @FindBy (css = "div:nth-child(1) > span > div.w-full")
    private WebElementFacade startDateDropdown;

    @FindBy (css = " div:nth-child(2) > span > div.w-full")
    private WebElementFacade endDateDropdown;

    @FindBy (css = " div.vc-pane-layout > div > div.vc-header.align-center > div")
    private WebElementFacade startDateSelectionText;

    @FindBy (css = ".vc-arrow.is-right")
    private WebElementFacade rightArrowStartDateSelection;

    @FindBy (css =".vc-arrow.is-left")
    private WebElementFacade leftArrowStartDateSelection;

    @FindBy (css = "vc-weeks")
    private List<WebElementFacade> dateOptions;

    @FindBy (css = ".lg\\:col-span-3 > div:nth-child(1) > p span")
    private WebElementFacade startDateNecessaryText;

    @FindBy (css = ".lg\\:col-span-3 > div:nth-child(2) > p span")
    private WebElementFacade endDateNecessaryText;

    @FindBy (css = ".lg\\:col-span-2 > div:nth-child(4)  > p span")
    private WebElementFacade goalsNecessaryText;

    @FindBy (css = ".lg\\:col-span-2 > div:nth-child(7)  > p span")
    private WebElementFacade maxAttendeeNecessaryText;

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
    private WebElementFacade groupDetailsColumnFromEditGroup;

    @FindBy (css = "li:nth-child(2) > .px-5")
    private WebElementFacade groupRulesColumnFromEditGroup;

    @FindBy (css = "li:nth-child(3) > .px-5")
    private WebElementFacade groupJoinRequestFieldsColumnFromEditGroup;

    @FindBy (css = "li:nth-child(4) > .px-5")
    private WebElementFacade groupPriceColumnFromEditGroup;

    @FindBy (css = "li:nth-child(5) > .px-5")
    private WebElementFacade groupLegalColumnFromEditGroup;

    @FindBy (css = "li:nth-child(6) > .px-5")
    private WebElementFacade groupAdministratorsColumnFromEditGroup;

    @FindBy (css = "li:nth-child(7) > .px-5")
    private WebElementFacade groupGamificationColumnFromEditGroup;

    @FindBy (css = "div > div> div > div > div > div:nth-child(4) > .text-lg")
    private WebElementFacade groupRulesColumnVerificationText;

    @FindBy (css = "div > div> div > div > div > div:nth-child(5) > .text-lg")
    private WebElementFacade groupJoinRequestFieldsColumnVerificationText;

    @FindBy (css = "div > div> div > div > div > div:nth-child(7) > .text-lg")
    private WebElementFacade groupLegalColumnVerificationText;

    @FindBy (css = "div > div> div > div > div > div:nth-child(8) > .text-lg")
    private WebElementFacade groupAdministratorsColumnVerificationText;

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

    @FindBy (id = "requirement")
    private WebElementFacade joinRequestRequirementField;

    @FindBy (css = "div > div:nth-child(5) > div > div > div> div > div > div > button" )
    private WebElementFacade joinRequestTypeDropdown;

    @FindBy (css = ".h-11 label:nth-child(1) .cursor-pointer")
    private WebElementFacade evaluationNumberRequirementsSmallerYes;

    @FindBy (css = ".h-11 label:nth-child(2) .cursor-pointer")
    private WebElementFacade evaluationNumberRequirementsBiggerNo;

    @FindBy (id = "points")
    private WebElementFacade joinRequestPoints;

    @FindBy (css = " :nth-child(5) >div > div > div > button > span.left-3")
    private WebElementFacade isRequiredVerificationText;

    @FindBy (css = " :nth-child(5) >div > div > div > button > span.transform")
    private WebElementFacade isRequiredSwitch;

    @FindBy (css = "li:nth-child(4) > div > div> div> :nth-child(1) .mb-4")
    private WebElementFacade joinRequestRequirementType;

    @FindBy (css = ".mt-6 button")
    private WebElementFacade createRequestButton;

    @FindBy (id = "price")
    private WebElementFacade priceField;

    @FindBy (css = "div:nth-child(6) > div > button")
    private WebElementFacade savePriceButton;

    @FindBy (id = "contract")
    private WebElementFacade contractField;

    @FindBy (css = "div:nth-child(7) > div:nth-child(3) > div > a")
    private WebElementFacade previewContractButton;

    @FindBy (id = "confidentiality_agreement")
    private WebElementFacade confidentialityAgreementField;

    @FindBy (css = "div:nth-child(7) > div:nth-child(4) > div > a")
    private WebElementFacade previewConfidentialityAgreementButton;

    @FindBy (id = "email")
    private WebElementFacade addUserAdministratorField;

    @FindBy (css = ".text-red-400.pt-1 span")
    private WebElementFacade emailAdministratorVerificationText;

    @FindBy (css = " div:nth-child(8) > div > button")
    private WebElementFacade addAdministratorButton;

    @FindBy (css = " div:nth-child(8) > div:nth-child(5) > div > div > div > button > svg")
    private WebElementFacade deleteAdministrator;

    @FindBy (css = "div:nth-child(9) > div:nth-child(1) > div > div:nth-child(1) > div > button > span.absolute")
    private WebElementFacade gamificationOneSwitchText;

    @FindBy (css = " div:nth-child(9) > div:nth-child(1) > div > div:nth-child(1) > div > button .pointer-events-none")
    private WebElementFacade gamificationOneSwitch;

    @FindBy (css = " div:nth-child(9) > div:nth-child(2) > div > div > button > span.absolute")
    private WebElementFacade gamificationTwoSwitchText;

    @FindBy (css = " div:nth-child(9) > div:nth-child(2) > div > div > button .pointer-events-none")
    private WebElementFacade gamificationTwoSwitch;

    @FindBy (css = "div:nth-child(9) > div:nth-child(2) #points")
    private WebElementFacade gamificationTwoPointsField;

    @FindBy (css = " div:nth-child(9) > div:nth-child(3) > div > div > button > span.absolute")
    private WebElementFacade gamificationThreeSwitchText;

    @FindBy (css = " div:nth-child(9) > div:nth-child(3) > div > div > button .pointer-events-none")
    private WebElementFacade gamificationThreeSwitch;

    @FindBy (css = "div:nth-child(9) > div:nth-child(3) #points")
    private WebElementFacade gamificationThreePointsField;

    @FindBy (css = " div:nth-child(9) > div:nth-child(4) > div > div > button > span.absolute")
    private WebElementFacade gamificationFourSwitchText;

    @FindBy (css = " div:nth-child(9) > div:nth-child(4) > div > div > button .pointer-events-none")
    private WebElementFacade gamificationFourSwitch;

    @FindBy (css = "div:nth-child(9) > div:nth-child(4) #points")
    private WebElementFacade gamificationFourPointsField;

    @FindBy (css = " div:nth-child(9) > div:nth-child(5) > div > div > button > span.absolute")
    private WebElementFacade gamificationFiveSwitchText;

    @FindBy (css = " div:nth-child(9) > div:nth-child(5) > div > div > button .pointer-events-none")
    private WebElementFacade gamificationFiveSwitch;

    @FindBy (css = "div:nth-child(9) > div:nth-child(5) #points")
    private WebElementFacade gamificationFivePointsField;

    @FindBy (css = " div:nth-child(9) > div:nth-child(6) > div > div > button > span.absolute")
    private WebElementFacade gamificationSixSwitchText;

    @FindBy (css = " div:nth-child(9) > div:nth-child(6) > div > div > button .pointer-events-none")
    private WebElementFacade gamificationSixSwitch;

    @FindBy (css = "div:nth-child(9) > div:nth-child(6) #points")
    private WebElementFacade gamificationSixPointsField;

    @FindBy (css = " div:nth-child(9) > div:nth-child(7) > div > div > button > span.absolute")
    private WebElementFacade gamificationSevenSwitchText;

    @FindBy (css = " div:nth-child(9) > div:nth-child(7) > div > div > button .pointer-events-none")
    private WebElementFacade gamificationSevenSwitch;

    @FindBy (css = "div:nth-child(9) > div:nth-child(7) #points")
    private WebElementFacade gamificationSevenPointsField;

    @FindBy (css = ".h-11.mr-0")
    private WebElementFacade applyGamificationButton;


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

    public void clickOnPreviewTheGroup(){
        groupPreviewButton.click();
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

    public boolean verifyIfGroupIsActive(){
        if (groupIsActive.getText().equals("Off")){
            return false;
        }
        return true;
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
        unsplashSearchResult.get(0).click();

    }

    public void selectFirstCoverGroupPicture(){
        clickOn(firstCoverPicture);
    }

    public void clickCloseButtonFromGroupPhoto(){
        clickOn(closeButtonGroupPhoto);
    }

    public void saveChangesGood(){
        saveChangesMessage.containsElements("Group updated!");
    }

    public void saveChangesError(){
        saveChangesMessage.containsElements("Error!");

    }

    public void clickOnStartDateDropdown(){
        startDateDropdown.click();
    }

    public void clickOnEndDateDropdown(){
        endDateDropdown.click();
    }

    public void changeCoverPhotoNecessaryText(){
        coverPhotoNecessaryText.shouldContainOnlyText("Cover photo is mandatory!");
    }

    public void descriptionNecessaryText(){
        descriptionNecessaryText.shouldContainOnlyText("Description is mandatory!");
    }

    public void startDateNecessaryText(){
        startDateNecessaryText.shouldContainOnlyText("Start is mandatory!");
    }

    public void endDateNecessaryText(){
        endDateNecessaryText.shouldContainOnlyText("End is mandatory!");
    }

    public void goalsNecessaryText(){
        goalsNecessaryText.shouldContainOnlyText("Goal is mandatory!");
    }

    public void maxNumberOfAttendeeNecessaryText(){
        maxAttendeeNecessaryText.shouldContainOnlyText("Max attendee members is mandatory!");
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

    public void deleteLastRule(){
        deleteLastRuleButton.click();
        waitABit(1000);
        getAlert().accept();
    }

    public void goToGroupRulesFromDetailsGroup(){
        groupRulesColumnFromEditGroup.click();
    }

    public void clickAddNewRule(){
        addNewRuleButton.click();
    }

    public void completeLastRuleField(String text){
        typeInto(newLastRuleFieldText,text);
    }

    public void clickSaveButtonFromGroupRules(){
        saveChangeButtonFromGroupRules.click();
    }

    public void clickCancelButtonFromGroupRules(){
        cancelButtonFromGroupRules.click();
    }

    public void goToGroupDetailsFromEditingGroup(){
        groupDetailsColumnFromEditGroup.click();
    }

    public void goToGroupJoinRequestFromEditingGroup(){
        groupJoinRequestFieldsColumnFromEditGroup.click();
    }

    public void goToGroupPriceColumnFromEditGroup(){
        groupPriceColumnFromEditGroup.click();
    }

    public void goToGroupLegalColumnFromEditGroup(){
        groupLegalColumnFromEditGroup.click();
    }

    public void goToGroupAdministratorsColumnFromEditGroup(){
        groupAdministratorsColumnFromEditGroup.click();
    }

    public void goToGroupGamificationColumnFromEditGroup(){
        groupGamificationColumnFromEditGroup.click();
    }

    public void verifyGroupRulesColumn(){
        groupRulesColumnVerificationText.shouldContainOnlyText("Group rules");
    }

    public void verifyJoinRequestColumn(){
        groupJoinRequestFieldsColumnVerificationText.shouldContainOnlyText("Define requests");
    }

    public void verifyLegalColumn(){
        groupLegalColumnVerificationText.shouldContainOnlyText("Legal");
    }

    public void verifyAdministratorsColumn(){
        groupAdministratorsColumnVerificationText.shouldContainOnlyText("Group administrators");
    }



    public void selectTypeOfJoinRequest(String text){
        selectFromDropdown(joinRequestTypeDropdown,text);
    }

    public void completeJoinRequestRequirementField(String text){
        typeInto(joinRequestRequirementField,text);
    }

    public void completePointsOfRequest(double points){
        typeInto(joinRequestPoints, String.valueOf(points));
    }

//    public void isRequiredYesText(){
//        isRequiredVerificationText.shouldContainOnlyText("Yes");
//    }
//
//    public void isRequiredNoText(){
//        isRequiredVerificationText.shouldContainOnlyText("No");
//    }

    public boolean clickOnIsRequiredSwitch() {
        String text = isRequiredVerificationText.getText();
        if (!text.equals("Yes")) {
            isRequiredSwitch.click();
        }
        return true;
    }


    public void clickOnEvaluationSmallerAndYes(){
        evaluationNumberRequirementsSmallerYes.click();
    }

    public void clickOnEvaluationBiggerAndNo(){
        evaluationNumberRequirementsBiggerNo.click();
    }

    public void clickCreateRequest(){
        createRequestButton.click();
    }

    public void completePriceField(double price){
        typeInto(priceField, String.valueOf(price));
    }

    public void clickOnSavePrice(){
        savePriceButton.click();
    }

    public void completeContractField(String contractText){
        typeInto(contractField, contractText);
    }

    public void clickPreviewContract(){
        clickOn(previewContractButton);
    }

    public void completeConfidentialityAgreementField(String confidentialityAgreement){
        typeInto(confidentialityAgreementField,confidentialityAgreement);
    }

    public void clickPreviewConfidentialityAgreement(){
        clickOn(previewConfidentialityAgreementButton);
    }


    public void completeAddUserAdministratorField(String administratorEmail){
        typeInto(addUserAdministratorField, administratorEmail);
    }

    public void clickAddUserAdministrator(){
        addAdministratorButton.click();
    }

    public void addAnAdministrator(String administratorEmail){
        completeAddUserAdministratorField(administratorEmail);
        clickAddUserAdministrator();
    }
    public void verifyWrongEmailUserAdministrator(){
        emailAdministratorVerificationText.shouldContainOnlyText(" User not found!");
    }

    public void verifyAddedUserAdministrator(){
        emailAdministratorVerificationText.shouldContainOnlyText("User is already a member of this group!" );
    }

    public void clickDeleteAdministrator(){
        deleteAdministrator.click();
        getAlert().accept();
    }

    public void addAndDeleteAdministrator(String administratorEmail, int numberOfTimes) {
        for (int i = 1; i <= numberOfTimes; i++) {
            addAnAdministrator(administratorEmail);
            clickDeleteAdministrator();
        }
    }


    public void clickOnGamificationOneSwitch(){
        gamificationOneSwitch.click();
    }

    public boolean gamificationOneYesNoSwitchText(){
        String text = gamificationOneSwitchText.getText();
        if (text.equals("Off")){
            return false;
        }else {
            return true;
        }
    }

    public void clickOnGamificationTwoSwitch(){
        gamificationTwoSwitch.click();
    }

    public boolean gamificationTwoYesNoSwitchText(){
        String text = gamificationTwoSwitchText.getText();
        if (text.equals("Off")){
            return false;
        }else {
            return true;
        }
    }

    public void completeGamificationTwoPointsField(double points){
        typeInto(gamificationTwoPointsField, String.valueOf(points));
    }

    public void clickOnGamificationThreeSwitch(){
        gamificationThreeSwitch.click();
    }

    public boolean gamificationThreeYesNoSwitchText(){
        String text = gamificationThreeSwitchText.getText();
        if (text.equals("Off")){
            return false;
        }else {
            return true;
        }
    }

    public void completeGamificationThreePointsField(double points){
        typeInto(gamificationThreePointsField, String.valueOf(points));
    }

    public void clickOnGamificationFourSwitch(){
        gamificationFourSwitch.click();
    }

    public boolean gamificationFourYesNoSwitchText(){
        String text = gamificationFourSwitchText.getText();
        if (text.equals("Off")){
            return false;
        }else {
            return true;
        }
    }

    public void completeGamificationFourPointsField(double points){
        typeInto(gamificationFourPointsField, String.valueOf(points));
    }


    public void clickOnGamificationFiveSwitch(){
        gamificationFiveSwitch.click();
    }

    public boolean gamificationFiveYesNoSwitchText(){
        String text = gamificationFiveSwitchText.getText();
        if (text.equals("Off")){
            return false;
        }else {
            return true;
        }
    }

    public void completeGamificationFivePointsField(double points){
        typeInto(gamificationFivePointsField, String.valueOf(points));
    }


    public void clickOnGamificationSixSwitch(){
        gamificationSixSwitch.click();
    }

    public boolean gamificationSixYesNoSwitchText(){
        String text = gamificationSixSwitchText.getText();
        if (text.equals("Off")){
            return false;
        }else {
            return true;
        }
    }

    public void completeGamificationSixPointsField(double points){
        typeInto(gamificationSixPointsField, String.valueOf(points));
    }

    public void clickOnGamificationSevenSwitch(){
        gamificationSevenSwitch.click();
    }

    public boolean gamificationSevenYesNoSwitchText(){
        String text = gamificationSevenSwitchText.getText();
        if (text.equals("Off")){
            return false;
        }else {
            return true;
        }
    }

    public void completeGamificationSevenPointsField(double points){
        typeInto(gamificationSevenPointsField, String.valueOf(points));
    }


    public void clickOnApplyGamificationButton(){
        applyGamificationButton.click();
    }




}

