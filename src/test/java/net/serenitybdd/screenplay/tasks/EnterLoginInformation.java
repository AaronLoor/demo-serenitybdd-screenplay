package net.serenitybdd.screenplay.tasks;

import net.serenitybbd.screenplay.util.Constants;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.uitargets.LoginForm;
import net.serenitybdd.screenplay.uitargets.RegistrationForm;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class EnterLoginInformation {
    public static Performable about(String user, String password) {
        return Task.where("{0} enters for '" + user + Constants.FIELD_SEPARATOR + password + "' and click on login button",
                Enter.theValue(user).into(LoginForm.USER_FIELD),
                Enter.theValue(password).into(LoginForm.PASSWORD_FIELD),
                Click.on(LoginForm.LOGIN_BUTTON),
                WaitUntil.the(RegistrationForm.CLIENT_FORM_TITLE, isPresent())
        );
    }
}
