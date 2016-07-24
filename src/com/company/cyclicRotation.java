package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by esriava on 7/22/2016.
 */
public class cyclicRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int A[] = new int[4];
        for (int i = 0; i < A.length; i++) {
            A[i] = scan.nextInt();
        }
        int[] B=new int[4];
        B = solution(A, K);
        System.out.println(Arrays.toString(B));
    }

    public static int[] solution(int[] A, int K){
    for(int i=0;i<K;i++){
        for(int j=A.length-1;j>0;j--){
            int temp=A[j];
            A[j]=A[j-1];
            A[j-1]=temp;
        }

    }
        return A;
    }
}
