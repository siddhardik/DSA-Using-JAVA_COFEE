class A1{
    public static void main(String[] args){

    try{
       int a = 5/0;
    }
   
    catch(Exception e){
     System.out.print("Exception caught ");
 }
    catch(ArithmeticException e){
        System.out.print("Arithmetic Exception caught ");
   }      // error   Beacause Child ko samne rakho pita ko pichhe
   finally{
       System.out.print("finally block");
   } 
 }
}