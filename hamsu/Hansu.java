package hamsu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//정수 n이 주어졌을떄     0<=  N  <1000  각 자리수가 한수(등차수열) 구하기
public class Hansu {
	
	
	// 정수 x 의 각자리가 등차수열 이루면 ==한수라 한다
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		System.out.println(hansuMethod(n));
	}
	
	    
		//1 ~1000 숫자중  한수 구하기 메서드
		//1부터 99 까지 한수는 99이다. 1도 등차수열
		//  1~99일때랑 100~1000 일떄 나눠서 생각한다.
		// 두 자리 수는 어떤수가와도 차이가 일정
		public static int hansuMethod(int n) {
			 
			//cnt= 한수 개수
			 int cnt=0;
			
			 
			//  n=1~99
			if(n<100) {
				
			   return n;
			   
			}else{
				//100 이상이면 최소 한수 99개 이상
				cnt=99;
				
				if(n==1000) {
					n=999;
				}
			
			
			//100이상 숫자 등차수열 체크
			for(int i =100; i<= n; i++) {
				
				int a=i%10;//일의 자리 숫자 구하기
				int b=(i/10)%10; //십의 자리 숫자 구하기
				int c=i/100;  //백의 자리 숫자 구하기
			
			
			//등차 수열의 조건 // 각 자리수마다 일정한 차이
			if((c-b)==(b-a)) {
				
				cnt++;
			}
			}
			}
		
			return cnt;
		}
		
		
		
		
		
		
		
		
	
}
