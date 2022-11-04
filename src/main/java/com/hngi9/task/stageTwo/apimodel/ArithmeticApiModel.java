package com.hngi9.task.stageTwo.apimodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hngi9.task.stageTwo.model.OperationType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArithmeticApiModel {
    private String slackUsername;
    private int result;
    @JsonProperty("operation_type")
    private OperationType operationType;
}
