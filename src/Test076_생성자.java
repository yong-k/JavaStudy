 /*=================================
   ■■■ 클래스와 인스턴스 ■■■
===================================*/

// 생성자(Constructor)
/*
- 생성자(Constructor)의 역할
	
	1. 인스턴스 생성 → 메모리 할당
	2. 초기화

- 생성자(Constructor)의 특징
	
	1. 생성자는 메소드이지만, 
	     - 일반 메소드처럼 호출될 수 없으며(부르고 싶을 때마다 부를 수 없음,,),
	     - 반환 자료형을 가질 수 없다.(void 조차 가질 수 없음)
	     - 값을 반환할 수도 없다.
	2. 생성자는 클래스와 동일한 이름을 가져야 한다.
	   (대소문자 명확히 구분)
	3. 생성자는 객체를 생성하는 과정에서 [ new 생성자(); ]의 형태로 호출된다.
	   (인스턴스 생성 시 단 한 번만 호출)
	   ==> 그래서 final 변수 초기화 가능함

- 디폴트 생성자(default constructor)
클래스 생성 시에, 사용자가 생성자 선언하지 않으면
컴파일 과정에서 자동으로 삽입됨
	- 클래스 이름과 같은 메소드를
	- 매개변수 없고,
	- 안에 텅 비어있는 상태이다.

*/


class NumberTest
{
	int num;

	// 사용자 정의 생성자가 존재하지 않을 경우에만 !
	// 컴파일 과정에서 자동으로 삽입되는 디폴트 생성자(default constructor
	/*
	NumberTest()
	{
		// 텅 비어있는 상태
	}
	*/
	
	// 사용자 정의 생성자 => 이거 있으면 디폴트 생성자 생성 X
	
	NumberTest()
	{
		num = 10;
		System.out.println("사용자 정의 생성자 호출~!!!");
	}

	int getNum()
	{
		return num;
	}
}

public class Test076_생성자
{
	public static void main(String[] args)
	{
		// NumberTest 클래스 기반의 인스턴스 생성
		NumberTest nt1 = new NumberTest(); // 사용자 정의 생성자 호출~!!!
		//					---------------
		//					NumberTest() 메소드 호출하고 있는데,
		//					위에 분명 NumberTest() 메소드 없는데 컴파일 에러 안 남
		// NumberTest nt1 = new NumberTest + numberTest();
		//					
		//-- 인스턴스가 생성되는 시점에서
		//   이와 동시에 선택의 여지 없이 생성자 호출이 이루어진다.
		//								  ------------
		// 								  NumberTest()
		
		//nt1.NumberTest();
		// ==> 에러 발생 (컴파일 에러) : cannot find symbol
		// 생성자 호출 불가
		// NumberTest nt1 = new NumberTest(); => 이 때 이미 한 번 호출함

		System.out.println(nt1.getNum());	// 10 		
		// 사용자 정의 생성자 없애고 출력해도,
		// 전역변수는 자바가 0으로 초기화해주기 때문에 0으로 출력나옴

		nt1.num = 100;
		System.out.println(nt1.getNum());	// 100

		NumberTest nt2 = new NumberTest(); // 사용자 정의 생성자 호출~!!!

		int testResult = nt2.getNum();		// 10
		System.out.println(testResult);
	}
}

// 실행 결과
/*
사용자 정의 생성자 호출~!!!
10
100
사용자 정의 생성자 호출~!!!
10
계속하려면 아무 키나 누르십시오 . . .
*/