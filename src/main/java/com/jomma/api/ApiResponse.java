package com.jomma.api;

public class ApiResponse {
    private int error;
    private int userId;
    private int otp;
    private String msg;

    // Default constructor
    public ApiResponse() {
    }

    // Constructor with all fields
    public ApiResponse(int error, int userId, int otp, String msg) {
        this.error = error;
        this.userId = userId;
        this.otp = otp;
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

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
