package co.com.client.project.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Page extends PageObject {

    public static final Target WEB_ELEMENT = Target.the("Elemento web esperado")
            .locatedBy("//*[]"); //TODO completar path o cambiar por selector optimo

}
