package arrayAlgorith;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//세자리수 세개 곱하고 0 몇번 1 몇번 2몇번......9몇번 쓰엿는지 개수 구하기
public class CountNumber {

	
		public static void main(String[] args) throws IOException {
			
			
			//000000으로 초기화된 배열로 숫자세기
			//  세자리수 x 세자리수   최대 6 // 세자리 세자리 세자리 최대 9
			int [] arr= new int[10];
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int a=Integer.parseInt(br.readLine());
			int b=Integer.parseInt(br.readLine());
			int c=Integer.parseInt(br.readLine());
			
			int result= a*b*c;
			// int- > String
			String str=String.valueOf(result);
			
			
			// -48 해서 우리가 보는 숫자int값 추출 한뒤 arr배열 개수 계산
			for (int i = 0; i < str.length(); i++) {
				arr[(str.charAt(i) - 48)]++;
			}
	 
			for (int v : arr) {
				System.out.println(v);
			}
			
			
		}
}
