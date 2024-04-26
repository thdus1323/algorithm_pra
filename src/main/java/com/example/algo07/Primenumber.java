package com.example.algo07;

public class Primenumber {
    public static void main(String[] args) {
        int num = 13;

        boolean isPrimeNumber = true;
        //num=103이면 102까지? 무의미하다
        //수의 자기 자신의 절반보다 크게 된 숫자로 나누면 나누어 떨어지지 않음.
        // 항상 나머지가 남음. 결국 자기 자신보다 /2하여도 답이 나온다.
        for (int i = 2; i<=num/2; i++) {
            if (num % i == 0) {
                //primeNumber x
                isPrimeNumber = false;
            }
        }
        if (isPrimeNumber){
            System.out.println(num + " 은 소수입니다.");
            }
        else {
            System.out.println(num + "은 소수가 아닙니다");
        }
    }
}
