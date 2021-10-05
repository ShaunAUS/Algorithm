package mathAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//    a+b+b+b+b+b+........ c+c+c+c...      => 몇번쨰에 오른쪽 우항 값이 더 높아지는지 구하기
public class SonikBungi {
	
	
	//코드 개선 // 두번째 시도
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine());
 
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
        
		
		//c가 b보다 작거나 같으면 이익이 날수가 없다.
		if (C <= B) {
			System.out.println("-1");
		} 
		//c가 b보다 크면  그 차액만큼 증가 함으로 그 값이 a를 넘는 순간을 구하면된다.
		else {
			System.out.println((A/(C-B))+1);
		}
	}
	
	
	//첫번쨰 시도 코드
	/*
	 * public static void main(String[] args) throws NumberFormatException,
	 * IOException {
	 * 
	 * int sum=0; int count=0;
	 * 
	 * 
	 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 * String str=br.readLine();
	 * 
	 * //빈칸 구분자로 나누기 StringTokenizer st= new StringTokenizer(str," ");
	 * 
	 * int a=Integer.parseInt(st.nextToken()); int
	 * b=Integer.parseInt(st.nextToken()); int c=Integer.parseInt(st.nextToken());
	 * 
	 * //손익 분기점이 되기위해서는 b가 무조건 c보다 커야함 // b와 c가 같으면 0으로 손익분기점이 안남 if(b>=c) {
	 * System.out.println(-1); System.exit(0);
	 * 
	 * }
	 * 
	 * //우항 int rightNumber= c-b;
	 * 
	 * 
	 * //좌항 =a //우항 =rightNumber = 팔아서 번 수익 while(true) {
	 * 
	 * //순이익 계산 sum+=rightNumber; //횟수 카운팅 count++;
	 * 
	 * 
	 * //손익 분기점 넘을때 if(a<sum) {
	 * 
	 * break; }
	 * 
	 * }
	 * 
	 * System.out.println(count);
	 * 
	 * }
	 */
}
