public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(long t = 0;t<testcases; t++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            HashSet<Integer> set = new HashSet<>();
            int max = 0;
            for(int i=0;i<n;i++){
              int curr = Math.abs(sc.nextInt() - (i+1));
              max = Math.max(max,curr);
              set.add(curr);
            }
            System.out.println(hcf(set,max));
        }
            
    }
    public static int hcf(HashSet<Integer>hs, int max) {
       for(int i =max;i>0;i--){
          boolean flag = true;
          for(int num:hs)if(num%i!=0) {flag = false;break;}
          if(flag)return i;
       }
       return -1;
    }
}   
