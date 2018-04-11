package Collection_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

//회사 로그저장 문제

public class CompanyLog {

	public static void main(String[] args)throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		HashSet<String> hash = new HashSet<>();
		
		//StringTokenizer st = new StringTokenizer(bf.readLine()); // 아마 공백을 기준으로
		//토큰별로 나누어서 st에다가 저장하는 거임 nexttoken 하면 다음 공백에 있는 글자들이 st부분으로 들어감
			
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
		String str[]= hash.toArray(new String[hash.size()]); //이 format은 외우자
		Arrays.sort(str);//이렇게 외우자
		int length =str.length;
		
		for(int j=length-1;j>=0;j--)
		{
			System.out.println(str[j]);
		}
	
		
		
		
	}

}
