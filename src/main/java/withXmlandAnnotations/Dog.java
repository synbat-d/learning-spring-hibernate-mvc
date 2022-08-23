package withXmlandAnnotations;

import org.springframework.stereotype.Component;

@Component("beanDog")
public class Dog implements Pet {

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
