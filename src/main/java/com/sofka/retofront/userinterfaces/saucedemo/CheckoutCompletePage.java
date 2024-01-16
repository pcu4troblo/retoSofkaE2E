package com.sofka.retofront.userinterfaces.saucedemo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutCompletePage extends PageObject {

    public static final Target LABEL_GRACIAS_POR_COMPRA = Target.the("Label gracias por su compra")
            .locatedBy("//h2[text()='Thank you for your order!']");
}
