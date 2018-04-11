package Collection_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Test
{
	String name;
	int flag=0;
	public Test() {
		// TODO Auto-generated constructor stub
	}
	public Test(String name, int flag) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.flag=flag;
	}
}

public class Dontknow {

	public static void main(String[] args)throws IOException {

		ArrayList<Test> list = new ArrayList<>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());

		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());

		for(int i=0;i<n;i++)
		{
			list.add(new Test(bf.readLine(),1));
		}
		int length= list.size();

		for(int i=0;i<m;i++)
		{
			if(length<i)
			{
				break;
			}
			String temp=bf.readLine();

			for(int j=0;j<length;j++)
			{
				if(list.get(j).name.equals(temp))
				{
					list.get(j).flag=3;
					break;
				}
				if(j==length-1)
				{
					list.add(new Test(temp,2));
					break;
				}
			}

		}
		List<String> str = new ArrayList<>();
		for(int j=0; j<list.size();j++)
		{
			if(list.get(j).flag==3)
			{
				str.add(list.get(j).name);
			}
		}
		Collections.sort(str);
		System.out.println(str.size());
		for(int i= 0;i<str.size();i++)
		{
			System.out.println(str.get(i));
		}


	}

}
