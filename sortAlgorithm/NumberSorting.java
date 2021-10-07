package sortAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberSorting {
  
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n= Integer.parseInt(br.readLine());
		
		
		int [] arr= new int[n];
		
		
		//값 받기
		for(int j=0; j<=n-1; j++) {
			
			arr[j]=Integer.parseInt(br.readLine());
			
		}
		
     	//정렬
		Arrays.sort(arr);
		//출력
		for(int i=0; i<=n-1 ; i++) {
			
			System.out.println(arr[i]);
		}
		
	}
}
