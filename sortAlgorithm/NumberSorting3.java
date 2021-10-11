package sortAlgorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
 

        //시간을 위해 bufferedReader +StringBuilder
		// 이전에는 Array.sort   // collections.sort // 이번에는 counting 을 사용해서 정렬을 해보자
public class NumberSorting3 {
	
	//countting 으로 풀기
	// 배열에 입력값(index) +1을 해서 표시를하고  나중에 1보다 더큰값(index가 입력된) 값들을 추출해서 출력한다
	//배열 순서대로 0 부터 하기떄문에 따로 정렬 메서드가 필요없다.
	
	 public static void main(String[] args) throws IOException {
	        // 수의 범위 (0 ~ 10000) 사실상 0은 제외
	        int[] cnt = new int[10001];
	 
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	        int N = Integer.parseInt(br.readLine());
	        
	        //입력값(index)  +1을해서 입력받은값을 표시한다
	        for (int i = 0; i < N; i++) {
	            // 해당 인덱스의 값을 1 증가
	            cnt[Integer.parseInt(br.readLine())] ++;
	        }
	 
	        br.close();
	 
	        StringBuilder sb = new StringBuilder();
	 
	        // 0은 입력범위에서 없으므로 1부터 시작
	        for(int i = 1; i < 10001; i++){
	            // 0보다 큰값(index 가 입력된값) 들을 찾는다
	            while(cnt[i] > 0){
	            	// 그 입력된index들을 stringBuilder 한번에 모아 출력한다
	                sb.append(i).append('\n');
	                //++1됐던 값들은 다시 원상태로
	                cnt[i]--;
	            }
	        }
	        System.out.println(sb);
	    }
	 
	 // 그냥 Arrays.sort로 풀기
	 
		/*
		 * public static void main(String[] args) throws IOException {
		 * 
		 * 
		 * BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 * StringBuilder sb = new StringBuilder();
		 * 
		 * int N = Integer.parseInt(br.readLine()); int[] arr = new int[N];
		 * 
		 * for(int i = 0; i < N; i++){
		 * 
		 * arr[i] = Integer.parseInt(br.readLine()); }
		 * 
		 * Arrays.sort(arr);
		 * 
		 * for(int i = 0; i < N; i++){ sb.append(arr[i]).append('\n'); }
		 * 
		 * System.out.println(sb); }
		 */
}


