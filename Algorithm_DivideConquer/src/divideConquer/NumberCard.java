package divideConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

//https://www.acmicpc.net/problem/10815


public class NumberCard {

	public static void main(String[] args) throws IOException{
	
		HashSet<Integer> hash = new HashSet<>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());

		String line[] = bf.readLine().split(" ");

		for (int i = 0; i < N; i++) {
			hash.add(Integer.parseInt(line[i]));
		}

		int M = Integer.parseInt(bf.readLine());
		String line2[] = bf.readLine().split(" ");
		for (int i = 0; i < M; i++) {
			if (hash.contains(Integer.parseInt(line2[i]))) {
				System.out.print("1 ");
			} else {
				System.out.print("0 ");
			}
		}

		
	}

}
