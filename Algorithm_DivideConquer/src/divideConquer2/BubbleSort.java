package divideConquer2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
	//https://www.acmicpc.net/problem/1517

	public static int swapCont=0;
	public static int arr[];

	public static void sort(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					swapCont++;
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bf.readLine());

		arr=new int[n];
		String line[]=bf.readLine().split(" ");
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.valueOf(line[i]);
		}
		sort(n);
		
		System.out.println(swapCont);

	}

}
