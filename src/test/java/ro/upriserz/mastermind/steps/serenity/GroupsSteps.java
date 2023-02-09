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
    public void clickOnCancelButtonFromChangeCoverPhoto(){
        groupsPage.clickCancelButton();
    }

    @Step
    public void clickOnSaveChangeCoverPhoto(){
        groupsPage.clickOnSaveChangesButton();
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
        groupsPage.changeCoverPhotoText();
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
        groupsPage.maxNumberOfAttendee();
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
    public void verifyEmptyFieldsGroupSave() {
        noPhotoCoverText();
        emptyDescriptionText();
        emptyStartDateText();
        emptyEndDateText();
        emptyGoalsText();
        emptyMaxAttendeeText();
    }

    @Step
    public void changeTheCoverPhoto(String search){
        clickOnChangeCoverPhoto();
        selectFromUnsplash();
        inputUnsplashTextField(search);
        clickSearchButtonFromUnsplash();
        selectFirstResultFromUnsplashSearch();
        selectFirstCoverPhotoGroup();
        clickOnSaveChangeCoverPhoto();
        saveCoverPhotoGoodText();
    }

    @Step
    public void changeCovePhotoFromMediaItems(){
        clickOnChangeCoverPhoto();
        selectFirstCoverPhotoGroup();
        clickOnSaveChangeCoverPhoto();
        saveCoverPhotoGoodText();
    }

    @Step
    public void selectTheStartDate(String monthAndYear, int day){
        groupsPage.selectStartDate(monthAndYear, day);
    }



}
