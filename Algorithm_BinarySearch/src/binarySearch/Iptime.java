package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Iptime {

	//이건 답지 봄..
	//mid를 설정 할 때 기준 **
	//https://www.acmicpc.net/problem/2110

	public static long arr[];

	public static boolean check(int N,int C,long mid)
	{
		//무조건 시작 기준은 첫 번째 인덱스
		long start=arr[0];
		int count=1;

		for(int i=1;i<N;i++)
		{	
			if(arr[i]-start>=mid)
			{
				count++;
				start=arr[i];
			}
		}
		if(count>=C)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static long search(int N,int C)
	{
		long result=0;

		//기준값은 "인접한 집 사이의 거리"
		//최소값인 left는 1칸
		long left=1;
		//최대값인 right는 정렬한 arr이므로 처음과 끝
		long right=arr[N-1]-arr[0];

		while(left<=right)
		{
			long mid= (left+right)/2;

			if(check(N, C, mid))
			{
				if(result<mid)
				{
					result=mid;
				}
				left=mid+1;
			}
			else
				right=mid-1;
		}

		return result;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int C=sc.nextInt();

		arr=new long[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextLong();
		}
		Arrays.sort(arr);

		System.out.println(search(N, C));

	}

}
