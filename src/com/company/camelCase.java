package com.company;

/**
 * Created by esriava on 7/23/2016.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class camelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String answer = "";
        int count=0;
        char[] findUpper=s.toCharArray();
        for(int i=0;i<findUpper.length;i++){
            if(findUpper[i]>=65 && findUpper[i]<=91){
                //answer+=findUpper[i];
                count++;
            }

        }
        System.out.println(count);
    }
}
