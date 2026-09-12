import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
       String s = sc.next();
       long n = s.length();
       if(!s.contains("1")){System.out.println(0); continue;}
       if(!s.contains("0")){System.out.println(n*n); continue;}
      
       s += s;
       int curr = 0;
       long max = 0;
       
       for(char c : s.toCharArray()) if(c == '1') curr++; else{ max = Math.max(curr,max); curr=0;}
       max = Math.min(n,Math.max(curr,max));
       
       long h = (max+1)/2L;
       long w = max+1 - h;
       System.out.println(h*w);
      }
  }
} 
