package arrayAlgorith;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Overall {
	
	//처음 n개의 개수만큼 시험을 보고 시험점수 =    원래시험점수/최고점수*100
	//조작된 시험점수로 평균값구하기
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 
		 double result=0;
		 int n=Integer.parseInt(br.readLine());
		 double [] arr= new double[n];
		 String str= br.readLine();
		 
		 StringTokenizer st= new StringTokenizer(str," ");
		 
		 
		 for(int i=0; i<=n-1 ; i++) {
			 
			 
			 //시험 점수들 배열에 넣기
			arr[i]= Integer.parseInt(st.nextToken());
		 }
		 
		 //오름차순 정렬
		 Arrays.sort(arr);
		 //최대값 지정
		 double bigNum=arr[n-1];
		 
		 //System.out.println(bigNum);
		 //System.out.println(arr[0]);
		 //System.out.println(arr[1]);
		 //System.out.println(arr[2]);
		 
		 
	
		 
		 for(int j= 0 ; j<=n-1 ; j++) {
			 
			 arr[j]=arr[j]/bigNum*100;
			 result += arr[j];
		 }
		 
		 System.out.println(result/n);
		 
			
	}
}
