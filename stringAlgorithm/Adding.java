package stringAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 문자열 합구하기
public class Adding {
		
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		//숫자 개수
		int n=Integer.parseInt(br.readLine());
		
		
		String str=br.readLine();
		
		
		int sum=0;
		
		for(int i=0; i<=n-1; i++) {
			sum+=str.charAt(i)-'0';
		}
		
		
		System.out.println(sum);
	}
}
