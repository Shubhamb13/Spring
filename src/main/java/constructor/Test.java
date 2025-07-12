package constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor/construc.xml");
        Person p=context.getBean("person",Person.class);
        System.out.println(p);

        Ambiguity a=context.getBean("data",Ambiguity.class);
        a.addition();
    }
}