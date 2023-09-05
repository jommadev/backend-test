package com.jomma.api.Entities;

public class LoginResponse {
    private int error;
    private int userId;
    private String isValid;
    private String msg;

    // Default constructor
    public LoginResponse() {
    }

    // Constructor with all fields
    public LoginResponse(int error, int userId, String isValid, String msg) {
        this.error = error;
        this.userId = userId;
        this.isValid = isValid;
        this.msg = msg;
    }

    // Getters and setters for all fields

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getisValid() {
        return isValid;
    }

    public void isValid(String isValid) {
        this.isValid = isValid;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
