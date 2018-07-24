package greedyPart2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Matrix {

	//https://www.acmicpc.net/problem/1080
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String stLine[]=bf.readLine().split(" ");
		int N=Integer.parseInt(stLine[0]);
		int M=Integer.parseInt(stLine[1]);
		
		int arr[][] = new int[N][M];
		int brr[][] = new int[N][M];
		int hitCount=0;
		
		//**연속적으로 입력되는 정수 배열에 저장하는법**
		//여기서 시간초과 뜰 수 있음.
		for(int i=0;i<N;i++)
		{
			String temp=bf.readLine();
			for(int j=0;j<M;j++)
			{
				arr[i][j]=temp.charAt(j)-'0';
			}
		}

		for(int i=0;i<N;i++)
		{
			String temp=bf.readLine();
			for(int j=0;j<M;j++)
			{
				brr[i][j]=temp.charAt(j)-'0';
			}
		}
		
		//3*3 으로 연산하므로 최대 연산 횟수는 (N-2)(M-2)
		int n=0;
		int m=0;
		int count=0;
		
		//while문 조건 다시 체크 - > 2중 for문으로 만드는게 더 깔끔함
		while(n<N-2 && m<M-2)
		{
			//다르면 연산해야됌
			if(arr[n][m]!=brr[n][m])
			{
				for(int i=n;i<n+3;i++)
				{
					for(int j=m;j<m+3;j++)
					{
						//1->0 , 0->1
						arr[i][j]=(arr[i][j]==1)?0:1;			
					}
				}
				count++;
			}
			m++;
			if(!(m<M-2))
			{
				m=0;
				n++;
			}
		}
		
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				if(arr[i][j]==brr[i][j])
				{
					hitCount++;
				}
			}
		}
		if(hitCount==N*M)
		{
			System.out.println(count);
		}
		else
			System.out.println("-1");
	}
}
