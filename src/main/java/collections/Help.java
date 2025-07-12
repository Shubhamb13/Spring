package collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Help {
    public static void main (String []args){
        ApplicationContext obj=new ClassPathXmlApplicationContext("collections/newconfig.xml");
        Emp ob=obj.getBean("demo1",Emp.class);
        System.out.println(ob.getName());
        System.out.println(ob.getId());
        System.out.println(ob.getCourses());
        System.out.println(ob.getDatas());
    }
    
}
