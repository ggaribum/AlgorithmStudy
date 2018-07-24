package greedyPart2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Contest_or_Intern {
	// https://www.acmicpc.net/problem/2875

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line[] = bf.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		int K = Integer.parseInt(line[2]);

		int teamCount = 0;

		while ((N - 2) + M > K && N >= 2 && M >= 1) {

			N -= 2;
			M -= 1;
			teamCount++;
		}
		System.out.println(teamCount);
	}

}
