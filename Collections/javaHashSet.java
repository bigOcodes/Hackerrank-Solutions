import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        Set<String> list = new HashSet<>();
        for(int i=0;i<t;i++){
            pair_left[i] = s.next();
            pair_right[i] = s.next();
            list.add(pair_left[i]+" "+pair_right[i]);
            System.out.println(list.size());
        }       
    }
}
