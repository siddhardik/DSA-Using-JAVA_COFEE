
public class StudentUse{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        s1.name="Siddhi";
        s1.rollNo=23;
        System.out.println(s1.name);
        System.out.println(s1.rollNo);


    }
}