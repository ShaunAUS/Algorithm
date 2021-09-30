package stringAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문장을 입력받고 (대소문자 + 공백)	몇개의 단어로 되있는지 구하기
// My name is = 3개
public class CountWordsFromSentence {
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String str= br.readLine();
		
		StringTokenizer st= new StringTokenizer(str," ");
		
		
		
	System.out.println(st.countTokens());
		
		
		
	}
}
