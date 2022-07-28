package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
// 카드2
public class _2164 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		for(int i=1; i<n+1; i++) {
			q.add(i);
		}
		while(true) {
			if(q.size() == 1) {
				break;
			}
			q.poll();
			if(q.size() == 1) {
				break;
			}
			q.add(q.poll());
		}
		System.out.println(q.peek());
	}

}
