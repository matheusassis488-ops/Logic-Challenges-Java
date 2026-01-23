import java.util.Set;
import java.util.HashSet;

public class AlbumMissingCards {
	public static void main(String[] args) {
	    int[] a = {1, 2, 3, 4, 5, 6};

	    int res = solution(10, a);
	    System.out.println("MISSING CARDS: " + res);
	}
	
	public static int solution(int totalCards, int[] boughtCards) {
	    
	    Set<Integer> cards = new HashSet<>();
	    
	    for(int i : boughtCards) {
	        cards.add(i);
	    }
	    
	    return totalCards - cards.size();
	}
}
