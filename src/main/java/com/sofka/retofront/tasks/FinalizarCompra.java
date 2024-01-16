package com.sofka.retofront.tasks;

import com.sofka.retofront.userinterfaces.saucedemo.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FinalizarCompra implements Task {

    public static FinalizarCompra exitosa(){
        return instrumented(FinalizarCompra.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckoutPage.BUTTON_TERMINAR)
        );
    }
}
