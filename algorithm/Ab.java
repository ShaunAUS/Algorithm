package algorithm;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;



public class Ab {
	
	//입력받은 값 출력 // scanner은 성능이 xx
	// split 보다는 stringTokenizer 사용! (문자열 더 많아지면 성능이 더좋다)
	// nextoToken = 문자열 반환
	//split() 은 결과값을 배열에 저장
	
	
public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a*b);

}

		//스캐너로 출력하기
/*
 * public static void main(String[] args) {
 * 
 * Scanner in = new Scanner(System.in); int A = in.nextInt(); int B =
 * in.nextInt();
 * 
 * System.out.println(A+B);
 * 
 * in.close(); }
 */


}
