package ua.net.azhytnytskyi.articlesserver.dto;

public class RegisterInfoDto {

    private String userName;

    private String password;

    public RegisterInfoDto() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
