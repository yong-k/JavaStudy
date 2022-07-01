 /*==========================
   ■■■ 클래스 고급 ■■■
============================*/

// 인터페이스(Interface)

// 인터페이스
interface ADemo
{
	public void write();
}

// 인터페이스
interface BDemo
{
	public void print();
}

// ※ 인터페이스는 2개 이상을 구현(implements)할 수 있다.
//	   → 다중 상속이 되지 않는 부분을 보완(보충)하는 개념.

// 클래스
// 추상 클래스 - 두 인터페이스를 구현한 추상 클래스
//abstract class DemoImpl implements ADemo, BDemo
//	  ↓
// 클래스 - 두 인터페이스를 구현한 클래스
class DemoImpl2 implements ADemo, BDemo
{
	// 클래스에서의     @Override는 jdk 1.5부터 지원
	// 인터페이스에서의 @Override는 jdk 1.6부터 지원
	//
	// JDK 1.5(5.0)에서는 인터페이스 메소드를
	// 오버라이딩(Overriding)할 때
	// 『@Override』 어노테이션(annotation)을 사용할 수 없다.
	// JDK 1.6 이후부터 적용 가능한 문법이다.
	// 단, 상속받은 클래스의 메소드를 오버라이딩(Overriding)할 때에는
	// JDK 1.5 에서도 『@Override』 어노테이션(annotation) 사용이 가능하다.
	@Override	
	public void write()
	{
		System.out.println("ADemo 인터페이스 메소드 write()...");
	}

	@Override
	public void print()
	{
		System.out.println("BDemo 인터페이스 메소드 print()...");
	}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test120
{
	public static void main(String[] args)
	{
		//ADemo ob = new ADemo();		//-- 인터페이스 → 인스턴스 생성 불가
		//BDemo ob = new BDemo();		//-- 인터페이스 → 인스턴스 생성 불가
		
		// ADemo, BDemo 인터페이스를 구현(implements)한 클래스(→ DemoImpl)
		// 기반의 인스턴스 생성
		DemoImpl2 ob1 = new DemoImpl2();

		ob1.write();
		ob1.print();
		//--==> ADemo 인터페이스 메소드 write()...
		//		BDemo 인터페이스 메소드 print()...

		ADemo ob2 = new DemoImpl2();		//-- 업 캐스팅
		BDemo ob3 = new DemoImpl2();		//-- 업 캐스팅

		//ob2.print();	//--==> 에러 발생 error: cannot find symbol
		//ob3.write();	//--==> 에러 발생 error: cannot find symbol
		// 자기가 갖고 있는 것만 호출 가능함

		ob2.write();	// ADemo 인터페이스 메소드 write()...
		ob3.print();	// BDemo 인터페이스 메소드 print()...

		// check~~!!!
		((BDemo)ob2).print();	// BDemo 인터페이스 메소드 print()...
		((ADemo)ob3).write();	// ADemo 인터페이스 메소드 write()...
		//-- DemoImpl 클래스가 두 인터페이스를 모두 구현했기 때문에 가능하다.
		//	 만약, DemoImpl 클래스가 이들 중 한 인터페이스만 구현했다면
		//	 이 구문은 런타임 에러 발생하는 구문이 된다.
		//
		// 일반적으로 봤을 때는 터무니없는 구문이지만
		// 둘 다 new DemoImpl(); 한 상황이고
		// DemoImpl이 ADemo와 BDemo를 둘 다 implements 한 상황
		//==> DemoImpl 로 인해서 ADemo와 BDemo 사이에 관계가 생겨버림
		//	  그 전에는 ADemo와 BDemo 아무 관계 없었음
		//===> 그러므로 각각 CROSS 해서 캐스팅하는게 가능해짐!
		// 이건 업캐스팅,다운캐스팅이 아님
		// 그냥 다른 클래스들끼리의 캐스팅임..!
	

		// 다운 캐스팅
		((DemoImpl2)ob3).write();	// ADemo 인터페이스 메소드 write()...

	}
}

// 실행 결과
/*
ADemo 인터페이스 메소드 write()...
BDemo 인터페이스 메소드 print()...
ADemo 인터페이스 메소드 write()...
BDemo 인터페이스 메소드 print()...
BDemo 인터페이스 메소드 print()...
ADemo 인터페이스 메소드 write()...
ADemo 인터페이스 메소드 write()...
계속하려면 아무 키나 누르십시오 . . .
*/