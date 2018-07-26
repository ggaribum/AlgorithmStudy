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


		//R¦�� * C¦��
		if(R%2==0 && C%2==0)
		{
			int x=0;
			int y=1;

			for(int i=0; i<R;i++)
			{
				for(int k=0;k<C;k++)
				{
					//���� ���!! - > �ű��ϰ� �� �κ��� ���ؾߵ�.
					if((i+k)%2==1)
					{
						if(arr[x][y]>arr[i][k])
						{
							//���� ���� ���� x,y���� ��ǥ�� �˾Ƴ�.
							x=i;
							y=k;
						}
					}
				}
			}

			//������ ĭ���� ���̸鼭(��������鼭) 2x2 ��Ĳ÷� �����߉�
			// X ? ���� Ȥ�� X @  ���·� �������Ѵ�
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

			//���� ���߿� reverse��ų�Ŷ� L - >R �׸��� U- > D�� ǥ���ؾ���
			for(x3=R-1;x3>x+1;x3--)
			{
				for(y3=C-1;y3>0;y3--)
				{
					sb2.append("R");
				}
				sb2.append("D");
				x3--;
				
				//�ؿ� C-> C-1����
				for(y3=y3;y3<C-1;y3++)
				{
					sb2.append("L");
				}
				sb2.append("D");
			}
			
			//x2,y2���� x,y�� �ٷ� �� Ȥ�� �����ʿ� ���� �ʴٸ�
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
		
			//x3,y3�� �ٷ� �� Ȥ�� �ٷ� ���ʿ� ���� �ʴٸ�
			//���⵵ reverse�� ���� L->R , U->D
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

			//x2,y2���� �ٷ� ���� �ִٸ�
			if(x2==x && y2+1==y)
			{
				sb.append("D");
				x2++;
				sb.append("R");
				y2++;
			}
			//�װ� �ƴ϶�� �ٷ� �ؿ� �ְ���
			else
			{
				sb.append("R");
				y2++;
				sb.append("D");
				x2++;
			}
			
			

		}//else��

		
		
		//R¦�� * CȦ��
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
