package autowire.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Button {

    @Autowired
    @Qualifier("lap2")
    private Lap lap;

    public Lap getLap() {
        return lap;
    }

   
    public void setLap(Lap lap) {
        System.out.println("Inside Setter");
        this.lap = lap;
    }

    public String toString() {
        return "Lap name is = " + lap;
    }
    
    // public Button(Lap lap) {
    // System.out.println("Inside Constructor");
    // this.lap = lap;
    // }

}
