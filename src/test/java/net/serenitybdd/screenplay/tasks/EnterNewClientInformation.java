package net.serenitybdd.screenplay.tasks;

import net.serenitybbd.screenplay.model.Client;
import net.serenitybbd.screenplay.util.Constants;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.uitargets.RegistrationForm;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnterNewClientInformation {
    public static Performable withClientDetailsFrom(Client client) {
        return Task.where("{0} details for a new client with '" + client.getName() + Constants.FIELD_SEPARATOR + client.getLastName() + Constants.FIELD_SEPARATOR
                        + client.getId() + Constants.FIELD_SEPARATOR + client.getDateBirth() + Constants.FIELD_SEPARATOR + client.getPhone() + Constants.FIELD_SEPARATOR
                        + client.getMaritalStatus() + Constants.FIELD_SEPARATOR + client.getEmail() + Constants.FIELD_SEPARATOR + client.getGender() + Constants.FIELD_SEPARATOR
                        + client.getAddress() + "'",
                Enter.theValue(client.getName()).into(RegistrationForm.NAME_FIELD),
                Enter.theValue(client.getLastName()).into(RegistrationForm.LAST_NAME_FIELD),
                Enter.theValue(client.getId()).into(RegistrationForm.ID_FIELD),

                WaitUntil.the(RegistrationForm.DATE_BIRTH_FIELD, isClickable()),
                Clear.field(RegistrationForm.DATE_BIRTH_FIELD),
                Enter.theValue(client.getDateBirth())
                        .into(RegistrationForm.DATE_BIRTH_FIELD)
                        .thenHit(Keys.ENTER),

                Enter.theValue(client.getPhone()).into(RegistrationForm.PHONE_FIELD),

                Click.on(RegistrationForm.MARITAL_STATUS_DROPDOWN),
                WaitUntil.the(RegistrationForm.MARITAL_STATUS_OPTION.of(client.getMaritalStatus()),
                        isVisible()),
                Click.on(RegistrationForm.MARITAL_STATUS_OPTION.of(client.getMaritalStatus())),

                Enter.theValue(client.getEmail()).into(RegistrationForm.EMAIL_FIELD),

                Click.on(RegistrationForm.GENDER_DROPDOWN),
                WaitUntil.the(RegistrationForm.GENDER_OPTION.of(client.getGender()),
                        isVisible()),
                Click.on(RegistrationForm.GENDER_OPTION.of(client.getGender())),

                Enter.theValue(client.getAddress()).into(RegistrationForm.ADDRESS_FIELD));
    }
}
