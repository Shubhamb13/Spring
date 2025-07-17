package standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Second {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("standalone/stand.xml");
        First f=context.getBean("f1",First.class);
        System.out.println(f.getfruits());
        System.out.println(f.getfruits().getClass().getName());
        System.out.println("_________________________");
        System.out.println(f.getwater());
        System.out.println(f.getwater().getClass().getName());
        System.out.println("_________________________");
        System.out.println(f.getcourses());
        System.out.println(f.getcourses().getClass().getName());
        System.out.println("_________________________");
        System.out.println(f.getProperties());
        System.out.println(f.getProperties().getClass().getName());

    }
}
