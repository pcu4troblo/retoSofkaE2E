package co.com.client.project.stepdefinitions;

import co.com.client.project.questions.TestQuestion;
import co.com.client.project.tasks.OpenSite;
import co.com.client.project.utils.Constants;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.thucydides.core.util.EnvironmentVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.client.project.stepdefinitions.Hooks.actor;
import static co.com.client.project.utils.PropertiesManager.getValue;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class StepDefinitions {

    private static final Logger LOGGER = LoggerFactory.getLogger(StepDefinitions.class);
    private static EnvironmentVariables environmentVariables;

    @Before
    public void beforeRun()
    {
        LOGGER.info(Constants.Messages.MSG_INICIA_PRUEBA);
    }

    @Given("^precondicion del caso de prueba$")
    public void precondicionDelCasoDePrueba() {
        String url = environmentVariables.optionalProperty("applications.url").orElse(getValue("url"));
        actor.attemptsTo(OpenSite.abrir(url));
    }

    @When("^accion realizada por el actor en el aplicativo$")
    public void accionRealizadaPorElActorEnElAplicativo() {
       actor.attemptsTo(); //TODO inclir task
    }

    @Then("^respuesta esperada$")
    public void respuestaEsperada() {
        String accion = "Accion esperada por el actor";
        LOGGER.info(Constants.Messages.MSG_EXEC_ACCION,accion);
        actor.should(seeThat(accion, TestQuestion.validarAccion(), is(true))); //TODO implementar question
    }

    @After
    public void afterRun() {
        LOGGER.info(Constants.Messages.MSG_FIN_PRUEBA);
    }

}
