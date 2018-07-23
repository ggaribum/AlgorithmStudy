package greedyPart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ATM {

	public static void main(String[] args)throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bf.readLine());
		
		int arr[]=new int[n];
		int sum=0;
		int temp=0;
/*		String line[]=bf.readLine().split(" ");
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(line[i]);
		}*/
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		//오름차순으로 정렬
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		//시간합만 출력하면 됨
		/*for(int i=0;i<n;i++)
		{
			sum+=(sum+arr[i]);
		}
		*/
		System.out.println(sum);
		
	}

}
