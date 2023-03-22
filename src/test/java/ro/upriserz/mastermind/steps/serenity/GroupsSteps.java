package ro.upriserz.mastermind.steps.serenity;

import net.thucydides.core.annotations.Step;
import ro.upriserz.mastermind.pages.BasePage;
import ro.upriserz.mastermind.pages.DashboardPage;
import ro.upriserz.mastermind.pages.GroupsPage;
import ro.upriserz.mastermind.pages.LoginPage;

public class GroupsSteps extends BaseSteps{

    private BasePage basePage;
    private DashboardPage dashboard;
    private LoginPage loginPage;
    private LoginSteps loginSteps;
    private GroupsPage groupsPage;

    @Step
    public void clickOnGroups(){
        groupsPage.clickGroupsButton();
    }

    @Step
    public void clickOnNewGroupButton(){
        groupsPage.clickNewGroupButton();
    }

    @Step
    public void setNewGroupName(String name){
        groupsPage.setGroupName(name);
    }

    @Step
    public void clickFreeGroup(){
        groupsPage.clickFreeGroup();
    }

    @Step
    public void clickPaidGroup(){
        groupsPage.clickPaidGroup();
    }

    @Step
    public void clickCreateGroupButton(){
        groupsPage.clickCreateGroup();
    }

    @Step
    public void freeGroupCreate(String name){
        clickOnNewGroupButton();
        setNewGroupName(name);
        clickFreeGroup();
        clickCreateGroupButton();
    }

    @Step
    public void paidGroupCreate(String name) {
        clickOnNewGroupButton();
        setNewGroupName(name);
        clickPaidGroup();
        clickCreateGroupButton();
    }



    @Step
    public void verifyIfAnGroupIsActive(){
        groupsPage.verifyIfGroupIsActive();
    }

    @Step
    public void selectGroupFrequency(String frequency){
        groupsPage.selectFrequency(frequency);
    }

    @Step
    public void selectGroupDailyFrequency(){
        groupsPage.selectFrequency("Daily");
    }

    @Step
    public void selectGroupWeeklyFrequency(){
        groupsPage.selectFrequency("Weekly");
    }

    @Step
    public void selectGroupBiWeeklyFrequency(){
        groupsPage.selectFrequency("BiWeekly");
    }

    @Step
    public void selectGroupMonthlyFrequency(){
        groupsPage.selectFrequency("Monthly");
    }

    @Step
    public void selectGroupBiMonthlyFrequency(){
        groupsPage.selectFrequency("BiMonthly");
    }

    @Step
    public void selectGroupYearlyFrequency(){
        groupsPage.selectFrequency("Yearly");
    }

    @Step
    public void selectGroupTimeZone(String timeZone){
        groupsPage.selectTimeZone(timeZone);
    }

    @Step
    public void selectGroupLanguage(String language){
        groupsPage.selectLanguage(language);
    }

    @Step
    public void selectGroupRomanianLanguage(){
        groupsPage.selectLanguage("Romanian");
    }

    @Step
    public void selectGroupEnglishLanguage(){
        groupsPage.selectLanguage("English");
    }

    @Step
    public void selectGroupAccess(String access){
        groupsPage.selectAccess(access);
    }

    @Step
    public void selectGroupPrivateAccess(){
        groupsPage.selectAccess("Private");
    }

    @Step
    public void selectGroupPublicAccess(){
        groupsPage.selectAccess("Public");
    }

    @Step
    public void switchGroupActive(){
        groupsPage.clickActiveGroup();
    }

    @Step
    public void clickOnChangeCoverPhoto(){
        groupsPage.clickChangeCoverPhoto();
    }

    @Step
    public void selectTheFirstPhotoFromMediaItemsCoverPhoto(){
        groupsPage.selectFirstPhotoFromMediaItemsCoverPhoto();
    }

    @Step
    public void selectFromUnsplash(){
        groupsPage.clickSelectFromUnsplash();
    }

    @Step
    public void inputUnsplashTextField(String search){
        groupsPage.completeUnsplashTextField(search);
    }

    @Step
    public void clickSearchButtonFromUnsplash(){
        groupsPage.clickOnSearchButtonFromUnsplash();
    }
    @Step
    public void selectFirstResultFromUnsplashSearch(){
        groupsPage.selectFirstResultUnsplash();
    }

    @Step
    public void selectFirstCoverPhotoGroup(){
        groupsPage.selectFirstCoverGroupPicture();
    }

    @Step
    public void clickOnCloseButtonFromChangeCoverPhoto(){
        groupsPage.clickCloseButtonFromGroupPhoto();
    }

