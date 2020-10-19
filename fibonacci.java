/*
***********************************************************

Topic   : Program to demonstrate Fibonacci Series in java.
Author  : Chpaone09®
Date    : Oct 20, 2020

************************************************************
*/

import java.util.*;

public class fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 1, b = 1, c = 0, n;
       try {
           System.out.print("\n\n\t Please enter a number >> ");
           n = sc.nextInt();
            //n = Integer.parseInt(n);
            System.out.print("\n\n\t Fibonacci series till "+n+"th term >> "+a+" "+b+" ");
            for(int i=3 ; i<=n ; i++){
                c = a+b;
                System.out.print(c+" ");
                b=a;
                a=c;   
            }
        } 
        catch (Exception e) {
            System.out.print("Error");
        }
        sc.close();
    }
}
