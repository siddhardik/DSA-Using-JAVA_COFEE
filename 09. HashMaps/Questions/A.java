public class A {
    public static String addBinary(String a, String b) {
        int carry=0;
        String ans="";
      
        int tempSum=0;
        int l1=a.length();
        int l2=b.length();
        int i=l1-1;
        int j=l2-1;
        while(i>=0 && j>=0){
            tempSum= a.charAt(i) +b.charAt(j) -48-48+carry;
            System.out.println(tempSum);
            i--;
            j--;
            carry=0;
            if(tempSum>2){
                ans="1" +ans ;
                carry=1;
            }
            else if(tempSum>1){
                ans="0" +ans ;
                carry=1;
            }
            else{
                ans=tempSum +ans;
            }
        }
        while(i>=0){
           tempSum=carry+a.charAt(i)-48;
           carry=0;
           if(tempSum>1){
                ans="0" +ans ;
                carry=1;
            
            }
            else{
                ans=tempSum +ans;
            }
           i--;
        }

          while(j>=0){
           tempSum=carry+b.charAt(j)-48;
           carry=0;
           if(tempSum>1){
                ans="0" +ans ;
                carry=1;
            }
            else{
                ans=tempSum +ans;
            }
           j--;
        }
        if(carry!=0){
            ans=carry+ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        String ans ="";
        ans="0"+ans;
        ans="1" +ans;
        ans=2+ans;
        String a="110";
        String b="111";
        System.out.println(addBinary(a, b));

        System.out.println(ans);
    }
}
