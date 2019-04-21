package ua.net.azhytnytskyi.articlesserver.dto;


public class ResponseDto<T> {

    private boolean isSucceed;

    private T entity;

    private String message;

    public ResponseDto() {
    }

    public boolean isSucceed() {
        return isSucceed;
    }

    public void setSucceed(boolean succeed) {
        this.isSucceed = succeed;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
