package com.example.algo08;
//입력된 수의 팩토리얼 구하기
//ex) 5 => 120
//tag : 반복문(for, while)

public class Factorial {
    public static void main(String[] args) {
        //만약 주어진 숫자가 7이고,
        int inputNum = 7;
        //누적넘버가 1이면,
        int accNum = 1;

        //방법1) 1부터 주어진 숫자까지 가볼까?_늘어나는 건 inputNum까지 i를 변경
        for (int i = 1; i <=inputNum; i++) {
            accNum *= i;
            //accNum = i*accNum; 1부터 기존의 누적수까지 곱셈한 것이 누적수
            //예를 들어 accNum_1 = 1*1 = 1
            //예를 들어 accNum_1 = 2*1 = 2(2*1)
            //예를 들어 accNum_1 = 3*2*1 = 6(3*2*1)
            //예를 들어 accNum_1 = 4*3*2*1 = 24(3*2*1)
            // .. 이런 식.

        }
        //최종 누적된 수를 출력해줘.
        System.out.println(accNum);

        //방법2) 뒤에서 앞으로 (i를 줄여가며) 가볼까?
        accNum = 1;
        for (int i = inputNum; i>=1; i--){
            accNum *= i;
            //예를 들어 accNum = i*accNum
            //주어진 숫자가 7이면,
            //accNum = 7*1 = 7
            //accNum = 6*7
            //accNum = 5*6*7
            //..
            //1*2*3..*7이 되지용
        }
        //최종 누적수를 말해줘.
        System.out.println(accNum);
    }

}
