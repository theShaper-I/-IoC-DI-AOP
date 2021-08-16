package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExeptionHandlingAspect {
    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExeptionHandlingAdvice() {
        System.out.println("beforeAddExeptionHandlingAdvice: ловимо/обробляємо " + "виключення при спробі отримати книгу/журнал");
        System.out.println("--------------------------------");
    }
}
