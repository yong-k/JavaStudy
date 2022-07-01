/*====================================
   ■■■ 자바의 개요 및 특징 ■■■
======================================*/

// 변수와 자료형
// 변수와 자료형 실습 및 테스트 : char

public class Test010
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		char ch1, ch2, ch3;
		int a;	// **check 해두기**

		// 연산 및 처리 (대입 연산)
		ch1 = 'A';
		ch2 = '\n';
		// \ 과 n이 따로 문자와 문자로 인식되는게 아니라 
		// 둘이 합쳐서 '줄바꿈' 을 나타냄
		ch3 = '대';
		
		a = (int)ch1;	// **check 해두기**
		// (int) 표시 이유 => 다른 타입 넣은거 실수 아니고 의도해서 형 변환 한거야
		// 자동 형 변환이지만, 명시적 형 변환 표기함

		// 결과 출력
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		System.out.println("ch3 : " + ch3);

		System.out.println("a   : " + a);
	}
}

// 실행 결과
/*
ch1 : A
ch2 :

ch3 : 대
a   : 65
계속하려면 아무 키나 누르십시오 . . .
*/