package stringAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//연속된 단어 찾기   
// aaabbbccc  o // abcd  o ///  appla   x
//모두 다르거나// 연속되거나  //앞에나왓던거 뒤에다시 x= 반복체크해야함


/*prev 의 문자와 해당 문자가 같다면? 
→ 해당 문자가 중복된 문자인지 여부를 검사하지 않는다. (boolean 배열)

 

prev 의 문자와 해당 문자가 다르다면? 
→ 해당 문자가 중복된 문자인지 여부를 검사한다. (boolean 배열)*/


public class GroupWordsChecker {
     
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	 public static void main(String[] args) throws IOException {
		 
		
		 int count=0;
		 
	
		//테스트 케이스 개수 
		 int n=Integer.parseInt(br.readLine());
		 
		 //연속된 단어만 찾기
		 for(int i=0; i<n; i++) {
			 if(check()==true) {
				 count++;
			 }
			 
			 
		 }
		 System.out.println(count);
		
		
	}
	 
	 public static boolean check() throws IOException {
		 
		 //디폴트가 false
		 boolean[] check =new boolean[26];
		 
		 //이전값
		 int prev=0;
		 String str=br.readLine(); 
		 
		 
		 for(int i = 0; i < str.length(); i++) {
			 
			   //현재 검사하는 문자하나
			 // int로 받아 ==아스키코드값으로
				int now = str.charAt(i);
				
				//현재 문자가 이전 문자와 같지 않으면
				//boolean 배열은 디폴트가 false다
				if (prev != now) {		
					
				    //해당 인덱스 배열이 false 면 true로 바꿔준다 (=연속된 단어)
					//이전값도 다음값과 비교를 위해 바꿔준다
					if (!check[now - 'a']) {
						check[now - 'a'] = true;
						prev = now;	
					}
					else {
						return false;	
					}
				}
			}    
			return true;
		}
	}