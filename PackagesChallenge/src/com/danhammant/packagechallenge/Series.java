package com.danhammant.packagechallenge;

public class Series {

    public static long nSum(int n) {
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

//    public static long nSumBetter(int n) {
//        return (n * (n + 1)) /2;
//    }

    public static long factorial(int n) {
        if (n == 0) {
            return 0;
        }

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                sum = 1;
            }
            sum *= i;
        }
        return sum;
    }

    public static int fibonacci(int n) {
        int[] fibSequenceToN = new int[n + 1];

        fibSequenceToN[0] = 0;
        fibSequenceToN[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibSequenceToN[i] = fibSequenceToN[i - 1] + fibSequenceToN[i - 2];
        }

        return fibSequenceToN[n];
    }

//    public static long fibonacciBetter(int n) {
//        if (n == 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
//        }
//
//        long nMinus1 = 1;
//        long nMinus2 = 0;
//        long fib = 0;
//
//        for (int i = 1; i < n; i++) {
//            fib = (nMinus2 + nMinus1);
//            nMinus2 = nMinus1;
//            nMinus1 = fib;
//        }
//
//        return fib;
//    }


}
