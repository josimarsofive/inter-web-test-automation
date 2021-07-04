package interseguro.task.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import interseguro.ui.login.LoginLocators;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoLogin implements Task {
    private final String document;
    private final String phone;
    private final String email;

    public DoLogin(String document, String phone, String email) {
        this.document = document;
        this.phone = phone;
        this.email = email;
    }

    public static Performable withCredentials(String document, String phone, String email) {
        return instrumented(DoLogin.class, document, phone, email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(document).into(LoginLocators.DOCUMENT_FIELD),
                Enter.theValue(phone).into(LoginLocators.PHONE_FIELD),
                Enter.theValue(email).into(LoginLocators.EMAIL_FIELD),
                Click.on(LoginLocators.LOQUIERO_BUTTON)
        );
    }
}
