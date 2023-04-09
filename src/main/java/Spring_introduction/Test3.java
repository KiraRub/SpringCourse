package Spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        //Pet pet = new Cat();
        ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = Context.getBean("myPet", Pet.class);
        Person person = new Person(pet);
        person.CallYourPet();
        Context.close();
    }
}
