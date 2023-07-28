import java.util.Scanner;

public class B_Decimal_To_AnyBase{
   
    public static int Decimal_To_AnyBase(int input,int destinationBase){
        int result = 0;
        int place=1;
        
        while(input>0){
            result +=(input%destinationBase)*place;
            place*=10;
            input/=destinationBase;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Decimal Number number [Base 10 ] : ");
        int num=sc.nextInt();
        System.out.print("Enter  number's Destination Base  : ");
        int destinationBase=sc.nextInt();
        System.out.print(Decimal_To_AnyBase(num,destinationBase));
    }
}

/*
 Enter A Decimal Number number [Base 10 ] : 634
 Enter  number's Destination Base  : 8
 1172
 */