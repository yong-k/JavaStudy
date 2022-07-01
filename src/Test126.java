 /*==========================
   ■■■ 클래스 고급 ■■■
============================*/

// 중첩 클래스

// outer
class InnerOuterTest
{
	static int a = 10;
	int b = 20;

	// inner
	// 『InnerOuterTest$InnerNested.class』 로 클래스파일명 만들어짐
	// --> static 중첩 클래스(중첩 내부 클래스)와 동일함
	class InnerNested
	{
		// 변수 c와 write() 둘 다 인스턴스이고,
		// InnerNested 의 멤버이므로 탄생시점 같음
		int c = 30;
		
		void write()	// inner 의 write()
		{
			System.out.println("inner 의 write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}
	}

	void write()		// outer 의 write()
	{
		System.out.println("outer 의 write()...");

		InnerNested ob1 = new InnerNested();
		ob1.write();	//-- inner 의 write() 호출
	}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test126
{
	public static void main(String[] args)
	{
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();	//-- outer 의 write() 호출

		//InnerNested ob3 = new InnerNested();
		//--==> 에러남

		//InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();
		//--==> 에러남

		// ※ 중첩 내부 클래스(static 중첩 클래스)와는 달리
		//    외부 클래스의 인스턴스(객체)를 사용하지 않고
		//    단독으로 내부 클래스의 인스턴스 생성하는 것은 불가능하다.
		//    → 외부 클래스의 객체를 사용하면
		//       내부 클래스의 객체를 생성하는 것이 가능하다.


		// ※ Test124.java 파일과 비교할 것~!!!	
		
		// 미리 생성해놓은 InnerOuterTest 객체 ob2가 있으니 아래처럼 가능
		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();

		// 만약, 미리 생성해놓은 InnerOuterTest 객체 없다면,
		// InnerOuterTest 객체 생성하고.InnerNested 객체 생성
		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();

		/*
		outer클래스명.inner클래스명 참조변수명 = new outer생성자().new inner생성자();

			ex) InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();



		cf) static → 중첩 내부 클래스
		outer클래스명.inner클래스명 참조변수명 = new outer클래스명.inner생성자();

			ex) Test.StaticNested ob2 = new Test.StaticNested();
		*/


	}
}

// 실행 결과
/*
outer 의 write()...
inner 의 write()...
a : 10
b : 20
c : 30
inner 의 write()...
a : 10
b : 20
c : 30
inner 의 write()...
a : 10
b : 20
c : 30
계속하려면 아무 키나 누르십시오 . . .
*/