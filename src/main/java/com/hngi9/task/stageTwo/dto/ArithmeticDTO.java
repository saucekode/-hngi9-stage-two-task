package com.hngi9.task.stageTwo.dto;

import com.hngi9.task.stageTwo.model.OperationType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArithmeticDTO {
    private OperationType operationType;
    private int x;
    private int y;
}
