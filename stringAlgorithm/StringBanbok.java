package stringAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//테스트 개수 입력뒤 // 문자열, 반복횟수 입력,//   문자열 하나당 반복횟수만큼 반복
public class StringBanbok {
	
	public static void main(String[] args) throws IOException {
		
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	//테스트 케이스 개수
	int n=Integer.parseInt(br.readLine());
	
	for(int k=0 ; k<=n-1; k++) {
	StringTokenizer st=new StringTokenizer(br.readLine()," ");
	
	//반복 횟수
	int r=Integer.parseInt(st.nextToken());
	//문자열
	String s=st.nextToken();
	

	
	for(int j=0; j<=s.length()-1; j++) {
		
		for(int i =0; i<=r-1 ; i++) {
			System.out.print(s.charAt(j));	
		}
		
	}
	//띄어쓰기 까먹지말기
	System.out.println();
	}
	
	
	}
}
