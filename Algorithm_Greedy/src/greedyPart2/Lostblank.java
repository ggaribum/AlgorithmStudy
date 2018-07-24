package greedyPart2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lostblank {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line[];
		String line2[];
		int sum = 0;
		
		/*
		 * 
		 * StringTokenizer stz= new StringTokenizer(bf.readLine(),"-"); int count=0;
		 * StringTokenizer는 " " 공백으로 분리하는데에 쓰는게 제일 유용하고
		 * string.replace("[-]|[+]"," ") 이렇게 해서 공백으로 분리하고 토크나이저로 분리하기.
		 * 
		 * while(stz.hasMoreTokens()) { stz.nextToken(); count++; }
		 */
		
		line = bf.readLine().split("-");
		for (int i = 0; i < line.length; i++) {

			//+,0,^ 와같은 문자 split할 때 앞에 백슬래쉬 \\ 써줘야됌.
			line2 = line[i].split("\\+");

			for (int j = 0; j < line2.length; j++) {
				if (i >= 1) {
					sum -= Integer.parseInt(line2[j]);
				} else {
					sum += Integer.parseInt(line2[j]);
				}
			}

		}
		
		System.out.println(sum);

		
	}
}
