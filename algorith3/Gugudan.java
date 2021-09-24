package algorith3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Gugudan {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	
	int number= Integer.parseInt(br.readLine());
	
	
	
	
		
		for(int j=1 ; j<=9 ; j++) {
			
			int result = number*j;
			System.out.println(number+" * "+j+" = "+result);
		}
		
	}
}
