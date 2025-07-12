package collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {

    private List<Integer> id;
    private Set<String> name;
    private Map<String, String> courses;
    private Properties datas;

    public void setDatas(Properties datas){
        this.datas=datas;
    }
     public Properties getDatas(){
        return datas;
     }
    public void setId(List<Integer> id) {
        this.id = id;
    }

    public  List<Integer> getId(){
        return id;
    }

    public void setName(Set<String> name) {
        this.name = name;
    }

    public Set<String> getName() {
        return name;
    }

    public void setCourses(Map<String,String>courses){
        this.courses=courses;
    }

    public Map<String,String> getCourses(){
        return courses;
    }

    // public Emp()
    // {
        
    // }
}
