package lifecycle;

public class Cycle {
    
    private int data;

    public void setdata(int data){
        System.out.println("Setting values");
        this.data=data;
    }
    public int getdata(){
        return data;
    }
    
    public void init(){
        System.out.println("Inside Init");
    }

    @Override
    public String toString(){
        return "Value= "+data;
    }

    public void destroy(){
        System.out.println("Inside Destroy");
    }
}
