package CodingTest2;

import java.util.Arrays;

public class Solution2 {
	
	
	
	// 배열 교집합 구하기
	public String main(String[] participant,String[] completion) {
		
		String answer="";
		
		// 배열 정렬
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		
		// 교집합이 아닌것을 return해준다 == 완주하지 못한자
		for(int i =0 ; i<completion.length; i++) {
			
			if(!participant[i].equals(completion[i])) {
				
				answer= participant[i];
				return answer;
			}
				
			
		}
		
		return participant[participant.length-1];
	}
}
