package exception;

public class UnderflowException extends RuntimeException {
    public UnderflowException() {
    }

    public UnderflowException(String s) {
        super(s);
    }
}
