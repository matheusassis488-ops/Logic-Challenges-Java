import java.util.HashSet;
import java.util.Set;

public class SimetricDifference {
    public static void main(String[] args) {
        int[] vet = {1, 2, 3, 4, 5, 6};
        int[] vet2 = {7, 8, 9, 10, 1, 2};

        int s =(solution(vet, vet2));
        System.out.println(s);
    }

    public static int solution(int[] list1, int[] list2) {
        if(list1.length == 0 && list2.length == 0) {return 0;}

        Set<Integer> l1 = new HashSet<>();
        Set<Integer> l2 = new HashSet<>();

        for(int i : list1) {l1.add(i);}
        for(int i : list2) {l2.add(i);}
        int count = 0;

        for(int i : l1) {
            if(!l2.contains(i)) {count++;}
        }

        for(int i : l2) {
            if(!l1.contains(i)) {count++;}
        }

        return count;
    }
}
