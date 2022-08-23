package withXmlandAnnotations;

import org.springframework.stereotype.Component;

@Component("beanCat")
public class Cat implements Pet {

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
