import java.util.*;
public class Main{
  static long ans=0;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      long w = sc.nextInt();
      long arr[] = new long[n];
      long minHeight = Long.MAX_VALUE;
      long maxHeight = Long.MIN_VALUE;
      ans = 0;
      //int ans = Integer.MIN_VALUE;
      for(int i =0;i<n;i++){
        arr[i] = sc.nextLong();
        minHeight  = Math.min(arr[i],minHeight);
        maxHeight = Math.max(arr[i],maxHeight);
      }
      search(minHeight,maxHeight + (w/n),arr,w);
      System.out.println(ans);
      
    }
  }
  public static void search(long start, long end, long[] arr, long w){
    if(start>end) return;
    
    long mid = start + ((end-start)/2);
    long waterNeeded = calculateWater(mid,arr);
    
    if(waterNeeded>w){ //can't cover itni zyada height.
      search(start,mid-1,arr,w);
    }
    else if(waterNeeded<=w){ // this is a valid height, store it, and find if higher is possible too.
      ans = Math.max(ans,mid);
      // System.out.println("ans_update");
      search(mid+1,end,arr,w);
    }
    
  }
  public static long calculateWater(long height,long arr[]){
     //we will have definately this muchheight will be there with 0 water invested
      //now for each increase in height we will get the tve difference between the height we selected and the curr height of water 
      //we will calcuate for one increase in it how much we are getting 
      // then we will multiply with the number such that it is equal or less the the given height and we will return it.
    
      //we have calculated water requied for increase in one height
    long reqWater = 0;
    for(long i:arr) reqWater += Math.max(0, height-i);
    // System.out.println("For, height: " + height + " water needed is: "+ reqWater);
    return reqWater;
  }
}
