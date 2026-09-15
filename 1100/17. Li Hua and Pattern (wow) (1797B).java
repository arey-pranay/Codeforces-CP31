// import java.util.*;
 
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
 
//         int t = sc.nextInt();
 
//         while (t-- > 0) {
//             int n = sc.nextInt();
//             int k = sc.nextInt();
//             int[]arr = new int[n* (n/2 + n%2)]; //sundr baat, wah
//             int mismatch = 0;
          
//             for (int i = 0; i < n; i++) {
//                 for (int j = 0; j < n; j++) {
//                   int x  = sc.nextInt();
//                   if(i< (n+1)/2) arr[i*n+j] = x; //sundr baat, wah
//                   else if (x != arr[(n - 1 - i)*n + (n - 1 - j)]) mismatch++;
//                 }
//             }
//            if(n%2!=0){
//               int row = n/2;
//               for(int j=0;j<n/2;j++) if(arr[row*n +j] != arr[row*n + (n-1-j)]) mismatch++;
//            }
         
 
//             if (mismatch > k) {
//                 System.out.println("NO");
//             } else if (n % 2 == 0 && (k - mismatch) % 2 != 0) {
//                 System.out.println("NO");
//             } else {
//                 System.out.println("YES");
//             }
//         }
//     }
// }

import java.io.*;
import java.util.*;

public class Main {

    // Fast Scanner
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            while ((c = read()) <= ' ') ;
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            int val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }
    }

    public static void main(String[] args) throws Exception {

        FastScanner sc = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            // Store only the upper half of the matrix
            int[] arr = new int[n * ((n + 1) / 2)];

            int mismatch = 0;

            for (int i = 0; i < n; i++) {

                int base = i * n;

                if (i < (n + 1) / 2) {

                    // Save this row
                    for (int j = 0; j < n; j++) {
                        arr[base + j] = sc.nextInt();
                    }

                } else {

                    int mirrorBase = (n - 1 - i) * n;

                    for (int j = 0; j < n; j++) {
                        int x = sc.nextInt();
                        if (x != arr[mirrorBase + (n - 1 - j)]) {
                            mismatch++;
                        }
                    }
                }
            }

            // Middle row for odd n
            if ((n & 1) == 1) {
                int row = n / 2;
                int base = row * n;

                for (int j = 0; j < n / 2; j++) {
                    if (arr[base + j] != arr[base + (n - 1 - j)]) {
                        mismatch++;
                    }
                }
            }

            if (mismatch > k) {
                out.append("NO\n");
            } else if ((n & 1) == 0 && ((k - mismatch) & 1) == 1) {
                out.append("NO\n");
            } else {
                out.append("YES\n");
            }
        }

        System.out.print(out);
    }
}
