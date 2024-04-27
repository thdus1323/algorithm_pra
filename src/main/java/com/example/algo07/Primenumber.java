package com.example.algo07;

public class Primenumber {
    public static void main(String[] args) {
        //만약 주어진 숫자가 13이면,
        int num = 13;
        //그 숫자가 소수이면,
        boolean isPrimeNumber = true;
        //2~ 그 숫자-1한 범위의 숫자에서 나누어 떨어지는 것이 있으면 소수가 아니지
        for (int i = 2; i <= num - 1; i++) {
            //근데 나머지가 0으로 나누어 떨어지는 것이 있잖아? => 그러면 그것은 소수가 아니야
            if (num % i == 0) {
                isPrimeNumber = false;
            }
        }

        //그래서 정리하면, 그 숫자가 소수이면, 이렇게 출력해줘.
        if (isPrimeNumber) {
            System.out.println(num + " 은 소수입니다.");
        }
        //소수가 아니면, 이렇게 출력해줘.
        else {
            System.out.println(num + " 은 소수가 아닙니다.");
        }
    }
}
