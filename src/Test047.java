/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

// 반복문(while문) 실습
/*
1부터 100까지의 정수 중에서
짝수들의 합을 계산하여 결과값을 출력하는 프로그램을 구현한다.
단, 조건문을 사용하지 않도록 하며,
while 반복문을 활용하여 작성할 수 있도록 한다.

실행 예)
1부터 100까지의 수 중 짝수의 합 : xxx
계속하려면 아무 키나...
*/

public class Test047
{
		public static void main(String[] args)
	{
		int n = 0;
		int sum = 0;
		
		// 이건 if 조건문 쓴거고, 쌤이 원한 건 조건문 없이
		/*
		while (n <= 100)
		{	
			if (n % 2 == 0)
				sum += n;
			n++;
		}
		*/

		//쌤
		while (n < 100)
		{
			n += 2;
			sum += n;
		}

		System.out.println("1부터 100까지의 수 중 짝수의 합 : " + sum);
	}
}

// 실행 결과
/*
1부터 100까지의 수 중 짝수의 합 : 2550
계속하려면 아무 키나 누르십시오 . . .
*/