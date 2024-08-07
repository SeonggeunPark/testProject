import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class D4_5432_쇠막대기자르기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		char[] arr;
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t=1; t<=T; t++) {
			int sum = 0;
			String str = br.readLine();
			arr = new char[str.length()];
			for (int i=0; i<str.length(); i++) {
				arr[i] = str.charAt(i);
			}
			
			stack.push('(');
			for (int i=1; i<str.length(); i++) {
				char c = arr[i];
				if (c == '(' ) {
					stack.push(c);
				} else {
					if (arr[i-1] == '(') {
						stack.pop();
						sum += stack.size();
					} else {
						stack.pop();
						sum += 1;
					}
				}
			}
			
			System.out.printf("#%d %d \n", t, sum);
		}
	}
}
