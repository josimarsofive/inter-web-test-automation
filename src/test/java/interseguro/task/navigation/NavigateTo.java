package interseguro.task.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theInterSeguroVidaHomePage() {
        return Task.where("{0} opens the Interseguro Vida home page",
                Open.browserOn().the(InterseguroHomePage.class)
        );
    }
}
