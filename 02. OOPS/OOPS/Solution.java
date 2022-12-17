/*
 
 class Base {
     public final void show() {
         System.out.println("Base show");
     }
 }
 class Derived extends Base {
     public void show() {   //Error
         System.out.println("Derived show");
     }
 }
 public class Solution {
     public static void main(String[] args) {
         Base b = new Derived();
         b.show();
     }
 }
 */


/*
interface calculate {
   void cal(int item);
}
class display implements calculate {
   int x;
   public void cal(int item) {
       x = item * item;           
   }
}
class Solution {
   public static void main(String args[]) {
       display arr = new display();
       arr.x = 0;     
       arr.cal(2);
       System.out.print(arr.x);
   }
}
 * 
 // Output  : 4
 */


 interface A{
    public void method();
}
class One{
    public void method(){
        System.out.println("Class One method");
    }
}
class Two extends One implements A{
    public void method(){
        System.out.println("Class Two method");
    }
}
public class Solution extends Two{
    public static void main(String[] args){
        A a = new Two();
        a.method();     
    }
}