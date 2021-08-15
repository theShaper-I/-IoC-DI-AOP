package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExeptionHandlingAspect {
    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetExeptionHandlingAdvice() {
        System.out.println("beforeGetExeptionHandlingAdvice: ловимо/обробляємо " + "виключення при спробі отримати книгу/журнал");
    }
}
