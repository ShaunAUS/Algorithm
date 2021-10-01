package stringAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Croatia {
	public static void main(String[] args) throws IOException {
        
		
		// 문자열에 특정한 문자열이 오면 다르게 계산하기 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		
		//입력값 길이
		int len = str.length();
		int count = 0;
 
		for (int i = 0; i < len; i++) {
 
			char ch = str.charAt(i);
             
			// 만약 ch 가 c 라면?
			//그냥 출력하면  배열 오류가 난다. aedzdz=ls=c  이런식으로 오면 c다음에 오는게 없어서 오류남 
			if(ch == 'c' && i < len - 1) {			
				//만약 ch 다음 문자가 '=' 또는 '-' 이라면?
				if(str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {		
					// i+1 까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1 증가
					i++;		
				}
				
			}
		    
			else if(ch == 'd' && i < len - 1) {
				// d- 일 경우
				if(str.charAt(i + 1) == '-') {	
						i++;
					}
				else if(str.charAt(i + 1) == 'z' && i < len - 2) {
					// dz= 일 경우
					if(str.charAt(i + 2) == '=') {	
						i += 2;
					}
				}
			}
		    
			else if((ch == 'l' || ch == 'n') && i < len - 1) {
				// lj 또는 nj 일 경우
				if(str.charAt(i + 1) == 'j') {	
					i++;
				}
			}
		    
 
			else if((ch == 's' || ch == 'z') && i < len - 1) {
				
				// s= 또는z= 일 경우
				if(str.charAt(i + 1) == '=') {	
					i++;
				}
			
		    }
		    
			count++;
 
		}
 
		System.out.println(count);
	}
}