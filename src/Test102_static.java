 /*================================
   ■■■ 클래스와 인스턴스 ■■■
==================================*/

// static 변수(클래스 변수)와 static 메소드(클래스 메소드)
//  (탄생시점, 공유)
//		* 1. 탄생시점 : 인스턴스 보다 static이 누나
//		* 2. 공유	  : 사무실 사물함에 있는 스테이플러 생각하기

// ※ 실습 편의상 접근 제어 지시자 생략

public class Test102_static
{	
	//클래스 영역에서 아래 코드는 불가
	//int a;
	//a = 10;	//이게 안됨

	// ※ 클래스 변수 또는 클래스 메소드는
	//	  클래스 정보가 로딩되는 순간 메모리 할당이 이루어지며,
	//    클래스 이름 또는 객체(인스턴스)를 통해 접근할 수 있다.
	//    즉, 『new』연산자를 통해 메모리를 할당받지 않아도
	//    사용이 가능하다는 것이다.

	static int a = 10;		//-- static변수(클래스변수, class변수, 정적변수)

	// ※ 인스턴스 변수 또는 인스턴스 메소드는
	//    동일한 클래스의 메소드에서는 바로 접근하는 것이 가능하지만
	//    클래스 메소드에서는 접근할 수 없다.

	int b = 20;				//-- non-static변수(인스턴스변수, instance변수, 동적변수)

	void write()			//-- non-static메소드(인스턴스메소드, instance메소드, 동적메소드)
	{
		System.out.println("클래스   변수 a : " + a);
		System.out.println("인스턴스 변수 b : " + b);
	}

	static void print()		//-- static메소드(클래스메소드, class메소드, 정적메소드)
	{
		System.out.println("클래스   변수 a : " + a);
		//System.out.println("인스턴스 변수 b : " + b);
		//==> 에러 (컴파일 에러) 
		//	→ non-static variable b cannot be referenced from a static context
		// 인스턴스 변수 b는 static 메소드 print() 가 태어났을 때는 아직 없음		
	}
	
	public static void main(String[] args)
	{
		// 접근방법1) 클래스 변수니까 클래스명으로 접근 => 클래스명.변수명
		//-- 클래스 변수에 접근하기 위해서는
		//   『클래스명.변수명』의 형태로 클래스의 이름을 통해 접근하는 것이 가능하다.
		System.out.println("main() → 클래스 변수 a : " + Test102_static.a);


		// 접근방법2) 같은 클래스 안에 포함되어 있기 때문에 그냥 변수명으로도 접근 가능
		// *** 기본적으로 클래스변수는 클래스이름으로 접근해야하는데
		//     동일한 클래스에 포함되어 있기 때문에 클래스 이름을 생략한 것 뿐이다. ***
		//-- 같은 클래스 내부에 존재하기 때문에 클래스 이름을 생략하는 것이 가능하다.
		System.out.println("main() → 클래스 변수 a : " + a);

		// 메소드도 동일함
		Test102_static.print();	// 접근방법1
		print();			// 접근방법2
			//-- 클래스 메소드에서 클래스 메소드의 호출은 가능하며
			//   『클래스명.메소드명()』 형태로 접근하여 호출하는 것이 가능하다.
			//   또한, 지금은 같은 클래스 내부에 존재하기 때문에 
			//   클래스의 이름을 생략하는 것이 가능하다.

		//System.out.println("main() → 인스턴스 변수 b : " + b);
		//==> 에러 (컴파일 에러) → non-static variable b cannot be referenced from a static context
		//System.out.println("main() → 인스턴스 변수 b : " + Test102.b);
		//==> 에러 (컴파일 에러) → non-static variable b cannot be referenced from a static context

		//Test102.write();
		//==> 에러 (컴파일 에러) → non-static variable b cannot be referenced from a static context
		//write();		
		//==> 에러 (컴파일 에러) → non-static variable b cannot be referenced from a static context

		// Test102 클래스 기반 인스턴스 생성
		Test102_static ob = new Test102_static();

		//System.out.println("main() → 인스턴스 변수 b : " + b);
		//==> 에러 (컴파일 에러) → non-static variable b cannot be referenced from a static context
		// 생성된 인스턴스를 통해 접근한게 아니기 때문에 에러남

		// 생성된 인스턴스를 통한 인스턴스 변수 접근
		System.out.println("main() → 인스턴스 변수 b : " + ob.b);
		//==> 정상적으로 실행됨

		//write();		
		//==> 에러 (컴파일 에러) → non-static variable b cannot be referenced from a static context
		
		// 생성된 인스턴스를 통한 인스턴스 메소드 접근(호출)
		ob.write();
		//==> 정상적으로 실행됨

		// 생성된 인스턴스를 통한 클래스 변수 접근
		System.out.println("main() → 클래스 변수 a : " + ob.a);
			// 클래스의 이름을 통해서 접근하는 것도 되지만,
			// 생성된 인스턴스를 통해서 접근하는 것도 된다.

		// 생성된 인스턴스를 통한 클래스 메소드 접근
		ob.print();
			// 클래스의 이름을 통해서 접근하는 것도 되지만,
			// 생성된 인스턴스를 통해서 접근하는 것도 된다.

		// ※ 클래스 변수나 클래스 메소드는
		//	  『생성된인스턴스명.변수명』
		//    『생성된인스턴스명.메소드명()』
		//     의 형태로도 접근(호출)이 가능하지만
		//	  『클래스명.변수명』
		//    『클래스명.메소드명()』
		//	   의 형태로 접근(호출)하는 것이 일반적이다.

		System.out.println("\n<<< 최종적으로... >>>");
		System.out.println("[a] main() → 클래스 변수 a : " + a);
		System.out.println("[Test102.a] main() → 클래스 변수 a : " + Test102_static.a);
		System.out.println("[ob.a] main() → 클래스 변수 a : " + ob.a);

		System.out.println("\n===============================================\n");
		
		// Test102 클래스 기반 인스턴스 생성
		Test102_static ob2 = new Test102_static();
		
		ob2.a = 10000;		//-- 클래스 변수 초기화
		ob2.b = 20000;		//-- 인스턴스 변수 초기화

		// 변수 값 바꾸는 행위 => 두번째 생성된 ob2 객체에서 함
		System.out.println("<<<  ob2 확인  >>>");
		ob2.write();
		/*
		<<<  ob2 확인  >>>
		클래스   변수 a : 10000
		인스턴스 변수 b : 20000
		*/

		System.out.println();
		System.out.println("<<<  ob 확인  >>>");
		ob.write();
		/*
		<<<  ob 확인  >>>
		클래스   변수 a : 10000
		인스턴스 변수 b : 20
		*/

		// a 변수는    공용 사물함에 있는 공용 스테이플러임
		// b 변수는 내 책상 사물함에 있는 개인 스테이플러
		
	}
}

// 실행 결과
/*

*/