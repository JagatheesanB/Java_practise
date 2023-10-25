package J_Collection;

public class Student {
    private int rollno;
    private String name;

    public Student() {
    }

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public void SetRollNo(int rollno){
        this.rollno=rollno;
    }

    public void SetName(String name){
        this.name=name;
    }
}
