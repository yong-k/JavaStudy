 /*==================================
   ■■■ 지역변수와 전역변수 ■■■
====================================*/

// 전역 변수의 초기화 테스트

// Test070.java 와 비교 ~!!

/*
클래스 설계한 설계도는 실체가 있는게 아님
그냥 하드디스크에 있는거. 
메소드에서 호출해야 그 때 메모리에 올라감 !
*/
public class Test071
{
	// 클래스의 영역

	// 전역 변수 a 선언 => 클래스 변수 (X)
	int a;
	//-- 자바가 자동으로 0 으로 초기화 지원

	boolean b;
	//-- 자바가 자동으로 false 로 초기화 지원

	char c;
	//-- 자바가 자동으로 아무것도 갖고 있지 않은 값 으로 초기화 지원

	double d;
	//-- 자바가 자동으로 0.0 으로 초기화 지원

	public static void main(String[] args)
	{
		// 메소드의 영역
		
		//System.out.println("a : " + a);
		// ==> 에러 발생 (컴파일 에러)
		//	non-static variable a cannot be referenced from a static context
		//	==> class Test071 설계도 안에 int a 있기는 하지만
		//      설계도만 있는거지 아직 Test071 class는 메모리에 올라오지 않아서
		//		변수 a에 대한 정보가 없음

		// Test071 클래스를 기반으로 인스턴스 생성
		Test071 ob = new Test071();

		System.out.println("ob.a : " + ob.a);
		// ==> ob.a : 0
		// ==> 자바가 자동으로 0으로 초기화 지원해줌
		// Line19 에 선언되어 있는 a에 접근한게 아니라
		// 메모리에 올라가 있는 a에 접근한거

		System.out.println("ob.b : " + ob.b);
		// ==> ob.b : false

		System.out.println("ob.c : " + ob.c);
		// ==> ob.c : 

		System.out.println("ob.d : " + ob.d);
		// ==> ob.d : 0.0
	}
	/*
	다른메소드1()
	{		
	}
	*/

	/*
	다른메소드2()
	{	
	}
	*/
}

// 실행 결과
/*

*/