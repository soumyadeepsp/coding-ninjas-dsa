import java.util.*;

// given a string, print only the unique characters in the order in which they appear in the string

public class ExtractUniqueCharacter {
	public static String uniqueChar(String str){
		HashMap<Character, Boolean> map = new HashMap<>();
		for (int i=0; i<str.length(); i++) {
			if (!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), false);
			}
		}
		Set<Character> keys = map.keySet();
		String s = "";
		for (int i=0; i<str.length(); i++) {
			if (map.get(str.charAt(i))==false) {
				s = s + str.charAt(i);
				map.put(str.charAt(i), true);
			}
		}
		return s;
	}
}