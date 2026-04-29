import java.util.*;

class Main {
    public static void main (String[] args) throws Exception {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Arrays.sort(arr);

            // check all equal
            if(arr[0] == arr[n-1]){
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");

            // print largest first
            System.out.print(arr[n-1] + " ");

            // then rest
            for(int i = 0; i < n-1; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
