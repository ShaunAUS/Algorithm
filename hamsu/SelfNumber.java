package hamsu;

public class SelfNumber {
	 
	//https://www.acmicpc.net/problem/4673
	
	public static void main(String[] args) {
        
		
		//체크용 배열
		boolean[] check = new boolean[10001];	
 
		for (int i = 1; i < 10001; i++){
			int n = d(i);
		    
			//10000이 넘는값 찾아내기
			if(n < 10001){	
				check[n] = true;
			}
		}
 
		StringBuilder sb = new StringBuilder();
        
		//10000이 넘는값 인덱스
		for (int i = 1; i < 10001; i++) {
			if (!check[i]) {	
				sb.append(i).append('\n');
			}
		}
		// false 인 인덱스만 출력
		System.out.println(sb);
	}
 
 
 
	public static int d(int number){
		
		int sum = number;
        
		
		// 1234  -> 1234+1+2+3+4
		while(number != 0){
			sum = sum + (number % 10); // 첫 째 자리수
			number = number/10;	// 10을 나누어 첫 째 자리를 없앤다
		}
    
		return sum;
	}
}    
