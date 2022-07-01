 /*=======================================
   ■■■ 자바의 주요(중요) 클래스 ■■■
=========================================*/

// Wrapper 클래스 
// BigDecimal 클래스는 lang 패키지에 없어서 import 해줘야함
// =================
// => 실수형태로 엄청나게 큰 숫자를 처리하려고 할 때 사용

import java.math.BigDecimal;

public class Test135
{
	public static void main(String[] args)
	{
		BigDecimal a = new BigDecimal("123456789.123456789");

		// movePointLeft() : 소수점을 매개변수로 받은 수만큼 왼쪽으로 이동
		BigDecimal b = a.movePointLeft(3);
		System.out.println("처리 결과 : " + b);
		//--==> 처리 결과 : 123456.789123456789

		// 나눗셈연산 (대체 속성 확인, 반올림 하지 않는다 → 절삭)
		BigDecimal c = a.divide(b, BigDecimal.ROUND_DOWN);
		System.out.println("처리 결과 : " + c);
		//--==> 처리 결과 : 1000.000000000
		// (관찰) 클래스이름.ROUND_DOWN => static final 이겠구나..
		
		// BigInteger 객체로 변환
		System.out.println(a.toBigInteger());
		//--==> 123456789	(실수 → 정수화 됨)
		// (관찰) 메소드 이름 앞에 to 붙었네 ?
		//		  (100%는 아니지만 90% 정도는) 변환을 수행하는 메소드
	}
}

// 실행 결과
/*

*/