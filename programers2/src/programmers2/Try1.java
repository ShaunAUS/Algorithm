package programmers2;

import java.util.HashMap;
import java.util.HashSet;

class Try1 {
	//프로그래머스 2   실패작
	
	// { "321" , "321555" "6315" "12222"}
	// 접두어 있으면 false  없으면 true
    public boolean solution(String[] phone_book) {
    	
    	
    	
    	HashMap<String, Boolean> hm = new HashMap();
    	
    	for(String key: phone_book) {
    		// 값하나를 받아 hahsMap 일치하는게 있는지 찾아본다.
    		//hm.put(key, hm.getOrDefault((!key.startsWith(key)),true));
    		
    		
    		//hashMap에 값 다넣음
    		hm.put(key, null);
    	}
    	
    	for(int k=0;k<=hm.size() ;k++) {
    		hm.getOrDefault(hm.get, null);
    	
    	}
  
    	
    
		  
		  }
		 

    	
        boolean answer = true;
        return answer;
    }
    
    
    
    
   

