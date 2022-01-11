import java.io.*;
import java.util.*;

class Players{
    String name;
    int score;
    
    public Players(String name, int score){
        this.name = name;
        this.score = score;
    }
    
    public String toString(){
        return this.name+" "+this.score;
    }
}

class Checker implements Comparator<Players>{
    public int compare(Players p1, Players p2){
        if(p1.score == p2.score){
            return p1.name.compareTo(p2.name);
        }else{
            return p2.score - p1.score;
        }
    }    
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Players> ar = new ArrayList<Players>();
        for(int i=0;i<n;i++){
            ar.add(new Players(br.readLine(), Integer.parseInt(br.readLine())));
        }
        Collections.sort(ar,new Checker());
        
        for(int i=0;i<n;i++){
            System.out.println(ar.get(i));
        }
    }
}
