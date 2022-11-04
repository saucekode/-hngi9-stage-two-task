package com.hngi9.task.stageTwo.service;


import com.hngi9.task.stageTwo.apimodel.ArithmeticApiModel;
import com.hngi9.task.stageTwo.dto.ArithmeticDTO;
import com.hngi9.task.stageTwo.model.OperationType;
import org.springframework.stereotype.Service;

import java.util.InputMismatchException;

import static com.hngi9.task.stageTwo.model.OperationType.*;

@Service
public class ArithmeticService {

    public ArithmeticApiModel performCalculation(ArithmeticDTO arithmeticDTO) throws ArithmeticException{
        return ArithmeticApiModel
                .builder()
                .slackUsername("saucekode")
                .result(processArithmeticOperation(arithmeticDTO))
                .operationType(processOperationTypes(arithmeticDTO))
                .build();
    }

    private int processArithmeticOperation(ArithmeticDTO arithmeticDTO) {
        int x = arithmeticDTO.getX();
        int y = arithmeticDTO.getY();

        return switch (arithmeticDTO.getOperationType()){
            case "ADDITION", "addition" -> ADDITION.apply(x, y);
            case "SUBTRACTION", "subtraction" -> SUBTRACTION.apply(x, y);
            case "MULTIPLICATION", "multiplication" -> MULTIPLICATION.apply(x, y);
            default -> throw new ArithmeticException("Problem could be: wrong operation type or wrong input");
        };
    }

    private OperationType processOperationTypes(ArithmeticDTO arithmeticDTO){
        return switch (arithmeticDTO.getOperationType()){
            case "ADDITION", "addition" -> ADDITION;
            case "SUBTRACTION", "subtraction" -> SUBTRACTION;
            case "MULTIPLICATION", "multiplication" -> MULTIPLICATION;
            default -> throw new ArithmeticException("Problem could be: wrong operation type or wrong input");
        };
    }
}
