package IO_basic;

import java.util.Scanner;

public class N {
	//N��� StringBuilder�� �ϱ�
	public static void main(String[] args) {
		
		int n=0;
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		n=sc.nextInt();
		for(int i= 1; i<=n ;i++)
		{
			sb.append(i+"\n");
		}
		
		System.out.println(sb);
	}

}
