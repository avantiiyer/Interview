package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by esriava on 7/24/2016.
 */
public class PermCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A[] = new int[5];
        for (int i = 0; i < 4; i++) {
            A[i] = scan.nextInt();
        }
        int a = solution(A);
        System.out.println(a);
    }

    public static int solution(int[] A) {
        HashMap<Integer, Integer> elementMap = new HashMap<>();
        int temp = 0;
        //Arrays.sort(A);
        if (A.length > 1) {
            for (int i = 0; i < A.length; i++) {
                int element = A[i];
                if (element <= A.length) {
                    if (elementMap.containsKey(element)) {
                        return 0;
                    } else {
                        elementMap.put(element, 1);
                        temp++;

                    }
                }
            }
        }
        return temp==A.length?1:0;
    }
}