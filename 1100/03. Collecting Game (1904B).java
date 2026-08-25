import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);  
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int nums[] = new int[n];
      long sum = 0;
      HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
        for(int i =0;i<n;i++){
          nums[i] = sc.nextInt();
          ArrayList<Integer> temp = hm.getOrDefault(nums[i], new ArrayList<>());
          temp.add(i);
          hm.put(nums[i],temp);
          sum+= nums[i];
        }
      Arrays.sort(nums);
      int[] count = new int[n];
      count[n-1] = n-1;
      for(int i=n-2;i>=0;i--){
        int num = nums[i+1];
        sum -= num;
         if(sum>=num) count[i] = count[i+1]; // agr hum agle wale tk pohch skte hai to hum usko apne me milaakr uske aage bhi pohch skte hai na
        else count[i] = i;//humse chhote hum saare numbers pe ja skte hai
      }
        HashSet<Integer> done = new HashSet<>();
      int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            int num = nums[i];
        
            if(done.contains(num)) continue;
            done.add(num);
        
            int c = count[i];
            for(int idx : hm.get(num))
                ans[idx] = c;
            } // because if array is [1,1,1,1,] thousand times, then count is [1000,1000,1000...]. 
            //so if we dont use hashset, then for every '1', we will go to the other "1000" 1s. N^2 then
      for(int num : ans) System.out.print(num+" ");
      System.out.println();
    }
  }
}
// 1 2 4 5 20
// 32
// 12
