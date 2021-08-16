package aop.aspects;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public void aroundReturnBookLoggingAdvice() {
        System.out.println("aroundReturnBookLoggingAdvice: returns a book to the library");
    }
}
