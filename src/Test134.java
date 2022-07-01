 /*=======================================
   ■■■ 자바의 주요(중요) 클래스 ■■■
=========================================*/

// Wrapper 클래스
// BigInteger 클래스는 lang 패키지에 없어서 import 해줘야함
// =================
// => 정수형태로 엄청나게 큰 숫자를 처리하려고 할 때 사용

import java.math.BigInteger;

public class Test134
{
	public static void main(String[] args)
	{
		//int a1 = 123456789123456789;
		//System.out.println(a1);
		//--==> 에러 발생 (컴파일 에러) 
		// error: integer number too large: 123456789123456789
		// int는 약 +-21억 담을 수 있기 때문에 에러남

		//long b1 = 123456789123456789;
		//System.out.println(b1);
		//--==> 에러 발생 (컴파일 에러) 
		// error: integer number too large: 123456789123456789
		// long 형에 못 담아서 생기는 에러가 아니라,
		// 뒤에 상수를 먼저 int형 4byte에 담았다가 long 형에 담는데,
		// 4byte 에 못담아서 생기는 오류임!!
		// 숫자 뒤에 접미사 l 또는 L 안 써서 생기는 오류!

		long b1 = 123456789123456789L;
		System.out.println(b1);		// 123456789123456789

		//long b1 = 123456789123456789123456789L;
		//System.out.println(b1);	
		//--==> 에러 발생 (컴파일 에러) 
		// error: integer number too large: 123456789123456789123456789
		// 숫자가 너무 커서 long type 에 들어가지 않음
		// 그럼 이런 큰 숫자는 어떻게 넣을까?
	
		// BigInteger 
		// => byte, short, int, long 에 담지 못하는 큰 수 담기 위해 만든 것
		// 생성자에 문자열 형태의 숫자 넘겨받음. 왜?
		// 정수형태 일단 4byte로 처리하는데 에러남
		// long type 에도 담지 못하는 숫자 처리하려고 하니까 L 붙여도 에러날거임
		// 거기서부터 에러나면 BigInteger로 만들지도 못하니까 문자열로 넘겨 받음
		BigInteger a = new BigInteger("123456789123456789");
		BigInteger b = new BigInteger("123456789123456789");
		
		// 일반적인 산술연산 수행 불가
		//BigInteger c = a + b;
		//System.out.println(c);

		// 더하기 : BigInteger.add(BigInteger type 변수)
		BigInteger c = a.add(b);
		System.out.println("덧셈 결과 : " + c);		
		//--==> 덧셈 결과 : 246913578246913578

		// 빼기 : BigInteger.subtract(BigInteger type 변수)
		BigInteger d = a.subtract(b);
		System.out.println("뺄셈 결과 : " + d);		
		//--==> 뺄셈 결과 : 0

		// 곱하기 : BigInteger.multiply(BigInteger type 변수)
		BigInteger e = a.multiply(b);
		System.out.println("곱셈 결과 : " + e);		
		//--==> 곱셈 결과 : 15241578780673678515622620750190521

		// 나누기 : BigInteger.divide(BigInteger type 변수)
		BigInteger f = a.divide(b);
		System.out.println("나눗셈 결과 : " + f);		
		//--==> 나눗셈 결과 : 1

		// 지수승 : BigInteger.pow(몇 승)
		BigInteger g = new BigInteger("2");
		System.out.println("2의 3제곱 : " + g.pow(3));
		//--==> 2의 3제곱 : 8

	}
}

// 실행 결과
/*
123456789123456789
덧셈 결과 : 246913578246913578
뺄셈 결과 : 0
곱셈 결과 : 15241578780673678515622620750190521
나눗셈 결과 : 1
2의 3제곱 : 8
계속하려면 아무 키나 누르십시오 . . .
*/