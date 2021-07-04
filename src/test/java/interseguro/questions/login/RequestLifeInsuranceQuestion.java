package interseguro.questions.login;

import interseguro.task.login.DoLogin;
import interseguro.ui.login.LoginLocators;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class RequestLifeInsuranceQuestion {
    public static Question<String> requestInsuranceLife(){
        return actor -> TextContent.of(LoginLocators.MESSAGE_TEXTO).viewedBy(actor).asString().trim();
    }
}
