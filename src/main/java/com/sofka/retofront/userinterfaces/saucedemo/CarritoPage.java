package com.sofka.retofront.userinterfaces.saucedemo;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoPage {
    public static final Target LABEL_CANTIDAD_PRODUCTOS_CARRITO = Target.the("Label cantidad de productos en el carrito")
            .locatedBy("//span[@class='shopping_cart_badge']");

    public static final Target LABEL_PRODUCTO = Target.the("{0} Label del producto añadido")
            .locatedBy("//*[text()='{0}']");

    public static final Target BUTTON_CHEKOUT = Target.the("Boton checkout")
            .locatedBy("#checkout");
}
