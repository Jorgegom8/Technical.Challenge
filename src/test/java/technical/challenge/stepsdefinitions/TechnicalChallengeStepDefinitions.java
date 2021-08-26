package technical.challenge.stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import technical.challenge.model.TechnicalChallengeData;
import technical.challenge.questions.Answer;
import technical.challenge.tasks.*;

import java.util.List;

public class TechnicalChallengeStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Jorge wants to create account in the Utest page$")
    public void than_Jorge_wants_to_create_account_in_the_Utest_page(List<TechnicalChallengeData> technicalChallengeData) {
        OnStage.theActorCalled("Armando").wasAbleTo(OpenPage.thePage(), (Login.
                onThePage(technicalChallengeData.get(0).getStrF_name(), technicalChallengeData.get(0).getStrL_name(),
                        technicalChallengeData.get(0).getStrEmail())));
    }

    @When("^he configure the address and device module$")
    public void he_configure_the_address_and_device_module(List<TechnicalChallengeData> technicalChallengeData) {

        OnStage.theActorInTheSpotlight().attemptsTo(Location.the(technicalChallengeData.get(0).getStrCity(), technicalChallengeData.get(0).getStrZip()),
                Device.module(technicalChallengeData.get(0).getStrDevice(), technicalChallengeData.get(0).getStrModel()),
                Password.Pass(technicalChallengeData.get(0).getStrPassword()));

    }

    @Then("^he creates the password and finish the form$")
    public void he_creates_the_password_and_finish_the_form() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.answer()));

    }

}
