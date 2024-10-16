package com.easy;

public class Armstrong {
    public static void main(String[] args) {
        int num=153;
        int original=num;
        int sum=0;
        int numberOfDigits = String.valueOf(num).length();  //get length of digit
        while(num>0){
            //last digit
            int digit=num%10;
            // 1^3+5^3+3^3
            sum+=Math.pow(digit,numberOfDigits);
            //remove 
            num/=10;

        }
        if(original==sum){
            System.out.println("armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }
}
