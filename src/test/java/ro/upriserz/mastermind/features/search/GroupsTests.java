package ro.upriserz.mastermind.features.search;

import org.junit.Test;
import ro.upriserz.mastermind.Utilities.Constants;

public class GroupsTests extends BaseTests{

    @Test
    public void goToGroups(){
        loginSteps.doLogin(Constants.TESTING_EMAIL,Constants.TESTING_PASSWORD);
        baseSteps.openMastermind();
        groupsSteps.clickOnGroups();
    }

    @Test
    public void verifyPaidGroup(){
        loginSteps.doLogin(Constants.TESTING_EMAIL,Constants.TESTING_PASSWORD);
        baseSteps.openMastermind();
        groupsSteps.clickOnGroups();
        groupsSteps.paidGroupCreate("paidTestGroup");
        groupsSteps.verifyPaidGroupText();
    }

    @Test
    public void verifyFreeGroup(){
        loginSteps.doLogin(Constants.TESTING_EMAIL,Constants.TESTING_PASSWORD);
        baseSteps.openMastermind();
        groupsSteps.clickOnGroups();
        groupsSteps.freeGroupCreate("freeTestGroup");
        groupsSteps.verifyFreeGroupText();
    }



    @Test
    public void selectStartDate(){
        loginSteps.doLogin(Constants.TESTING_EMAIL,Constants.TESTING_PASSWORD);
        baseSteps.openMastermind();
        groupsSteps.clickOnGroups();
        groupsSteps.freeGroupCreate("testFreeGroup");
        groupsSteps.clickOnTheStartDateDropdown();
        groupsSteps.selectStartDate(12);
        baseSteps.waitTime(500);
    }

    @Test
    public void selectEndDate(){
        loginSteps.doLogin(Constants.TESTING_EMAIL,Constants.TESTING_PASSWORD);
        baseSteps.openMastermind();
        groupsSteps.clickOnGroups();
        groupsSteps.freeGroupCreate("testFreeGroup");
        groupsSteps.clickOnTheEndDateDropdown();
        groupsSteps.selectEndDate(12);
        baseSteps.waitTime(500);
    }

    @Test
    public void deleteRule(){
        loginSteps.doLogin(Constants.TESTING_EMAIL,Constants.TESTING_PASSWORD);
        baseSteps.openMastermind();
        groupsSteps.clickOnGroups();
        groupsSteps.paidGroupCreate("PAIDGRUPTEST");
        groupsSteps.clickOnAddNewRuleButton();
        groupsSteps.clickOnAddNewRuleButton();
        groupsSteps.clickOnAddNewRuleButton();
        groupsSteps.completeTheLastRuleField("TESTESTESTESTESTESTESt");
        groupsSteps.deleteLastRule();

    }

    @Test
    public void changeCoverPhoto(){
        loginSteps.doLogin(Constants.TESTING_EMAIL,Constants.TESTING_PASSWORD);
        baseSteps.openMastermind();
        groupsSteps.clickOnGroups();
        groupsSteps.paidGroupCreate("PAIDGRUPTEST");
        groupsSteps.clickOnChangeCoverPhoto();
        groupsSteps.selectTheFirstPhotoFromMediaItemsCoverPhoto();
        baseSteps.waitTime(3000);
    }

    @Test
    public void verifyEmptyGroupFields(){
        loginSteps.doLogin(Constants.TESTING_EMAIL,Constants.TESTING_PASSWORD);
        baseSteps.openMastermind();
        groupsSteps.clickOnGroups();
        groupsSteps.freeGroupCreate("testFreeGroup");
        groupsSteps.clickOnSaveChangesButtonFromGroupDetails();
        groupsSteps.verifyEmptyFieldsGroupDetails();
        groupsSteps.saveChangesErrorMessage();

    }

    @Test
    public void createFreeGroup(){
        loginSteps.doLogin(Constants.TESTING_EMAIL,Constants.TESTING_PASSWORD);
        baseSteps.openMastermind();
        groupsSteps.completelyCreateFreeGroup("FreeTestGroup","This is a description",12,19,"This is a goal",123);
    }


}
