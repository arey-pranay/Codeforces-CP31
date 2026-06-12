import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int tc = sc.nextInt();
 
        while (tc-- > 0) {            
            long loc = sc.nextLong(); //10
            long n = sc.nextLong();       //10         
            
            long newI = n/4; // 2
            long rem = n%4;
            long start = newI*4;
            for(long i=start+1;i<=start+rem;i++){
                int multi = loc%2 == 0 ? -1: 1;
                loc += i*multi;
            }
                
            System.out.println(loc);
 
            } 
        }
    }
