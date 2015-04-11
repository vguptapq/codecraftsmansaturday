package com.craftsman.calc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MathRequest {
    private Double a;
    private Double b;
    private Operation operation;

    public MathRequest() {
    }

    public MathRequest(Double a, Double b, Operation operation) {
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

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

}
