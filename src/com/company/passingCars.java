package com.company;

import java.util.Scanner;

/**
 * Created by esriava on 7/24/2016.
 */
public class passingCars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A[] = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = scan.nextInt();
        }
        int a = solution(A);
        System.out.println(a);
    }

    public static int solution(int[] A) {
        int count1 = 0;
        int count2 = 0;
        int temp = 0;
        if (A.length > 1) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] == 0) {
                    count1++;
                }
                if (A[i] == 1) {
                    count2++;
                }
            }
            temp = count1 * count2 - 1;
            return temp;
        } else
            return -1;
    }
}
