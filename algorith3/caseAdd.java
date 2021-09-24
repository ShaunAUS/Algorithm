package algorith3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class caseAdd {
	public static void main(String args[]) throws IOException {
 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		//돌릴 횟수 =n
		int n=Integer.parseInt(br.readLine());
		
		
		for(int i=1; i<=n ; i++) {
			
			
			String str=br.readLine();
			//숫자 두개 입력받아서 나누기
			StringTokenizer stn= new StringTokenizer(str," ");
			
			
			
			int A=Integer.parseInt(stn.nextToken());
			int B=Integer.parseInt(stn.nextToken());
		
			
			
			
			//출력
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
			//bw.write("Case #"+i+":"+a+"+"+b+"="+(a+b));
			
		}
		
		
		 bw.flush(); 
		 bw.close();
		 
		
	}
 
}
 
