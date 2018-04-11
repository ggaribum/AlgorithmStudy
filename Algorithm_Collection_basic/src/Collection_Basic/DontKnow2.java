package Collection_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class DontKnow2 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String, Integer> hash = new HashMap<>();
		StringTokenizer st= new StringTokenizer(bf.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		for(int i=0;i<n;i++)
		{
			String name=bf.readLine();
			hash.put(name, 1);
		}
		for(int i=0;i<m;i++)
		{
			String name=bf.readLine();
			Integer v=hash.get(name);
			if(v==null)
			{
				v=0;
			}
			v+=2;
			hash.put(name,v);
		}
		
		ArrayList<String> str= new ArrayList<>();
		for(Entry<String, Integer> temp:hash.entrySet())
		{
			String key=temp.getKey();
			Integer value=temp.getValue();
			if(value==3)
			{
				str.add(key);
			}
		}
		Collections.sort(str);
		System.out.println(str.size());
		for(int i=0;i<str.size();i++)
		{
			System.out.println(str.get(i));
		}
		
	}

	
}


//굳이 Map으로 풀 필요가 없음 Set으로 처음 듣 부분만 넣어두고 비교해도된다.
//문제의 핵심은 중복될 때 ++ 만 해주면되는거
//거기다 바로 핵심은 사전 순 정렬이기 때문에 ArraryList<String>에 다가 result만
//옮겨담으면 간단하다!!! 이걸 꼭 기억해라!!!!

/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashSet<String> hm1 = new HashSet<String>();
		
		for (int i = 0; i < N; i++) {
			hm1.add(br.readLine());
		}
		
		ArrayList<String> resultList = new ArrayList<String>();
		int cnt = 0;
		String tmp = null;
		
		for (int i = 0; i < M; i++) {
			tmp = br.readLine();
			if(hm1.contains(tmp)) {
				cnt++;
				resultList.add(tmp);
			}
		}
		
		br.close();
		
		Collections.sort(resultList);
		
		StringBuilder sb = new StringBuilder();
		
		for (String s: resultList) {
			sb.append(s).append("\n");
		}
		
		System.out.println(cnt);
		System.out.println(sb);
	}
}
*/