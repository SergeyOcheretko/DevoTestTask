package Cucumber;

import PageObject.MainPageTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs {

    private final MainPageTest mainPage = new MainPageTest(CucumberHooks.getDriver());




    @Given("Enter {string} in the Link ou Nome de usuario field")
    public void enterInTheLinkOuNomeDeUsuarioField(String text) throws InterruptedException {
    mainPage.enterInTheLinkOuNomeDeUsuarioField(text);
    }

    @When("Enter {string} in the email field")
    public void enterInTheEmailField(String text) {
    mainPage.enterInTheEmailField(text);
    }

    @Then("Verify that error is appeared below email field")
    public void verifyThatErrorIsAppearedBelowEmailField() {
    Assert.assertTrue("Por favor, preencha o campo com seu e-mail",mainPage.verifyThatErrorIsAppearedBelowEmailField());
    }

    @When("Click on the CONTINUAR button")
    public void clickOnTheCONTINUARButton() {
    mainPage.clickOnTheCONTINUARButton();
    }
}
