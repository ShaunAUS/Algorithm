package algorith3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//윤년 구하기 //4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때
public class Yunyear {
public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		//숫자 입력받고
		int A = Integer.parseInt(br.readLine());
	
		//A가 4의 배수이면서 400의 배수일때
		if(A%4==0 && A%400==0) {
			System.out.println("1");
		//A가 4의 배수이면서 , 100의 배수가 아닐때
		}else if(A%4==0 && A%100!=0){
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		

}
}
