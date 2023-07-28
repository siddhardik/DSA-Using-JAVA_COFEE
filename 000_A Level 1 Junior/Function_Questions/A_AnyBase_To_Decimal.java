import java.util.Scanner;
public class A_AnyBase_To_Decimal{
    
    public static int AnyBase_To_Decimal(int input,int base){
        int result=0;
        int mul=1;
        while(input>0){
             result += (input%10)*mul;
             mul*=base;
             input/=10;
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A number : ");
        int num=sc.nextInt();
        System.out.print("Enter  number's Base  : ");
        int base=sc.nextInt();
        System.out.print(AnyBase_To_Decimal(num,base));

    }
}

/*

 Enter A number : 1172
 Enter  number's Base  : 8
 634

 */