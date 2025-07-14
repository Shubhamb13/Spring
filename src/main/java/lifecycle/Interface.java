package lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Interface implements InitializingBean,DisposableBean {
    private String address;
    private int id;

    public void setaddress(String address) {
        this.address = address;
        System.out.println("Setting values");
    }

    public String getaddress() {
        return address;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
    }

  public String toString(){
    return "id is "+id+"address "+address;
  }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(" After Initalization");
       
    }

    @Override
    public void destroy() throws Exception {
      
        System.out.println(" Before Distroy");
    }

}
