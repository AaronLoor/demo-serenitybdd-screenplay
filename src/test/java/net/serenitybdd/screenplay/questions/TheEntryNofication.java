package net.serenitybdd.screenplay.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.uitargets.RegistrationForm;

public class TheEntryNofication {
    public static Question<String> text() {
        return Question.about("entry notification text").answeredBy(
                actor -> RegistrationForm.ENTRY_NOTIFICATION.resolveFor(actor).getText()
        );
    }
}