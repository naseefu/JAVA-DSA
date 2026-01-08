package com.dsa.easy;

import java.util.Scanner;

public class PalindromNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Input number : ");
            int number = sc.nextInt();
            System.out.println("IS PALINDROME : "+isPalindrom(number));
            System.out.print("Wanna continue ,0/1 : ");
            int ch = sc.nextInt();

            if(ch==0)
                break;

        }


    }

    public static boolean isPalindrom(int x){

        if(x<0)
            return false;

        int rev = 0;
        int num = x;

        while(num!=0){

            rev = rev*10 + num%10;
            num = num/10;

        }

        return rev == x;

    }

}
