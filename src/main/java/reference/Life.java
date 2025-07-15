package reference;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Life {
    public static void main(String[] args) {
     AbstractApplicationContext context =  new ClassPathXmlApplicationContext("reference/lifeconfig.xml");

Student s=context.getBean("s1",Student.class);
    System.out.println(s);

    }
}
