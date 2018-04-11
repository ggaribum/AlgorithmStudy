package Collection_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MakeQueue {

	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> queue= new ArrayList<>();

		int n = Integer.parseInt(bf.readLine());
		int cur=-1;
		int front=0;
		int tail=-1;

		for(int i=0;i<n;i++)
		{
			String str[]=bf.readLine().split(" ");
			switch(str[0])
			{
			case "push":
				queue.add(str[1]);
				tail++;
				break;
			case "pop":
				if(queue.isEmpty())
				{
					System.out.println("-1");
					break;
				}
				System.out.println(queue.get(front));
				queue.remove(front);
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				if(queue.isEmpty())
				{
					System.out.println("1");
				}
				else
				{
					System.out.println("0");
				}
				break;
			case "front":
				if(queue.isEmpty())
				{
					System.out.println("-1");
					break;
				}
				System.out.println(queue.get(front));
				break;
			case "back":
				if(queue.isEmpty())
				{
					System.out.println("-1");
					break;
				}
				System.out.println(queue.get(tail));
				break;

			}
		}

	}

}
