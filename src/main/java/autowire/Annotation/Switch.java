package autowire.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Switch {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire/Annotation/autowireannotation.xml");
        Button b = context.getBean("b1", Button.class);
        System.out.println(b);
    }
}
