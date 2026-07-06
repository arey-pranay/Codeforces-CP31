import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			long  sbkaMin = Long.MAX_VALUE;
			long  sbkaSecMin = Long.MAX_VALUE;
			long sum = 0;
			for(int i=0; i<n; i++) {
				int m = sc.nextInt();
				long min =  Long.MAX_VALUE;
				long smin = Long.MAX_VALUE;
				for(int j=0; j<m; j++) {
					long curr = sc.nextInt();
					if(curr < min) {
						smin = min;
						min = curr;
					} else if(curr<smin) smin = curr;
				}
				sbkaMin = Math.min(sbkaMin, min);
				sbkaSecMin = Math.min(sbkaSecMin, smin);
				sum += smin;
			}
			// ek array esi hogi, jisme secMin sbse chhota hoga, uske secMin nhi lege, usko fook aur usme global min daaldege
			sum -= sbkaSecMin;
			sum += sbkaMin;
			System.out.println(sum);
		}
	}
}
