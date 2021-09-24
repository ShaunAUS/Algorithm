package arrayAlgorith;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BiggestNumber {
    
	//최대값 최소값 구하기
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		
		
		//개수
		String str= br.readLine();
		//정수들
		String str2=br.readLine();
		
		
		
		int n=Integer.parseInt(str);
		//개수에 맞는 배열 생성
		int [] arr=new int[n];
		
		
		//정수들 빈칸 기준으로 자르기
		StringTokenizer st= new StringTokenizer(str2," ");
		
	
		  for(int i =0; i<=arr.length-1 ; i++) {
		 
		   //정수를 배열에 넣는다
		   arr[i]=Integer.parseInt(st.nextToken());
		  
		  }
		  //오름차순 정렬
		  Arrays.sort(arr);
		  
		  //출력// 0 번쨰는 최소값 // 끝번호는 최대값
		  sb.append(arr[0]).append(" ").append(arr[n-1]); 
		  
		  System.out.println(sb);
		 	}
}
