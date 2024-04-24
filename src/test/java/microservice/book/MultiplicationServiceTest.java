package microservice.book;

import microservice.book.domain.Multiplication;
import microservice.book.service.MultiplicationService;
import microservice.book.service.RandomGeneratorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.BDDAssumptions.*;

public class MultiplicationServiceTest {
    @MockBean
    private RandomGeneratorService randomGeneratorService;
    @Autowired
    private MultiplicationService multiplicationService;
    @Test
    public void createRandomMultiplicationTest(){

        Multiplication multiplication=multiplicationService.createRandomMultiplication();
        assumeThat(multiplication.getFactorA()).isEqualTo(50);
        assumeThat(multiplication.getFactorB()).isEqualTo(30);
        assumeThat(multiplication.getResult()).isEqualTo(1500);
    }
}
