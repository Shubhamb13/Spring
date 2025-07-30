package Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class first {
public static void main(String[] args) {
   ApplicationContext context= new ClassPathXmlApplicationContext("Stereotype/stereo.xml");
   Second second =context.getBean("second",Second.class);
   System.out.println(second);
   System.out.println(second.getCourses());
   System.out.println(second.getCourses().getClass().getName());

}
}
