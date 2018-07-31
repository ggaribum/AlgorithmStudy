package divideConquer2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadTree {
	
	// https://www.acmicpc.net/problem/1992

	public static int matrix[][];
	public static StringBuilder sb;
	
	public static boolean correct(int x,int y,int range)
	{
		for(int i=x;i<x+range;i++)
		{
			for(int j=y;j<y+range;j++)
			{
				if(matrix[x][y]!=matrix[i][j])
				{
					return false;
				}
			}
		}
		
		return true;
	}
	public static void quadTree(int x,int y,int range)
	{
		if(correct(x,y,range))
		{
			if(matrix[x][y]==0) {sb.append("0");}
			if(matrix[x][y]==1) {sb.append("1");}
			return;
		}
		//재귀 들어갈 때 마다 괄호 열고
		sb.append("(");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				quadTree(x+(i*range/2), y+(j*range/2), range/2);
			}
		}
		//재귀 끝나는 지점에 닫아주기
		sb.append(")");
	}


	public static void main(String[] args) throws IOException{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(bf.readLine());
		sb= new StringBuilder();
		
		String line[];
		matrix= new int[n][n];

		for(int i=0;i<n;i++)
		{
			line=bf.readLine().split("");
			for(int j=0;j<n;j++)
			{
				matrix[i][j]=Integer.parseInt(line[j]);
			}
		}
		quadTree(0, 0, n);
		System.out.println(sb);
		/*for(int i=0;i<N;i++)
		{
			String temp=bf.readLine();
			for(int j=0;j<M;j++)
			{
				arr[i][j]=temp.charAt(j)-'0';
			}
		}*/







	}

}
