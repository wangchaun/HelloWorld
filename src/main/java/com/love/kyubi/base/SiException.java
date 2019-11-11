package com.love.kyubi.base;

/**
 * @program: silin
 * @description:
 * @author: siming.wang
 * @create: 2019-01-11 17:19
 **/

public class SiException extends Exception{
    private String message;

    public SiException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
