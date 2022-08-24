package withXmlandAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("beanPerson")
public class Person {

    private Pet pet;

    @Autowired

    public Person(@Qualifier("beanDog") Pet pet) {
        this.pet = pet;
    }

    private String surname;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPet(Pet pet) {
        System.out.println("setting a pet to a person");
        this.pet=pet;
    }

    public void callYourPet () {
        System.out.println("Hello my lovely pet!");
        pet.say();
    }
}
