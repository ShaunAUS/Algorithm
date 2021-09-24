package algorith3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarsReverse {
		
	
	    //빈칸도 반복이다!
		public static void main(String[] args) throws NumberFormatException, IOException {
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			
			int n=Integer.parseInt(br.readLine());
			
			
			//행반복
			for(int i=1; i<=n; i++) {
				
				//빈칸반복
				for (int j = 1; j <= n - i; j++) {
					System.out.print(" ");
				}
				//별 반복
				for (int k = 1; k <= i; k++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
		
	}

}
