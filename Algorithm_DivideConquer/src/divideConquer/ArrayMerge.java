package divideConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayMerge {

	//https://www.acmicpc.net/problem/11728
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		String line[]=bf.readLine().split(" ");
		
		int N=Integer.parseInt(line[0]);
		int M=Integer.valueOf(line[1]);	//위에랑 같은말임
		int arr[]=new int[N];
		int brr[]=new int[M];
		int crr[]=new int[N+M];
		
		line=bf.readLine().split(" ");
		for(int i=0;i<N;i++)
		{
			arr[i]=Integer.parseInt(line[i]);  
		}
		
		line=bf.readLine().split(" ");
		for(int i=0;i<M;i++)
		{
			brr[i]=Integer.parseInt(line[i]);
		}
		int i=0;
		int j=0;
		int index=0;
		while(i<N && j <M)
		{
			if(arr[i]<=brr[j])
			{
				crr[index++]=arr[i++];
			}
			else
				crr[index++]=brr[j++];
		}
		while(i<N) {crr[index++]=arr[i++];}
		while(j<M) {crr[index++]=brr[j++];}
		
		for(int k=0;k<N+M;k++)
		{
		System.out.print(crr[k]+" ");
		}
	}	
}
