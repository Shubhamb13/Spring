package autowire;

public class Bottle {

    private String name;
    private String fill;

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setfill(String fill){
        this.fill=fill;
    }
    public String getfill(){
        return fill;
    }

    public String toString(){
        return "name "+name+"fill "+fill;
    }
}
