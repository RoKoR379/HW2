package org.example;

public class SumCalculator {
    public int sum(int n) throws IllegalArgumentException{
        if (n <= 0){
            throw new IllegalArgumentException();
        }
        int sum = 0;
        for (int i = 1; i < n+1; i++) {
            sum += i;
        }
        return sum;
    }
}
