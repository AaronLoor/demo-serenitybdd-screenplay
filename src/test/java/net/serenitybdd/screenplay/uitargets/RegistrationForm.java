package net.serenitybdd.screenplay.uitargets;

import net.serenitybdd.screenplay.targets.Target;

public class RegistrationForm {

    public static Target NAME_FIELD = Target.the("name field").locatedBy("#name");
    public static Target LAST_NAME_FIELD = Target.the("last name field").locatedBy("#lastName");
    public static Target ID_FIELD = Target.the(" ID field").locatedBy("#id");
    public static Target DATE_BIRTH_FIELD = Target.the("date birth field").locatedBy("//p-calendar[@id='dateBirth']//input");
    public static Target PHONE_FIELD = Target.the("phone field").locatedBy("#phone");
    public static final Target MARITAL_STATUS_DROPDOWN = Target.the("marital status dropdown")
            .locatedBy("//p-dropdown[@id='maritalStatus']//span[contains(@class, 'p-dropdown-label')]");
    public static final Target MARITAL_STATUS_OPTION = Target.the("marital status option {0}")
            .locatedBy("//p-dropdown[@id='maritalStatus']//li[@role='option']//span[contains(text(),'{0}')]");
    public static Target EMAIL_FIELD = Target.the("email field").locatedBy("#email");
    public static final Target GENDER_DROPDOWN = Target.the("gender status dropdown")
            .locatedBy("//p-dropdown[@id='gender']//span[contains(@class, 'p-dropdown-label')]");
    public static final Target GENDER_OPTION = Target.the("marital status option {0}")
            .locatedBy("//p-dropdown[@id='gender']//li[@role='option']//span[contains(text(),'{0}')]");
    public static Target ADDRESS_FIELD = Target.the("address field").locatedBy("#address");
    public static Target REGISTER_BUTTON = Target.the("register button").locatedBy("#buttonRegister");
    public static Target ENTRY_NOTIFICATION = Target.the("entry notification").locatedBy(".p-toast-detail");
    public static Target CLIENT_FORM_TITLE = Target.the("client form title").locatedBy(".form-title").containingText("Client");


}
