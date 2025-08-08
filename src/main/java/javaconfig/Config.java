package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("javaconfig")
public class Config {

    // @Bean
    // public Samosa getSamosa(){
    //     return new Samosa();
    // }

    // @Bean
    // public Student getstudent(){
    //     Student student=new Student(getSamosa());
    //     return student;
    // }
    
}
