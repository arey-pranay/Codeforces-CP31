import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
          int n = sc.nextInt();
          sc.nextLine();
          String s = sc.nextLine();
          int ans =0;
          int[] pre = new int[n];
          int[] suf = new int[n];
          HashSet<Character> set = new HashSet<>();
          for(int i=0;i<n;i++){
            set.add(s.charAt(i));
            pre[i] = set.size();
          }
          set.clear();
           for(int i=n-1;i>=0;i--){
            set.add(s.charAt(i));
            suf[i] = set.size();
          }
          for(int i=0;i<n-1;i++) ans = Math.max(ans,pre[i]+suf[i+1]);
          System.out.println(ans);
        }
    } 
}
