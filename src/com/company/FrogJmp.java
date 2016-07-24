package com.company;

import java.util.Scanner;

/**
 * Created by esriava on 7/23/2016.
 */
public class FrogJmp {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int X=scan.nextInt();
        int Y=scan.nextInt();
        int D=scan.nextInt();
        int a = solution(X,Y,D);
        System.out.println(a);
    }

    public static int solution(int X, int Y, int D) {
        int count=0;
        while(X<Y) {
            X=X+D;
            count++;
        }
        return count;
    }
}
