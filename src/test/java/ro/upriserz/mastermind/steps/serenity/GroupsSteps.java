package ro.upriserz.mastermind.steps.serenity;

import net.thucydides.core.annotations.Step;
import ro.upriserz.mastermind.pages.BasePage;
import ro.upriserz.mastermind.pages.Dashboard;
import ro.upriserz.mastermind.pages.GroupsPage;
import ro.upriserz.mastermind.pages.LoginPage;

public class GroupsSteps extends BaseSteps{

    private BasePage basePage;
    private Dashboard dashboard;
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
    public void selectGroupTimeZone(String timeZone){
        groupsPage.selectTimeZone(timeZone);
    }
    @Step
    public void selectGroupLanguage(String language){
        groupsPage.selectLanguage(language);
    }
    @Step
    public void selectGroupAccess(String access){
        groupsPage.selectAccess(access);
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
    public void saveCoverPhotoGoodText(){
        groupsPage.saveChangesGood();
    }

    @Step
    public void saveCoverPhotoErrorText(){
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
    public void clickOnTheEndDateDropdown(){
        groupsPage.clickOnEndDateDropdown();
    }

    @Step
    public void completeTheDescriptionField(String description){
        groupsPage.completeTheDescription(description);
    }

    @Step
    public void completeTheNumberOfAttendees(String maxAttendee){
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

}
