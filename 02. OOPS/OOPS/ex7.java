class Test 
{
    static int a = 10; 
    int b = 20; 
    static void fun1() 
    { 
        a = 20;                             //Line 1
        b = 10;                             //Line 2
        fun2();                             //Line 3
        System.out.print(this.b);           //Line 4
    } 
    void fun2() 
    {     
        System.out.println("from m2"); 
    }
}
class ex7{    
    public static void main(String[] args) 
    { 
        Test.fun1(); 
    } 
} 