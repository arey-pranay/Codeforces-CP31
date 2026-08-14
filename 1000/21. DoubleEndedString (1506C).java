import java.util.*;
public class Main {
  static int[][][] memo;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while(t-->0){
     String a = sc.nextLine();
     String b = sc.nextLine();
     memo = new int[a.length()][b.length()][Math.min(a.length(),b.length()) + 1];
     for(int[][] d2 : memo)for(int[] temp : d2) Arrays.fill(temp,-1);
     int lcs =func(0,0,0,a,b);
     int val = (a.length()-lcs) + (b.length()-lcs);
     System.out.println(val);
    }
  }
  public static int func(int i ,int j, int count, String a, String b){
    if(i==a.length()|| j==b.length()) return count;
    if(memo[i][j][count] != -1)return memo[i][j][count];
    int matched = count;
    if(a.charAt(i)==b.charAt(j)) matched = func(i+1,j+1,count+1,a,b);
    int skipA = func(i+1,j,0,a,b); 
    int skipB = func(i,j+1,0,a,b);
    return memo[i][j][count] = Math.max(matched,Math.max(skipA,skipB));
  }
}
