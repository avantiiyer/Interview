package com.company;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by esriava on 7/22/2016.
 */
public class oddOccurenceArray {
    public static void main(String[] args){
        Scanner scan=new Scanner(in);
        int A[]=new int[7];
        for (int i=0;i<7;i++){
            A[i]= scan.nextInt();
        }
        int a=solution(A);
        System.out.println(a);
    }
    static int solution(int A[]){
        int temp=0;
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++) {
                if(A[j]!=A[i]){
                    temp=A[j];
                }
            }
        }
        //System.out.println(temp);
        return temp;
    }
}
