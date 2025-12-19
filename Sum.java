package com.gauri;

import java.util.Scanner;

public class Sum {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num1 = input.nextLine();

        float num2 = input.nextFloat();

        String sum = num1 + num2;

        System.out.println(sum);

    }
}