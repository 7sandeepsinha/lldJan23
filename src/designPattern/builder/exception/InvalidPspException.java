package designPattern.builder.exception;

public class InvalidPspException extends RuntimeException {
    public InvalidPspException() {
    }

    public InvalidPspException(String message) {
        super(message);
    }

    public InvalidPspException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPspException(Throwable cause) {
        super(cause);
    }

    public InvalidPspException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
