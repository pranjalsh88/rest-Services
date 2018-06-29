package com.in28minutes.rest.webservices.restfulwebservices;

public class HelloBean {
    String message;

    public HelloBean(String n) {
        this.message = n;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "HelloBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
