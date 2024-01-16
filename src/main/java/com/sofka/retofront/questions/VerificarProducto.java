package com.sofka.retofront.questions;

import com.sofka.retofront.userinterfaces.saucedemo.CarritoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarProducto implements Question<Boolean> {
    private String producto;

    public VerificarProducto (String producto){
        this.producto = producto;
    }

    public static VerificarProducto enCarrito(String producto) {
        return new VerificarProducto(producto);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return CarritoPage.LABEL_PRODUCTO.of(producto).resolveFor(actor).isVisible();
    }
}
