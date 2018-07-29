package divideConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class HanoiTop {

	public static int count=0;
	public static Stack<Integer> oneStack=new Stack<>();
	public static Stack<Integer> twoStack=new Stack<>();
	public static Stack<Integer> threeStack=new Stack<>();

	public static void solve(int n, int x, int y, StringBuilder sb) {
		if (n == 0) return;
		solve(n-1, x, 6-x-y, sb);
		sb.append(x + " " + y + "\n");
		solve(n-1, 6-x-y,y, sb);
	}
	//https://www.acmicpc.net/problem/11729
	//몇 번 더 고민해 보자
	
	public static void main(String[] args) throws IOException{


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println((1<<n)-1);
		StringBuilder sb = new StringBuilder();
		solve(n, 1, 3, sb);
		System.out.println(sb);

	}

}
