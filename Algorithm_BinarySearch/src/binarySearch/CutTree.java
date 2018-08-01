package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CutTree {

	//https://www.acmicpc.net/problem/2805

	public static long arr[];

	public static boolean check(int N,long M,long mid)
	{
		long count=0;
		for(int i=0;i<N;i++)
		{
			if(arr[i]>=mid)
			{
				count+=(arr[i]-mid);
			}
		}
		if(count>=M)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static long search(int N,long M,long max)
	{
		long height=0;
		long left=1;
		long right=max;

		while(left<=right)
		{
			long mid=(left+right)/2;

			if(check(N,M,mid))
			{
				if(height<=mid)
				{
					height=mid;
				}
				left=mid+1;
			}
			else
				right=mid-1;
		}

		return height;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line[]=bf.readLine().split(" ");

		int N=Integer.parseInt(line[0]);
		long M=Long.parseLong(line[1]);
		arr= new long[N];

		line=bf.readLine().split(" ");
		long max=0;

		for(int i=0;i<N;i++)
		{
			arr[i]=Long.parseLong(line[i]);
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		
		System.out.println(search(N, M, max));

	}

}
