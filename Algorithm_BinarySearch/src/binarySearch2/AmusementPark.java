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
		
		//놀이기구 배열입력
		for(int i=0; i<M;i++)
		{
			arr[i]=sc.nextInt();
		}
		//놀이기구 종류보다 기다리는 사람이 적으면 그냥 바로 출력
		if(N<=M)
		{
			int newN=(int)N;
			System.out.println(arr[newN-1]);
			return;
		}
		
		//이게 Main로직
		else
		{
			count=M;//놀이기구 종류만큼 먼저 사람들을 배치하므로 M으로 초기화
			//마지막 사람까지 놀이기구 탈 때까지
			while(count!=N)
			{
				//시간초과가 뜨는 이유 ㅋㅋ
				for(int i=0; i<M && count<N; i++)
				{
					//운행시간이 1이면 1분 지날 때 마다 바로바로 탈 수 있음.
					if(arr[i]==1)
					{
						res=i;
						//사람 태웠으니 count++
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
