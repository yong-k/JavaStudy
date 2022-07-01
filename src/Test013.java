/*====================================
   ■■■ 자바의 개요 및 특징 ■■■
======================================*/

// 퀴즈
// 직사각형의 넓이와 둘레를 구하는 프로그램을 작성한다.
// 가로: 10, 세로: 20

// 실행 예)
// 넓이 : xxxx
// 둘레 : xxxx
// 계속하려면 아무 키나 누르세요...

public class Test013
{
	public static void main(String[] args)
	{
		int width = 10;
		int height = 20;
		int area, length;

		area = width * height;
		length = (width + height) * 2;

		System.out.printf("넓이 : %d\n", area);
		System.out.printf("둘레 : %d\n", length);
	}
}

// 실행 결과
/*
넓이 : 200
둘레 : 60
계속하려면 아무 키나 누르십시오 . . .
*/