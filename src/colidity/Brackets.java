import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        String s = "({[]})";
        System.out.println(solution(s));       
    }

    public static boolean solution(String s) {
        if(s.length() == 0) {return true;}
        if(s.length() % 2 != 0) {return false;}

        Stack<Character> pilha = new Stack<>();

        for(char i : s.toCharArray()) {
            if(i == '(' || i == '[' || i == '{') {pilha.push(i);}
            else {
                if(pilha.isEmpty()) {return false;}
                char peak = pilha.pop();

                if(i == ')' && peak != '(') {return false;}
                if(i == ']' && peak != '[') {return false;}
                if(i == '}' && peak != '{') {return false;}
            }
        }

        return pilha.isEmpty();
    }
}
