package constructor;

public class Ambiguity {
    
    private int value1;
    private int value2;

    Ambiguity(int value1, int value2){
        this.value1=value1;
        this.value2=value2;
        System.out.println("Inside int");
    }
    Ambiguity(double value1, double value2){
        this.value1=(int)value1;
        this.value2=(int)value2;
        System.out.println("Inside Double");
    }
    Ambiguity(String value1,String value2){
        this.value1=Integer.parseInt(value1);
        this.value2=Integer.parseInt(value2);
        System.out.println("Inside String");
    }

    public void addition(){
        System.out.println("value1="+value1);
        System.out.println("addition= "+(value1+value2));
        System.out.println("value2="+value2);
    }
}
