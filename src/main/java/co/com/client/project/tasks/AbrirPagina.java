package co.com.client.project.tasks;

import co.com.client.project.util.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbrirPagina implements Task {

    private final String rutaPagina;
    private static final Logger LOGGER = LoggerFactory.getLogger(AbrirPagina.class);

    public AbrirPagina(String rutaPagina) {
        this.rutaPagina = rutaPagina;
    }

    /**
     * se abre el link del ambiente de pruebas seteado en ruta de propiedades
     * @return AbrirPagina
     */
    public static AbrirPagina url() {
        return Tasks.instrumented(AbrirPagina.class, Constantes.PropertiesManager.URL);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info(Constantes.Messages.MSG_EXEC_ACCION_PAGINA,rutaPagina);
        actor.attemptsTo(Open.url(rutaPagina));
        LOGGER.info(Constantes.Messages.MSG_FIN_ACCION_PAGINA);
    }
}
