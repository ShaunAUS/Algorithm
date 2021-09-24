package WhileAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm {

	//숫자 입력 2개 덧셈 결과 나오다 0 0 오면 종료
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	while(true) {
		
		String str=br.readLine();
		StringTokenizer stn=new StringTokenizer(str," ");
		
		int n=Integer.parseInt(stn.nextToken());
		int x=Integer.parseInt(stn.nextToken());
		
		if(n==0 && x==0) {
			//0 0 이면 종료
			break;
		}	
			
			System.out.println(n+x);
		
		
	}
		
		
	}
}
