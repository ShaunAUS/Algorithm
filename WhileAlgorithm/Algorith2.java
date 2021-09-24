package WhileAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 정수는 반드시 ( 0< A,B < 10 ) 이다. 즉, 한자릿수 정수만 입력받는다.
//그렇게 되면 자연스레 공백(" ")의 위치도 항상 고정된 위치라는 것을 알 수 있다.
//charAt() 은 해당 문자의 아스키코드 값을 반환하기 때문에 반드시 우리가 아는 정수 형태로 변경하려면 -48 또는 -'0'을 해주어야 한다
public class Algorith2 {
	
	
		public static void main(String args[]) throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			String str;
	 
			while( (str=br.readLine()) != null ){
			    
				
				// 빈칸은 charAt(1) 로 고정이니 (0)과 (2)의 값만 
				int a = str.charAt(0) - 48;
				int b = str.charAt(2) - 48;
				sb.append(a+b).append("\n");
			
			}
			System.out.print(sb);
		}
	
}
