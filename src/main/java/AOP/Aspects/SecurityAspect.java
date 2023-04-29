package AOP.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("AOP.Aspects.MyPointcuts.AllGetMethods()")
    public void beforeGetSecurityAdvice() {

        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги или журнала");

    }
}
