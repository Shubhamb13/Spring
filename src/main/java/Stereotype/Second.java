package Stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Second {
    @Value("shubham")
    private String name;
    @Value("pune")
    private String address;
    @Value("#{mybean}")
    private List<String> Courses;

    public List<String> getCourses() {
        return Courses;
    }

    public void setCourses(List<String> Courses) {
        this.Courses = Courses;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String geString() {
        return name;
    }

    public String toString() {

        return "name is " + name + " addres is " + address;
    }
}
