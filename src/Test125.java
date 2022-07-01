 /*==========================
   ■■■ 클래스 고급 ■■■
============================*/

// 중첩 클래스

// outer
class Test2
{
	static int a = 10;	// 전역변수, Test2의 멤버변수, static변수(클래스변수)
	int b = 20;			// 전역변수, Test2의 멤버변수, non-static변수(인스턴스변수)

	void write()	// ▶ 첫 번째 write() 메소드	/	 인스턴스메소드
					// 변수 b랑 write() 같이 태어남
					// write()가 태어났을 때에는 이미 변수 a는 태어나있는 상태
					// --> 그래서 일단 변수 a, b에는 접근 가능
	{
		System.out.println("write()...①");
		final int c = 20;	// 메소드 안에 선언된 변수 => 지역변수, local 변수
							// 지역변수, 상수화된변수(값이 변하지 않는 변수)

		int d = 40;			//						   => 지역변수, local 변수					
							// 지역변수, 값이 수시로 변할 수 있는 변수

		// LocalTest 탄생시점 보장받을 수 없음
		//LocalTest lt = new LocalTest(); 가 될 수도 있고,

		// 메소드 안에 존재하는 또 다른 클래스(local class, 로컬 클래스, 지역 클래스)
		// inner
		// 『Test2$1LocalTest.class』 로 클래스파일명 만들어짐
		class LocalTest	// 메소드 안에 설계되어 있는 클래스 => 지역클래스, local 클래스
						// 변수 c, d와 클래스 LocalTest 모두 인스턴스
						// 그런데 태어나는 시점으로 보면, 
						// 클래스가 설계되어 있다고 해서 LocalTest가 태어나는게 아님
						// 클래스가 태어나는 시점은, 인스턴스 생성이 언제되느냐에 따라 달라짐!
						// (static 클래스가 아닌 이상)
						// 그런데, 인스턴스 생성 시점 언제라고 보장받을 수 없음
						// c, d 태어날 때 같이 생성될 수도, 한~참 뒤에 될 수도 있음
						// 일단, c와 d 가 태어나고 난 후에 태어남
						// 그런데 d가 값이 계속 변함 => 접근 막음
		{
			void write()	// ▶ 두 번째 write() 메소드
			{
				System.out.println("write()...②");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				// 아래 d 변경 값들 주석제거했을 때, 에러남
				//System.out.println("d : " + d);
				//  error: local variables referenced from an inner class must be final 
				//	or effectively final

				// 아래 d 변경 값들 주석처리했을 때, 정상작동
				System.out.println("d : " + d);
			}
		}

		// ※ 변수 c 와 변수 d 는 둘 다 지역변수 이지만...
		//	  c 는 final 변수이기 때문에
		//	  두 번째 write() 메소드에서 언제 접근하더라도 고정된 값임을 보장받을 수 있다.
		//	  반면에 d 는 그 값이 수시로 변동될 수 있는 상황이므로 
		//	  LocalTest 클래스의 인스턴스 생성 시점이 언제가 될 지 알 수 없기 때문에
		//	  그렇다면 d 에 어떤 값이 담겨있는지 보장받을 수 없기 때문에
		//	  변수 d 에 접근하는 것을 피할 수 있도록 문법적으로 처리해놨다.

		
		// LocalTest 탄생시점 보장받을 수 없음
		//LocalTest lt = new LocalTest(); 가 될 수도 있고,

		//d = 10;
		//d -= 30;

		LocalTest lt = new LocalTest();
		lt.write();		//-- 두 번째 write() 메소드 호출
		
		// LocalTest 탄생시점 보장받을 수 없음
		//LocalTest lt = new LocalTest(); 가 될 수도 있고,

		//d += 10;

		// LocalTest 탄생시점 보장받을 수 없음
		//LocalTest lt = new LocalTest(); 가 될 수도 있음
		
		// ==> LocalTest가 언제 태어나느냐에 따라 d 값이 계속 변할 수 있음
		//===> 그래서 접근을 막아놓은 거임
		//	   d가 값이 어떻게 될 지 모르고, LocalTest 인스턴스 생성시점인지도 모르니까

		// 메소드 영역 안에서만큼은 코드 순차적으로 실행됨

		// c는 LocalTest가 언제 태어나도 값 고정되어 있으니 c = 20 임	  => 접근허용
		// d는 LocalTest 객체가 언제 태어나냐에 따라 값이 뭐가 될 지 모름 => 접근불허
	}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test125
{
	public static void main(String[] args)
	{
		Test2 ob = new Test2();
		ob.write();		//-- 첫 번째 write() 메소드 호출
		// 첫 번째 write() 가 두 번째 write() 도 품고 있기 때문에 둘 다 호출됨
		// 왜 변수 d에 접근이 안 될까? 잘 읽어두기!!
		// d 증감식 주석처리해놔서 지금은 접근가능해짐
	}
}

// 실행 결과
/*
write()...①
write()...②
a : 10
b : 20
c : 20
d : 40
계속하려면 아무 키나 누르십시오 . . .
*/