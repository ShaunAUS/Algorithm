package sortAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


//숫자가 입력되면 내림차순으로 정렬하기

/* 1. Integer 객체 형태로 배열을 선언해줘야합니다

2. Arrays.sort(배열) - 기본 오름차순(작은순서)으로 정렬됩니다

3. Arrays.sort(배열,Collections.reverseOrder()) - 내림차순(큰순서)으로 정렬됩니다*/

public class SortInside2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		  BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		  
		  String str=bf.readLine();
		  
		  Integer arr[] = new Integer [str.length()];
		  
		  
		  //입력받은 문자열값 배열에 하나씩 저장
		  for(int i =0; i<str.length(); i++) {
			  
			  arr[i]=str.charAt(i)-48;
		  }
		  
		  
		  Arrays.sort(arr,Collections.reverseOrder());
		  
		  //내림차순 출력
		  //System.out.println(Arrays.toString(arr));
		  
          for(int j =0; j<arr.length; j++) {
			  
			  System.out.print(arr[j]);
		  }
		  


		 
		
		

		
		
		
		
		
	}
}
