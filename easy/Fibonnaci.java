package com.easy;
 //Write a program to generate the Fibonacci series up to a given number.
public class Fibonnaci {
       static void fib(int n,int fib[]){
           // First two Fibonacci numbers
                   fib[0] = 0;
                   fib[1] = 1;

                   // Generating the Fibonacci sequence
                   for (int i = 2; i < n; i++) {
                       fib[i] = fib[i - 1] + fib[i - 2];
                   }

                   // Printing the Fibonacci numbers
                   for (int i = 0; i < n; i++) {
                       System.out.print(fib[i] + " ");
                   }

           }
           public static void main(String[] args) {
           int n = 10;  // Number of terms
              int[] fib = new int[n];
              fib(n,fib);

     }
}
