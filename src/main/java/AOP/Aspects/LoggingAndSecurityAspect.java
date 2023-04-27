package AOP.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {
    @Pointcut("execution(* get*())")
    private void AllGetMethods() {
    }

    @Before("AllGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: попытка получить книгу/журнал");
    }

    @Before("AllGetMethods()")
    public void beforeGetSecurityAdvice() {

        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги или журнала");

    }
}
