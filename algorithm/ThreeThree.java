package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ThreeThree {
	
	
	//  472 * 385  곱셈 과정 나열하기
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//숫자 입력 받은뒤  String -> int로 
		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();
		
		//문자배열로 만들어 주기
		char[] b = B.toCharArray();
			
		
		System.out.println(A * (b[2]-'0'));
		System.out.println(A * (b[1]-'0'));
		System.out.println(A * (b[0]-'0'));
		System.out.println(A * Integer.parseInt(B));
 
	}
	
	//이 방법 말고도 scanner 로 charAt 사용 가능 but 성능 떨어진다
	// String -> charAt() //  toCharArray()
}
