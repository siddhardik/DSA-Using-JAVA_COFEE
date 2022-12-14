class Test 
    { 
        int a; 
        int b; 

    public void set(int a, int b) 
    {  
        b = a; 
        this.b = b; 
    } 

    void display() 
    { 
        System.out.println("a=" + a + " b=" + b); 
    } 
}
public class ex2{
    public static void main(String[] args) 
    { 
        Test object = new Test();
        object.set(10,20);
        object.display(); 
    } 
} 
