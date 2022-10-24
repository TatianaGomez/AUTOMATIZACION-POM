package co.com.choucair.certification.pom.definition;

import co.com.choucair.certification.pom.step.TaskAction;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Mydefinition {

    @Steps
    TaskAction taskAction;

    @Given("^I enter with my credentials$")
    public void iEnterWithMyCredentials() {

        taskAction.appUrl();
    }

    @When("^I proceed with the authentication$")
    public void iProceedWithTheAuthentication() throws InterruptedException {
        taskAction.singIn();
    }

    @And("^go to the main view of the page$")
        public void goToTheMainViewOfThePage() {
            taskAction.verificar();
        }

    @And("^enter submenu$")
    public void enterSubmenu() throws InterruptedException {
        taskAction.Menu();
    }

    @And("^Check the title of the form on the screen$")
    public void CheckTheTitleOfTheFormOnTheScreen() {
        taskAction.verificarForms();
    }

    @And("^fill out information$")
    public void fillOutInformation() throws InterruptedException {
        taskAction.InformationForms();
    }

    @And("^clic button Validate$")
    public void clicButtonValidate() throws InterruptedException {
        taskAction.BtnValidate();
    }


    @Then("^successful response or wrong answer$")
    public void successfulResponseOrWrongAnswer() throws InterruptedException {
        taskAction.ValidationForms();
    }

}

