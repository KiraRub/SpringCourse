package AOP.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
//    @Pointcut("execution(* AOP.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(public void AOP.UniLibrary.returnMagazine())")
//    private void returnMagazineFromLibrary() {
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromLibrary()")
//    private void allMethodsExceptReturnMagazineFromLibrary() {
//    }

    //
//    @Before("allMethodsExceptReturnMagazineFromLibrary()")
//    private void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: log #10");
//    }
//    @Pointcut("execution(* AOP.UniLibrary.get*())")
//    private void allGetsMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(* AOP.UniLibrary.return*())")
//    private void allReturnsMethodsFromUniLibrary() {
//    }
//
//    @Before("allGetsMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing log #1");
//    }
//
//    @Before("allReturnsMethodsFromUniLibrary()")
//    public void beforeReturnsLoggingAdvice() {
//        System.out.println("beforeReturnsLoggingAdvice: writing log #1");
//    }


    @Before("AOP.Aspects.MyPointcuts.AllGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice:Логирование попытки получить книгу/журнал");
    }


}
