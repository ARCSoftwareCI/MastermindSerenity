package ro.upriserz.mastermind.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import ro.upriserz.mastermind.pages.*;

public class BaseSteps extends ScenarioSteps {

    private BasePage basePage;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private LoginSteps loginSteps;
    private SearchPage searchPage;
    private GroupsPage groupsPage;


    @Step
    public void openHomePage(){
        basePage.open();
        basePage.clickOnCookiesButton();
    }

    @Step
    public void verifyRegisterPage(){
        basePage.verifyRegisterPageText();
    }

    @Step
    public void verifyHomePageText(){
        basePage.verifyHomePageText();
    }

    @Step
    public void clickHomeButtonFromLoginPage(){
        loginPage.clickHomeButton();

    }

    @Step
    public void verifyForgottenPasswordPage(){
        basePage.verifyForgottenPasswordPage();
    }

    @Step
    public void openMastermind(){
        dashboardPage.open();
    }

    @Step
    public void mastermindDashboardPage(String email,String password){
        loginSteps.doLogin(email, password);
        openMastermind();

    }

    @Step
    public void waitTime(long second){
        basePage.waiting(second);
    }

}
