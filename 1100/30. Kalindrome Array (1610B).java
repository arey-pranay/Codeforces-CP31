import java.util.*;
public class Main{
  public static void main(String[] args){
  Scanner sc =  new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextLong();
        System.out.println(func(arr));
    }
  }
  public static String func(long[] arr){
      return palindrome(arr) ? "YES" : "NO";
  }
  public static boolean palindrome(long[] arr){
    int i = 0;
    int j = arr.length-1;
    while(i<j && arr[i]==arr[j]){
      i++;
      j--;
    }
    if(i>=j || skipPalindrome(arr,i,j,arr[i]) ||  skipPalindrome(arr,i,j,arr[j])) return true;
    return false;
  }
  public static boolean skipPalindrome(long[] arr, int start, int end, long skip){
    while(start<end){
      if(arr[start] == arr[end]) {start++; end--;}
      else{
        if(arr[start] == skip) start++;
        else if(arr[end] == skip) end--;
        else return false;
      }
    }
    return true;
  }
}
