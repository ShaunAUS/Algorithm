package arrayAlgorith;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//최대값 구하고 그 위치index값 구하기
public class FindBiggestNumber {
    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int [] arr=new int[9];
    	
    	
    	for(int i=0; i<=8; i++) {
    		
    		//값 9개쓰고 배열에 넣기
    		arr[i]=Integer.parseInt(br.readLine());
    	}
    	
    	// 카운트로 계속 세다가  max값이면 index값에 count대입하고 아니면 count만 센다
    	int max = 0;
		int index = 0;
		
		int count = 0;
		
		for(int value : arr) {
			count++;
			if(value > max) {
				max = value;
				index = count;
			}
		}
 
		System.out.println(max);
		System.out.println(index);
    	
    	
	}
}
