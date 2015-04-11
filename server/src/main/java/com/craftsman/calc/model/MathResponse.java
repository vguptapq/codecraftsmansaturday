package com.craftsman.calc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class MathResponse {
    private Float answer;

    public MathResponse(Float answer) {
        this.setAnswer(answer);
    }

    public Float getAnswer() {
        return answer;
    }

    public void setAnswer(Float answer) {
        this.answer = answer;
    }


}
