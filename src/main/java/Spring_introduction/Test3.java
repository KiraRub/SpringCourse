package Spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        //Pet pet = new Cat();
        ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Pet pet = Context.getBean("myPet", Pet.class);//Получаем из контейнера объект питомца
        Person person = Context.getBean("myPerson", Person.class);//Получаем из контейнера объект человека
        person.CallYourPet();//Вызов метода питомца из класса человека
        System.out.println(person.getAge()+" "+person.getSurname());
        Context.close();//Закрытие бина
    }
}
