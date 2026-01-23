public class VetRotation {
    public static void main(String[] args) {
        int[] vet = {1, 2, 3, 4};
        int[] res = solution(vet, 2);
      
        for(int i : res) {System.out.println(i);};
    }

    public static int[] solution(int[] vet, int k) {
        if (vet.length == 0 || k == 0) {return vet;}      
       
        int rotations = k % vet.length;
        if(rotations == 0) {return vet;}
        int[] newVet = new int[vet.length];

        for(int i = 0; i < vet.length; i++) {
            int newPos = (rotations + i) % vet.length;;
            newVet[newPos] = vet[i];
        }

        return newVet;        
    }
}
