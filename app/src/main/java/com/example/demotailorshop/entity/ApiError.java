package com.example.demotailorshop.entity;

import androidx.annotation.NonNull;

import java.util.Collection;

public class ApiError {

    private int httpStatus;
    private String message;
    private Collection<String> errorList;

    public ApiError() {
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Collection<String> getErrorList() {
        return errorList;
    }

    public void setErrorList(Collection<String> errorList) {
        this.errorList = errorList;
    }

    @NonNull
    @Override
    public String toString() {
        return "ApiError{" +
                "httpStatus=" + httpStatus +
                ", message='" + message + '\'' +
                ", errorList=" + errorList +
                '}';
    }
}
