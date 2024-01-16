package com.sofka.retofront.questions;

import com.sofka.retofront.userinterfaces.saucedemo.CarritoPage;
import com.sofka.retofront.userinterfaces.saucedemo.CheckoutCompletePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarCompra implements Question<Boolean> {
    public static VerificarCompra exitosa() {
        return new VerificarCompra();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return CheckoutCompletePage.LABEL_GRACIAS_POR_COMPRA.resolveFor(actor).isVisible();
    }
}
