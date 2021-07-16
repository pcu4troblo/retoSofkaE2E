package co.com.client.project.interactions.servicios;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.RestInteraction;
import net.thucydides.core.annotations.Step;

public class Put extends RestInteraction {
    private String resource;
    private String body;

    public Put(String resource, String body) {
        this.resource = resource;
        this.body = body;
    }

    @Step("{0} executes a PUT on the resource #resource")
    @Override
    public <T extends Actor> void performAs(T actor) {
        rest().contentType(ContentType.JSON)
                .relaxedHTTPSValidation()
                .body(body)
                .when()
                .put(resource);
    }
}
