package divideConquer2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class STAR {
	public static StringBuilder sb ;
	public static String str[][];
	//https://www.acmicpc.net/problem/2447
	
	public static void conquer(int x, int y, int range,String s)
	{
		if(range==1)
		{
			str[x][y]=s;
			//sb.append("*");
			return ;
		}		
		//규칙을 찾아라
		//depth가 가장 깊은 곳 = > 1x1 
		//=>3x3
		//=>9x9 ...
		//형태니깐 재귀의 탈출 경로는 1x1일 때.
		//그리고 3x3형태에서 규칙을 보면 이중 포문(0~9)이 5번째 돌 때 공백을 출력
		//똑같이 9x9에서 한 칸을(3x3)으로 보면 (3x3)짜리가 9개 있는 것이므로
		//5번 째 돌 때 죄다 공백이어야 한다.
		
		int count=0;

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				count++;
				//이게 핵심. 이중 포문이 5번째 일때 혹은
				//recall될 때 빈칸으로 들어오면 더 밑으로 recall 할 때도 빈칸으로 보낸다
				
				if(count==5||s.equals(" "))
				{
					conquer(x+(i*range/3), y+(j*range/3), range/3 ," ");
				}
				//출발 지점인 x y좌표를 3칸씩 이동
				else
				{
					conquer(x+(i*range/3), y+(j*range/3), range/3 ,"*");
				}
			}
		}
	
		
		
	}
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		//sb= new StringBuilder();
		str=new String [n][n];
		
		conquer(0, 0, n, "*");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(str[i][j]);
			}
			System.out.print("\n");
		}
	}

}
