package IO_basic;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*�� N���� �־����� ��, N���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� N(1 �� N �� 100)���� ���� �������� ���еǾ �־�����. �Է����� �־����� ���� 10,000���� �۰ų� ���� �ڿ����̴�. ��, 0���� �����ϴ� ���� �־����� �ʴ´�.

*/

public class Add3 {

	public static void main(String[] args)throws IOException {
			
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = bf.readLine();
		StringTokenizer st= new StringTokenizer(line);
		long sum=0;
		
		while(st.hasMoreTokens())
		{
			sum+=Long.valueOf(st.nextToken());
		}
		
		System.out.println(sum);
				

	}

}
