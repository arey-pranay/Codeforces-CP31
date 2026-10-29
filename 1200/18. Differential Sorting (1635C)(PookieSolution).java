import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int arr[] = new int [n];
      boolean isSorted = true;
      for(int i =0;i<n;i++){
        arr[i] = sc.nextInt();
        if(i>0 && arr[i-1] > arr[i]) isSorted = false;
      }
      if(arr[n-2] > arr[n-1]) System.out.println(-1);
      else if(arr[n-1] < 0) System.out.println(isSorted ? 0 : -1); 
      else {
        System.out.println(n-2);
        for(int i=1;i<n-1;i++) System.out.println(i+" "+(n-1)+" "+n);
      }
    }
  }
}
