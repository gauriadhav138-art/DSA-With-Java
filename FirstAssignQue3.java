package com.gauri;

import java.util.Scanner;

public class FirstAssignQue3 {
    static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter p:");
        int P=input.nextInt();
        System.out.println("enter T:");
        int T=input.nextInt();
        System.out.println("enter R:");
        int R=input.nextInt();
        int SI=P*T*R/100;
        System.out.println(SI);
    }
}
