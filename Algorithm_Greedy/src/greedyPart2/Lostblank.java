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
		 * StringTokenizer�� " " �������� �и��ϴµ��� ���°� ���� �����ϰ�
		 * string.replace("[-]|[+]"," ") �̷��� �ؼ� �������� �и��ϰ� ��ũ�������� �и��ϱ�.
		 * 
		 * while(stz.hasMoreTokens()) { stz.nextToken(); count++; }
		 */
		
		line = bf.readLine().split("-");
		for (int i = 0; i < line.length; i++) {

			//+,0,^ �Ͱ��� ���� split�� �� �տ� �齽���� \\ ����߉�.
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
