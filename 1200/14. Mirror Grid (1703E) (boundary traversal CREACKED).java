import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc  = new Scanner(System.in);
    int t  = sc.nextInt();

    while(t-->0){
      int n = sc.nextInt();
      int grid[][]  = new int[n][n];
      for(int i =0;i<n;i++){
        String s = sc.next();
        for(int j = 0;j<n;j++){
          grid[i][j] = s.charAt(j)-'0';
        }
      }
      int count = 0;
      for(int i=0;i<n/2;i++) count +=getFlips (i,i,n-i-1,n-i-1,grid);
      System.out.println(count);
    }

  }


  private static int getFlips(int x1, int y1, int x2, int y2, int[][] grid){
    int flips = 0;
    int diff = y2-y1;
    for(int j=0;j<diff;j++){
        int a = grid[x1][y1+j];
        int b = grid[x1+j][y2];
        int c= grid[x2][y2-j];
        int d = grid[x2-j][y1];
        int ones = 0; if(a==1) ones++; if(b==1) ones++; if(c==1) ones++; if(d==1) ones++;
        flips += Math.min(ones, 4-ones);
    }
    //System.out.println(flips);
    return flips;
  }
}
