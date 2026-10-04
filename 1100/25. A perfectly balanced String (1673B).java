import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
     int t= sc.nextInt();
     sc.nextLine();
    while(t-->0){
      HashSet<Character> hs = new HashSet<>();
      boolean ok = true;
      
      String s= sc.nextLine();
      int last[] = new int[26];
      Arrays.fill(last,-1);
      for(char c: s.toCharArray()) hs.add(c);
      for(int i = 0;i<s.length();i++){
        char c = s.charAt(i);
        if(last[c-'a'] != -1 && (i - last[c-'a'] != hs.size())){ok = false; break;}
        last[c-'a'] = i;
      }
      System.out.println(ok ? "YES" : "NO");
    }
  }
}
// YES
// NO
// YES
// YES
// NO
