package maratonajava.javacore.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Login invãlido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
