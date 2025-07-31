package Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class first {
public static void main(String[] args) {
   ApplicationContext context= new ClassPathXmlApplicationContext("Stereotype/stereo.xml");
   Second second =context.getBean("second",Second.class);
   Second second1 =context.getBean("second",Second.class);
   // System.out.println(second);
   // System.out.println(second.getCourses());
   // System.out.println(second.getCourses().getClass().getName());
   // System.out.println(second.hashCode());
   // System.out.println(second1.hashCode());

   Man man=context.getBean("ms1",Man.class);
   Man man1=context.getBean("ms1",Man.class);


   System.out.println(man.hashCode());
   System.out.println(man1.hashCode());


}
}
