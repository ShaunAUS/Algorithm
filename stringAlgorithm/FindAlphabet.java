package stringAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단어를 입력하면 apple   -> a가 처음등장하는 index값..b가 처음 등장하는 index값....z가~~

// 쉽게 - indexOf() 사용 => 문자 위치값 반환 없으면 -1반환
//arr 배열의 인덱스(원소 위치)는 ch 가 갖고 있는 문자 인코딩 값(=아스키코드 값과 동일)에 'a' 또는 97 을 빼주면 된다.
public class FindAlphabet {
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
 
		String S = br.readLine();
 
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
    
			if(arr[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
				arr[ch - 'a'] = i;
			}
		}
 
		for(int val : arr) {	// 배열 출력
			System.out.print(val + " ");
		}
	}
}