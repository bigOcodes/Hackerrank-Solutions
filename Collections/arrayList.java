import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int d = in.nextInt();
            ArrayList<Integer> col = new ArrayList<>();
            
            for(int j = 0; j < d; j++){
                col.add(in.nextInt());
            }
            
            lines.add(col);
        }
        
        int q = in.nextInt();
        for(int i = 0; i< q; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            
            try{
                System.out.println(lines.get(x-1).get(y-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
