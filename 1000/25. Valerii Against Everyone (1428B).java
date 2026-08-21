import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while(t-->0){
      int n = sc.nextInt();    
      HashSet<Long> found = new HashSet<>();
      boolean printed = false;
      for(int i=0;i<n;i++){
        long curr = sc.nextInt();
        if(found.contains(curr)){printed=true;}
        found.add(curr);
      }
      System.out.println(!printed ? "NO" : "YES");
    }
  }
}
