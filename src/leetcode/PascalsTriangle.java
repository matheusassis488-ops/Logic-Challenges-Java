import java.util.List;
import java.util.ArrayList;

class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {
            List<Integer> actual = new ArrayList<>();

            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {actual.add(1);}
                else {actual.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));}
            }

            result.add(actual);
        }

        return result;
    }
}
