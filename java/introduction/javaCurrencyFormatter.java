import java.io.*;
import java.util.*;
import java.text.NumberFormat;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        NumberFormat US = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat India = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat China = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat France = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: "+US.format(d));
        System.out.println("India: "+India.format(d));
        System.out.println("China: "+China.format(d));
        System.out.println("France: "+France.format(d));
    }
}

//currency formatter using NumberFormat <Object> = NumberFormat.getCurrencyInstance(Locale.Country name);