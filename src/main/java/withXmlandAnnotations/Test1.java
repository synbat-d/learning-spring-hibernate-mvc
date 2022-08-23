package withXmlandAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Person;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Pet pet = context.getBean("beanCat", Pet.class);
        pet.say();
        context.close();

    }
}
