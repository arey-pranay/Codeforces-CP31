import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc  = new Scanner(System.in);
    int t  = sc.nextInt();
    while(t-->0){
       int n = sc.nextInt();
       String s = sc.next();
       int count=0;
       for(int i=0;i<n;i++) if(s.charAt(i)=='0') count++;
       System.out.println(count==1 || count%2==0 ? "BOB" : "ALICE");
    }
  }
}
//jiske paas pehle odd 0s wala palindrome aaya, wo haarega.
// a 3 
// b 3
// // 1 _ _ 4 _ _ _ 7

// 010101 0 101010
// 010101 1 101010   - alice 0 to 1

// 110101 1 101010   - bob 0 to 1

// 010101 1 101011    - alice reverse

// 1101011101011    - bob 0 to 1  

// 1111011101011     alice 0 to 1  
// 1101011110111      bob swap

// 111101110111     alice 0 to 1  

//  111111110111    ''

  


  
  
