import java.util.Scanner;
import java.util.HashMap;

public class BobAndString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> map = new HashMap<>();
		String s = sc.next();
		int n = s.length();
		int ans = -1;
		for (int i = 0; i < n; i++) {
			if (map.containsKey(s.charAt(i))) {
				int dis = i - map.get(s.charAt(i)) - 1;
				ans = Math.max(ans, dis);
			} else {
				map.put(s.charAt(i), i);
			}
		}

		System.out.println(ans);
	}

}