// input string is 1000 char max, single ans <26, double ans < 26^2 (676), triple length ans < 26^3 (17000).
// so find if we have which consecutive smallest combination.

import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc  = new Scanner(System.in);
    int t  = sc.nextInt();
    while(t-->0){
       int n = sc.nextInt();
       sc.nextLine();

       char[] arr = sc.nextLine().toCharArray();
       boolean[] ones = new boolean[26];
       for(int i=0;i<n;i++){
          ones[arr[i]-'a']=true;
       }

       boolean found=false;
       for(int i=0;i<26;i++)
         if(ones[i] == false){
           System.out.println((char)('a'+i)); 
           found=true; break;
         }
       if(found) continue;

       boolean[][] twos = new boolean[26][26];
       for(int i=0;i<n-1;i++) twos[arr[i]-'a'][arr[i+1]-'a']=true;
      
       l2:{
         for(int i=0;i<26;i++) 
           for(int j=0;j<26;j++) 
             if(twos[i][j] == false){
               System.out.println(""+(char)('a'+i)+(char)('a'+j)); 
               found=true; break l2;
             }
       }
       if(found) continue;

       boolean[][][] threes = new boolean[26][26][26];
       for(int i=0;i<n-2;i++)threes[arr[i]-'a'][arr[i+1]-'a'][arr[i+2]-'a']=true;
      
       l3:{
         for(int i=0;i<26;i++)
           for(int j=0;j<26;j++)
             for(int k=0;k<26;k++)
               if(threes[i][j][k] == false){
                 System.out.println(""+(char)('a'+i)+(char)('a'+j)+(char)('a'+k)); found=true; break l3;
               }
       }
    }
  }
}
