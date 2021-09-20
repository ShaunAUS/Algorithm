package programmers2;

class Try2 {
	
	
	//프로그래머스2 실패작
	public static boolean Testsolution(String[] phone_book) {
    	
    	 
    	
    	for(int i =0 ; i<=phone_book.length ; i++) {
  		  
			  for(int j =i+1; j<=phone_book.length ; j++) {
		  

			  //answer => true 이면 
			  boolean answer=phone_book[i].startsWith(phone_book[j]);
		  	
			  if(answer==true) {
				  
				  return false;
			  }
			  
		  
		  
		  }
		  
		  
		  }
    	 
		return  true;
    }
}