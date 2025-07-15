package autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Combine {
    public static void main(String []args){
       AbstractApplicationContext context= new ClassPathXmlApplicationContext("autowire/autowire.xml");
        Opener o=context.getBean("data1",Opener.class);
        System.out.println(o);
    }
}
