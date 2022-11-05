package com.hngi9.task.stageTwo.controller;

import com.hngi9.task.stageTwo.apimodel.ArithmeticApiModel;
import com.hngi9.task.stageTwo.dto.ArithmeticDTO;
import com.hngi9.task.stageTwo.service.ArithmeticService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.InputMismatchException;

@RestController
@RequestMapping("/v1/arithmetic/process")
public class ArithmeticController {

    private final ArithmeticService arithmeticService;

    public ArithmeticController(ArithmeticService arithmeticService) {
        this.arithmeticService = arithmeticService;
    }

    @PostMapping("calculate")
    public ResponseEntity<ArithmeticApiModel> performCalculations(@RequestBody ArithmeticDTO arithmeticDTO){
        return new ResponseEntity<>(arithmeticService.performCalculation(arithmeticDTO), HttpStatus.OK);
    }
}
