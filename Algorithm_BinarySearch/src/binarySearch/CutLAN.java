package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CutLAN {

	//https://www.acmicpc.net/problem/1654

	//왜 long으로 해야하지 ?
	public static long arr[];

	public static boolean check(int K,int N,long mid)
	{
		int count=0;

		for(int i=0;i<K;i++)
		{
			//각 배열 인덱스별로 mid(자를 길이)만큼 나누어서 잘려진 LAN선 갯수 셈 
			count+=arr[i]/mid;
		}

		if(count>=N)
		{
			return true;
		}
		else
			return false;
	}

	public static long search(int K,int N,long max)
	{
		//입력수는 자연수라 0부터 들어가면 runTime Error !!
		long left=1;
		long right=max;
		long result=0;

		while(left<=right)
		{
			long mid=(left+right)/2;

			//N개를 만들 수 있다면
			if(check(K,N,mid))
			{
				//N개를 만드는 최대값을 찾을 때 까지 result 바꿈
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

	public static void main(String[] args) throws IOException{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line[]=bf.readLine().split(" ");
		int K= Integer.parseInt(line[0]);
		int N= Integer.parseInt(line[1]);
		long max=0;

		arr=new long [K];

		for(int i=0; i<K; i++)
		{
			arr[i]=Long.parseLong(bf.readLine());
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		
		System.out.println(search(K, N, max));
	}

}
