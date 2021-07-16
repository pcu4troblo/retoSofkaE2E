package co.com.client.project.stepdefinitions;

import co.com.client.project.questions.TestQuestion;
import co.com.client.project.tasks.AbrirPagina;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class StepDefinitions {

    private static final Logger LOGGER = LoggerFactory.getLogger(StepDefinitions.class);
    private static final String ACTOR = "Actor";
    private static final String MSG_FIN_PRUEBA = "Finaliza test";
    private static final String MSG_INICIA_PRUEBA = "Inicia test";
    private static final String MSG_EXEC_ACCION = "Validando resultado de la accion: %s";

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
        LOGGER.info(MSG_INICIA_PRUEBA);
    }

    @Given("^precondicion del caso de prueba$")
    public void precondicionDelCasoDePrueba() {
        OnStage.theActor(ACTOR).wasAbleTo(
                AbrirPagina.url()
                );
    }

    @When("^accion realizada por el actor en el aplicativo$")
    public void accionRealizadaPorElActorEnElAplicativo() {
        OnStage.theActorInTheSpotlight().attemptsTo( //TODO inclir task
        );
    }

    @Then("^respuesta esperada$")
    public void respuestaEsperada() {
        String accion = "Accion esperada por el actor";
        LOGGER.info(String.format(MSG_EXEC_ACCION, accion));
        OnStage.theActor(ACTOR).should(
            seeThat(accion, TestQuestion.validarAccion())  //TODO implementar question
        );
    }

    @After
    public void afterRun() {
        LOGGER.info(MSG_FIN_PRUEBA);
    }

}
