package com.jomma.api;

public class SignRequest {
    private String phone;
    private String password;
    private String session;
    private String ipAddress;

    // Getter and setter methods for 'phone'
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Getter and setter methods for 'password'
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter and setter methods for 'session'
    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    // Getter and setter methods for 'ipAddress'
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}


