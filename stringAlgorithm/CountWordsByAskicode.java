package stringAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountWordsByAskicode {
	
	//단어주어지면 가장 많이 사용된 알파벳 뭔지 알아내기 //대소문자 구별 x
	// 두 단어가 동점이면 '?' 출력
	public static void main(String[] args) throws IOException{
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// a[0]=a   a[1]=b... 이런식으로 만들 예정
		int[] arr = new int[26]; // 영문자의 개수는 26개임
		String s = br.readLine();
		
 
		
		
		for (int i = 0; i < s.length(); i++) {
			//대문자 // a z 대신 아스키코드값(숫자) 넣어줘도 가능
			if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
				arr[s.charAt(i) - 97]++;
				
				//소문자
			} else {
				arr[s.charAt(i) - 65]++;
			}
		}
		
		
		//최댓값 구하기 .   for문을 돌려 빈도수 저장된 배열 체크 
		// 최댓값보다 크면 그 값이 최댓값이 된다
		int max = -1;
		char ch = '?';
		for (int i = 0; i < 26; i++) {
 
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
			} 
			else if (arr[i] == max) {
				ch = '?';
			}
		}
		System.out.print(ch);
	}
}