    @Step
    public void saveChangesGoodMessage(){
        groupsPage.saveChangesGood();
    }

    @Step
    public void saveChangesErrorMessage(){
        groupsPage.saveChangesError();
    }

    @Step
    public void noPhotoCoverText(){
        groupsPage.changeCoverPhotoNecessaryText();
    }

    @Step
    public void emptyDescriptionText(){
        groupsPage.descriptionNecessaryText();
    }

    @Step
    public void emptyStartDateText(){
        groupsPage.startDateNecessaryText();
    }

    @Step
    public void emptyEndDateText(){
        groupsPage.endDateNecessaryText();
    }

    @Step
    public void emptyGoalsText(){
        groupsPage.goalsNecessaryText();
    }

    @Step
    public void emptyMaxAttendeeText(){
        groupsPage.maxNumberOfAttendeeNecessaryText();
    }

    @Step
    public void verifyPaidGroupText(){
        groupsPage.paidGroupVerification();
    }

    @Step
    public void verifyFreeGroupText(){
        groupsPage.freeGroupVerification();
    }

    @Step
    public void verifyEmptyFieldsGroupDetails() {
        noPhotoCoverText();
        emptyDescriptionText();
        emptyStartDateText();
        emptyEndDateText();
        emptyGoalsText();
        emptyMaxAttendeeText();
    }

    @Step
    public void clickOnTheStartDateDropdown(){
        groupsPage.clickOnStartDateDropdown();
    }

    @Step
    public void selectStartDate(int day){
        clickOnTheStartDateDropdown();
        groupsPage.selectStartDay(day);
    }
    @Step
    public void clickOnTheEndDateDropdown(){
        groupsPage.clickOnEndDateDropdown();
    }

    @Step
    public void selectEndDate(int day){
        clickOnTheEndDateDropdown();
        groupsPage.selectEndDay(day);
    }

    @Step
    public void completeTheDescriptionField(String description){
        groupsPage.completeTheDescription(description);
    }

    @Step
    public void completeTheNumberOfAttendees(double maxAttendee){
        groupsPage.completeNumberOfAttendee(maxAttendee);
    }

    @Step
    public void completeTheGoalsField(String goals){
        groupsPage.completeGoalsField(goals);
    }

    @Step
    public void clickOnSaveChangesButtonFromGroupDetails(){
        groupsPage.clickSaveChangesFromGroupDetails();
    }

    @Step
    public void clickOnCancelButtonFromGroupDetails(){
        groupsPage.clickCancelButtonFromGroupDetails();
    }

   @Step
   public void moveRuleElement(){
        groupsPage.sortingLastRules();
   }

    @Step
    public void clickPreviewTheGroup(){
        groupsPage.clickOnPreviewTheGroup();
    }

    @Step
    public void verifyPreviewTheGroup(String groupName){
        groupsPage.groupNameFromPreview(groupName);
    }

    @Step
    public void clickOnRuleColumnFromGroupDetails(){
        groupsPage.goToGroupRulesFromDetailsGroup();
    }

    @Step
    public void clickOnAddNewRuleButton(){
        groupsPage.clickAddNewRule();
    }

    @Step
    public void completeTheLastRuleField(String text){
        groupsPage.completeLastRuleField(text);
    }

    @Step
    public void deleteLastRule(){
        groupsPage.deleteLastRule();
    }

    @Step
    public void clickOnSaveChangesButtonFromGroupRules(){
        groupsPage.clickSaveButtonFromGroupRules();
    }

    @Step
    public void clickOnCancelButtonFromGroupRules(){
        groupsPage.clickCancelButtonFromGroupRules();
    }

    @Step
    public void clickOnGroupDetailsFromEditingGroup(){
        groupsPage.goToGroupDetailsFromEditingGroup();
    }

    @Step
    public void clickOnJoinRequestColumnFromGroupDetails(){
        groupsPage.goToGroupJoinRequestFromEditingGroup();
    }

    @Step
    public void clickOnPriceColumnFromGroupDetails(){
        groupsPage.goToGroupPriceColumnFromEditGroup();
    }

    @Step
    public void clickOnLegalColumnFromGroupDetails(){
        groupsPage.goToGroupLegalColumnFromEditGroup();
    }

    @Step
    public void clickOnAdministratorsColumnFromGroupDetails(){
        groupsPage.goToGroupAdministratorsColumnFromEditGroup();
    }

    @Step
    public void clickOnGamificationColumnFromGroupDetails(){
        groupsPage.goToGroupGamificationColumnFromEditGroup();
    }

