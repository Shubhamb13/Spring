package constructor;

public class Lap {
   private String brand;

    Lap(String brand) {
        this.brand = brand;
    }
   @Override
   public String toString(){
        return brand;
    }
}
