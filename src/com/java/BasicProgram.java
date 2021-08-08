package com.java;

public class BasicProgram {
    public static void checkAlphabetCheck(){

        char c  = '1';

        if( (c >='a' && c<='z') || (c >='A' && c<='Z'))
            System.out.println(c +" is an alphabet");
        else
            System.out.println(c +" is not an alphabet");
    }

    public static void getFact(int num) {

        System.out.println("this is my fact code");
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of " + num + " is :" + fact);
    }

    public static void checkLargestAmongThreeNumbers(){
        int x = 1100;
        int y = 1500;
        int z = 1100;


        if(x>y && x>z){
            System.out.println("x is the greatest");
        }

        else if (y>z){
            System.out.println("y is the greatest");

        }
        else{
            System.out.println("z is the greatest");
        }


        if(x>=y){
            if(x>=z){
                System.out.println("x is the greatest");
            }
            else{
                System.out.println("z is the greatest");
            }
        }
        else{
            if(y>=z){
                System.out.println("y is the greatest");
            }
            else{
                System.out.println("z is the greatest");
            }
        }
    }

    public static void checkLeapYear(int yr){
        int year = yr;
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }

        if (leap) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }

    public static void doReverseANumber(int number){
        int num = number; ///4321
        int rev  = 0;

        while(num !=0){
            int n = num % 10;
            rev = rev * 10 + n; //43
         //   System.out.print(n);
            num = num/10;
        }


        System.out.println("reversed number is : " + rev);

    }
    public static void swapNumbers(){
        int a = 10;
        int b = 20;

		System.out.println("before swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);

		System.out.println("after swapping:");
//
		int temp;
		temp = a;
		a = b;
		b = temp;

		System.out.println("a="+a);
		System.out.println("b="+b);

        //without temp var:
        System.out.println("before swapping:");
        System.out.println("a="+a);
        System.out.println("b="+b);

        System.out.println("after swapping:");

        a = a-b;//-10
        b = a+b;//10
        a = b-a;//20

        System.out.println("a="+a);
        System.out.println("b="+b);



    }

    public static void main(String[] args) {
        checkAlphabetCheck();
        getFact(4);
        checkLargestAmongThreeNumbers();
        doReverseANumber(1234);
        swapNumbers();
    }
}
