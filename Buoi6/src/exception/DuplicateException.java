package exception;

public class DuplicateException extends Exception{
    private String message;

    public DuplicateException(String message) {
        super(message);
        this.message = message;
    }
}
