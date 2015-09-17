package core;

import java.util.ArrayList;

public class test {
static ArrayList<String> subs= new ArrayList<String>();
    public static void print(String prefix, String remaining, int k) {

        if (k == 0) {
            subs.add(prefix);
            return;
        }
        if (remaining.length() == 0) return;
        print(prefix + remaining.charAt(0), remaining.substring(1), k-1);
        print(prefix, remaining.substring(1), k);
    }

    static String[] buildSubsets(String s) {

        int length = s.length();
        int total = 50;
        String[] all = new String[total];
        for(int i=0; i<length; i++)
        {
            print("",s,i);
        }
        for(String s2: subs)
        System.out.println(s2);
        return all;
    }
    public static void main(String[] args) {
        String s = "hello";
        int k = 3;
        buildSubsets(s);
    }

}

