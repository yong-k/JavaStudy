/*====================================
   ■■■ 자바의 개요 및 특징 ■■■
======================================*/

// 변수와 자료형
// 키워드 및 식별자
// printf()

public class Test007
{
	public static void main(String[] args)
	{
		// 주요 변수 선언 및 초기화
		int a = 10, b = 5;
		int c, d;
		
		// 연산 및 처리
		c = a + b;
		d = a - b;

		// 결과 출력
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("[println] " + a + " + " + b + " = " + c);

		// 자바에서는 서로 다른 자료형의 데이터들끼리도
		// + 연산이 가능하며,
		// 다른 어떤 자료형과 문자열 데이터의 + 연산 결과는 문자열
		// 즉, 문자열 결합 연산자로써 +

		// print()	println()	printf()	format()
		
		// printf()		format()
		// -> JDK 1.5 부터 지원되는 메소드
		System.out.printf("[printf(\\n)] %d + %d = %d\n", a, b, c);
		System.out.printf("[printf(%%n)] %d + %d = %d%n", a, b, c);
		// 서식 출력용 메소드
		// printf에서는 \n, %n 다 개행
		
		//System.out.printf("%d와 %d\n", 10, 3.14);
		// => 런타임 에러 발생
		// 왜 컴파일 에러 아니고 런타임 에러?
		// 자바는 컴파일 과정에서는, 안에 어떤 옵션을 구성했는지는 검사하지 않음
		// 실수일 때는 %f 를 사용해야 한다. => 소수점 이하 6자리까지 나옴
		System.out.printf("%d 과 %f\n", 10, 3.14);

		System.out.printf("%.2f\n", 3.141592);
		// %.2f => 소수점 이하 두 번째 자리까지 표현
		System.out.printf("%.3f\n", 3.141592);
		// %.3f => 소수점 이하 세 번째 자리까지 표현 (반올림 발생)
		System.out.printf("%.4f\n", 3.141592);
		// %.4f => 소수점 이하 네 번째 자리까지 표현 (반올림 발생)


	}
}

// 실행 결과
/*
c = 15
d = 5
[println] 10 + 5 = 15
[printf(\n)] 10 + 5 = 15
[printf(%n)] 10 + 5 = 15
10 과 3.140000
3.14
3.142
3.1416
계속하려면 아무 키나 누르십시오 . . .
*/