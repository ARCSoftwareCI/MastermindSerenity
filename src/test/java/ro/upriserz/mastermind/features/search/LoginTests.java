package ro.upriserz.mastermind.features.search;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import ro.upriserz.mastermind.Utilities.Constants;

public class LoginTests extends BaseTests {

    @Test
    public void goToLogin(){
        loginSteps.goToLoginPage();

    }

    @Test
    public void loginWithValidCredentials(){
        loginSteps.goToLoginPage();
        loginSteps.doCompleteLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        loginSteps.loginVerification(Constants.USER_FIRST);
    }

    @Test
    public void loginWithEmptyFields(){
        loginSteps.goToLoginPage();
        loginSteps.clickOnLoginButton();
        loginSteps.verifyEmptyFieldsLoginText();
    }

    @Test
    public void loginWithEmptyEmailField() {
        loginSteps.goToLoginPage();
        loginSteps.completePasswordField(RandomStringUtils.randomAlphabetic(8));
        loginSteps.clickOnLoginButton();
        loginSteps.verifyEmptyEmailFieldText();
    }

    @Test
    public void loginWithEmptyPasswordField() {
        loginSteps.goToLoginPage();
        loginSteps.completeEmailField(Constants.TESTING_EMAIL);
        loginSteps.clickOnLoginButton();
        loginSteps.verifyEmptyPasswordFieldText();
    }


    @Test
    public void loginWithWrongEmail(){
        loginSteps.goToLoginPage();
        loginSteps.completeEmailField("emailtest@test.com");
        loginSteps.completePasswordField(RandomStringUtils.randomAlphabetic(8));
        loginSteps.clickOnLoginButton();
        loginSteps.verifyWrongEmailText();
    }

    @Test
    public void loginWithWrongPassword() {
        loginSteps.goToLoginPage();
        loginSteps.completeEmailField(Constants.TESTING_EMAIL);
        loginSteps.completePasswordField(RandomStringUtils.randomAlphabetic(8));
        loginSteps.clickOnLoginButton();
        loginSteps.verifyWrongPasswordText();
    }

    @Test
    public void goToHomePageFromLoginPage() {
        loginSteps.goToLoginPage();
        loginSteps.clickHomeButtonFromLoginPage();
        baseSteps.verifyHomePageText();
    }

    @Test
    public void goToCreateNewAccount() {
        loginSteps.goToLoginPage();
        loginSteps.clickOnNewAccountLink();
        baseSteps.verifyRegisterPage();
    }

    @Test
    public void goToForgottenPassword() {
        loginSteps.goToLoginPage();
        loginSteps.clickOnForgotPassword();
        baseSteps.verifyForgottenPasswordPage();
    }


    @Test
    public void verifyRememberMeCheckboxStatus() {
        loginSteps.isCheckboxChecked();
    }

    @Test
    public void goToMastermind(){
        loginSteps.doLogin(Constants.TESTING_EMAIL,Constants.TESTING_PASSWORD);
        baseSteps.openMastermind();
    }

}
