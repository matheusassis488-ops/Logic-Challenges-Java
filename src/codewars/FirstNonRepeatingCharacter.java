import java.util.Map;
import java.util.HashMap;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		System.out.println(solution("sTreSS"));
	}
	
	public static char solution(String str) {
	    
	    Map<Character, Integer> map = new HashMap<>();
	    
	    for(char c : str.toCharArray()) {
	        c = Character.toLowerCase(c);
	        map.put(c, map.getOrDefault(c, 0) + 1);
	    }
	    
	    for(char c : str.toCharArray()) {
	        if(map.get(Character.toLowerCase(c)) == 1) {return c;}
	    }
	    
	    return ' ';
	}
}
