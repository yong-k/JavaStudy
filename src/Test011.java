/*====================================
   ■■■ 자바의 개요 및 특징 ■■■
======================================*/

// 변수와 자료형
// 변수와 자료형 실습 및 테스트 : double
// 나눗셈 연산 실습

public class Test011
{
	public static void main(String[] args)
	{
		// 정수와 정수의 나눗셈
		double a = 1/2;
		System.out.println("double a : " + a);

		double b = 1/2 + 1/2;
		System.out.println("double b : " + b);

		// 피연산자로 실수가 포함되어 있는 나눗셈
		double c = 1 / 2.0;
		System.out.println("double c : " + c);
		// 나눗셈 연산과 관련하여
		//	피연산자 중 실수가 포함되어 있다면
		//	연산은 실수 기반의 연산이 수행되며,
		//	결과값 또한 실수 형태로 반환된다.

		double d = 3/2 + 1/2;
		System.out.println("double d : " + d);

		double e = 3/2 + 1/2.0;
		System.out.println("double e : " + e);
	}
}

// 실행 결과
/*
double a : 0.0
double b : 0.0
double c : 0.5
double d : 1.0
double e : 1.5
계속하려면 아무 키나 누르십시오 . . .
*/