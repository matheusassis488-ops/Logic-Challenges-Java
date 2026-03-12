import java.util.List;
import java.util.ArrayList;

class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> past = new ArrayList<>();

        for(int i = 0; i <= rowIndex; i++) {
            List<Integer> actual = new ArrayList<>();

            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {actual.add(1);}
                else {actual.add(past.get(j-1) + past.get(j));}
            }

            past = actual;
        }

        return past;
    }
}
