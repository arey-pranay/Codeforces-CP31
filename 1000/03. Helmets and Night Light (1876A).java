import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {			
            ArrayList<long[]> arr = new ArrayList<>();
            int n = sc.nextInt();
            long p = sc.nextLong();
            long cost = p;
            int done = 1;
			for(int i=0; i<n; i++) {
				long[] temp = new long[2];
                temp[0] = sc.nextLong();
                arr.add(temp);
			}
            for(int i=0; i<n; i++) {
				long[] temp = arr.get(i);
                temp[1] = sc.nextLong();
			}
            Collections.sort(arr,(a,b)->Long.compare(a[1],b[1]));
            for(long[] temp : arr){
               if(temp[1] >= p || done == n) break;
               long cap = Math.min(n-done,temp[0]);
               cost += cap*temp[1];
               done += cap;
            }
            cost += (n-done)*p;
			System.out.println(cost);
		}
	}
}
