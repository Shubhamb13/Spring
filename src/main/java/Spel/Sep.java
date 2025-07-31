package Spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sep {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spel/spel.xml");
        Lang lang=context.getBean("lang",Lang.class);

        System.out.println(lang);
    }
}
