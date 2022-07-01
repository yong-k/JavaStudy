 /*=======================================
   ■■■ 자바의 주요(중요) 클래스 ■■■
=========================================*/

// Wrapper 클래스

public class Test136
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		// 객체 출력했는데, 내용물 잘 나오고 있음
		System.out.println(b2);		// 3
		System.out.println(i2);		// 256

		print(b2);
		print(i2);

		// Byte 클래스의 byteValue() 메소드 호출
		byte b3 = b2.byteValue();	// 언박싱
		
		// Integer 클래스의 intValue() 메소드 호출
		int i3 = i2.intValue();		// 언박싱

		// check~!!!
		int i4 = b2.byteValue();
		//		---------------
		//		Byte 객체가 아니라 primitive 타입의 byte 값 반환
		//		=> 그리고 그건 int 타입에 충분히 담김

		//byte b4 = i2.intValue();	// 에러 발생(컴파일 에러)
		// 이건 자동형변환 규칙에 위배되므로 에러남
		// error: incompatible types: possible lossy conversion from int to byte
		byte b4 = i2.byteValue();	// 이렇게 해야 함

		System.out.println(b3);		// 3
		System.out.println(i3);		// 256

		// check~!!!
		System.out.println(b4);		// 0
		//--> byte type 반환하지만, 256이 나오는거 아니라 0 나옴
		// 반환값을 byte로 반환하는 것 뿐이지, byte에서 수용할 수 없는 값
		// 그런 경우에 에러는 발생하지 않지만 잘못된 값 반환함!
		System.out.println(i4);		// 3


	}
/*	// print() 메소드 하나만 정의해도 아래 2개 기능하게 만들어보기

	static void print(Byte b)
	{
		System.out.println(b);
	}

	static void print(Integer i)
	{
		System.out.println(i);
	}

*/

// 내가 한 거  (Object 까지 간 건 너무 조상으로 간 듯)
// 최상위에 있는 객체타입이기 때문에... 모든 타입을 수용하지만 바람직하진 않다.
// 만들 때 Object로 만들면 만들 때는 쉽게 만들 수 있음
/*
	static void print(Object obj)
	{
		System.out.println(obj);
	}
*/
	// java.lang.Number 클래스(추상 클래스)는
	// 모든 숫자형 Wrapper 클래스들의 부모 클래스
	// (슈퍼 클래스, 상위 클래스)이다.
	// b2, i2 자료형이 Number 에 넘어오면서
	// 업 캐스팅이 일어나게 된다.
	// Auto-Boxing 이 일어나게 된다.
	static void print(Number n)	
	{
		// 아래 둘 중 뭐로 하나 상관없음
		System.out.println(n);
		System.out.println(n.intValue());
	}

}
// 실행 결과
/*
3
256
3
3
256
256
계속하려면 아무 키나 누르십시오 . . .
*/