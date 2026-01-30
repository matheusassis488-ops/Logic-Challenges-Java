import java.math.BigInteger;

public class StringIncrementer {
	public static void main(String[] args) {
		System.out.println(solution("matheus00037"));
	}
	
	public static String solution(String str) {
    
	    int i = str.length() - 1;
	    while(i >= 0 && Character.isDigit(str.charAt(i))) {i--;}
	    
	    String texto = str.substring(0, i + 1);
	    String numeros = str.substring(i + 1);
	    
	    if(numeros.length() == 0) {
	        str += '1';
	        return str;
	    }
	    
	    int size = numeros.length();
	    BigInteger num = new BigInteger(numeros);
	    num = num.add(BigInteger.ONE);
	    
	    String newNum = String.format("%0" + size + "d", num);
	    
	    return texto + newNum;
	}
}
