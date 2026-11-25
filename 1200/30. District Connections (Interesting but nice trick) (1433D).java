import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0;i<n;i++) arr[i] = sc.nextInt();// 1 1000 101 1000
      int root = -1;
      for(int i=1;i<n;i++) if(arr[i]!=arr[0]){root = i; break;}
      if(root==-1) {System.out.println("NO"); continue;}
      System.out.println("YES");
      for(int i=1;i<n;i++){
         int x =  arr[i] != arr[0] ? 0 : root;
         int y = i;
         System.out.println((x+1) + " " +(y+1));
      }
    }
  }
}
// 10 ->9/45. MST
// 1,2  1,3  4,2  2,5
// 1 -> [1,4]
// 2 -> [2,3]
// 3 -> [5]

  
// 1<->3,5,2<->4
  
// 1,2,3,5,4

// 1,2
// 1,3
// 4,2
// 2,5

// 1,2,3,4,5

