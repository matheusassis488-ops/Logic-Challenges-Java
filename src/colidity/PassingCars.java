public class PassingCars {
    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1, 1, 1};
        System.out.println(solution(A));
    }

    public static int solution(int[] vet) {
        if(vet.length == 1000000000) {return -1;}

        int carrosLeste = 0;
        int pares = 0;

        for(int i : vet) {
            if(i == 0) {carrosLeste++;}
            else {pares += carrosLeste;}
        }

        return pares;
    }
}
