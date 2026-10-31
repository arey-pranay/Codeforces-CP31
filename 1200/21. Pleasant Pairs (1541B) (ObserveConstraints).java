// i + j <= 2n => a[i] * a[j] <= 2n => a[j] <= 2n/a[i] => arr[j] can be from 1 to 2*n/arr[i].
// j+i = arr[i]*arr[j] => j+i = arr[i]*x
// a[i] <= 2n && a[j] <= 2n


import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    int t  = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int arr[] = new int[n+1];
      for(int i =1;i<=n;i++) arr[i] = sc.nextInt();
      int count = 0;
      for(int i = 1;i<=n;i++) for(int x = 1; x <= 2*n/arr[i] ;x++) {int j = arr[i]*x -i; if(j>i && j<=n && arr[j]==x) count++;}
      System.out.println(count);
    }
  }
}
