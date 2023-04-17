package com.iteso.model;

public class Buffer {

    private Object objectInBuffer = null;

    // fill put place add store
    public boolean store(Object obj) {
        if(this.objectInBuffer == null) {
            this.objectInBuffer = obj;
            return true;
        }
        return false;
    }

    public Object peek() {
        return this.objectInBuffer;
    }

    // yeet, get, pull, take, extract, pop
    public Object pop() {
        Object tmp = this.objectInBuffer;
        this.objectInBuffer = null;
        return tmp;
    }

}
