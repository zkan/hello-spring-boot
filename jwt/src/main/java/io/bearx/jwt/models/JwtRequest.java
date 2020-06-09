package io.bearx.jwt.models;

import java.io.Serializable;

public class JwtRequest implements Serializable {

    private static final long serialVersionUID = 5926468583005150707L;

    private Integer userId;

    // need default constructor for JSON Parsing
    public JwtRequest() {}

    public JwtRequest(Integer userId) {
        this.setUserId(userId);
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
