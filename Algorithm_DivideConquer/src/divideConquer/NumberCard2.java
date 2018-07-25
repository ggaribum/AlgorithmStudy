package divideConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class NumberCard2 {

	//https://www.acmicpc.net/problem/10816
	//그냥 Collection 이랑 Iterator 써보고 싶었음 ->
	//for each가 훨씬 더 빠를듯
	public static void main(String[] args) throws IOException {

		ArrayList<Integer> list = new ArrayList<>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(bf.readLine());
		String line[] = bf.readLine().split(" ");

		for (int i = 0; i < num; i++) {
			list.add(Integer.valueOf(line[i]));
		}

		int num2 = Integer.parseInt(bf.readLine());
		line = bf.readLine().split(" ");
		int count =0;
		
		for (int i = 0; i < num2; i++) {
			count=0;
			Iterator<Integer> it = list.iterator();
			
			while (it.hasNext()) {
				if(Integer.parseInt(line[i])==(it.next()))
						{
							count++;
						}
			}
			System.out.print(count+" ");
		}

	}
}
