import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%2 ==1||(n>=6 && n<=20)){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }
    }
}