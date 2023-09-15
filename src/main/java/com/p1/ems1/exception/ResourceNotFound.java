package com.p1.ems1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException{

    private  static final long serialVersionUID=1l;
    private String resourceName;
    private String fieldName;
    private Object fieldName2;

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Object getFieldName2() {
        return fieldName2;
    }

    public void setFieldName2(Object fieldName2) {
        this.fieldName2 = fieldName2;
    }

    public ResourceNotFound(String resourceName, String fieldName, Object fieldName2) {
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldName2 = fieldName2;
    }

    public ResourceNotFound() {
    }
}
