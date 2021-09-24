package arrayAlgorith;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class CountDifferendOffcut {
	
	
	

	//10개의 값을 받은뒤 42로 나눈뒤 나머지가 몇개나 다른지 개수
	public static void main(String[] args) throws IOException {
	    
		
		
		        //중복을 제거려하지말고   곂쳐도 하나로 카운팅하게 만들기
		        boolean[] arr = new boolean[42];
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        
		        
		        //중복이되도 ture로 덮어씌우기떄문에 상관없다
		        for(int i = 0 ; i < 10 ; i++) {
		            arr[Integer.parseInt(br.readLine()) % 42] = true;
		        }
		        
		        int count = 0;
		        for(boolean value : arr) {
		            if(value){    // value 가 true 라면 
		                count++;
		            }
		        }
		        System.out.println(count);
		
		
		
		
		
		
		
		
		
		
		
		//42로 나눈 나머지가 0이 아니면// 42의 배수가 아니면
		/*
		 * if(Integer.parseInt(br.readLine())%42!=0) {
		 * 
		 * count++;
		 * 
		 * }else {
		 * 
		 * }
		 */
	}
}
