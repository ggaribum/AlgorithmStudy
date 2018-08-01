package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CutLAN {

	//https://www.acmicpc.net/problem/1654

	//�� long���� �ؾ����� ?
	public static long arr[];

	public static boolean check(int K,int N,long mid)
	{
		int count=0;

		for(int i=0;i<K;i++)
		{
			//�� �迭 �ε������� mid(�ڸ� ����)��ŭ ����� �߷��� LAN�� ���� �� 
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
		//�Է¼��� �ڿ����� 0���� ���� runTime Error !!
		long left=1;
		long right=max;
		long result=0;

		while(left<=right)
		{
			long mid=(left+right)/2;

			//N���� ���� �� �ִٸ�
			if(check(K,N,mid))
			{
				//N���� ����� �ִ밪�� ã�� �� ���� result �ٲ�
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
