import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc  = new Scanner(System.in);
    int t  = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int S = sc.nextInt();
      int arr[] = new int[n];
      for(int i =0;i<n;i++) arr[i] = sc.nextInt();
      int left = 0;
      int ones= 0;
      int ans = -1;
      for(int right = 0;right<n;right++){
        if(arr[right] == 1) ones++;
        while(ones > S) if(arr[left++] == 1)ones--;
        if(ones == S) ans = Math.max(ans, right-left+1);
      }
   
      System.out.println(ans==-1 ? -1:n-ans);
    }
    // n - lengthOfLargestSubstringWith1sequalToS

  }
}
