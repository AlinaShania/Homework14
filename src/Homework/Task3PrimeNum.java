package Homework;

import java.util.Scanner;

public class Task3PrimeNum {

    boolean isPrime(int x){
        if (x<=1){
            return false;
        }
        for (int i=2; i<x; i++){
            if (x%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Task3PrimeNum number = new Task3PrimeNum();
       boolean primeNum = number.isPrime(5);
        System.out.println(primeNum);
    }
}
