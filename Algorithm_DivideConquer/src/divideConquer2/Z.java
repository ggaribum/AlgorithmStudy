package divideConquer2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Z {

	//https://www.acmicpc.net/problem/1074

	
	//public static int matrix[][];
	public static int count=0;
	public static int res=0;
	public static boolean FLAG=true;
	
	public static void conquer(int x,int y, int range,int r, int c)
	{
		if(range==1)
		{
			//시작점(x,y)이 r,c이면 그때의 순서(count)값 기억 그리고 시스템 종료
			if(x==r && y==c)
			{
				res=count;
				FLAG=false;
				return;
			}
			count++;
			return;
		}
		//4등분 하니깐 < 2 
		for(int i=0;i<2 && FLAG;i++)
		{
			for(int j=0;j<2 && FLAG ;j++)
			{
				conquer(x+(i*range/2), y+(j*range/2), range/2, r, c);
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException{
			
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line[]=bf.readLine().split(" ");
		int N=Integer.parseInt(line[0]);
		int r=Integer.parseInt(line[1]);
		int c=Integer.parseInt(line[2]);
		
		int size=1;
		//2^N 이 사이즈가 되므로
		for(int i=0;i<N;i++)
		{
			size *=2;
		}
		//배열을 따로 만들 필요없음 메모리 초과!
		//matrix=new int[size][size];
		
		conquer(0, 0, size, r, c);
		System.out.println(res);
	}

}
