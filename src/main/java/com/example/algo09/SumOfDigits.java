package com.example.algo09;

public class SumOfDigits {
    public static void main(String[] args) {
        //주어진 수
        int inputNum = 4280;

        //누적수 초기값
        int accSum = 0;

        while (inputNum > 0) {
            //주어진 수 > 0 크면 계속 반복

            accSum += inputNum % 10;
            // 반영누적수 = 기존 누적수 0 + (4280 % 10)
            //           = 0 + 0 = 0

            inputNum /= 10;
            //주어진 수 = 4280 /10 =428(첫번째 턴)

            //(두 번째 턴)
            //428>0 => accSum = 0 +(428 % 10) = 0 + 8
            //inputNum = 428/10 = 42

            //(세번째 턴)
            //42>0 => accSum = 8 + (42 % 10) = 8+2 = 10
            //inputNum = 42/10 = 4

            //(네번째 턴)
            //4>0 = > accSum = 10 + (4 % 10) = 10 + 4
            //inputNum = 4/10 = 0

            //(다섯번째 턴 시도) = > 0 > 0? no! 끝! 빠져나가자
        }
        System.out.println(accSum);
        //최종 accSum은 14

    }
}

