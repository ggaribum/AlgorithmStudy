package greedyPart1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountCoin {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String line[]=bf.readLine().split(" ");
		int n=Integer.parseInt(line[0]);
		int money = Integer.parseInt(line[1]);
		int coin[]= new int[n];
	
		/*Scanner sc= new Scanner(System.in);
		int  n = sc.nextInt();
		int money= sc.nextInt();
		int coin[]=new int[n];
		*/
		
		for(int i=0; i<n;i++)
		{
			coin[i]=Integer.parseInt(bf.readLine());
		}
		
		int coinCount=0; //°Å½º¸§µ· °¹¼ö 
		while(true)
		{
			coinCount+=money/coin[n-1];
			money=money%coin[n-1];
			n--;
			if(n==0)
			{
				break;
			}
		}
		System.out.println(coinCount);
		

	}

}
