/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

// 반복문(do~while문) 실습
/*
- 개요
  do~while 문은 while 문과 마찬가지로
  특정한 영역을 반복 수행하는 반복문이다.
  다만, while 문과 다른 점은
  조건식에 대한 검사를 반복문을 수행한 이후에 한다는 것이다.
  이와 같은 성격으로 인해 반드시 한 번은 수행하게 되는 특성을 갖는다.

- 형식 및 구조

  do
  {
	  실행문
  }
  while (조건식);

*/

import java.util.Scanner;

public class Test057
{
	public static void main(String[] args)
	{
		// while 반복문을 통해 구현했던 내용들을
		// do~while 문을 통해서도 구현할 수 있다.
		
		/*
		int n = 1;

		do
		{
			System.out.println("n = " + n);
			n++;
		}
		while (n <= 10);
		*/
		/*
		int n = 1;

		do
		{
			n++;
			System.out.println("n = " + n);
		}
		while (n <= 10);
		*/
		/*
		int n = 0;

		do
		{
			n++;
			System.out.println("n = " + n);
		}
		while (n < 10);
		*/
		/*
		int n = 0;

		do
		{
			System.out.println("n = " + ++n);
		}
		while (n <= 10);
		*/

		// do~while 문의 활용 모델
		// 예를 들어, 사용자로부터 특정 범위의 정수가 입력될 때까지
		// 입력 받는 행위 자체를 반복해서 수행해야 하는 상황이라 가정한다.

		Scanner sc = new Scanner(System.in);
		int num;

		// while은 조건문 먼저 확인하고 실행하지만,
		// do~while은 일단 한 번 수행하고 조건 확인함
		// 즉, 최소 한 번은 사용자의 입력 값을 받아오는 처리를 수행해야
		// 반복을 추가로 수행할지 말지의 여부를 결정할 수 있는 상황,모델에 많이 쓰임
		do
		{
			System.out.print("100 이상의 정수를 입력하세요 : ");
			num = sc.nextInt();
		}
		while (num < 100);

			// 위에 반복문 빠져나오면, 100 이상의 정수 입력한 거임
		System.out.printf("<< %d → 100 이상의 정수 입력 완료 >>\n", num);
		


	}
}

// 실행 결과
/*
100 이상의 정수를 입력하세요 : 1
100 이상의 정수를 입력하세요 : 2
100 이상의 정수를 입력하세요 : 3
100 이상의 정수를 입력하세요 : 4
100 이상의 정수를 입력하세요 : 5
100 이상의 정수를 입력하세요 : 154
<< 154 → 100 이상의 정수 입력 완료 >>
계속하려면 아무 키나 누르십시오 . . .
*/