import java.util.ArrayList;
public class TraverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(17);
        list.add(28);
        list.add(33);
        list.add(46);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        for(int i:list){
            System.out.println(i); // Enhanced for loop For-Each Loop


        }

        // Convert ArrayList To Int[] Array
        int[] ansArray = list.stream().mapToInt(Integer::intValue).toArray();
       
        for(int i:ansArray){
            System.out.println(i); // Enhanced for loop For-Each Loop


        }
}
} 

/*
17
28
33
46
17
28
33
46
 */