package reference;

public class Student {
    
    private int Science_Mark;
    private Marks marks;

    public int getScience_Mark() {
        return Science_Mark;
    }

    public void setScience_Mark(int science_Mark) {
        Science_Mark = science_Mark;
    }

    

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }
 public String toString(){
    return "Science Marks is "+Science_Mark+"and Maths marks= "+marks;
 }
}
