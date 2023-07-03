package pl.milosz.library.exception;

public class NoSuchFileTypeException extends RuntimeException {
    public NoSuchFileTypeException(String msg) {
        super(msg);
    }
}
