package ricky.oknet.exception;

public class ServerException extends Exception {

    public static ServerException INSTANCE(String msg) {
        return new ServerException(msg);
    }
    public ServerException(String detailMessage) {
        super(detailMessage);
    }
}
