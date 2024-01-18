package S04.ex4;

import java.util.InputMismatchException;

public class IdadeInvalidaException extends InputMismatchException {

    public IdadeInvalidaException() {
        super("A idade precisa ser maior que zero e menor que cem!");
    }

    public IdadeInvalidaException(String message) {
        super(message);
    }
}
