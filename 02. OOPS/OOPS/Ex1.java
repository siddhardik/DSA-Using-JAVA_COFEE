class Employee{
    String name;
        private int emp_id;
    public void set_id(int id)
    {
        if(id>0)
        emp_id=id;
        else 
        System.out.println("Invalid id");
    }
    public int get_id()
    {
        return emp_id;
    }
    public void set_name(String n)
    {
        name=n;
    }
}
public class Ex1 {
    public static void main (String[] args) {
        Employee e=new Employee();  
        e.set_id(10);
        e.set_name("Naman");
        System.out.println(e.get_id()+" "+e.name);
    }
}