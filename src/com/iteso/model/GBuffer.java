package com.iteso.model;

public class GBuffer<Type> {

    private Type objectInBuffer = null;

    @Override
    public String toString() {
        return this.objectInBuffer == null? "Cajón vacío" : "Cajón de " + objectInBuffer;
    }

    // fill put place add store
    public boolean store(Type obj) {
        if(this.objectInBuffer == null) {
            this.objectInBuffer = obj;
            return true;
        }
        return false;
    }

    public Type peek() {
        return this.objectInBuffer;
    }

    // yeet, get, pull, take, extract, pop
    public Type pop() {
        Type tmp = this.objectInBuffer;
        this.objectInBuffer = null;
        return tmp;
    }

}
