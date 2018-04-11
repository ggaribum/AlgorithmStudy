package Collection_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//스택구현한건데 이걸 Collection에 있는 stack이 아니라
//int [] 로 stack 만들어보기 포인터 개념 처럼 current 써가면서~

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
