package SortBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


class Point implements Comparable<Point>
{
	int x,y=0;
	
	public Point() {
		// TODO Auto-generated constructor stub
	}
	public Point(int x,int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
	}
	@Override
	public int compareTo(Point p1) {
		// TODO Auto-generated method stub
		if(this.x<p1.x)
		{
			return -1;
		}
		else if(this.x==p1.x)
		{
			if(this.y<p1.y)
			{
				return -1;
			}
			else if(this.y==p1.y)
			{
				return 0;
			}
			else
				return 1;
		}
		else
			return 1;
	}
}

public class ComparableTest {

	public static void main(String[] args)throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(bf.readLine());
		Point []obj = new Point[num];
		
		for(int i=0;i<num;i++)
		{
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			obj[i]=new Point(x,y);
			
		}
		Arrays.sort(obj);
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i].x+" "+obj[i].y);
		}

	}

}
