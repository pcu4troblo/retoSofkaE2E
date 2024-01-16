package com.sofka.retofront.userinterfaces.saucedemo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage extends PageObject {

    public static final Target INPUT_NOMBRE = Target.the("Campo de texto nombre")
            .locatedBy("#first-name");

    public static final Target INPUT_APELLIDO = Target.the("Campo de texto apellido")
            .locatedBy("#last-name");

    public static final Target INPUT_CODIGO_POSTAL = Target.the("Campo de texto codigo postal")
            .locatedBy("#postal-code");

    public static final Target BUTTON_CONTINUAR = Target.the("Botón continuar")
            .locatedBy("#continue");

    public static final Target BUTTON_TERMINAR = Target.the("Botón continuar")
            .locatedBy("#finish");


}
