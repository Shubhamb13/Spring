package Spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Lang {
    @Value("#{10}")
    private int a;
    @Value("#{20+20}")
    private int b;
 
    @Value("#{T(java.lang.Math).sqrt(144)}")
    private int sum;
     
    @Value("#{new java.lang.String('CSK')}")
    private String team;

    @Value("#{8>3}")
    private boolean isTrue;

    public boolean isTrue() {
        return isTrue;
    }
    public void setTrue(boolean isTrue) {
        this.isTrue = isTrue;
    }
    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public int getSum() {
        return sum;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }

    @Value("#{T(java.lang.Math).PI}")
    private int sub;

    public int getSub() {
        return sub;
    }
    public void setSub(int sub) {
        this.sub = sub;
    }
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
        
        return "A=" + a +" B="+b +" SQRRT is= "+sum  +" PI value is= "+sub + "Team is= "+ team + " ISTrue= " +isTrue;
    }
}
