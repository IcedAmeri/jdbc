package hello.jdbc.repository.ex;

public class MyDupliacteKeyException extends MyDbException {
    public MyDupliacteKeyException() {
    }

    public MyDupliacteKeyException(String message) {
        super(message);
    }

    public MyDupliacteKeyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyDupliacteKeyException(Throwable cause) {
        super(cause);
    }
}
