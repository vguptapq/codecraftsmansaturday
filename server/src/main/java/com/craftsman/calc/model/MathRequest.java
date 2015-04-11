package com.craftsman.calc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MathRequest {
    private Float a;
    private Float b;
    private Operation operation;

    public MathRequest() {
    }

    public MathRequest(Float a, Float b, Operation operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public Float getB() {
        return b;
    }

    public void setB(Float b) {
        this.b = b;
    }

    public Float getA() {
        return a;
    }

    public void setA(Float a) {
        this.a = a;
    }

}
