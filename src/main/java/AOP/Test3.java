package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts.");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        try {
            UniLibrary unilibrary = context.getBean("Library", UniLibrary.class);
            String bookName = unilibrary.returnBook();
            System.out.println("В библиотеку вернули книгу: " + bookName);
        } catch (Exception a) {
            System.out.println("Поймано исключение: " + a);
        }
        context.close();
        System.out.println("Method main ends.");
    }
}
