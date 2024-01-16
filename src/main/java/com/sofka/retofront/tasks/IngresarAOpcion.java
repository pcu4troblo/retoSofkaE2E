package com.sofka.retofront.tasks;

import com.sofka.retofront.userinterfaces.saucedemo.CarritoPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarAOpcion {
    public static Performable carritoDeCompras(){
        return Task.where("{0} ingresa al carrito de compras.",
                Click.on(CarritoPage.LABEL_CANTIDAD_PRODUCTOS_CARRITO)
        );
    }

    public static Performable checkout(){
        return Task.where("{0} ingresa al checkout de la compra.",
                Click.on(CarritoPage.BUTTON_CHEKOUT)
        );
    }
}