    @Step
    public void verifyGroupRulesColumn(){
        groupsPage.verifyGroupRulesColumn();
    }

    @Step
    public void verifyJoinRequestColumn(){
        groupsPage.verifyJoinRequestColumn();
    }

    @Step
    public void verifyLegalColumn(){
        groupsPage.verifyLegalColumn();
    }

    @Step
    public void verifyAdministratorsColumn(){
        groupsPage.verifyAdministratorsColumn();
    }

    @Step
    public void selectTheTypeOfJoinRequest(String typeOfJoinRequest){
        groupsPage.selectTypeOfJoinRequest(typeOfJoinRequest);
    }

    @Step
    public void completeTheJoinRequestRequirementsField(String joinRequest){
        groupsPage.completeJoinRequestRequirementField(joinRequest);

    }

    @Step
    public void completePointsRequestField(double requirementsPoints){
        groupsPage.completePointsOfRequest(requirementsPoints);
    }

    @Step
    public void clickOnIsRequiredSwitchButton(){
        groupsPage.clickOnIsRequiredSwitch();
    }

    @Step
    public void clickOnEvaluationSmallerAndYesButton(){
        groupsPage.clickOnEvaluationSmallerAndYes();
    }

    @Step
    public void clickOnEvaluationBiggerAndNoButton(){
        groupsPage.clickOnEvaluationBiggerAndNo();
    }

    @Step
    public void clickOnCreateJoinRequest(){
        groupsPage.clickCreateJoinRequest();
    }

    @Step
    public void completeThePriceField(double price){
        groupsPage.completePriceField(price);
    }

    @Step
    public void clickSavePrice(){
        groupsPage.clickOnSavePrice();
    }

    @Step
    public void completeTheContractField(String contractText){
        groupsPage.completeContractField(contractText);
    }

    @Step
    public void clickOnPreviewContract(){
        groupsPage.clickPreviewContract();
    }

    @Step
    public void completeConfidentialityAgreementField(String confidentialityAgreementText){
        groupsPage.completeConfidentialityAgreementField(confidentialityAgreementText);
    }

    @Step
    public void clickOnPreviewConfidentialityAgreement(){
        groupsPage.clickPreviewConfidentialityAgreement();
    }

    @Step
    public void verifyWrongEmailUserAdministrator(){
        groupsPage.verifyWrongEmailUserAdministrator();
    }

    @Step
    public void verifyAddedUserAdministrator(){
        groupsPage.verifyAddedUserAdministrator();
    }

    @Step
    public void addAndDeleteAdministrator(String administratorEmail, int numberOfTimes){
        groupsPage.addAndDeleteAdministrator(administratorEmail, numberOfTimes);
    }

    @Step
    public void clickOnGamificationOneSwitchButton(){
        groupsPage.clickOnGamificationOneSwitch();
    }

    @Step
    public void clickOnGamificationTwoSwitchButton(){
        groupsPage.clickOnGamificationTwoSwitch();
    }

    @Step
    public void clickOnGamificationThreeSwitchButton(){
        groupsPage.clickOnGamificationThreeSwitch();
    }

    @Step
    public void clickOnGamificationFourSwitchButton(){
        groupsPage.clickOnGamificationFourSwitch();
    }

    @Step
    public void clickOnGamificationFiveSwitchButton(){
        groupsPage.clickOnGamificationFiveSwitch();
    }

    @Step
    public void clickOnGamificationSixSwitchButton(){
        groupsPage.clickOnGamificationSixSwitch();
    }

    @Step
    public void clickOnGamificationSevenSwitchButton(){
        groupsPage.clickOnGamificationSevenSwitch();
    }

    @Step
    public void verifyGamificationOneSwitchText(){
        groupsPage.gamificationOneYesNoSwitchText();
    }

    @Step
    public void verifyGamificationTwoSwitchText(){
        groupsPage.gamificationTwoYesNoSwitchText();
    }

    @Step
    public void verifyGamificationThreeSwitchText(){
        groupsPage.gamificationThreeYesNoSwitchText();
    }

    @Step
    public void verifyGamificationFourSwitchText(){
        groupsPage.gamificationFourYesNoSwitchText();
    }

    @Step
    public void verifyGamificationFiveSwitchText(){
        groupsPage.gamificationFiveYesNoSwitchText();
    }

    @Step
    public void verifyGamificationSixSwitchText(){
        groupsPage.gamificationSixYesNoSwitchText();
    }

    @Step
    public void verifyGamificationSevenSwitchText(){
        groupsPage.gamificationSevenYesNoSwitchText();
    }

