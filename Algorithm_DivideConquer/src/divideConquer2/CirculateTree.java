package divideConquer2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CirculateTree {

	//https://www.acmicpc.net/problem/2263

	public static int inorderArr[];
	public static int postorderArr[];
	public static int position[];
	public static ArrayList<Integer> list;
	
	public static void conquer(int inStart,int inEnd, int postStart,int postEnd)
	{
		if(inStart > inEnd || postStart > postEnd) {return ;}
		int root = postorderArr[postEnd];
		//root 출력
		System.out.print(root+" ");
		
		int p=position[root];
		int left = p-inStart;
		conquer(inStart,p-1, postStart, postStart+left-1);
		conquer(p+1,inEnd, postStart+left, postEnd-1);
		
	}
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int num=Integer.parseInt(bf.readLine());
		String line[]=bf.readLine().split(" ");
		String line2[]=bf.readLine().split(" ");
	
		inorderArr=new int[num];
		postorderArr=new int[num];
		position=new int[num+1];
		
		//list=new ArrayList<>();
		
		//트리 순회배열 생성
		for(int i=0;i<num;i++)
		{
			inorderArr[i]=Integer.parseInt(line[i]);
			postorderArr[i]=Integer.parseInt(line2[i]);
			position[inorderArr[i]] = i; //검색하기 간편하게
		}
	
		conquer(0,num-1,0,num-1);

		
	}

}
