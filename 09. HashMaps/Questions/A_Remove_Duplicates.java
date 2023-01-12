
import java.util.ArrayList;
import java.util.HashMap;
public class A_Remove_Duplicates{

    public static int maxFrequencyNumber(int[] arr){ 
		HashMap<Integer,Integer> map =new HashMap<>();
		for (int e: arr){
			if(map.containsKey(e)){
				int inc=map.get(e);
				inc++;
                // System.out.println("Element "+ e + " val : "+ inc);
				map.put(e,inc);
			}
			else{
				map.put(e,1);
			}
		}

		int ans=arr[0];
		int times=0;
		for(int e:arr){
              if(map.get(e)>times){
				  ans=e;
                  times = map.get(e);
			  }
		}
	return ans;
    }
    public static ArrayList<Integer>  removeDuplicates(int arr[]){
           HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
           for(int ele:arr){
            if(!map.containsKey(ele)){

                map.put(ele,1);
            }
           }
           ArrayList<Integer> result = new ArrayList<Integer>();
           for(int i:arr){
            if(map.containsKey(i)){
                 result.add(i);
                 map.remove(i);
           }
    }
    return result;
}

    public static void main(String[] args) {
        int arr[]={1,4,5,2,3,4,6,7,7,8,8,67,6,4,2,2,2,2,2,2};
        for(int i:removeDuplicates(arr)){
            System.out.println(i +" ");
        }
        System.out.println("Maximum Frequency Number : " + maxFrequencyNumber(arr));

    }
}