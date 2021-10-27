package stackAlgorithm;

import java.util.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 

/*첫 번째 줄에 정수 K가 주어진다. (1 ≤ K ≤ 100,000)
이후 K개의 줄에 정수가 1개씩 주어진다. 정수는 0에서 1,000,000 사이의 값을 가지며,
정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.
정수가 "0"일 경우에 지울 수 있는 수가 있음을 보장할 수 있다.

재민이가 최종적으로 적어 낸 수의 합을 출력한다. 최종적으로 적어낸 수의 합은 231-1보다 작거나 같은 정수이다*/
public class Zero {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int K = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < K; i++) {
			int number = Integer.parseInt(br.readLine());	// 정수 입력
			
			if(number == 0) {	// 0이라면 스택에 저장된 top 원소를 지운다.
				stack.pop();
			}
			else {
				/*
				 * push() 대신 add()로 대체해도 됨 (똑같이 상단에 원소를 추가하는 메소드다.)
				 * ex) stack.add(number);
				 */
				stack.push(number);
			}
		}
		int sum = 0;
		
		for(int o : stack) {
			sum += o;
		}
 
		System.out.println(sum);		
	}
 
}
