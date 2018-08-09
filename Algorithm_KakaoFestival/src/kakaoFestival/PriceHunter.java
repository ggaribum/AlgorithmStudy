package kakaoFestival;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PriceHunter {

	public static int res=0;

	public static void priceCount(int n)
	{
		//1
		if(n==1)
		{
			res+=5000000;
		}
		//2
		else if(2<=n&&n<=3)
		{
			res+=3000000;
		}
		//3
		else if(4<=n&&n<=6)
		{
			res+=2000000;
		}
		//4
		else if(7<=n&&n<=10)
		{
			res+=500000;
		}
		//
		else if(11<=n&&n<=15)
		{
			res+=300000;
		}
		else if(16<=n&&n<=21)
		{
			res+=100000;
		}
		
	}

	public static void priceCount2(int n)
	{
		if(n==1)
		{
			res+=5120000;
		}
		else if(2<=n && n <=3)
		{
			res+=2560000;
		}
		else if(4<=n && n<=7)
		{
			res+=1280000;
		}
		else if(8<=n && n<=15)
		{
			res+=640000;
		}
		else if(16<=n && n<=31)
		{
			res+=320000;
		}
	}
	public static void main(String[] args) throws IOException{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int num= Integer.parseInt(bf.readLine());

		String line[]=new String[2];
		for(int i=0;i<num;i++)
		{
			line=bf.readLine().split(" ");
			priceCount(Integer.parseInt(line[0]));
			priceCount2(Integer.parseInt(line[1]));
			System.out.println(res);
			res=0;
		}

	}

}
