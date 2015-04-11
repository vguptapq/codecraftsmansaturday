package com.craftsman.calc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class MathResponse {
    private Double answer;

    public MathResponse(Double answer) {
        this.setAnswer(answer);
    }

    public Double getAnswer() {
        return answer;
    }

    public void setAnswer(Double answer) {
        this.answer = answer;
    }
}
