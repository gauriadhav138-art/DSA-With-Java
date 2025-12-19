package com.gauri;

import java.util.Scanner;

public class FirstAssignQue7 {
    static void main(String[] args) {
int first=0;
int second=1;
int next;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
if (n==0)
        {
            System.out.println("0");
        }else if(n==1){
    System.out.println("1");

}else{
for(int i=2;i<=n;i++)
{
   next=first+second;
      first=second;
    second=next;}
        System.out.println(second);
    }
}}
