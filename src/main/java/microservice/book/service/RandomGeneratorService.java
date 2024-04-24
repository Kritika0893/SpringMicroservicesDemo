package microservice.book.service;

import org.springframework.stereotype.Service;

@Service

public interface RandomGeneratorService {
    int generateRandomFactor();
}
