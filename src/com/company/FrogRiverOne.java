package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by esriava on 7/24/2016.
 */
public class FrogRiverOne {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int A[]=new int[5];
        for (int i=0;i<5;i++){
            A[i]= scan.nextInt();
        }
        int X=scan.nextInt();
        int a=solution(X,A);
        System.out.println(a);
    }
    public static int solution(int X,int[] A){
        int maxIndex=0;
        for(int i=0;i<5;i++){
            //int max=A[i];
            if(A[i]==X) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
