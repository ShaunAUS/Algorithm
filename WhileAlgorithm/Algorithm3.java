package WhileAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm3 {
	
	
		public static void main(String[] args) throws IOException {
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			
			
			//두자리수 입력 받기// ex 23
			String str=br.readLine();
			int num=Integer.parseInt(str);
			int count = 0;
			int finalResult;
			
			
			//두자리수 하나씩 나누기
			int a=str.charAt(0)-48;
			int b= str.charAt(1)-48;
			
			
			
			do{
				
				//덧셈결과
				int result=a+b;
				
				//두번쨰 숫자
				String numberB=String.valueOf(b);
				//결과 두번째자리숫자
				String StringReuslt=String.valueOf(result);
				
				
				String realResult=numberB+StringReuslt.charAt(1);
				
				
				 finalResult=Integer. parseInt(realResult);
				
				
			}while(finalResult!=num);
			
			
			
				
				
				
				
				
				
				
				while(finalResult!=num) {
					
					count++;
					
				}
				
				
				/*
				 * if(처음 숫자랑 같으면) {
				 *   break;
				 * }
				 */
				
			
			
			
	
				
				
			
			
		
	}
}
