import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
          int n = sc.nextInt();
          char c = sc.next().charAt(0);
          sc.nextLine();
          String s = sc.nextLine();
          if(c=='g'){System.out.println(0); continue;}
          int nextGreen = -1;
          int ans = 0;
          s = s+s;
          for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='g')nextGreen = i;
            if(i<n && s.charAt(i)==c){
              ans = Math.max(ans, nextGreen-i);
            }
          }
          System.out.println(ans);
        }
    } 
}
