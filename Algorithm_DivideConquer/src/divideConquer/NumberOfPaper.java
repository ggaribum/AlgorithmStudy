package divideConquer;

import java.util.Scanner;

public class NumberOfPaper {

	//https://www.acmicpc.net/problem/1780

	public static int paperZero=0;
	public static int paperOne=0;
	public static int paperMinusOne=0;
	
	public static boolean correct(int x,int y ,int range,int arr[][])
	{
		//���۱����� �Ǵ� x y�� �׸��� �߷��� ������ �ִ� ���� range�� ����
		//ex) 0,0 ~ 2,2 �˻� -> range�� 3��-> �� 0,0 ���� 0,1 0,2 ..���ؼ�
		//�ϳ��� �ٸ��� false �װ� �ƴ϶�� true ��ȯ
		
		for(int i=0;i<range;i++)
		{
			for(int j=0;j<range;j++)
			{
				if(arr[x][y]!=arr[i+x][j+y])
				{
					return false;
				}
			}
		}
		return true;
		
	}

	public static void cutting(int x,int y,int range,int arr[][])
	{
		//���̰� �ϼ��Ǹ�
		if(correct(x,y,range,arr))
		{
			//������ �Ǿ��� ������ Ȯ��
			if(arr[x][y]==0) {paperZero++;}
			if(arr[x][y]==1) {paperOne++;}
			if(arr[x][y]==-1) {paperMinusOne++;}
			
			//��� ���� ����Ʈ
			return;
		}
		
		//3x3 =9������ �������� ���� 3ĭ ���� 3ĭ¥����� �����ϸ� ��
		//���� �����ϴ�(�����ϴ�) ������ ó���� 0 �״����� 3 �״����� 6 
		//							       3        3        6
		//								   6        6		 6
		//�̷��� 9ĭ �ϴ°���.
		
		for(int i=0;i<3;i++)
		{	
			for(int j=0;j<3;j++)
			{
				//���Ⱑ �ٽ�..�̰� ��¥ ���� ���ϰڴ�.
				//����� ����Ҷ� ���� ����Ʈ(�����ϴ�)
				//��ʹ� �׳� deep�� �κ� ������������ �켱 ���翡�� ��� �ǳʰǳ� �۰���
				//�����ϴ°� ���ѵ�.
				
				cutting(x+(i*(range/3)), y+(j*(range/3)), range/3, arr);
			}
		}
		
	}

	
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int arr[][]= new int[num][num];

		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		cutting(0, 0, num, arr);
		System.out.println(paperMinusOne);
		System.out.println(paperZero);
		System.out.println(paperOne);

	}
}
