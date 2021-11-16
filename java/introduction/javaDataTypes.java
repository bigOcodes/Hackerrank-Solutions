import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            try{
                long x = sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x >= -128 && x <= 127){
                    System.out.println("* byte");
                }if(x >= -Math.pow(2, 15) && x <= Math.pow(2, 15)-1){
                    System.out.println("* short");
                }if(x >= -Math.pow(2, 31) && x <= Math.pow(2, 31)-1){
                    System.out.println("* int");
                }if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63)-1){
                    System.out.println("* long");
                }
            }catch(Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}