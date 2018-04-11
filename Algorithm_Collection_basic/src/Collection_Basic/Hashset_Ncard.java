package Collection_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

/*���� ī��� ���� �ϳ��� ������ �ִ� ī���̴�. ����̴� ���� ī�� N���� ������ �ִ�. 
���� M���� �־����� ��, �� ���ڰ� �����ִ� ���� ī�带 
����̰� ������ �ִ��� �ƴ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/
public class Hashset_Ncard {

	public static void main(String[] args) throws IOException {

		HashSet<Integer> hash = new HashSet<>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());

		String line[] = bf.readLine().split(" ");

		for (int i = 0; i < N; i++) {
			hash.add(Integer.parseInt(line[i]));
		}

		int M = Integer.parseInt(bf.readLine());
		String line2[] = bf.readLine().split(" ");
		for (int i = 0; i < M; i++) {
			if (hash.contains(Integer.parseInt(line2[i]))) {
				System.out.print("1 ");
			} else {
				System.out.print("0 ");
			}
		}

	}

}

/*
 * ���ѻ�� �ڵ�!!
 * 
 * StringTokenizer�� StringBuilder�� �� Ȱ���Ѵ�!!
 * 
 * 
 import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
 
 
 
public class Main {
    static int MAX_N = 500000;
    static int N;
    static int M;
    static int[] NUM = new int[MAX_N];
    public static void main(String[] args) throws Exception{
        //System.setIn(new FileInputStream("input.txt"));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine());
        for(int idx = 0; idx < N; idx++) {
            NUM[idx] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(NUM, 0, N);
        StringBuilder sb = new StringBuilder(MAX_N);
        
        M = Integer.parseInt(in.readLine());
        st = new StringTokenizer(in.readLine());
        for(int idx = 0; idx < M; idx++) {
            int number = Integer.parseInt(st.nextToken());
            sb.append(Arrays.binarySearch(NUM, 0, N, number) >= 0 ? 1 : 0).append(" ");
        }
        System.out.println(sb.toString());
    }
}
 
 */
