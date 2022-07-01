/*====================================
   ■■■ 자바의 개요 및 특징 ■■■
======================================*/

// 퀴즈
// 사전에 부여된 반지름 정보를 통해
// 원의 넓이와 둘레를 구하는 프로그램을 구현한다.
// - 반지름: 10

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 넓이 : xxxx
// 둘레 : xxxx
// 계속하려면 아무 키나 누르세요...

public class Test012
{
	public static void main(String[] args)
	{
		/* 내가 푼 거
		int r = 10;
		double area = r * r * 3.141592;
		double length = r * 2 * 3.141592;

		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + length);
		*/

		// 쌤이 푼 거
		int r = 10;
		final double PI = 3.141592;	
			// final 키워드 : 변수의 상수화
			// => 변하지 않는 값이라면 final 이용해서 변수를 상수화 하기 
			// final 붙어있으면 상수 => (X)
			//	final 로 상수화된 변수는 이름 대문자로!
			//	  => 문법이 아니고 개발자들끼리 약속한 것
			//	  => 상수화된 변수명에는 단어구분위해 언더바 사용
			//	ex) final int RAINBOW_COLOR
		double area, length;

		area = r * r * PI;
		length = r * 2 * PI;
		
		System.out.printf("넓이 : %.2f\n", area);
		System.out.printf("둘레 : %.2f\n", length);
	}
}

// 실행 결과
/*
<< 나 >>
넓이 : 314.1592
둘레 : 62.83184
계속하려면 아무 키나 누르십시오 . . .

<< 쌤 >>
넓이 : 314.16
둘레 : 62.83
계속하려면 아무 키나 누르십시오 . . .
*/