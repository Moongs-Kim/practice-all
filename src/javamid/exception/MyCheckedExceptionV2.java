package javamid.exception;

public class MyCheckedExceptionV2 extends Exception {

    private String errorCode;

    public MyCheckedExceptionV2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
