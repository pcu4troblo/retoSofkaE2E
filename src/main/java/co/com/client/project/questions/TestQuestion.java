package co.com.client.project.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TestQuestion implements Question {

    public static TestQuestion validarAccion() {
        return new TestQuestion();
    }

    @Override
    public Object answeredBy(Actor actor) {
        boolean resultado = true; //TODO Implementar validacion logica
        return resultado;
    }

}
