import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Pattern p = Pattern.compile("\\b(\\w+)(?:\\W+\\1\\b)+", Pattern.CASE_INSENSITIVE);
        
        while(n-- > 0){
            String input = sc.nextLine();
            Matcher m = p.matcher(input);
            while(m.find()){
                input = input.replaceAll(m.group(),m.group(1));
            }
            System.out.println(input);
        }
        sc.close();
    }
}
