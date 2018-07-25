package divideConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearch {
	
	//https://www.acmicpc.net/problem/10815
	
	public static boolean search(int arr[], int search)
	{
		int left=0;
		int right=arr.length-1;
		int mid;
		//boolean flag=false;
		
		while(left<=right)
		{
			mid=(left+right)/2;
			
			if(search==arr[mid])
			{
				return true;
			}
		
			// mid 보다 찾는 수가 작다면
			else if(search<arr[mid])
			{
				right=mid-1;
			}
			else
			{
				left=mid+1;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int arr[]=new int [n];
		
		String line[]=bf.readLine().split(" ");
		
		for(int i=0; i<n;i++)
		{
			arr[i]=Integer.parseInt(line[i]);
		}
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		
		int m = Integer.parseInt(bf.readLine());
		line=bf.readLine().split(" ");
		for(int i=0;i<m;i++)
		{
			//return 값이 true면
			if(search(arr,Integer.parseInt(line[i])))
			{
				sb.append("1 ");
			}
			else
				sb.append("0 ");
		}
		
		System.out.println(sb);
	}

}
