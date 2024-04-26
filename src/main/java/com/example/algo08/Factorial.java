package com.example.algo08;
//입력된 수의 팩토리얼 구하기
//ex) 5 => 120
//tag : 반복문(for, while)

public class Factorial {
    public static void main(String[] args) {

        int inputNum = 7;

        //1로 초기화(0하면 무조건 0이니까)
        //누적숫자
        int accNum = 1;
        // 5! = 5*4*3*2*1
        // 7! = 7*6*5*4*3*2*1

        //방법1 (1->5)
        for(int i =1; i <=inputNum; i++){
            accNum *= i; //accNum = accNum * i;
        }
        System.out.println(accNum);

        //방법2 (5->1)
        accNum = 1;
        for (int i = inputNum ; i>=1; i--){
            accNum *= i; // accNum = accNum *i;
        }

        System.out.println(accNum);
    }

}
