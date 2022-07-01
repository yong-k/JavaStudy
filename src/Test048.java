/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

// 반복문(while문) 실습
/*
1부터 100까지의 정수 중에서
짝수들의 합과 홀수들의 합을 따로 구분하여 계산한다.
그리고 결과값을 출력하는 프로그램을 구현한다.
단, 반복문은 while문을 사용할 수 있도록 하며,
조건문은 if문을 사용하여 작성할 수 있도록 한다.

실행 예)
1 부터 100 까지의 정수 중
짝수의 합 : 2550
홀수의 합 : 2500
계속하려면 아무 키나...
*/

public class Test048
{
		public static void main(String[] args)
	{
		int n = 0;
		int evenSum = 0, oddSum = 0;

		while (n <= 100)
		{
			if (n % 2 == 0)
				evenSum += n;
			else if (n % 2 != 0)
				oddSum += n;
			else
			{
				System.out.println("판별 불가 데이터");
				return;
			}

			n++;
		}

		System.out.println("1 부터 100 까지의 정수 중");
		System.out.println("짝수의 합 : " + evenSum);
		System.out.println("홀수의 합 : " + oddSum);
	}
}

// 실행 결과
/*
1 부터 100 까지의 정수 중
짝수의 합 : 2550
홀수의 합 : 2500
계속하려면 아무 키나 누르십시오 . . .
*/