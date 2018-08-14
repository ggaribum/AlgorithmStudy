package backJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TempTest{
   
   public static class Point{
      
      int x,y;
      long dis=0;
      int count=0;
      
   }

   public static void main(String[] args) throws IOException {
      // TODO Auto-generated method stub
      
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      
      
      String[] line=br.readLine().split(" ");
      int n=Integer.parseInt(line[0]);
      int m=Integer.parseInt(line[1]);
      
      ArrayList<Point> house=new ArrayList<Point>();
      ArrayList<Point> chic=new ArrayList<Point>();
      ArrayList<Point> selected=new ArrayList<Point>();
      
      
      for(int i=0;i<n;i++) {
         line=br.readLine().split(" ");
         
         for(int j=0;j<n;j++) {
            
            if(Integer.parseInt(line[j])==2) {
               Point pos=new Point();
               pos.x=i+1;
               pos.y=j+1;
               
               chic.add(pos);
            }else if(Integer.parseInt(line[j])==1) {
               Point pos=new Point();
               pos.x=i+1;
               pos.y=j+1;
               
               house.add(pos);
            }
         }

      }
      
      
      for(int j=0;j<house.size();j++) {
         house.get(j).dis=n+n;
         int shortest=0;
         
         for(int i=0;i<chic.size();i++) {
            

            long x=(house.get(j).x>chic.get(i).x)? (house.get(j).x-chic.get(i).x) : (chic.get(i).x-house.get(j).x); 
            long y=(house.get(j).y>chic.get(i).y)? (house.get(j).y-chic.get(i).y) : (chic.get(i).y-house.get(j).y); 
            long distance=x+y;
            chic.get(i).dis+=distance;
            if(house.get(j).dis>distance) {
               house.get(j).dis=distance;
               shortest=i;
            }
         }
         
         chic.get(shortest).count++;
         	
      }
      
      Collections.sort(chic, new Comparator<Point>() {
         
         public int compare(Point a, Point b) {
            if(a.count<b.count) {
               return 1;
            }else {
               if(a.dis>b.dis) {
                  return 1;
               }else {
                  return -1;
               }
               
            }
               
         }
      });
      
      for(int i=0;i<m;i++) {
         selected.add(chic.get(i));
         
      }
      
      
      for(int j=0;j<house.size();j++) {
         for(int i=0;i<selected.size();i++) {
            

            long x=(house.get(j).x>selected.get(i).x)? (house.get(j).x-selected.get(i).x) : (selected.get(i).x-house.get(j).x); 
            long y=(house.get(j).y>selected.get(i).y)? (house.get(j).y-selected.get(i).y) : (selected.get(i).y-house.get(j).y); 
            long distance=x+y;
            if(i==0) {
               house.get(j).dis=distance;
            }else {
               house.get(j).dis=(int)Math.min(house.get(j).dis, distance);
            }
         }
      }
      
      long answer=0;
      
      for(Point pos : house) {
         answer+=pos.dis;
      }
      
      bw.write(answer+"");
      bw.flush();
      bw.close();
      
      
      

   }

}