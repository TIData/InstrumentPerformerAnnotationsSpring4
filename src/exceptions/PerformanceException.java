package exceptions;

public class PerformanceException extends RuntimeException {

    public PerformanceException() {
    }

    public PerformanceException(String message) {
        super(message);
    }
}