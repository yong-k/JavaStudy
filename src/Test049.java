/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

// 반복문(while문) 실습
/*
실행 예)
1 부터 100 까지 정수의 합 : 5050
1 부터 100 까지 짝수의 합 : 2550
1 부터 100 까지 홀수의 합 : 2500
계속하려면 아무 키나 누르세요...
*/

public class Test049
{
		public static void main(String[] args)
	{
		int n = 0;
		int sum = 0, evenSum = 0, oddSum = 0;
		/*
		//아래처럼 해도 됨
		//순서만 잘 알아두기
		// **[sum, evenSum, oddSum 을 모두 0으로 초기화] 라는 뜻 X !!
		int sum, evenSum, oddSum;
		sum = evenSum = oddSum = 0;
			 1) oddSum 에 0 대입
				oddSum = 0
		     2) oddSum 을 evenSum 에 대입
				evenSum = 0
		     3) evenSum 을 sum 에 대입
				sum = 0
		*/

		while (n <= 100)
		{
			sum += n;

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

		System.out.println("1 부터 100 까지 정수의 합 : " +  sum);
		System.out.println("1 부터 100 까지 짝수의 합 : " +  evenSum);
		System.out.println("1 부터 100 까지 홀수의 합 : " +  oddSum);
	}
}

// 실행 결과
/*
1 부터 100 까지 정수의 합 : 5050
1 부터 100 까지 짝수의 합 : 2550
1 부터 100 까지 홀수의 합 : 2500
계속하려면 아무 키나 누르십시오 . . .
*/