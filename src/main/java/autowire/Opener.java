package autowire;

public class Opener {

    private Bottle data;

    public void setBottle(Bottle data) {
        System.out.println("setting value");
        this.data = data;
    }

    public Bottle getdata() {
        return data;
    }

    public String toString(){
        return "data "+data;
    }
    public Opener(Bottle data){
        this.data=data;
        System.out.println("constrctor");
    }
}
