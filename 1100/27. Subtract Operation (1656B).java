import java.util.*;
public class Main{
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    int t =sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int k = sc.nextInt();
      HashSet<Integer> hs = new HashSet<>();
      boolean found = false;
      for(int i=0;i<n;i++) hs.add(sc.nextInt());
      for(int num : hs) if(hs.contains(num-k)){found=true; break;}
      System.out.println(found ? "YES" : "NO");
   }
 }
}
