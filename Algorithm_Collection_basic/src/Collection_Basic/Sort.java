package Collection_Basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

//N개의 수 오름차순 정렬
public class Sort {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int i = 0; i<n;i++)
		{
			int temp=sc.nextInt();
			arr.add(temp);
		}
		Collections.sort(arr);
		for(int a:arr)
		{
			System.out.println(a);
		}
		
	}

}
