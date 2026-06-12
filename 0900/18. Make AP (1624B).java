import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {            
            double a = sc.nextInt();
            double b = sc.nextInt();
            double c = sc.nextInt();
                
            if((b-a == c-b) || isInt((a+c)/(2*b)) || isInt((2*b-c)/a) || isInt((2*b-a)/c))
                System.out.println("YES");
            else System.out.println("NO");
            } 
        }
        public static boolean isInt(double num){
            return num>0 && num==Math.floor(num);
        }
    }
