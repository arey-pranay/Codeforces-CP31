import java.util.*;
public class Main{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		for(int t=0;t<testcases;t++){
		    
		    int n = sc.nextInt();
		    int ans[] = new int[n];
		    int prev = Integer.MAX_VALUE;
		   

		    for(int i =0;i<n;i++){
		        int curr = sc.nextInt();
		        if(curr==1) ans[i]=++curr;
		        
                if(i!=0&&curr%prev==0) ans[i]= ++curr;
		        else ans[i]=curr;
		        
		        prev = curr;
		    }
		   
		   
		    for(int i :ans) System.out.print((i+" "));
		    System.out.println();
		}
	}
}
