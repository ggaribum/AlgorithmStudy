package Collection_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//1076번 저항문제
public class Resist {

	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String, String> hm = new HashMap<>();
		hm.put("black", "0,1");
		hm.put("brown", "1,10");
		hm.put("red"  , "2,100");
		hm.put("orange", "3,1000");
		hm.put("yellow", "4,10000");
		hm.put("green", "5,100000");
		hm.put("blue", "6,1000000");
		hm.put("violet", "7,10000000");
		hm.put("grey", "8,100000000");
		hm.put("white", "9,1000000000");
		
		String ansline1[]=hm.get(bf.readLine()).split(",");
		String ansline2[]=hm.get(bf.readLine()).split(",");
		String ansline3[]=hm.get(bf.readLine()).split(",");
		
		String ans=ansline1[0]+ansline2[0];
		long result = Long.parseLong(ans)*Long.parseLong(ansline3[1]);
		System.out.println(result);
		
	}

}
