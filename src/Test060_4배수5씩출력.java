/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

// 반복문(for 문) 실습
/*
1 부터 100 까지의 정수 중에서
4의 배수만 출력하는 프로그램을 구현한다.
단, for 문을 활용해야 하며
한 줄에 5개씩만 출력할 수 있도록 한다.

실행 예)
   4   8  12  16  20
  24  28  32  36  40
  		   :
		   :
계속하려면 아무 키나 누르세요...
*/

public class Test060_4배수5씩출력
{
	public static void main(String[] args)
	{
		System.out.println("======= yong ========");
		int count = 0;	//한 줄 5개 개수 세기 위한 변수

		for (int i = 1; i <= 100; i++)
		{
			if (i % 4 == 0)
			{
				System.out.printf("%4d", i);
				count++;

				if (count == 5)
				{
					System.out.println();
					count = 0;
				}
			}
		}
		System.out.println("=====================");
		System.out.println();
		System.out.println("======== 쌤 =========");
		//쌤
		for (int n = 4; n <= 100; n += 4)
		{
			System.out.printf("%4d", n);

			// 출력 구문이 4*5 의 배수가 될 때마다 => 개행
			if (n % (4*5) == 0)
				System.out.println();
		}
		System.out.println("=====================");
	}
}

// 실행 결과
/*
======= yong ========
   4   8  12  16  20
  24  28  32  36  40
  44  48  52  56  60
  64  68  72  76  80
  84  88  92  96 100
=====================

======== 쌤 =========
   4   8  12  16  20
  24  28  32  36  40
  44  48  52  56  60
  64  68  72  76  80
  84  88  92  96 100
=====================
계속하려면 아무 키나 누르십시오 . . .
*/