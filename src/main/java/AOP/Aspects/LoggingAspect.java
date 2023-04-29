package AOP.Aspects;

import AOP.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
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


    @Before("AOP.Aspects.MyPointcuts.AllAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("signature = " + signature);
        System.out.println("signature.getMethod() = " + signature.getMethod());
        System.out.println("signature.getReturnType() = " + signature.getReturnType());
        System.out.println("signature.getName() = " + signature.getName());

        System.out.println("beforeAddLoggingAdvice:Логирование попытки получить книгу/журнал");
        System.out.println("-----------------------------");
        if (signature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: название книги - " + myBook.getName() +
                            ", автор - " + myBook.getAuthor() +
                            ", год издания - " + myBook.getYearOfPublication());
                } else if (obj instanceof String) {
                    System.out.println("Книгу в библиотеку добавляет - " + obj);
                }
            }
        }
    }


}
