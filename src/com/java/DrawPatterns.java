package com.java;

public class DrawPatterns {
    public static void main(String[] args) {
        /* Draw Pattern
         *
         **
         ***
         ****
         *****
         */
        System.out.println("First Pattern");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        /* draw pattern
         *****
         ****
         ***
         **
         *
                 */
        System.out.println("Second Pattern");
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Third Pattern");
        for(int i=1;i<=5;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Fourth Pattern");
        for(int i=1;i<=5;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print(" *");

            }
            System.out.println();
        }

        System.out.println("Fifth Pattern");
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" *");
            }
            for(int k=1;k<=i;k++) {
                //System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("Sixth Pattern");
        int alpha = 65;
        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(alpha+j) + " ");
            }
            System.out.println();
        }

        System.out.println("Sixth Pattern");
       // int alpha = 65;
        for(int i=0;i<=5;i++){
            int a = 65+i;
            for(int j=0;j<=i;j++){
                System.out.print((char)(a) + " ");
            }
            System.out.println();
        }
    }
}
