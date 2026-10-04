import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
     int t= sc.nextInt();
     while(t-->0){
      int n = sc.nextInt();
     
      int arr[] = new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
       if(n==1){System.out.println(0);continue;}
      int left = 1;
      int right = n-2;
      int alice = arr[0];
      int bob = arr[n-1];
      int ans = alice==bob ? 2:0;
      while(left<=right){
        if(alice > bob){
          bob += arr[right--];  // 5 1 3
        } else if(bob > alice){
          alice += arr[left++];  //7 3 3
        } else {
            
          ans = left+n-1-right; 
          if(left==right) break;
          alice += arr[left++]; bob += arr[right--];
            
        }
      }
     ans =  alice ==bob ? left+n-1-right: ans;
      System.out.println(ans);
    }
  }
}
// 4
// 3
// 10 20 10
// 6
// 2 1 4 2 4 1
// 5
// 1 2 4 8 16
// 9
// 7 3 20 5 15 1 11 8 10
