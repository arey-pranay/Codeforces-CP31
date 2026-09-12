import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        int n = sc.nextInt();
        int bef[] = new int[n];
        int aft[] = new int[n];
        for(int i=0;i<2*n;i++){
          if(i<n) bef[i] = sc.nextInt();
          else aft[i%n] = sc.nextInt();
        }
       int i = 0;
       int j = n-1;
       while(bef[i] == aft[i])i++;
       while(bef[j] == aft[j])j--;
      
       while(i>0 && aft[i-1] <= aft[i]) i--; // can be included, because it's smaller than current smallest starting, so sorting wouldn't change
       while(j<n-1 && aft[j+1] >= aft[j]) j++;
      
       System.out.println((i+1)+" "+ (j+1));
      
      }
  }
} 
