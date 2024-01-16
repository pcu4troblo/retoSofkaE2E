package com.sofka.retofront.tasks;

import com.sofka.retofront.userinterfaces.saucedemo.ProductosPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AnadirACarrito {
    public static Performable producto(String producto) {
        return Task.where("{0} añade el producto " + producto + "al carrito" ,
                Click.on(ProductosPage.BUTTON_ANADIR_AL_CARRITO.of(producto))
        );
    }
}
