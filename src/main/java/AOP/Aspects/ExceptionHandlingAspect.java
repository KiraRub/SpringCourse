package AOP.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("AOP.Aspects.MyPointcuts.AllGetMethods()")
    public void beforeGetExceptionHandlingAdvice() {

        System.out.println("beforeGetExceptionHandlingAdvice: ловаим/обрабатываем" + "исключение при попытке получить книгу или журнал");

    }

}
