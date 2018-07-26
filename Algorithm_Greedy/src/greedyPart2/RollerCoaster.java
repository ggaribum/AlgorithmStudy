package greedyPart2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RollerCoaster {

	public static int SUM=0;
	public static boolean FLAG=true;
	//https://www.acmicpc.net/problem/2873

	public static void main(String[] args) throws IOException{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line[]=bf.readLine().split(" ");

		int R=Integer.parseInt(line[0]);	
		int C=Integer.parseInt(line[1]);	
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		int arr[][] = new int[R][C];
		int j=0;
		for(int i=0;i<R;i++)
		{
			line=bf.readLine().split(" ");
			for(int k=0;k<C;k++)
			{
				arr[i][k]=Integer.parseInt(line[k]);
			}
		}


		//R짝수 * C짝수
		if(R%2==0 && C%2==0)
		{
			int x=0;
			int y=1;

			for(int i=0; i<R;i++)
			{
				for(int k=0;k<C;k++)
				{
					//백준 방법!! - > 신기하게 이 부분은 피해야됨.
					if((i+k)%2==1)
					{
						if(arr[x][y]>arr[i][k])
						{
							//제일 작은 수의 x,y값의 좌표를 알아냄.
							x=i;
							y=k;
						}
					}
				}
			}

			//무조건 칸수를 줄이면서(가까워지면서) 2x2 행렬꼴로 만들어야됌
			// X ? 형태 혹은 X @  형태로 만들어야한다
			// @ Y         ? Y  

			int x2=0;
			int y2=0;
			int x3=R-1;
			int y3=C-1;

			for(x2=0;x2<x-1;x2++)
			{
				for(y2=0;y2<C-1;y2++)
				{
					sb.append("R");
				}
				sb.append("D");
				x2++;
				for(y2=y2;y2>0;y2--)
				{
					sb.append("L");
				}
				sb.append("D");
			}

			//ㅋㅋ 나중에 reverse시킬거라서 L - >R 그리고 U- > D로 표현해야함
			for(x3=R-1;x3>x+1;x3--)
			{
				for(y3=C-1;y3>0;y3--)
				{
					sb2.append("R");
				}
				sb2.append("D");
				x3--;
				
				//밑에 C-> C-1로함
				for(y3=y3;y3<C-1;y3++)
				{
					sb2.append("L");
				}
				sb2.append("D");
			}
			
			//x2,y2기준 x,y가 바로 밑 혹은 오른쪽에 있지 않다면
			while(!((x2-1==x && y2==y) || (x2==x && y2==y-1)))
			{
				sb.append("D");
				x2++;
				sb.append("R");
				y2++;
				sb.append("U");
				x2--;
				sb.append("R");
				y2++;
			}
		
			//x3,y3의 바로 위 혹은 바로 왼쪽에 있지 않다면
			//여기도 reverse를 위해 L->R , U->D
			while(!( (x3==x+1 && y3==y) || (x3==x && y3==y+1) ) )
			{
				sb2.append("D");
				x3--;
				sb2.append("R");
				y3--;
				sb2.append("U");
				x3++;
				sb2.append("R");
				y3--;
			}

			//x2,y2기준 바로 옆에 있다면
			if(x2==x && y2+1==y)
			{
				sb.append("D");
				x2++;
				sb.append("R");
				y2++;
			}
			//그게 아니라면 바로 밑에 있겠지
			else
			{
				sb.append("R");
				y2++;
				sb.append("D");
				x2++;
			}
			
			

		}//else문

		
		
		//R짝수 * C홀수
		else if(R%2==0 && C%2==1)
		{	
			int row=0;
			int column=0;
			while(row<R-1 && column<=C-1)
			{	
				sb.append("D");
				row++;
				if(row==R-1)
				{
					if(column==C-1)
					{
						break;
					}
					sb.append("R");
					column++;

					while(true)
					{
						sb.append("U");
						row--;
						if(row==0)
						{
							sb.append("R");
							column++;
							break;
						}
					}
				}
			}
		}


		else
		{
			for(int i=0;i<R;i++)
			{
				FLAG=true;
				while(FLAG)
				{
					sb.append("R");
					j++;
					if(i==R-1&&j==C-1)
					{
						break;
					}
					if(j==C-1)
					{
						sb.append("D");
						i++;
						for(j=j;j>=0;j--)
						{
							if(j==0) 
							{
								sb.append("D");
								break;
							}
							sb.append("L");
						}
						FLAG=false;
					}
				}
			}
		}
		
		sb2.reverse();
		sb.append(sb2);
		System.out.println(sb);

	}

}
