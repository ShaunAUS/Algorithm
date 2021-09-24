package algorith3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//문제에서 보면 최대 100만개의 테스트 케이스가 주어진다. 
//케이스가 늘어나면 늘어날 수록 문제점이 생기는데 바로 System.out.println()의 호출횟수 또한 증가한다는 것이다.
//그래서 아무리 BufferedReader 을 써줬어도 System.out.println() 을 각 테스트 케이스마다 해주면 
//시간초과가 되어버린다.

//sysout 말고 bufferedWriter 쓰기!
public class FasterAdd {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		

				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		 
				int N = Integer.parseInt(br.readLine());
		        
				StringTokenizer st;
		 
				for (int i = 0; i < N; i++) {
					st = new StringTokenizer(br.readLine()," ");
					bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
				}
				br.close();
		        
				bw.flush();
				bw.close();
		 
	
		
		/*
		 * 처음내꺼 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * //for문 개수 받기 int n= Integer.parseInt(br.readLine());
		 * 
		 * 
		 * String str=br.readLine();
		 * 
		 * // 빈공간 기준으로 짜르기 StringTokenizer stn= new StringTokenizer(str," ");
		 * 
		 * //짜른거 a, b로 지정 int a=Integer.parseInt(stn.nextToken()); int
		 * b=Integer.parseInt(stn.nextToken());
		 * 
		 * for(int i=1; i<=n;i++) {
		 * 
		 * System.out.println(a+b); }
		 */
	
	}
	
}
