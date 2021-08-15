package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Game of Thrones")
    private String name;

    public String getName() {
        return name;
    }
}
