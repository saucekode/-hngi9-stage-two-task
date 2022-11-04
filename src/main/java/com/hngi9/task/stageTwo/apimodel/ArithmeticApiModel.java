package com.hngi9.task.stageTwo.apimodel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ArithmeticApiModel {
    private String slackUsername;
    private int result;
    private String operationType;
}
