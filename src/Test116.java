 /*==========================
   ■■■ 클래스 고급 ■■■
============================*/

// 상속(Inheritance) 
/*
※ 메소드 오버라이딩(Method Overriding)의 특징
	- 메소드 이름, 리턴타입, 파라미터 수나 타입이 완전히 일치해야 한다.
	- 반드시 상속 관계가 있어야 한다.
	- 재정의된 하위 클래스의 메소드 접근제어지시자는 
	  상위 클래스의 메소드 접근제어지시자보다 범위가 크거나 같아야 한다.
	  예를 들어, 상위 클래스 메소드의 접근제어지시자 『protected』 인 경우
	  하위 클래스가 이 메소드를 오버라이딩(Overriding)하는 경우
	  접근제어지시자는 『protected』 또는 『public』 이어야 한다.
	- 『static』, 『final』, 『private』 메소드는 오버라이딩(Overriding) 할 수 없다.
	- Exception 의 추가가 불가능하다.
	  즉, 상위 메소드가 가지고 있는 기존 예외 사항에 
	  새로운 Exception 을 추가하는 것은 불가능 하다는 것이다.
*/

// 부모 클래스(상위 클래스, super class)
class SuperTest116
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
	}
}

// 자식 클래스(하위 클래스, sub class)
class SubTest116 extends SuperTest116
{
	/* <extends SuperTest116>
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
	}
	*/
	protected int b = 100;

	public void print()
	{
		//System.out.println("Sub print() 메소드 : " + a + " : " + b + " : " + c);
		//-- 슈퍼클래스에서 선언된 변수 a 에는 접근할 수 없다.
		//	→ private 변수이기 때문에...
		System.out.println("Sub print() 메소드 : " + b + " : " + c);

		System.out.println("Sub print() 메소드 : " + b);		// 100
		System.out.println("Sub print() 메소드 : " + this.b);	// 100
		System.out.println("Sub print() 메소드 : " + super.b);	// 10
		//-- 변수 b 는 접근 방법에 따라 다른 b 로 접근 및 출력이 이루어진다.
		//	 슈퍼 클래스에서 선언된 b, 서브 클래스에서 선언된 b

		System.out.println("Sub print() 메소드 : " + c);		// 20
		System.out.println("Sub print() 메소드 : " + this.c);	// 20
		System.out.println("Sub print() 메소드 : " + super.c);	// 20
		//-- 변수 c 는 접근하는데 아무런 제약과 제한이 없다.
		//   슈퍼 클래스에서 선언된 c
	}

	@Override
	public void write()
	{
		//System.out.println("Sub write() 메소드 : " + a + " : " + b + " : " + c);
		//-- 슈퍼 클래스에서 선언된 변수 a 에는 접근할 수 없다.
		//	 → private 변수이기 때문에...
		System.out.println("Sub write() 메소드 : " + b + " : " + c);
	}
}

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test116
{
	public static void main(String[] args)
	{
		// 하위 클래스(SubTest116) 인스턴스 생성
		SubTest116 ob = new SubTest116();

		ob.print();
		//--==> Sub print() 메소드 : 100 : 20

		ob.write();
		//		(write() 메소드 오버라이딩하기 전)
		//--==> Super write() 메소드 : 5 : 10 : 20
		//----- 부모 클래스에 있기 때문에 a, b, c 변수 다 접근 가능
		//		(write() 메소드 오버라이딩한 후)
		//--==> Sub write() 메소드 : 100 : 20

		System.out.println("----------------------------------- 구분선");

		System.out.println(ob.b);	// 100

		// ※ 슈퍼 부름~!!!
		System.out.println(((SuperTest116)ob).b);	// 10
		
		((SuperTest116)ob).write();
		//--==> Sub write() 메소드 : 100 : 20

		// check~!!!
		// ※ 메소드와 변수를 꼭~!!!!! 구분하여 정리할 것 ~!!!

		/*
		**변수,메소드
		변수는 슈퍼부름 가능
		=> 부모,자식 메모리 따로 잡힘
		메소드는 슈퍼부름 불가
		=> 부모-자식 메모리 같음
		=> 부모 위치에 자식꺼 덮어쓰기 해버리는 것!
		=> 그러므로 이전 것으로 돌아가지 못함!!
	    한번 튜닝한 그랜져 다시 순정 그랜져로 돌아가지 못함
		*/
	}
}

// 실행 결과
/*

*/