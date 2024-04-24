package microservice.book.controller;

import microservice.book.domain.Multiplication;
import microservice.book.service.MultiplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/multiplication")

public class MultiplicationController {
    private MultiplicationService multiplicationService;
    public MultiplicationController(final MultiplicationService multiplicationService){
        this.multiplicationService=multiplicationService;
    }
    @GetMapping("random")
    Multiplication getRandomMultiplication(){
        return  multiplicationService.createRandomMultiplication();
    }
}
