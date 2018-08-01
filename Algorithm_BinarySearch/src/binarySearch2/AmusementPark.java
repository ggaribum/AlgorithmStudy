package binarySearch2;

import java.util.Scanner;

public class AmusementPark {

	//https://www.acmicpc.net/problem/1561

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long N=sc.nextLong();
		int M=sc.nextInt();
		int arr[]=new int[M];
		long count=0;
		long time=2;
		int res=0;
		
		//���̱ⱸ �迭�Է�
		for(int i=0; i<M;i++)
		{
			arr[i]=sc.nextInt();
		}
		//���̱ⱸ �������� ��ٸ��� ����� ������ �׳� �ٷ� ���
		if(N<=M)
		{
			int newN=(int)N;
			System.out.println(arr[newN-1]);
			return;
		}
		
		//�̰� Main����
		else
		{
			count=M;//���̱ⱸ ������ŭ ���� ������� ��ġ�ϹǷ� M���� �ʱ�ȭ
			//������ ������� ���̱ⱸ Ż ������
			while(count!=N)
			{
				//�ð��ʰ��� �ߴ� ���� ����
				for(int i=0; i<M && count<N; i++)
				{
					//����ð��� 1�̸� 1�� ���� �� ���� �ٷιٷ� Ż �� ����.
					if(arr[i]==1)
					{
						res=i;
						//��� �¿����� count++
						count++;
					}
					else
					{
						if(time%arr[i]==1)
						{
							res=i;
							count++;
						}
					}
				}
				time++;
			}

		}
		System.out.println(arr[res]);
		
	}

}
