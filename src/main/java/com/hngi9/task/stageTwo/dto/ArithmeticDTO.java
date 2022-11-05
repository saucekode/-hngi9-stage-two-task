package com.hngi9.task.stageTwo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hngi9.task.stageTwo.model.OperationType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArithmeticDTO {
    @JsonProperty("operation_type")
    private OperationType operationType;
    private int x;
    private int y;
}
