package com.sofka.retofront.userinterfaces.saucedemo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductosPage extends PageObject {
    public static final Target BUTTON_ANADIR_AL_CARRITO = Target.the("{0} Boton añadir al carrito")
            .locatedBy("//div[text()='{0}']//ancestor::div[@class='inventory_item']//button");

    public static final Target BUTTON_BORRAR_DEL_CARRITO = Target.the("Boton borrar del carrito")
            .locatedBy("#remove-sauce-labs-backpack");
}
