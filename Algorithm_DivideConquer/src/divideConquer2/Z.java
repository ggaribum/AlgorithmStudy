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
			//������(x,y)�� r,c�̸� �׶��� ����(count)�� ��� �׸��� �ý��� ����
			if(x==r && y==c)
			{
				res=count;
				FLAG=false;
				return;
			}
			count++;
			return;
		}
		//4��� �ϴϱ� < 2 
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
		//2^N �� ����� �ǹǷ�
		for(int i=0;i<N;i++)
		{
			size *=2;
		}
		//�迭�� ���� ���� �ʿ���� �޸� �ʰ�!
		//matrix=new int[size][size];
		
		conquer(0, 0, size, r, c);
		System.out.println(res);
	}

}
