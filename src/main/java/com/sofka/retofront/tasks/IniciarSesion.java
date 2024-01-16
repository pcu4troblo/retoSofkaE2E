package com.sofka.retofront.tasks;

import com.sofka.retofront.userinterfaces.saucedemo.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.model.util.EnvironmentVariables;

import static com.sofka.retofront.utils.enums.VariablesProperty.URL_SAUCEDEMO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesion implements Task {

    private EnvironmentVariables environmentVariables;

    public static IniciarSesion saucedemo(){
        return instrumented(IniciarSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(environmentVariables.getProperty(URL_SAUCEDEMO.getProperty())),
                Enter.theValue("standard_user").into(LoginPage.INPUT_USUARIO),
                Enter.theValue("secret_sauce").into(LoginPage.INPUT_CONTRASENA),
                Click.on(LoginPage.BUTTON_LOGIN)
        );
    }
}
