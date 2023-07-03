package pl.milosz.library.exception;

public class PublicationAlreadyExistsException extends RuntimeException {
    public PublicationAlreadyExistsException(String message) {
        super(message);
    }
}