package algorith3;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


// 시간 , 분 입력하면 자동으로 -45분 되는 알람
public class Alarm {
	public static void main(String[] args) throws IOException {
   
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		
		//  분  45보다 작으면 h-1
		// 45보다 크면 
		// 시간이 0보다 작으면 23으로
		if(M < 45) {
			H--;
			M = 60 - (45 - M);
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M - 45));
		}
	}
}