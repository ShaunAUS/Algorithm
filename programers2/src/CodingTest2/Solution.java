package CodingTest2;

import java.util.HashMap;

public class Solution {
	
 public static void main(String[] args) {
	
	 //getOrDefault(Object key, V DefaultValue)

	 
	  String [] alphabet = { "A", "B", "C" ,"A"}; 
	  
	  HashMap<String, Integer> hm = new HashMap<>();
	 
	  
	  //찾는 키가 존재하면 키값반환 하고 아니면 기본값 반환
	  for(String key : alphabet) 
		 hm.put(key, hm.getOrDefault(key, 0) + 1);
	 
	 
	 System.out.println("결과 : " + hm);
	 
	 // 결과 : {A=2, B=1, C=1}
	 

	
}	


}
