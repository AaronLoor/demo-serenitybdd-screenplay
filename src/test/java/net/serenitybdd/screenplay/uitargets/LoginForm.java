package net.serenitybdd.screenplay.uitargets;

import net.serenitybdd.screenplay.targets.Target;

public class LoginForm {

    public static Target USER_FIELD = Target.the("user field").locatedBy("#user");
    public static Target PASSWORD_FIELD = Target.the("password field").locatedBy(".p-password-input");
    public static Target LOGIN_BUTTON = Target.the("login button").locatedBy(".btn");

}
