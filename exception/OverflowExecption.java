package exception;

public class OverflowExecption extends RuntimeException {
    public OverflowExecption() {
    }

    public OverflowExecption(String s) {
        super(s);
    }
}
