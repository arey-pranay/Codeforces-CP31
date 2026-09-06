  
        // A^2 + B^2 + C^2 ... = total (if A,B,C are the sides including the margins)
        // (a+2*w)^2
        // a^2 + 4aw + 4w^2
        // a^2 + 4w*(a+w)
        
        // a^2 + b^2 + c^2 ..
        // + 4w* ((a+w) + (b+w) + (c+w)..)
  
        // a^2 + b^2 + c^2 .. + 4w*(nw + (a+b+c+...)) = t
        // 4w*(nw + sumOf(a..z)) = t - sumOf(a^2..z^2)
        // 4nww  + 4wsumOf(a..z) = K
  
        
        // X w^2    + Y w + Z = 0

import java.util.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            BigInteger total = sc.nextBigInteger();

            BigInteger sum = BigInteger.ZERO;
            BigInteger sumSquares = BigInteger.ZERO;

            for (int i = 0; i < n; i++) {
                BigInteger x = sc.nextBigInteger();

                sum = sum.add(x);
                sumSquares = sumSquares.add(x.multiply(x));
            }
            //4nww  + 4wsumOf(a..z) = t - sumOf(a^2..z^2) => quadratic equation with a = 4n, b = 4*sum, c =  sumOf(a^2..z^2)-t 
            
            // D = b^2 - 4ac
  
            BigInteger N = BigInteger.valueOf(n);

            BigInteger D = sum.multiply(sum)
                    .add(N.multiply(total.subtract(sumSquares)));

            BigInteger sqrtD = sqrt(D);

            BigInteger w = sqrtD.subtract(sum)
                    .divide(N.multiply(BigInteger.TWO));

            System.out.println(w);
        }

        sc.close();
    }

    // Integer square root
    public static BigInteger sqrt(BigInteger n) {

        BigInteger x = BigInteger.valueOf(
                (long) Math.sqrt(n.doubleValue())
        );

        while (x.multiply(x).compareTo(n) > 0) {
            x = x.subtract(BigInteger.ONE);
        }

        while (x.add(BigInteger.ONE)
                .multiply(x.add(BigInteger.ONE))
                .compareTo(n) <= 0) {
            x = x.add(BigInteger.ONE);
        }

        return x;
    }
}
