package SortBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Point2 
{
	int x,y=0;
	public Point2() {
		// TODO Auto-generated constructor stub
	}
	public Point2(int x,int y) {
		this.x=x;
		this.y=y;
	}

}

public class ComparatorTest {

	public static void main(String[] args)throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(bf.readLine());

		Point2 obj[] = new Point2[num];
		for(int i=0; i< num; i++)
		{
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());

			obj[i]=new Point2(x,y);
		}
		Arrays.sort(obj, new Comparator<Point2>() {

			@Override
			public int compare(Point2 p1, Point2 p2) {
				if(p1.y<p2.y)
				{
					return -1;
				}
				else if(p1.y==p2.y)
				{
					if(p1.x<p2.x)
					{
						return -1;
					}
					else if(p1.x==p2.x)
					{
						return 0;
					}
					else
						return 1;
				}
				else 
					return 1;
			}

		});
		//Á¤·Ä ³¡
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i].x+" "+obj[i].y);
		}
		
		

	}
}
