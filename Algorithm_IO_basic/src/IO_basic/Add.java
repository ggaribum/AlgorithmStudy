package IO_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 //,�� ���еǴ� ���ڿ�s �� �ڿ������� �� ���ϱ�
public class Add {

	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = bf.readLine();
		StringTokenizer st = new StringTokenizer(line, ",");
		long sum=0;
		while (st.hasMoreTokens())
		{
			sum+=Long.valueOf(st.nextToken());
		}
		System.out.println(sum);
		

	}

}
