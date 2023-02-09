package ro.upriserz.mastermind.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import ro.upriserz.mastermind.pages.BasePage;
import ro.upriserz.mastermind.pages.Dashboard;
import ro.upriserz.mastermind.pages.LoginPage;

public class BaseSteps extends ScenarioSteps {

    private BasePage basePage;
    private LoginPage loginPage;
    private Dashboard dashboard;
    private LoginSteps loginSteps;


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
        dashboard.open();
    }

    @Step
    public void mastermindDashboardPage(String email,String password){
        loginSteps.doLogin(email, password);
        dashboard.open();

    }

    @Step
    public void waitTime(long second){
        basePage.waiting(second);
    }

}
