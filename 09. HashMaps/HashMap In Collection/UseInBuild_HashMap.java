import java.util.HashMap;
import java.util.Set;
public class UseInBuild_HashMap{
    public static void main(String[] args) {
    HashMap<String , Integer> map = new HashMap<>();
    // insert into Map
    map.put("abc",1);
    map.put("def",3);
    //size
    map.put("abc",4);
    System.out.println(map.size());
    // presence key or not
    if(map.containsKey("abc")) {
    System.out.println("map has abc");
    }
    if(map.containsKey("abc1")) {
    System.out.println("map has abc1");
    }
    // get value via key
    int v = map.get("abc");
    System.out.println(v);
    int v1 = 0;
    if(map.containsKey("abc1")) {
    v1 = map.get("abc1");
    }
    System.out.println(v1);

    // All Above Function are TC =O(1)
    // remove
    // map.remove("abc1");
    // if(map.containsKey("abc")) {
    // System.out.println("map has abc");
    
    // iterator    KeySet TC= O(n)
    Set<String> Keys = map.keySet(); 
    for(String s:Keys) {
    System.out.println(s);
    }
    }
}

// 2
// map has abc
// 4
// 0
// abc
// def