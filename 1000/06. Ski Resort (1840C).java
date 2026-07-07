import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
     int n = sc.nextInt();
     int k = sc.nextInt();
     int q = sc.nextInt();
     int[] arr = new int [n];
     for(int i=0;i<n;i++) arr[i] = sc.nextInt();
      int i=0,j=0;
      long ans=0;      
      while(j<n){
        if(arr[j] > q){
          int r = j-i;
          if(r>=k){
            long x = r-(k-1);
            ans += (x*(x+1)/2);
          }
          i=j+1;
        } 
        j++;
      }
    int r = n-i;
    if(r>=k){
        long x = r-k+1;
        ans += (x*(x+1)/2);
    }
    System.out.println(ans);
    }
  }
}
