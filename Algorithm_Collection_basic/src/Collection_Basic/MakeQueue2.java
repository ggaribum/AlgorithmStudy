package Collection_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class MakeQueue2 {

	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Queue q = new LinkedList(); //Queue�� �������̽��ϱ� Ŭ������ �����Ȱ� ��,linkedList�̿�
		int lastNum=-1;

		int num=Integer.parseInt(bf.readLine());
		for(int i=0;i<num;i++)
		{
			String str[]=bf.readLine().split(" ");
			switch(str[0])
			{
			case "push":
				q.offer(str[1]);
				lastNum=Integer.parseInt(str[1]);
				break;
			case "pop":
				if(q.isEmpty())
				{
					System.out.println("-1");
					break;
				}
				System.out.println(q.peek()); //���캼�� peek
				q.poll();  //poll�� ��������� null��ȯ remove�� ��������� Exception ����
				break;

			case "empty":
				if(q.isEmpty())
				{
					System.out.println("1");
					break;
				}
				else
				{
					System.out.println("0");
				}
				break;

			case "size":
			{
				System.out.println(q.size());
				break;
			}
			case "front":
				if(q.isEmpty())
				{
					System.out.println("-1");
					break;
				}
				System.out.println(q.peek());
				break;
			case "back":
				if(q.isEmpty())
				{
					System.out.println("-1");
					break;
				}
				System.out.println(lastNum);
				break;
			}


		}
	}
}
