package co.com.client.project.util;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Constantes {


    private Constantes() {
    }

    private static final String RUTA_PROPERTIES = "src/test/resources/properties/configuracion.properties";
    private static final Logger LOGGER = LoggerFactory.getLogger(Constantes.class);
    private static final Properties PROPERTIES = loadProperties();


    public static final String URL = PROPERTIES.getProperty("url");
    public static final String ENDPOINT = PROPERTIES.getProperty("endpoint");

    public static Properties loadProperties() {
        Properties properties = new Properties();
        try {
            LOGGER.info("Cargando datos de configuracion.properties");
            properties.load(new FileInputStream(RUTA_PROPERTIES));
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
            Assert.fail("Error al abrir el archivo properties configuracion.properties");
        }
        return properties;
    }

}
