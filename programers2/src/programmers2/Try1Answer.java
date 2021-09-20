package programmers2;

public class Try1Answer {
	
	
		//프로그래머스 2 정답
	    public boolean Programmers2Answer(String[] phoneBook) {
	    	
	       for(int i=0; i<phoneBook.length-1; i++) {
	            for(int j=i+1; j<phoneBook.length; j++) {
	            	
	                if(phoneBook[i].startsWith(phoneBook[j])) {
	                	
	                	return false;
	                	}
	                
	                if(phoneBook[j].startsWith(phoneBook[i])) {
	                	
	                	return false;
	                	}
	            }
	        }
	        return true;
	    }
	
}
