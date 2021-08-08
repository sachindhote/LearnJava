package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Hello World");

        // Sum = 1-2+3-4+- - - - -  nth element
        int n,sum=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the Number:");
        n=scan.nextInt();

        for(int i=1;i<=n;i++){
            sum=sum+(2*i-1)-(2*i);
        }
        System.out.println("Sum = 1-2+3-4+- - - - -  nth element - " + sum);

        // Sum = 1+3+5+7- - - - -  nth element
        sum=0;
        System.out.println("Enter the Number:");
        n=scan.nextInt();

        for(int i=1;i<=n;i++){
            sum=sum+(2*i-1);
        }
        System.out.println("Sum = 1+3+5+7- - - - -  nth element - " + sum);

        // Sum = 1!+2!+3!+4!- - - - -  nth element
        sum=0;
        System.out.println("Enter the Number:");
        n=scan.nextInt();
        int p=1;
        for(int i=1;i<=n;i++){
            p=1;
            for(int j=1;j<=i;j++){
                p=p*j;

            }
            sum=sum+p;
        }
        System.out.println("Sum = 1!+2!+3!+4!- - - - -  nth element - " + sum);
    }
}
