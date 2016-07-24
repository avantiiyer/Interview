package com.company;

/**
 * Created by esriava on 7/23/2016.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class stringConstruction {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] myStr=new char[10];
        for(int a0 = 0; a0 < n; a0++){
            int cost=0;
            String s = in.next();
            char[] charArray=s.toCharArray();
            // System.out.println(charArray);
            //StringBuilder sb=new StringBuilder(s);
            for(int i=0;i<s.length();i++){
                String s1="";
                String s2="";
                s1 = s.substring(0,i+1);
                s2 = s.substring(i+1,s.length());
                //  System.out.println(s1+ " "+s2);
                if(!s1.equalsIgnoreCase(s2)){
                    cost++;
                }else{
                    cost++;
                    break;
                }
            }
            System.out.println(cost);
        }

    }
}