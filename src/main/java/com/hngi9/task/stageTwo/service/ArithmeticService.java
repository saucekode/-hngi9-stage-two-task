package com.hngi9.task.stageTwo.service;


import com.hngi9.task.stageTwo.apimodel.ArithmeticApiModel;
import com.hngi9.task.stageTwo.dto.ArithmeticDTO;
import org.springframework.stereotype.Service;


import static com.hngi9.task.stageTwo.model.OperationType.*;

@Service
public class ArithmeticService {

    public ArithmeticApiModel performCalculation(ArithmeticDTO arithmeticDTO) throws ArithmeticException{
        return ArithmeticApiModel
                .builder()
                .slackUsername("saucekode")
                .result(processArithmeticOperation(arithmeticDTO))
                .operationType(arithmeticDTO.getOperationType())
                .build();
    }

    private int processArithmeticOperation(ArithmeticDTO arithmeticDTO) {
        int x = arithmeticDTO.getX();
        int y = arithmeticDTO.getY();

        return switch (arithmeticDTO.getOperationType()){
            case addition -> addition.apply(x, y);
            case subtraction -> subtraction.apply(x, y);
            case multiplication -> multiplication.apply(x, y);
        };
    }

}
