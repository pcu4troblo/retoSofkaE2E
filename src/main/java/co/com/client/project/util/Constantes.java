package co.com.client.project.util;

import co.com.client.project.exceptions.FalloEnPrueba;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Constantes {

    private Constantes() {
    }

    public static class PropertiesManager {

        private PropertiesManager() {

        }

        public static final String RUTA_PROPERTIES = "src/test/resources/properties/configuracion.properties";
        public static final Logger LOGGER = LoggerFactory.getLogger(PropertiesManager.class);
        public static final String URL = getProperty("url");
        public static final String ENDPOINT = getProperty("endpoint");

        private static String getProperty(String key)
        {
            Properties propertiesFile = loadProperties();
            return propertiesFile.getProperty(key);
        }

        public static Properties loadProperties() {
            Properties properties = new Properties();
            try (FileInputStream file = new FileInputStream(RUTA_PROPERTIES)){
                LOGGER.info("Cargando datos de configuracion.properties");
                properties.load(file);
            } catch (IOException e) {
                LOGGER.error(e.getMessage());
                throw new FalloEnPrueba("Error al abrir el archivo properties configuracion.properties");
            }
            return properties;
        }
    }

    public static class Messages {

        private Messages(){}

        public static final String MSG_FIN_PRUEBA = "Finaliza test";
        public static final String MSG_INICIA_PRUEBA = "Inicia test";
        public static final String MSG_EXEC_ACCION = "Validando resultado de la accion: {}";
        public static final String MSG_EXEC_ACCION_PAGINA = "Accediendo a la pagina: {}";
        public static final String MSG_FIN_ACCION_PAGINA = "Página cargada con exito";
    }

}
