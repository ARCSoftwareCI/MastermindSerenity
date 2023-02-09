package ro.upriserz.mastermind.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import ro.upriserz.mastermind.steps.serenity.BaseSteps;
import ro.upriserz.mastermind.steps.serenity.GroupsSteps;
import ro.upriserz.mastermind.steps.serenity.LoginSteps;
import ro.upriserz.mastermind.steps.serenity.SearchSteps;

@RunWith(SerenityRunner.class)
public class BaseTests {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    @Steps
    protected LoginSteps loginSteps;

    @Steps
    protected BaseSteps baseSteps;

    @Steps
    protected SearchSteps searchSteps;

    @Steps
    protected GroupsSteps groupsSteps;

    @Before
    public void maximize(){
        webDriver.manage().window().maximize();
    }

    @After
    public void closeDriver(){
        webDriver.close();
    }
}
