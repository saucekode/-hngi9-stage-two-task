package com.hngi9.task.stageTwo.service;


import com.hngi9.task.stageTwo.apimodel.ArithmeticApiModel;
import com.hngi9.task.stageTwo.dto.ArithmeticDTO;
import org.springframework.stereotype.Service;

import java.util.InputMismatchException;

import static com.hngi9.task.stageTwo.model.OperationType.*;

@Service
public class ArithmeticService {

    public ArithmeticApiModel performCalculation(ArithmeticDTO arithmeticDTO) throws ArithmeticException{
        return ArithmeticApiModel
                .builder()
                .slackUsername("saucekode")
                .result(processOperationType(arithmeticDTO))
                .operationType(String.valueOf(arithmeticDTO.getOperationType()))
                .build();
    }

    private int processOperationType(ArithmeticDTO arithmeticDTO) {
        int x = arithmeticDTO.getX();
        int y = arithmeticDTO.getY();

        return switch (arithmeticDTO.getOperationType()){
            case "ADDITION", "addition" -> ADDITION.apply(x, y);
            case "SUBTRACTION", "subtraction" -> SUBTRACTION.apply(x, y);
            case "MULTIPLICATION", "multiplication" -> MULTIPLICATION.apply(x, y);
            default -> throw new ArithmeticException("Problem could be: wrong operation type or wrong input");
        };
    }
}
