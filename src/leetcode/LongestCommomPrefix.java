class LongestCommomPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length < 1) {return "";}
  	    if(strs.length < 2) {return strs[0];}
  
  	    
  	    
  	    for(int i = 0; i < strs[0].length(); i++) {
  	        char current = strs[0].charAt(i);
  	        
  	        for(int j = 1; j < strs.length; j++) {
  	            if (i >= strs[j].length() || strs[j].charAt(i) != current) {
                      return strs[0].substring(0, i);
                }
  	        }	        
  	    }
  	    
  	    return strs[0];
    }
}
