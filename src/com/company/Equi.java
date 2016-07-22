package com.company;

import java.util.Scanner;

/**
 * Created by esriava on 7/22/2016.
 */
public class Equi {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int A[]=new int[8];
        for (int i=0;i<8;i++){
            A[i]= scan.nextInt();
        }
        int a=solution(A,N);
        System.out.println(a);
    }
    static int solution(int A[], int N){
        for(int i=0;i<8;i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 = sum1 + A[j];
            }
            for (int j = i + 1; j < N; j++) {
                sum2 = sum2 + A[j];
            }
            if (sum1 == sum2) {
                return i;
            }
        }
     return -1;
    }
}
