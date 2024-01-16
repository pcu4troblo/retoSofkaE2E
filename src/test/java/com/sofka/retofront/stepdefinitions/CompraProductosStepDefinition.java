package com.sofka.retofront.stepdefinitions;

import com.sofka.retofront.questions.VerificarCompra;
import com.sofka.retofront.questions.VerificarProducto;
import com.sofka.retofront.tasks.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraProductosStepDefinition {
    private String primerProducto;
    private String segundoProducto;
    @Given("{string} inicia sesion en saucedemo")
    public void iniciarSesionEnSaucedemo(String actor) {
        theActorCalled(actor).wasAbleTo(IniciarSesion.saucedemo());
    }

    @When("agrega los productos {string} y {string} al carrito")
    public void agregaLosProductosPrimerProductoYSegundoProductoAlCarrito(String primerProducto, String segundoProducto) {
        this.primerProducto = primerProducto;
        this.segundoProducto = segundoProducto;
        theActorInTheSpotlight().attemptsTo(AnadirACarrito.producto(primerProducto));
        theActorInTheSpotlight().attemptsTo(AnadirACarrito.producto(segundoProducto));
    }

    @And("visualiza los productos en el carrito")
    public void visualizaLosProductosEnElCarrito() {
        theActorInTheSpotlight().attemptsTo(IngresarAOpcion.carritoDeCompras());
        theActorInTheSpotlight().should(seeThat(VerificarProducto.enCarrito(primerProducto)));
        theActorInTheSpotlight().should(seeThat(VerificarProducto.enCarrito(segundoProducto)));
    }

    @And("completa el formulario de compra")
    public void completaElFormularioDeCompra() {
        theActorInTheSpotlight().attemptsTo(IngresarAOpcion.checkout());
        theActorInTheSpotlight().attemptsTo(CompletarFormulario.checkout());
        theActorInTheSpotlight().should(seeThat(VerificarProducto.enCarrito(primerProducto)));
        theActorInTheSpotlight().should(seeThat(VerificarProducto.enCarrito(segundoProducto)));
        theActorInTheSpotlight().attemptsTo(FinalizarCompra.exitosa());
    }

    @Then("finaliza la compra exitosamente")
    public void finalizaLaCompraExitosamente() {
        theActorInTheSpotlight().should(seeThat(VerificarCompra.exitosa()));
    }
}
