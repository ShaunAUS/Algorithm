package mathAlgorithm;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Snail {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
		//올라가는 거리 
		int up = Integer.parseInt(st.nextToken());
		//미끄러지는 거리
		int down = Integer.parseInt(st.nextToken());
		//총거리
		int length = Integer.parseInt(st.nextToken());
 
		int day = (length - down) / (up - down);
		if ((length - down) % (up - down) != 0)
			day++;
 
		System.out.println(day);
	}
}
