package co.com.client.project.exceptions;

public class FalloEnPrueba extends AssertionError {
    public FalloEnPrueba(String message, Throwable cause) {
        super(message, cause);
    }

    public FalloEnPrueba(String message) {
        super(message);
    }
}
