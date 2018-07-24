package greedyPart2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//www.acmicpc.net/problem/1744

public class TieNumber {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(bf.readLine());
		int numArr[]=new int[num];
		
		for(int i=0;i<num;i++)
		{
			numArr[i]=Integer.parseInt(bf.readLine());
		}
		
		//오름차순 정렬
		Arrays.sort(numArr);
		int minusCount=0;
		for(int i=0;i<num;i++)
		{
			if(numArr[i]<0)
			{
				minusCount++;
			}
		}
		int minusSum=1;
		int minusCount2=0;
		int plusSum=1;
		int sum=0;
		
		for(int i=0;i<numArr.length;i++)
		{
			if(minusCount%2==0 && i<minusCount)
			{
				minusSum *=numArr[i];
				minusCount2++;
			}
			if(minusCount%2!=0 && i<minusCount)
			{
				if(i<minusCount-1)
				{
					minusSum*=numArr[i];
				}
				if(i==(minusCount-1) && numArr[i+1]!=0)
				{
					sum+=numArr[i];
				}
			}
			if(numArr[i]==1)
			{
				sum+=numArr[i];
			}
			if(numArr[i]>1)
			{
				plusSum*=numArr[i];
			}
		}
		
		if(minusCount2==0)
		{
			minusSum=0;
		}
		sum+=minusSum+plusSum;
		
		System.out.println(sum);
		
	}

}
