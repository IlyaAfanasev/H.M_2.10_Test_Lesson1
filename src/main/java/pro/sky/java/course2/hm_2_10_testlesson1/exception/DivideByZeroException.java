package pro.sky.java.course2.hm_2_10_testlesson1.exception;

public class DivideByZeroException extends IllegalArgumentException {
    public DivideByZeroException(String s) {
        super(s);
    }

    public DivideByZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public DivideByZeroException(Throwable cause) {
        super(cause);
    }

    public DivideByZeroException() {
    }
}
