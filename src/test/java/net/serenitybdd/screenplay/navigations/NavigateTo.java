package net.serenitybdd.screenplay.navigations;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theDemoLoginPage() {
        return Task.where("{0} opens the Demo login page",
                Open.browserOn().the(DemoLoginPage.class));
    }
}
