package se.andolf.exceptions;

/**
 * Created by Thomas on 2016-06-12.
 */
public class NodeNotFoundException extends RuntimeException {

    public NodeNotFoundException(String message) {
        super(message);
    }

    public NodeNotFoundException(Throwable cause) {
        super(cause);
    }

    public NodeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
