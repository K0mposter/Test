package com.company;

import java.util.Scanner;

public class Minus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("z = x - y: ");
        System.out.print("x = ");
        int x = in.nextInt();
        System.out.print("y = ");
        int y = in.nextInt();
        int z = x - y;
        System.out.printf("z = %d \n", z);
        in.close();
    }
}
