package greedyPart2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Thirty {

	// https://www.acmicpc.net/problem/10610
	// 얼탱이 없네..내림차순 하면 됌.
	/*
	 * 문자열 내림차순 다른 방법
	 * String[] array = str.split(""); Arrays.sort(array,
	 * Collections.reverseOrder());
	 */
	//char s[] - > int sum; for(i<s.length){sum+=s[i]-'0'}
	
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String st = bf.readLine();
		int zero = 0;
		
		for (int i = 0; i < st.length(); i++) 
		{
			if (st.charAt(i) == '0') 
			{
				zero++;
			}			
		}	
		
		if (!st.contains("0")) 
		{
			System.out.println("-1");
			return;
		} 
		else 
		{	
			String stLine[] = st.split("");
			// 문자열 내림차순 정렬
			Arrays.sort(stLine);
			Collections.reverse(Arrays.asList(stLine));
			
				
		}
		
		
		
	}
}
