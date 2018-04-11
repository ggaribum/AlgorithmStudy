package Collection_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//���ñ����Ѱǵ� �̰� Collection�� �ִ� stack�� �ƴ϶�
//int [] �� stack ������ ������ ���� ó�� current �ᰡ�鼭~

public class MakeStack {

	public static void main(String[] args) throws IOException {

		Stack<Integer> stack = new Stack<>();
		int num = 0;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(bf.readLine());

		for (int i = 0; i < num; i++) {
			String temp = bf.readLine();
			String templist[] = temp.split(" ");
			
			if (templist[0].equals("push")) {
				stack.push(Integer.parseInt(templist[1]));
			}
			if (templist[0].equals("pop")) {
				if (!stack.isEmpty()) {
					System.out.println(stack.peek());
					stack.pop();
				} else
					System.out.println("-1");
			}
			if (templist[0].equals("size")) {
				System.out.println(stack.size());
			}
			if (templist[0].equals("empty")) {
				System.out.println(stack.isEmpty() ? "1" : "0");
			}
			if (templist[0].equals("top")) {
				if (!stack.isEmpty()) {
					System.out.println(stack.peek());
				} else {
					System.out.println("The Stack is empty");
				}
			}

		}

	}

}
