package kakaoFestival;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;

public class Dolls {

	public static int arr[];
	public static double getResult(int start,double m, int K)
	{
		double squareM=0;
		int j=0;
		for(int i=start;j<K;i++)
		{
			squareM+=Math.pow(arr[i]-m,2);
			j++;
		}
		
		return Math.sqrt(squareM/K);
		
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line[]=bf.readLine().split(" ");

		int N=Integer.parseInt(line[0]);
		int K=Integer.parseInt(line[1]);
		arr=new int [N];
		
		String line2[]=bf.readLine().split(" ");
		
		for(int i=0 ;i<N;i++)
		{
			arr[i]=Integer.parseInt(line2[i]);
		}
		
		if(K==1)
		{
			System.out.println(0);
			return;
		}
		
		double sum=0;
		double m=0;
		double res=999999999;
		double temp=0;
		
		for(int i=0;i<=N-K;i++)
		{
			for(int j=0;j<K;j++)
			{
				sum+=arr[i+j];
				if(j==K-1)
				{
					m=sum/K; //ЦђБе
					sum=0;
					temp=getResult(i,m,K);
				}
			}
			if(temp<res && temp!=0)
			{
				res=temp;
			}
		}
		if(String.valueOf(res).length()>13)
		{
		BigDecimal data= new BigDecimal(res).setScale(11, BigDecimal.ROUND_DOWN);
		System.out.println(data);
		return ;
		}		
		System.out.println(res);
		//System.out.println(String.format("%.11f", res));	
	
	}
}
