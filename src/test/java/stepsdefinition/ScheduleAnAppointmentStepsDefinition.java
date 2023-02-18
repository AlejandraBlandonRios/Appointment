package stepsdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import userinterface.AppointmentPageUserInterface;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ScheduleAnAppointmentStepsDefinition {

    @Managed(driver="chrome")
    private WebDriver chromeBrowser;
    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("user").can(BrowseTheWeb.with(chromeBrowser));
    }

    @Given("^user credentials are in the page$")
    public void user_credentials_are_in_the_page() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(new AppointmentPageUserInterface()));
    }

    @When("^user creates a new appointment$")
    public void user_creates_a_new_appointment() {
    }

    @Then("^the message Appointment Confirmation appears in the screen$")
    public void the_message_Appointment_Confirmation_appears_in_the_screen() {
    }

}
