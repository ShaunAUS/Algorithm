package algorith3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllAdd {
	
	
	static int  sum=0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		
	
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
	
	int number=Integer.parseInt(br.readLine());
	
	
	for(int i=0; i<=number; i++) {
		
		
		sum+=i;
	}
	System.out.println(sum);
	
	}		
			
}
