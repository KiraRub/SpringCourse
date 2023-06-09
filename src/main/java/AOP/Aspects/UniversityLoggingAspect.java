package AOP.Aspects;

import AOP.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents(..))")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: Логируем получение списка студентов перед методом getStudents");
//    }

    //    @AfterReturning(pointcut = "execution(* getStudents(..))", returning = "students")
////После AfterReturning можно изменять данные в методе который закончился хорошо, но ещё не вернул результат
//    public void AfterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//        //НИЖЕ КОД КОТОРЫЙ ОТРАБАТЫВАЕТСЯ ПОСЛЕ МЕТОДА getStudent, тут происходит изменение данных на выходе.
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr." + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double average = firstStudent.getAvgGrade();
//        average = average + 1.0;
//        firstStudent.setAvgGrade(average);
//
////        firstStudent.setCourse(1);
//
//        System.out.println("AfterReturningGetStudentsLoggingAdvice: Логируем получение списка студентов после работы метода getStudents");
//    }
//    @AfterThrowing(pointcut = "execution(* getStudents(..))", throwing = "exception")
//    public void AfterThrowingGetStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("AfterThrowingGetStudentsLoggingAdvice: логируем выброс исключения " + exception);
//    }

    @After("execution(* getStudents(..))")
    public void afterLoggingGetStudentsAdvice() {
        System.out.println("afterLoggingGetStudentsAdvice: логируем нормальное выполнение программы или выброс исключения");
    }
}
