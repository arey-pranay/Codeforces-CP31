import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int arr[]  = new int[n];
      for(int i =0;i<n;i++) arr[i] = sc.nextInt();
      int i =0, j  = n-1,min = 1, max = n;
       block: {
           while(i < j){
            if(arr[i] == min || arr[j] == min){
              if(arr[i]==min) i++;
              else if(arr[j]==min) j--;
              min++;
            }
            else if(arr[i] == max || arr[j] == max) {
              if(arr[i]==max) i++;
              else if(arr[j]==max) j--;
              max--;
            }
            else {System.out.println((i+1) + " " + (j+1)); break block;}
          }
           System.out.println(-1);
       }
    }
  }
}
