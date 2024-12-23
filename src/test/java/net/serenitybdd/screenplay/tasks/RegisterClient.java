package net.serenitybdd.screenplay.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.uitargets.RegistrationForm;

public class RegisterClient {
    public static Performable clickOnRegister() {
        return Task.where("click on register button",
                Click.on(RegistrationForm.REGISTER_BUTTON)
                );
    }
}
