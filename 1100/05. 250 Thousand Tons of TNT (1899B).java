import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t  = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int arr[] = new int[n];
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      
      for(int i =0;i<n;i++){
        arr[i] = sc.nextInt();
        min = Math.min(arr[i],min);
        max = Math.max(arr[i],max);
      }
      long ans = max-min;
     long pre[] = new long[n];
      // int suff[]  = new int[n];
      pre[0] = arr[0];
      // suff[n-1] = arr[n-1];
      for(int i = 1;i<n;i++){
        pre[i] = arr[i]+pre[i-1];
        // suf[n-i-1]= arr[n-i]+suf[n-i]; //nice
    }
    List<Integer> facts = findFact(n);
     for(int fact: facts){
      long currMin = pre[fact-1];
       long currMax = pre[fact-1];
       for(int i =(2*fact)-1;i<n;i+=fact){
          currMin = Math.min(pre[i]-pre[i-fact],currMin);
          currMax = Math.max(pre[i]-pre[i-fact],currMax);
       }
      ans = Math.max(ans,currMax-currMin);      
     }
      System.out.println(ans);
  }
  }
  private  static List<Integer> findFact(int n){
    List<Integer> facts = new ArrayList<>();
    for(int i=2;(i*i)<=n;i++) if(n%i==0) {facts.add(i); facts.add(n/i);}
    return facts;
  }
}
