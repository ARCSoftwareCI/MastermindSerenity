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
        groupsSteps.selectTheStartDate("March 2023", 8);
        baseSteps.waitTime(5);
    }

    @Test
    public void deleteRule(){
        loginSteps.doLogin(Constants.TESTING_EMAIL,Constants.TESTING_PASSWORD);
        baseSteps.openMastermind();
        groupsSteps.clickOnGroups();
        groupsSteps.paidGroupCreate("PAIDGRUPTEST");
        groupsSteps.();
        groupsSteps.clickOnAddNewRuleButton();
        groupsSteps.clickOnAddNewRuleButton();
        groupsSteps.clickOnAddNewRuleButton();
        groupsSteps.completeTheLastRuleField("TESTESTESTESTESTESTESt");
        groupsSteps.deleteLastRule();

    }

}
