 /*=======================================
   ■■■ 자바의 주요(중요) 클래스 ■■■
=========================================*/

// Wrapper 클래스
/*
○ Wrapper 클래스

   1. 자바에서는 언어 수준에서 제공하는 기본형 데이터를 제외한 
      나머지는 클래스로 정의하여 객체 단위로 처리한다.
	  따라서 자바에서는 이러한 기본형 데이터를
	  객체 단위로 처리할 수 있도록 클래스를 제공할 수 밖에 없는데
	  이러한 클래스들을 가리켜 Wrapper 클래스라 한다.

   2. 기본 자료형인
      byte, short, int,     long, float, double, char,      boolean 형에 대응하는
	  Byte, Short, Integer, Long, Float, Double, Character, Boolean 의
	  Wrapper 클래스 및 큰 숫자들을 다루기 위한
	  java.math.BigInteger 와 java.math.BigDecimal 클래스를 제공한다.

	  Wrapper 클래스는 java.lang 패키지에 포함되어 있으므로
	  별도의 import 과정 없이 바로 사용하는 것이 가능하며
	  기본형과 마찬가지로 Wrapper 클래스도 내부 메소드를 통해
	  형 변환이 가능하고 동등 비교와 같은 연산도 가능하다.

	  ex) java.lang.Integer 클래스
	      int 기본 자료형의 Wrapper 클래스로
		  정수를 다루는데 필요한 상수나 메소드, 진수 변환 등에 필요한
		  메소드 등을 포함하고 있다.

		  static int parseInt(String s)
		  문자열 형식으로 저장된 숫자를 정수 형태로 변환한다.

		  static Integer valueOf(int i)
		  int 형을 Integer 형으로 변환한다.

		  byte byteValue(), int intValue(),
		  short shortValue(), long longValue(),
		  float floatValue(), double doubleValue()
		  해당 기본 자료형으로 형 변환한 값을 반환한다.
*/

/*
○ 오토 박싱(Auto-Boxing) 과 오토 언박싱(Auto-Unboxing)

   일반적으로 래퍼런스 형과 기본 자료형은 호환되지 않으며
   										  ================
   이 경우 발생하는 문제 해결을 위해 자바에서는 Wrapper 클래스를 제공하게 되었다.
   하지만, JDK 1.5 부터 래퍼런스 형과 기본 자료형이 다음과 같이 형 변환이 가능하게 되었다.
 
   ===> 여전히 reference type - primitive type !! 호환은 안 됨 !! 
		복잡한 처리과정을 자바가 자동으로 처리해주는 게 이루어진거임!!

   int a = 10, b;
   Integer ob;	==> 몇 byte 무슨 type 이라고 표현할 수 없음
   				==> Integer 설계도를 보고 ob를 선언한거임. 인스턴스 생성한것도 아직 아님
				    근데 거기에 ob = a; 라는 말도 안되는 걸 자바가 해준다는 거임!!!
   ob = a;
   //-- 기본 자료형(int)이 Integer 형으로 자동 변환 (자바가 문법적으로 지원해줌)
   // a는 pri(free) 한 애. 그런데 Integer type의 경직된 class 안으로 데리고 옴 => Boxing
   // 실제로는... 『ob = new Integer(a);』라고 우리가 직접 해야하는 건데 ==> 이건 Boxing
   // --> 그런데 자바가 자동으로 해주는거니까 => Auto-Boxing

   primitive 자료형 애들은 자유로운 영혼임
   class 는 경직되어있고, 틀이 있고, 많은 규칙들이 있음
   그 규칙 안으로 primitive 자료형 애들을 끌어들이는 거임
   자유로운 primitive 애들을 객체 형식으로 집어넣는 걸 Boxing
   경직된 class 애들을 primitive 로 풀어주는 걸 Unboxing
   => 그걸 자바가 자동으로 해주면 Auto가 붙고, 우리가 직접하면 Auto 안 붙는거임!

   b = ob;
   //-- Integer(객체)가 기본 자료형 int 형으로 자동 변환(오토 언박싱)
   //	실제로는...『b = ob.intValue();』 라고 우리가 해야되는 거임

   이는 JDK 1.5 이후 추가된 오토 박싱 / 오토 언박싱이라는
   기능으로 인해 가능해진 것이다.
*/

public class Test132
{
	public static void main(String[] args)
	{
		int a = 10, b;
		Integer c;
		Object d;

		b = a;				//-- int 형 데이터(자료) → int 형 변수
		c = new Integer(0);	//-- Integer 타입의 객체 생성
		// 내부적으로는 c = 0; 으로 처리해줌

		// ※ 래퍼런스 형(참조 타입)과 기본 자료형(기본 타입)은 호환되지 않는다.

		b = c;		//-- Integer 형 데이터(객체) → int 형 변수(오토 언박싱)
					// 원래는 말도 안되는 거 but 자바가 해줌
				
		b = c.intValue();	//-- 언박싱 (오토언박싱 아니고 우리가 풀어서 반환해준거임)

		d = new Object();
		System.out.println("d.toString() : " + d.toString());
		//--==> d.toString() : java.lang.Object@15db9742
		//					   ---------------  --------
		//					      클래스명    @  해시코드

		d = new Integer(10);	//-- 업 캐스팅
		System.out.println("d.toString() : " + d.toString());
		//--==> d.toString() : 10

		// 99번 105번 toString() 둘 다 Object의 toString() 임
		// ==> 그런데 결과 다름... 이걸 자바가 해주는 거임

		d = new Double(12.345);	//-- 업 캐스팅
		System.out.println("d.toString() : " + d.toString());
		//--==> d.toString() : 12.345

		d = 10;					//-- 오토 박싱
		// 원래는 이렇게 하는 거 안되는데, 자바가 자동으로 처리해주기 때문에...!!!
		// d = new Integer(10); 
		// d = 10;
		// 위에 두 구문이 같은 거임
		System.out.println("d.toString() : " + d.toString());
		//--==> d.toString() : 10
	}
}

// 실행 결과
/*
d.toString() : java.lang.Object@15db9742
d.toString() : 10
d.toString() : 12.345
d.toString() : 10
계속하려면 아무 키나 누르십시오 . . .
*/