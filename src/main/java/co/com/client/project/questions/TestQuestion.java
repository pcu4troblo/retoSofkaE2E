package co.com.client.project.questions;

import net.serenitybdd.screenplay.Question;

public class TestQuestion {

    private TestQuestion() {
    }

    public static ValidarAccion validarAccion() {
        return new ValidarAccion();
    }
}
