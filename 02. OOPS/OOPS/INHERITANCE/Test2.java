class Person 
{ 
    void fun() 
    { 
        System.out.print("person class"); 
    } 
} 
class Student extends Person 
{ 
    void fun() 
    { 
        System.out.print("student class"); 
    } 
    void display() 
    { 
        fun(); 
        super.fun(); 
    } 
} 
class Test2
{ 
    public static void main(String args[]) 
    { 
        Student s = new Student(); 
            s.display();   //student classperson class
    } 
} 