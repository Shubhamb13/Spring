package standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class First {
    

    private List<String> fruits;
    private Set<String> water;
    private Map<Integer,String> courses;
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setcourses(Map<Integer,String> courses){
        this.courses=courses;
    }

    public Map<Integer,String> getcourses(){
        return courses;
    }


    public void setfruits(List<String> fruits){
        this.fruits=fruits;
    }

    public List<String> getfruits(){
        return fruits;
    }

    public void setwater(Set<String> water){
        this.water=water;
    }

    public Set<String> getwater(){
        return water;
    }

}
