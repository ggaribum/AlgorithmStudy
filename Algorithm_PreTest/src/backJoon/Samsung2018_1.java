package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Samsung2018_1 {

	public static int arr[][];
	public static int arr2[][];
	public static int answer[];
	
	public static int check(int x, int y,int N)
	{
		int dilivery_Distance=1000;
		
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(arr2[i][j]==2)
				{
					int temp=(Math.abs(i-x)+Math.abs(j-y));
					if(dilivery_Distance>temp)
					{
						dilivery_Distance=temp;
					}
				}
			}
		}
		return dilivery_Distance;
	}
	
	public static void main(String[] args) throws IOException{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line[]=bf.readLine().split(" ");

		int N=Integer.parseInt(line[0]);
		int M=Integer.parseInt(line[1]);
		int oneCount=0;
		int res=0;
		

		//int answerCount=0;
		//answer=new int[15];
		
		arr=new int[N][N];
		arr2=new int[N][N];
		

		//배열 입력.
		for(int i=0;i<N;i++)
		{
			line=bf.readLine().split(" ");
			for(int j=0;j<N;j++)
			{
				if(line[j].equals("2"))
				{
					arr2[i][j]=Integer.parseInt(line[j]);
				}
				else if(line[j].equals("1"))
				{
					oneCount++;
					arr[i][j]=Integer.parseInt(line[j]);
				}
			}
		}

		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				//집 발견
				if(arr[i][j]==1)
				{
					res+=check(i,j,N);
				}
			}
		}
		
		System.out.println(res);

	}

}
