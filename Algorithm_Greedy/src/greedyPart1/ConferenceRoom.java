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

		// 회의실 배열 입력
		for (int i = 0; i < inputNum; i++) {
			tempLine = bf.readLine().split(" ");
			roomTime[i][0] = Integer.parseInt(tempLine[0]);
			roomTime[i][1] = Integer.parseInt(tempLine[1]);
		}

		// 다음번엔 comparable 써보기
		// 2차원배열 정렬하기.. 이게 맞나 모르겠따
		for (int i = 0; i < inputNum; i++) {
			for (int j = 0; j < inputNum - 1; j++) {
				// 종료시간이 빠른걸 기준으로 먼저 정렬
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
				// 종료시간이 같을 때 시작시간이 빠른걸 기준으로 정렬
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
		
		//큐처럼 시작시간보다 같거나 작으면 빠지고
		//종료시간보다 작으면 빠지고
		//하면서 검사하기.
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
