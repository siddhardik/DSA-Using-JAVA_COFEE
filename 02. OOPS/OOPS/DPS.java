class Student1{
    int roll_number;
    String name;
}
public class DPS {
    public static void main (String[] args) {
        Student1 s=new Student1();
        s.roll_number=5;
        s.name="Rohit";
        System.out.println(s.roll_number+" "+s.name);
    }
}