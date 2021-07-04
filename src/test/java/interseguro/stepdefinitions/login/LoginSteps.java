package interseguro.stepdefinitions.login;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import interseguro.questions.login.RequestLifeInsuranceQuestion;
import interseguro.task.login.DoLogin;
import interseguro.task.navigation.NavigateTo;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginSteps {
    String name;
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("(.*) has an active account")
    public void josimar_has_an_active_account(String name) {
        this.name=name;
    }

    @When("he sends {string} {string} {string} their valid credentials")
    public void he_sends_their_valid_credentials(String document, String phone, String email) {
        theActorCalled(name).attemptsTo(
                NavigateTo.theInterSeguroVidaHomePage(),
                DoLogin.withCredentials(document,phone,email)

        );
    }
    @Then("he should have acces {string} denied")
    public void heShouldHaveAccesDenied(String message) {
        theActorInTheSpotlight().should(
                seeThat("Solicito información de seguro de vida", RequestLifeInsuranceQuestion.requestInsuranceLife(),equalTo(message))

        );
    }
}
