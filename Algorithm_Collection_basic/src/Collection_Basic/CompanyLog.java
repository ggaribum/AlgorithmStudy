package Collection_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

//ȸ�� �α����� ����

public class CompanyLog {

	public static void main(String[] args)throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		HashSet<String> hash = new HashSet<>();
		
		//StringTokenizer st = new StringTokenizer(bf.readLine()); // �Ƹ� ������ ��������
		//��ū���� ����� st���ٰ� �����ϴ� ���� nexttoken �ϸ� ���� ���鿡 �ִ� ���ڵ��� st�κ����� ��
			
		for(int i=0;i<n;i++)
		{
			String line[] = bf.readLine().split(" ");
			if(line[1].equals("enter"))
			{
				hash.add(line[0]);
			}
			else
			{
				hash.remove(line[0]);
			}
		}
		String str[]= hash.toArray(new String[hash.size()]); //�� format�� �ܿ���
		Arrays.sort(str);//�̷��� �ܿ���
		int length =str.length;
		
		for(int j=length-1;j>=0;j--)
		{
			System.out.println(str[j]);
		}
	
		
		
		
	}

}