    @Step
    public void completeGamificationTwoPointsField(double points){
        groupsPage.completeGamificationTwoPointsField(points);
    }

    @Step
    public void completeGamificationThreePointsField(double points){
        groupsPage.completeGamificationThreePointsField(points);
    }

    @Step
    public void completeGamificationFourPointsField(double points){
        groupsPage.completeGamificationFourPointsField(points);
    }

    @Step
    public void completeGamificationFivePointsField(double points){
        groupsPage.completeGamificationFivePointsField(points);
    }

    @Step
    public void completeGamificationSixPointsField(double points){
        groupsPage.completeGamificationSixPointsField(points);
    }

    @Step
    public void completeGamificationSevenPointsField(double points){
        groupsPage.completeGamificationSevenPointsField(points);
    }

    @Step
    public void clickOnApplyGamificationButton(){
        groupsPage.clickOnApplyGamificationButton();
    }

    @Step
    public void clickAllGamificationSwitchButtons(){
        clickOnGamificationOneSwitchButton();
        clickOnGamificationTwoSwitchButton();
        clickOnGamificationThreeSwitchButton();
        clickOnGamificationFourSwitchButton();
        clickOnGamificationFiveSwitchButton();
        clickOnGamificationSixSwitchButton();
        clickOnGamificationSevenSwitchButton();
    }

    @Step
    public void verifyAllGamificationSwitchTexts(){
        verifyGamificationOneSwitchText();
        verifyGamificationTwoSwitchText();
        verifyGamificationThreeSwitchText();
        verifyGamificationFourSwitchText();
        verifyGamificationFiveSwitchText();
        verifyGamificationSixSwitchText();
        verifyGamificationSevenSwitchText();
    }

    @Step
    public void createJoinRequestByText(String joinRequestField, double numberOfPoints){
        selectTheTypeOfJoinRequest("Text");
        completeTheJoinRequestRequirementsField(joinRequestField);
        completePointsRequestField(numberOfPoints);
        clickOnIsRequiredSwitchButton();
        clickOnCreateJoinRequest();
    }

    @Step
    public void createJoinRequestBySmallerNumber(String joinRequestField, double numberOfPoints){
        selectTheTypeOfJoinRequest("Number");
        completeTheJoinRequestRequirementsField(joinRequestField);
        completePointsRequestField(numberOfPoints);
        clickOnIsRequiredSwitchButton();
        clickOnEvaluationSmallerAndYesButton();
        clickOnCreateJoinRequest();
    }

    @Step
    public void createJoinRequestByBiggerNumber(String joinRequestField, double numberOfPoints){
        selectTheTypeOfJoinRequest("Number");
        completeTheJoinRequestRequirementsField(joinRequestField);
        completePointsRequestField(numberOfPoints);
        clickOnIsRequiredSwitchButton();
        clickOnEvaluationBiggerAndNoButton();
        clickOnCreateJoinRequest();
    }

    @Step
    public void createJoinRequestByNo(String joinRequestField, double numberOfPoints){
        selectTheTypeOfJoinRequest("Yes/No");
        completeTheJoinRequestRequirementsField(joinRequestField);
        completePointsRequestField(numberOfPoints);
        clickOnIsRequiredSwitchButton();
        clickOnEvaluationBiggerAndNoButton();
        clickOnCreateJoinRequest();
    }

    @Step
    public void createJoinRequestByYes(String joinRequestField, double numberOfPoints){
        selectTheTypeOfJoinRequest("Yes/No");
        completeTheJoinRequestRequirementsField(joinRequestField);
        completePointsRequestField(numberOfPoints);
        clickOnIsRequiredSwitchButton();
        clickOnEvaluationSmallerAndYesButton();
        clickOnCreateJoinRequest();
    }

    @Step
    public void completelyCreateFreeGroup(String groupName,String description,int startDate, int endDate, String goals, double numberOfAttendees){
        clickOnGroups();
        freeGroupCreate(groupName);
        completeTheDescriptionField(description);
        clickOnSelectFrequency();
        selectGroupBiMonthlyFrequency();

        waitTime(1000);
        selectStartDate(startDate);
//        waitTime(3000);
        selectEndDate(endDate);
        completeTheGoalsField(goals);
//        selectGroupEnglishLanguage();
        completeTheNumberOfAttendees(numberOfAttendees);
//        selectGroupPublicAccess();
        switchGroupActive();
        clickOnSaveChangesButtonFromGroupDetails();
        saveChangesGoodMessage();
        waitTime(1000);

    }

    @Step
    public void clickOnSelectFrequency(){
        groupsPage.clickSelectFrequency();
    }

}
