package co.com.client.project.stepdefinitions;

import co.com.client.project.questions.TestQuestion;
import co.com.client.project.tasks.AbrirPagina;

import co.com.client.project.util.Constantes;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class StepDefinitions {

    private static final Logger LOGGER = LoggerFactory.getLogger(StepDefinitions.class);
    private static final String ACTOR = "Actor";

    private Actor actor;

    @Managed(driver = "chrome")
    private WebDriver navegador;

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
        LOGGER.info(Constantes.Messages.MSG_INICIA_PRUEBA);
        actor = Actor.named(ACTOR);
        actor.can(BrowseTheWeb.with(navegador));
    }

    @Given("^precondicion del caso de prueba$")
    public void precondicionDelCasoDePrueba() {
        actor.wasAbleTo(
                AbrirPagina.url()
                );
    }

    @When("^accion realizada por el actor en el aplicativo$")
    public void accionRealizadaPorElActorEnElAplicativo() {
       actor.attemptsTo( //TODO inclir task
        );
    }

    @Then("^respuesta esperada$")
    public void respuestaEsperada() {
        String accion = "Accion esperada por el actor";
        LOGGER.info(Constantes.Messages.MSG_EXEC_ACCION,accion);
        actor.should(
            seeThat(accion, TestQuestion.validarAccion())  //TODO implementar question
        );
    }

    @After
    public void afterRun() {
        LOGGER.info(Constantes.Messages.MSG_FIN_PRUEBA);
    }

}
