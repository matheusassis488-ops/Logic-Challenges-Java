class ValidParentheses {
    public boolean isValid(String str) {
        Stack<Character> pilha = new Stack<>();
	    
	    for(char c : str.toCharArray()) {
	        if(c == '(' || c == '[' || c == '{') {pilha.push(c);}
	        else {
	            if(pilha.isEmpty()) {return false;}
	            char ch = pilha.pop();
	            
	            if(ch == '(' && c != ')') {return false;}
	            if(ch == '[' && c != ']') {return false;}
	            if(ch == '{' && c != '}') {return false;}
	        }
	    }
	    
	    return pilha.isEmpty();
    }
}
