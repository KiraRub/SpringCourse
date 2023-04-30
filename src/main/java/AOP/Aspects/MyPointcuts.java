package AOP.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


public class MyPointcuts {
    @Pointcut("execution(* abc*(..))")
    public void AllAddMethods() {
    }
}
