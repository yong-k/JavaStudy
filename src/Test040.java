/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

/*
사용자로부터 임의의 정수 5개를 입력받아
짝수별, 홀수별 합계를 출력하는 프로그램을 구현한다.
단, Scanner를 활용하여 데이터를 입력받을 수 있도록 한다.

실행 예)
임의의 정수 5개 입력 : 1 2 3 4 5

>> 짝수의 합은 6 이고, 홀수의 합은 9 입니다.
계속하려면 아무 키나...
*/

import java.util.Scanner;

public class Test040
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, num4, num5;	//사용자 입력 임의의 정수 5개 저장할 변수
		int evenSum = 0, oddSum = 0;		//짝수합, 홀수합 저장할 변수 선언 및 초기화
			//누적합 하려면 변수 0으로 초기화 해줘야 함
			//누적곱일 때는 변수 1로   초기화 해줘야 함

		// 연산 및 처리
		System.out.print("임의의 정수 5개 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();

			//if num이 짝수면 evenSum에 더하고, 
			//else     아니면  oddSum에 더해라.
		if (num1 % 2 == 0)	evenSum += num1;
		else				oddSum += num1;

		if (num2 % 2 == 0)	evenSum += num2;
		else				oddSum += num2;

		if (num3 % 2 == 0)	evenSum += num3;
		else				oddSum += num3;

		if (num4 % 2 == 0)	evenSum += num4;
		else				oddSum += num4;

		if (num5 % 2 == 0)	evenSum += num5;
		else				oddSum += num5;

		// 최종 결과 출력
		System.out.printf(">> 짝수의 합은 %d 이고, 홀수의 합은 %d 입니다.\n", evenSum, oddSum);
	}
}

// 실행 결과
/*

*/