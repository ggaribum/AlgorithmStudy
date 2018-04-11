package IO_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//10 20 30 40 들어가면 1020 + 3040 되게하는 코드
public class Add2 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		String line = bf.readLine();
		String line2[] = line.split(" ");
		
		String a = line2[0]+line2[1];
		String b = line2[2]+line2[3];
		
		System.out.println(Integer.valueOf(a)+Integer.valueOf(b));
		

	}

}
