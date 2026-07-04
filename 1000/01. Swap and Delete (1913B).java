import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while(t-->0){
      String s = sc.nextLine();
      int z=0;int o=0;
      for(char c:s.toCharArray()) if(c=='0')z++;else o++;
      if(z==o) {System.out.println(0);continue;}
      int n=s.length(); int i=0; int ans = 1;
      for(char c:s.toCharArray()) 
        if(i++!=-1 && (c=='0' && --o<0) || (c=='1' && --z<0))
            {ans= n-i+1; break;}
      System.out.println(ans);
    }
  }
}
