public class NotDefault{
    int i;

    NotDefault(){
        System.out.println("I am User Defined non parameterized Constructor");
    }


    public static void main(String[] args) {
        Default obj= new Default();
        System.out.print("The Value Of i without Default Constructor " + obj.i);  // 0
    }
}
