 /*==========================
   ■■■ 클래스 고급 ■■■
============================*/

// 인터페이스(Interface)

// 인터페이스
interface Demo2
{
	public void write();
	public void print();
}

// 인터페이스를 구현하는 추상 클래스
abstract class DemoImpl3 implements Demo2
{
	@Override
	public void write()
	{
		System.out.println("write() 메소드 재정의...");
	}

	// 물려받은 추상메소드 print()는 구현하지 않고 놔둠
	// 그걸 DemoImpl의 자식인 DemoImplSub가 물려받음
	//public void print();

}

// 추상 클래스를 상속받는 추상 클래스
//abstract class DemoImplSub extends DemoImpl
//	  ↓
// 추상 클래스를 상속받는 클래스
class DemoImplSub extends DemoImpl3
{
	@Override
	public void print()
	{
		System.out.println("print() 메소드 재정의...");
	}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test121
{
	public static void main(String[] args)
	{
		//Demo ob1 = new Demo();
		//-- 인터페이스이기 때문에 인스턴스 생성 불가

		//DemoImpl ob2 = new DemoImpl();
		//-- 추상클래스이기 때문에 인스턴스 생성 불가
		//error: DemoImpl is abstract; cannot be instantiated

		DemoImplSub ob3 = new DemoImplSub();

		ob3.write();	// write() 메소드 재정의...
		ob3.print();	// print() 메소드 재정의...
	}
}

// 실행 결과
/*
write() 메소드 재정의...
print() 메소드 재정의...
계속하려면 아무 키나 누르십시오 . . .
*/