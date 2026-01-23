import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class QueueDropout
{
	public static void main(String[] args) {
	    int[] a = {10, 20, 30, 40, 50, 60};
	    int[] b = {20, 50};
	    
	    List<Integer> res = solution(a, b);
	    System.out.println(res);
	}
	
	public static List<Integer> solution(int[] A, int[] B) {
	    
	    List<Integer> res = new ArrayList<>();
	    Set<Integer> dropout = new HashSet<>();
	    
	    for(int i : B) {dropout.add(i);}
	    
	    for(int i : A) {
	        if(!dropout.contains(i)) {res.add(i);}
	    }
	    
	    return res;
	}
}
