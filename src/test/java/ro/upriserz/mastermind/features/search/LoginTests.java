package ro.upriserz.mastermind.features.search;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import ro.upriserz.mastermind.Utilities.Constants;

public class LoginTests extends BaseTests {

    @Test
    public void goToLogin(){
        loginSteps.goToLogin();

    }

    @Test
    public void loginWithValidCredentials(){
        loginSteps.goToLogin();
        loginSteps.doCompleteLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        loginSteps.loginVerification(Constants.USER_FIRST);
    }

    @Test
    public void loginWithEmptyFields(){
        loginSteps.goToLogin();
        loginSteps.clickOnLoginButton();
        loginSteps.verifyEmptyFieldsLoginText();
    }

    @Test
    public void loginWithEmptyEmailField() {
        loginSteps.goToLogin();
        loginSteps.completePasswordField(RandomStringUtils.randomAlphabetic(8));
        loginSteps.clickOnLoginButton();
        loginSteps.verifyEmptyEmailFieldText();
    }

    @Test
    public void loginWithEmptyPasswordField() {
        loginSteps.goToLogin();
        loginSteps.completeEmailField(Constants.TESTING_EMAIL);
        loginSteps.clickOnLoginButton();
        loginSteps.verifyEmptyPasswordFieldText();
    }


    @Test
    public void loginWithWrongEmail(){
        loginSteps.goToLogin();
        loginSteps.completeEmailField("emailtest@test.com");
        loginSteps.completePasswordField(RandomStringUtils.randomAlphabetic(8));
        loginSteps.clickOnLoginButton();
        loginSteps.verifyWrongEmailText();
    }

    @Test
    public void loginWithWrongPassword() {
        loginSteps.goToLogin();
        loginSteps.completeEmailField(Constants.TESTING_EMAIL);
        loginSteps.completePasswordField(RandomStringUtils.randomAlphabetic(8));
        loginSteps.clickOnLoginButton();
        loginSteps.verifyWrongPasswordText();
    }

    @Test
    public void goToHomePageFromLoginPage() {
        loginSteps.goToLogin();
        loginSteps.clickHomeButtonFromLoginPage();
        baseSteps.verifyHomePageText();
    }

    @Test
    public void goToCreateNewAccount() {
        loginSteps.goToLogin();
        loginSteps.clickOnNewAccountLink();
        baseSteps.verifyRegisterPage();
    }

    @Test
    public void goToForgottenPassword() {
        loginSteps.goToLogin();
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
