package divideConquer;

import java.util.Scanner;

public class NumberOfPaper {

	//https://www.acmicpc.net/problem/1780

	public static int paperZero=0;
	public static int paperOne=0;
	public static int paperMinusOne=0;
	
	public static boolean correct(int x,int y ,int range,int arr[][])
	{
		//시작기준이 되는 x y값 그리고 잘려진 종이의 최대 범위 range를 받음
		//ex) 0,0 ~ 2,2 검색 -> range는 3임-> 즉 0,0 부터 0,1 0,2 ..비교해서
		//하나라도 다르면 false 그게 아니라면 true 반환
		
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
		//종이가 완성되면
		if(correct(x,y,range,arr))
		{
			//기준이 되었던 정수값 확인
			if(arr[x][y]==0) {paperZero++;}
			if(arr[x][y]==1) {paperOne++;}
			if(arr[x][y]==-1) {paperMinusOne++;}
			
			//재귀 종료 포인트
			return;
		}
		
		//3x3 =9장으로 나눴으니 세로 3칸 가로 3칸짜리라고 생각하면 됨
		//따라서 점프하는(증가하는) 간격은 처음엔 0 그다음은 3 그다음은 6 
		//							       3        3        6
		//								   6        6		 6
		//이렇게 9칸 하는거임.
		
		for(int i=0;i<3;i++)
		{	
			for(int j=0;j<3;j++)
			{
				//여기가 핵심..이건 진짜 생각 못하겠다.
				//여기는 재귀할때 시작 포인트(증가하는)
				//재귀는 그냥 deep한 부분 생각하지말고 우선 현재에서 어떻게 건너건너 뛸건지
				//생각하는게 편한듯.
				
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
