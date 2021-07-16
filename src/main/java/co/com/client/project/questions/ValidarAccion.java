package co.com.client.project.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarAccion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado = true; //TODO Implementar validacion logica
        return resultado;
    }
}
