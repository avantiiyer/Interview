package com.company;

import java.util.*;

public class tapeEqual {

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int A[]=new int[5];
        for (int i=0;i<5;i++){
            A[i]= scan.nextInt();
        }
        int a=solution(A);
        System.out.println(a);
    }
    public static int solution(int[] A){
        int sum1=0;
        int diff[]=new int[1000];
        for(int i=0;i<5;i++) {
            sum1 = sum1 + A[i];
            int sum2=0;
            for (int j = i; j < 4; j++) {
                sum2 = sum2 + A[j+1];
            }
            diff[i]=Math.abs(sum1-sum2);
        }
        int minDiff=diff[0];
        for(int i=1;i<diff.length;i++){
            if(diff[i]<minDiff){
                minDiff=diff[i];
            }
        }
        return minDiff;
    }
}




