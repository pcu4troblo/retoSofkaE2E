package com.sofka.retofront.userinterfaces.saucedemo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {

    public static final Target INPUT_USUARIO = Target.the("Campo de texto usuario")
            .locatedBy("#user-name");

    public static final Target INPUT_CONTRASENA = Target.the("Campo de texto contrasena")
            .locatedBy("#password");

    public static final Target BUTTON_LOGIN = Target.the("Boton logear")
            .locatedBy("#login-button");

}
