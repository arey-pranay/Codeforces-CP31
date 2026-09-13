import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t  = sc.nextInt();
    while(t-->0){
      int  n  = sc.nextInt();
      long arr[] = new long[n];
      for(int i =0;i<n;i++)arr[i] = sc.nextLong();
      boolean flag = false;
      Arrays.sort(arr);
      long sum = 2;
      if(arr[0]!=1 || ((n>1)&& arr[1]!=1 )) flag = true;
      for(int i = 2;i<n;i++)if(flag) break; else if(arr[i]>sum)flag = true; else sum += arr[i];
      
      if(flag)System.out.println("NO");
      else System.out.println("YES"); 
    }
  }
}
