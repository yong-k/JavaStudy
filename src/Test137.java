 /*=======================================
   ■■■ 자바의 주요(중요) 클래스 ■■■
=========================================*/

// Wrapper 클래스

public class Test137
{
	public static void main(String[] args)
	{
		// Integer.MAX_VALUE, Integer.MIN_VALUE
		// 둘 다 인스턴스 생성과정 없이 바로 접근 가능 (static final)
		System.out.println(Integer.MAX_VALUE);	// 2147483647
		System.out.println(Integer.MIN_VALUE);	// -2147483648

		System.out.println(Long.MAX_VALUE);		// 9223372036854775807
		System.out.println(Long.MIN_VALUE);		// -9223372036854775808

		System.out.println(Double.MAX_VALUE);	// 1.7976931348623157E308
		System.out.println(Double.MIN_VALUE);	// 4.9E-324
												// ※ e 표기법
		
		System.out.println();

		// 실수 기반의 나눗셈 연산
		System.out.println("1 : " + 3.0/0);		// 1 : Infinity
		System.out.println("2 : " + -3.0/0);	// 2 : -Infinity

		System.out.println("3 : " + (3.0/0 == 3.0/0));		// 3 : true
		System.out.println("4 : " + (3.0/0 == -3.0/0));		// 4 : false
		// 무한은 비교 불가하다고 생각할 수 있지만,
		// 자바가 '둘 다 똑같은 무한대네' 하고 true 로 처리해줌
		// 양의 무한대와 음의 무한대는 서로 다른걸로 봄

		// Infinity 와 "Infinity" 다름
		//			   -----------
		//			   문자열 상수

		// is~~ 라고 되어있는 메소드는 99%
		// 대부분 ~인지 아닌지 구분해서 true, false 반환하는 메소드
		// to~~ 라고 되어있는 메소드는 99% 변환수행하는 메소드 
		// 『Double.isInfinite()』
		System.out.println("5 : " + Double.isInfinite(3.0/0));	// 5 : true
		System.out.println("6 : " + Double.isInfinite(-3.0/0));	// 6 : true
		// ==> 양, 음 부호 가리지 않고 무한대인지 확인해주는 메소드!

		System.out.println("7 : " + (3.0/0 + -3.0/0));		// 7 : NaN
		System.out.println("8 : " + (0.0/0));				// 8 : NaN
		// NaN : Not a Number	=> 숫자가 아닙니다.

		System.out.println("9 : " + (0.0/0 == 0.0/0));		// 9 : false
		System.out.println("10: " + (0.0/0 != 0.0/0));		// 10: true

		// ※ NaN(Not a Number) 값과 임의의 수를 
		//    『==』 연산자를 통해 비교 연산을 수행하게 되면
		//	  결과는 언제나 『false』를 반환한다.
		//    『!=』 연산자를 통해 비교 연산을 수행하게 되면
		//	  결과는 언제나 『true』를 반환한다.

		// 자바에서 무한대도 숫자로 간주하지만,
		//			NaN 은 숫자, 값으로 간주하지 않음
		// => 그러다보니까 값 비교 불가능!

		// 『Double.isNaN()』
		System.out.println("11: " + Double.isNaN(0.0/0));	// 11: true
		System.out.println("12: " + Double.isNaN(1.1+1.2));	// 12: false

	}
}

// 실행 결과
/*
2147483647
-2147483648
9223372036854775807
-9223372036854775808
1.7976931348623157E308
4.9E-324

1 : Infinity
2 : -Infinity
3 : true
4 : false
5 : true
6 : true
7 : NaN
8 : NaN
9 : false
10: true
11: true
12: false
계속하려면 아무 키나 누르십시오 . . .
*/