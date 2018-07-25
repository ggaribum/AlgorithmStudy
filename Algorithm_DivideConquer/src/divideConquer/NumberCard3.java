package divideConquer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class NumberCard3 {

	//Àç±Í ¶û mapÀ¸·Î Ç®¾îº¸ÀÚ
	//https://www.acmicpc.net/problem/10816
	public static void main(String[] args) {
		HashMap<Integer, Integer> h= new HashMap<>();
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int keyNum=0;
		
		for(int i=0;i<n;i++)
		{
			keyNum=sc.nextInt();
			if(h.get(keyNum)!=null)
			{
				h.put(keyNum,h.get(keyNum)+1);
			}
			else
				h.put(keyNum,1);
		}
	
		//Ä«µå»Ì±â
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			keyNum=sc.nextInt();
			if(h.get(keyNum)!=null)
			{
				System.out.print(h.get(keyNum)+" ");
			}
			else
				System.out.print("0 ");
		}
	}
}
