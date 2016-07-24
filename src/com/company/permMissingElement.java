package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by esriava on 7/23/2016.
 */
public class permMissingElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A[]=new int[5];
        for (int i=0;i<1;i++){
            A[i]= scan.nextInt();
        }
        int a=solution(A);
        System.out.println(a);
    }
    public static int solution(int[] A) {
        int temp=0;
        Arrays.sort(A);
        if(A.length>1) {
            for (int i = 1; i < A.length - 1; i++) {
                if (A[i] == A[i + 1] - 1) {
                    // System.out.println("No missing Elements");
                } else {
                    temp = A[i + 1] - 1;
                    System.out.println(temp);
                }
            }
        }
       // System.out.println(Arrays.toString(A));
        return temp;
    }
}
