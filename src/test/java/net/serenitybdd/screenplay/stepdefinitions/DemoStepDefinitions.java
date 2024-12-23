package net.serenitybdd.screenplay.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybbd.screenplay.model.Client;
import net.serenitybbd.screenplay.util.Utils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.navigations.NavigateTo;
import net.serenitybdd.screenplay.questions.TheEntryNofication;
import net.serenitybdd.screenplay.tasks.RegisterClient;
import net.serenitybdd.screenplay.tasks.EnterLoginInformation;
import net.serenitybdd.screenplay.tasks.EnterNewClientInformation;

import java.util.Map;

public class DemoStepDefinitions {

    @Given("{actor} accesses the page and enters user {string} and password {string} and click on the login button")
    public void userAccessesAndLogin(Actor actor, String user, String password) {
        actor.wasAbleTo(NavigateTo.theDemoLoginPage());
        actor.attemptsTo(EnterLoginInformation.about(user, password));
    }

    @When("{actor} enters the following registration data")
    public void enterRegistrationDetails(Actor actor, DataTable dataTable) {
        Map<String, String> data = dataTable.asMaps().get(0);
        Client client = Client.builder()
                .name(Utils.validateNullString(data.get("name")))
                .lastName(Utils.validateNullString(data.get("last_name")))
                .id(Utils.validateNullString(data.get("id")))
                .dateBirth(Utils.validateNullString(data.get("date_birth")))
                .phone(Utils.validateNullString(data.get("phone")))
                .maritalStatus(Utils.validateNullString(data.get("marital_status")))
                .email(Utils.validateNullString(data.get("email")))
                .gender(Utils.validateNullString(data.get("gender")))
                .address(Utils.validateNullString(data.get("address")))
                .build();
        actor.attemptsTo(EnterNewClientInformation.withClientDetailsFrom(client));
    }

    @And("{actor} click on the register button")
    public void clickRegisterButton(Actor actor) {
        actor.attemptsTo(RegisterClient.clickOnRegister());
    }

    @Then("{actor} should see successful login notification message {string}")
    public void verifySuccessMessage(Actor actor, String message) {
        actor.attemptsTo(
                Ensure.that(TheEntryNofication.text()).containsIgnoringCase(message)
        );
    }
}
