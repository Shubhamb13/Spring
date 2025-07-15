package lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Dog {
    private String food;

    public void setfood(String food){
        this.food=food;
    }
    public String getfood(){
        return food;
    }
    public String toString(){
        return "food name "+food;
    }

    @PostConstruct
    public void start(){
        System.out.println("started");
    }

    @PreDestroy
    public void end(){
        System.out.println("end");
    }

}
