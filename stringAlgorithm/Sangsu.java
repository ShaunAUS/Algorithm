package stringAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//   세자리 숫자 두개를 읽어 역순으로 한뒤 큰값 출력
public class Sangsu {

	
	  public static void main(String[] args) throws IOException {
		
		  BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			
			String str= br.readLine();
			
			
			
			StringTokenizer st= new StringTokenizer(str," ");
			
			//역순으로 읽어서 string으로 반환
			String a= new StringBuilder(st.nextToken()).reverse().toString();
			String b= new StringBuilder(st.nextToken()).reverse().toString();
			
			//stirng ->int
			int num1=Integer.parseInt(a);
			int num2=Integer.parseInt(b);
			
			if(num1>num2) {
				System.out.println(num1);
			}else {
				System.out.println(num2);
			}
			
			
			
			
	}
}
