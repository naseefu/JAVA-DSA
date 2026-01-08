package com.dsa.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Input String: ");
            String inp = sc.next();
            sc.nextLine();
            System.out.println("Integer value : "+romanToInteger(inp));
            System.out.print("Continue, 0/1 : ");
            int ch = sc.nextInt();

            if (ch==0)
                break;

        }
        sc.close();

    }

    public static int romanToInteger(String inp){

        char[] arr = inp.toCharArray();
        Map<Character, Integer> mapper = new HashMap<>();
        mapper.put('I',1);
        mapper.put('V',2);
        mapper.put('X',3);
        mapper.put('L',4);
        mapper.put('C',5);
        mapper.put('D',6);
        mapper.put('M',7);

        int prev = 0;
        int prevRes = 0;
        int result = 0;

        for(char c:arr){

            if(prev>0 && mapper.get(c)>prev){
                result += getNum(c) - 2*prevRes;
                prevRes = 0;
                prev=0;
            }
            else{
                int num=getNum(c);
                result+=num;
                prevRes = num;
                prev = mapper.get(c);
            }

        }
        return result;

    }

    public static int getNum(char c){

        if(c=='I'){
            return 1;
        }
        else if(c=='V'){
            return 5;
        }
        else if(c=='X'){
            return 10;
        }
        else if(c=='L'){
            return 50;
        }
        else if(c=='C'){
            return 100;
        }
        else if(c=='D'){
            return 500;
        }
        else if(c=='M'){
            return 1000;
        }
        return 0;
    }

}
