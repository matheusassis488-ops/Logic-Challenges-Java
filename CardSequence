public class CardSequence {

    public static void main(String[] args) {
        String input = "1 2 3 4 5"; 
        System.out.println("RESULT: " + solution(input));
    }

    public static char solution(String n) {
        String[] parts = n.split(" ");
        int[] nums = new int[parts.length];
        
        int cresc = 0;
        int decresc = 0;
        
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                cresc++;
            } else if (nums[i] > nums[i + 1]) {
                decresc++;
            }
        }

        if (cresc == nums.length - 1) {
            return 'C';
        } else if (decresc == nums.length - 1) {
            return 'D';
        } else {
            return 'N';
        }
    }
}
