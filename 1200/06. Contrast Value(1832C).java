import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int[] arr = new int[n];
      int m = 0;
      for(int i=0;i<n;i++){
         int x = sc.nextInt();
         if(m== 0 || x != arr[m-1]){
          arr[m++] = x;    
        }
      }
      int ans = 1; 
      for(int i=1;i<m-1;i++){ // unique numbers
        if( // na increasing hai, na decreasing. so we cannot ignore this number. i is at a crest or trough, ya to V bnra hai ya A bnra hai
          (arr[i] < arr[i-1] && arr[i] < arr[i+1])
          ||
          (arr[i] > arr[i-1] && arr[i] > arr[i+1])
        ) ans++;
      }
      if(m > 1) ans++;
      System.out.println(ans);
    }
  }
}
