package Spring_introduction;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Person bean is created!");
        this.pet = pet;
    }
    public void CallYourPet(){
        System.out.println("HelloMyLovelyPet");
        pet.say();
    }
}
