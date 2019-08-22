package com.subhash.supplier;

class Optimize {
public boolean isNumber(String s) {
    if(s == null) return false;
    s = s.trim();
    if(s.length() == 0) return false;
	
    char current = s.charAt(0);
    
    boolean hasDot = false;
    boolean hasE = false;  
    boolean hasDigit = (current <= 57 && current >= 48) ? true : false;
    
    // IF FIRST CHAR IS NUMBER
    if(current > 57 || current < 48)
    	// IF FIRST CHAR IS NOT + OR -
    	if(current != 43 && current != 45)
    		// IF FIRST CHAR IS NOT .
    		if(current != '.')
    			return false;
    // IF FIRST CHAR IS .
    if(current == '.') hasDot = true;
    
    for(int x = 1; x < s.length(); x++) {
        
        // IF INDEX IS NOT ALLOWED RETURN FALSE
        if(s.charAt(x) > 57 || s.charAt(x) < 48) {
             if(s.charAt(x) != '+' && s.charAt(x) != '-' && s.charAt(x) != 'e' && s.charAt(x) != '.') 
                 return false;
        }
       
        // IF INDEX IS SPACE RETURN FALSE
        if(s.charAt(x) == 32) return false;
        
        // IF INDEX IS e 
        if(s.charAt(x) == 'e') {
            if(hasE) return false;
            else hasE = true;
        }
        
        // IF INDEX IS . AND STRING ALREADY HAS A DOT
        if(s.charAt(x) == '.') {
            if(hasE) return false;
            if(hasDot) return false;
            else hasDot = true;
        }
        
        // IF INDEX IS e AND PREVIOUS CHARACTER IS NOT A NUMBER OR . RETURN FALSE
        if(s.charAt(x) == 'e' && (current > 57 || current < 48) && current != '.')
            return false;
        
        // IF INDEX IS e AND NO DIGIT YET
        if(s.charAt(x) == 'e' && !hasDigit) return false;
        
        // IF INDEX IS - OR + AND PREVIOUS CHARACTER IS NOT e RETURN FALSE
        if((s.charAt(x) == '-' || s.charAt(x) == '+') && current != 'e') return false;
        
        // IF INDEX IS . AND PREVIOUS CHARACTER IS NOT 0-9 OR +
        if(s.charAt(x) == '.' && (current > 57 || current < 48) && (current != '+' && current != '-')) return false;
            
        // UPDATE CURRENT
        current = s.charAt(x);
        if(current <= 57 && current >= 48) hasDigit = true;
    }
    
    char last = s.charAt(s.length()-1);
    
    // IF LAST CHAR IS e, + or -
    if(last == 'e' || last == '+' || last == '-') return false;
    // IF STRING ONLY CONTAINS NON-DIGITS
    if(s.length() == 1 && (last == '.' || last == '-' || last == '+' || last == 'e')) 
       return false;

    if(hasDigit) return true;
    else return false;
    
}
}