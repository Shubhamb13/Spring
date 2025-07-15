package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Life {
    public static void main(String[] args) {
     AbstractApplicationContext context =  new ClassPathXmlApplicationContext("lifecycle/lifeconfig.xml");
    //  Cycle c = context.getBean("leaf", Cycle.class);
    //  System.out.println(c);
     context.registerShutdownHook();

    // Interface inter= context.getBean("interfaces",Interface.class);
    // System.out.println(inter);

    // Dog d=context.getBean("d1",Dog.class);
    // System.out.println(d);

    

    }
}
