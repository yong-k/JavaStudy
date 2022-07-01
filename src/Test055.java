/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

// 반복문(while문) 실습
/*  << 과제 >>
사용자로부터 임의의 정수를 입력받아
1부터 입력받은 그 정수까지의
전체 함과, 짝수의 합과, 홀수의 합을
각각 결과값으로 출력하는 프로그램을 구현한다.

실행 예)
임의의 정수 입력 : 280
>> 1 ~ 280 까지 정수의 합 : xxxx
>> 1 ~ 280 까지 짝수의 합 : xxxx
>> 1 ~ 280 까지 홀수의 합 : xxxx
계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;

public class Test055
{
	public static void main(String[] args)
	{
		// 주요 변수 선언 및 초기화
		Scanner sc = new Scanner(System.in);
		
		int inputNum;							//-- 사용자 입력 정수
		int n = 1;								//-- 반복문에서 사용할 변수
		int sum = 0, evenSum = 0, oddSum = 0;	//-- 정수,짝수,홀수의 합 변수

		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		inputNum = sc.nextInt();

		while (n <= inputNum)
		{
			sum += n;

			if (n % 2 == 0)
				evenSum += n;
			else if (n % 2 != 0)
				oddSum += n;
			else
			{
				System.out.println("판별 불가");
				System.out.println("==== 프로그램 종료 ====");
				return;
			}

			n++;
		}

		// 결과 출력
		System.out.printf(">> 1 ~ %d 까지 정수의 합 : %d\n", inputNum, sum);
		System.out.printf(">> 1 ~ %d 까지 짝수의 합 : %d\n", inputNum, evenSum);
		System.out.printf(">> 1 ~ %d 까지 홀수의 합 : %d\n", inputNum, oddSum);
	}
}

// 실행 결과
/*
임의의 정수 입력 : 100
>> 1 ~ 100 까지 정수의 합 : 5050
>> 1 ~ 100 까지 짝수의 합 : 2550
>> 1 ~ 100 까지 홀수의 합 : 2500
계속하려면 아무 키나 누르십시오 . . .
*/