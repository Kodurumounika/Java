package code;

import java.util.Scanner;

public class Pangram {

    public static boolean isPangram(String str) {
        int[] ap = new int[26];
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
        	int k=1;
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                ap[c-'a']=k;
                k++;
            }
        }
        for(int i=0;i<ap.length;i++) {
            if (ap[i]==0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the String"); // With No Space
        String val=s.next();
        if (isPangram(val)) {
            System.out.println("pangram");
        } else {
            System.out.println("Not A Pangram");
        }
    }
}

