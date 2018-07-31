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
		//��Ģ�� ã�ƶ�
		//depth�� ���� ���� �� = > 1x1 
		//=>3x3
		//=>9x9 ...
		//���´ϱ� ����� Ż�� ��δ� 1x1�� ��.
		//�׸��� 3x3���¿��� ��Ģ�� ���� ���� ����(0~9)�� 5��° �� �� ������ ���
		//�Ȱ��� 9x9���� �� ĭ��(3x3)���� ���� (3x3)¥���� 9�� �ִ� ���̹Ƿ�
		//5�� ° �� �� �˴� �����̾�� �Ѵ�.
		
		int count=0;

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				count++;
				//�̰� �ٽ�. ���� ������ 5��° �϶� Ȥ��
				//recall�� �� ��ĭ���� ������ �� ������ recall �� ���� ��ĭ���� ������
				
				if(count==5||s.equals(" "))
				{
					conquer(x+(i*range/3), y+(j*range/3), range/3 ," ");
				}
				//��� ������ x y��ǥ�� 3ĭ�� �̵�
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
