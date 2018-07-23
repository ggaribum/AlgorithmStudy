package greedyPart1;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
11
1 4
3 5
0 6
5 7
3 8
5 9
6 10
8 11
8 12
2 13
12 14

-> 4
 */

public class ConferenceRoom {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int inputNum = Integer.parseInt(bf.readLine());
		int roomTime[][] = new int[inputNum][2];
		
		int tempNum1=0;
		int tempNum2=0;
		String tempLine[];

		// ȸ�ǽ� �迭 �Է�
		for (int i = 0; i < inputNum; i++) {
			tempLine = bf.readLine().split(" ");
			roomTime[i][0] = Integer.parseInt(tempLine[0]);
			roomTime[i][1] = Integer.parseInt(tempLine[1]);
		}

		// �������� comparable �Ẹ��
		// 2�����迭 �����ϱ�.. �̰� �³� �𸣰ڵ�
		for (int i = 0; i < inputNum; i++) {
			for (int j = 0; j < inputNum - 1; j++) {
				// ����ð��� ������ �������� ���� ����
				if (roomTime[i][1] <= roomTime[j][1]) {
					tempNum1 = roomTime[j][0];
					tempNum2 = roomTime[j][1];

					roomTime[j][0] = roomTime[i][0];
					roomTime[j][1] = roomTime[i][1];
					roomTime[i][0] = tempNum1;
					roomTime[i][1] = tempNum2;
				}
			}

		}
		for (int i = 0; i < inputNum; i++) {
			for (int j = 0; j < inputNum - 1; j++) {
				// ����ð��� ���� �� ���۽ð��� ������ �������� ����
				if (roomTime[i][1] == roomTime[j][1])

					if (roomTime[i][0] <= roomTime[j][0]) {
						tempNum1 = roomTime[j][0];
						tempNum2 = roomTime[j][1];

						roomTime[j][0] = roomTime[i][0];
						roomTime[j][1] = roomTime[i][1];
						roomTime[i][0] = tempNum1;
						roomTime[i][1] = tempNum2;
					}
			}

		}
		
		//ťó�� ���۽ð����� ���ų� ������ ������
		//����ð����� ������ ������
		//�ϸ鼭 �˻��ϱ�.
		int count=1;
		tempNum1=roomTime[0][0];
		tempNum2=roomTime[0][1];
		for(int i=1;i<inputNum;i++)
		{
			if(tempNum1<roomTime[i][0] && tempNum2<=roomTime[i][0])
			{
				count++;
				tempNum1=roomTime[i][0];
				tempNum2=roomTime[i][1];
			}
		}
		
		System.out.println(count);
		
		
		
	}

}
