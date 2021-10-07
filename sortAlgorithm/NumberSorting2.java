package sortAlgorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
 
// sorting 문제 1과 다른점은 각각의 검색, 정렬마다 시간복잡도, 즉 최악의 걸리는 시간등이 다르다.
// 이문제는 arrays.sort 최악의 시간 조건에 맞지않으므로 collections.sort 를 사용한다
public class NumberSorting2 {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		
		
		
		//  colletions.sort 를 쓰기위해 list 쓰기
		ArrayList<Integer> list = new ArrayList<>();
		
		//값 입력 받은뒤 list에 저장
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		//정렬
		Collections.sort(list);
		
		//출력
		for(int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}
}