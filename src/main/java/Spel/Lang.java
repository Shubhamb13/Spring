package Spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Lang {
    @Value("#{10}")
    private int a;
    @Value("#{20+20}")
    private int b;

    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void setA(int a){
        this.a=a;
    }
    public int getA(){
        return a;
    }
    @Override
    public String toString() {
        
        return "A=" + a +" B="+b;
    }
}
