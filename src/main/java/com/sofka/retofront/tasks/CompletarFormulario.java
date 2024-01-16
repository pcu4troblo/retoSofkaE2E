package com.sofka.retofront.tasks;

import com.github.javafaker.Faker;
import com.sofka.retofront.userinterfaces.saucedemo.CheckoutPage;
import com.sofka.retofront.userinterfaces.saucedemo.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompletarFormulario implements Task {
    private Faker faker = new Faker();

    public static CompletarFormulario checkout(){
        return instrumented(CompletarFormulario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(faker.name().firstName()).into(CheckoutPage.INPUT_NOMBRE),
                Enter.theValue(faker.name().lastName()).into(CheckoutPage.INPUT_APELLIDO),
                Enter.theValue(faker.address().zipCode()).into(CheckoutPage.INPUT_CODIGO_POSTAL),
                Click.on(CheckoutPage.BUTTON_CONTINUAR)
        );
    }

}
