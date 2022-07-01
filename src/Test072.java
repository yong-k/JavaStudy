 /*=================================
   ■■■ 클래스와 인스턴스 ■■■
===================================*/

// 직사각형 클래스 설계 실습
/*
직사각형의 넓이와 둘레 계산 -> 클래스 표현

클래스의 정체성 -> 직사각형
클래스의 속성   -> 가로, 세로
클래스의 기능   -> 넓이 계산, 둘레 계산, 가로세로 입력, 결과 출력, ....

객체를 구성   -> 데이터(속성, 상태) + 기능(동작, 행위)
    ↓					↓					↓
클래스 설계   ->	   변수			+	  메소드

class 직사각형
{
	// 데이터(속성, 상태) -> 변수 (선언 순서 의미 없음)
	//							=> class 안에서는 순차적 NO
	//							=> main 안에서만 순차적임
	int 가로, 세로;

	// 기능(동작, 행위)   -> 메소드 (선언 순서 의미 없음)
	가로세로 입력()
	{
	}

	둘레 계산()
	{
	}

	넓이 계산()
	{
	}

	결과 출력()
	{
	}

}

*/
// ** 하나의 자바 파일(.java)에 여러 개의 클래스(class)를 설계할 수 있나? ==> YES
// 그럼 클래스 여러개면 파일 이름은 뭘로 해??
// ** 하지만, public class 는 하나만 올 수 있다.
// ** 저장할 때 파일 이름은 ==> public 이 붙어있는 class 의 이름으로 저장해야 한다.
// 일반적으로는 하나의 파일에 하나의 클래스를 설계한다.
//    ==> 실무에 나가면 하나의 파일 안에 여러 클래스 설계할 일 없음 ㅎvㅎ
// ****** 또한, 여러 개의 클래스가 설계된 파일을 컴파일하게 되면,
//		  내부에 설계된 클래스의 수 만큼 클래스 파일(.class)이 파생된다. ******

// 실제로 넘겨줄 때는 .java 소스코드를 넘겨주는 게 아니라 (=> 우리 밑천임)
// .class 파일을 넘겨주는 거 => 열었을 때 우리가 해석 불가

// import 구문 여기에 써야함
// 지금까지 한 것 처럼 main() 위에 쓰면 안 됨!
import java.util.Scanner;

class Rect	// 직사각형 클래스 설계
{
	//Scanner sc = new Scanner(System.in);	--- (1)번자리
	//Scanner sc; --(2)번
		/*
		여기에 쓰면 안됨. 문법적으로 문제가 생기는 건 아님
		이거 작성하고 main()에서 호출할 때,

		Rect ob = new Rect();
		ob.input();
		ob.callLength();
		ob.calArea();
		ob.print();

		이런 식으로 할 거임
		(1)번 자리에 Scanner 인스턴스 생성구문 쓰면,
		=> ob 생성 만으로 Scanner가 메모리 잡아먹음
		   ob.input() 이번에 호출 안 할건데도 Scanner까지 생성되어 있음,,
		   Scanner 쓰지도 않을 건데 구성해서 메모리 쓸 필요 없음,,
		=> 필요한 메소드 안에 써야 ob.메소드(); 을 해야 Scanner가 메모리에 올라옴

		그럼 클래스의 모든 메소드에서 Scanner 쓰면 (1)번 자리에 해도 괜찮나? => NO
		(2)번과 같이 sc 생성만 해놓고,
			각각 메소드 안에서 sc = new Scanner(System.in); 해주는게 바람직함!
			각각 메소드 안에서 Scanner sc = new Scanner(System.in); 하면
				각각 메소드 안에 있는 sc 다 다른애. 서로 안보임
				(2)번 자리에 선언하면 sc를 메소드1이 초기화했다고 해도,
					메소드2 자리에서 그 sc 보임
		class 클래스명 
		{
			(1)
			int a;
			메소드1() { a = 10; }
			메소드2() { a = 20; }
			==> 메소드1과 메소드2의 a 모두 같은 애임
			
			(2)
			메소드1() { int a = 10; }
			메소드2() { int a = 20; }
			==> 메소드1과 메소드2의 a 각각 다른 애임. 서로 안 보임
		}

		==> 인스턴스 생성은 메소드 안에서 하는 게 일반적~!
		*/

	// 데이터(속성, 상태)	→ 변수
	int w, h;	// 가로, 세로
	
	// 기능(동작, 행위)		→ 메소드
	//반환자료형 메소드명 () {}
	//반환자료형 => 해당 메소드를 호출한 곳에 돌려주는 자료형
	void input()			// 가로,세로 입력()
	{
		Scanner sc = new Scanner(System.in);	// Scanner 의 인스턴스 생성 구문

		// 매개변수로 넘겨받은 걸 가로, 세로 초기화한 거 아님
		// 받아온 걸로 초기화해 온 거
		// 그래서 매개변수 없음
		System.out.print("가로 입력 : ");
		w = sc.nextInt();
		
		System.out.print("세로 입력 : ");
		h = sc.nextInt();

		// 가로세로 안넘겨줘도 됨
		// 뭘 반환해서 놓고오는 애가 아니라
		// 자기가 가지고 있는 w, h 값을 입력받아서 초기화하는 역할하는 아이
		// 그냥 자기 멤버한테 값 넣어주는 역할하는 것 ㅋㅅㅋ
		// 값 두고 오는 방법 한 가지 ==> return 키워드 이용하는 것
	}		

	//int calLength(int w, int h) => w, h 넘겨받을 필요 없음
	//							  => calLength() 의 위치에서 w, h 보이니까
	int calLength()		// 둘레 계산() → (가로+세로)*2
	{
		// 둘레 계산을 하는 연산에 필요한 변수가 있다면,
		// 근데 그 변수를 [[[ 해당 메소드가 갖고 있지 않다면 ]]],
		// 매개변수로 넘겨 받아야 함
		// ** BUT!! 
		// calLength 는 둘레를 구하는데 필요한 [가로]와 [세로] 없을까?
		// calLength 위치에서 보면 Rect class 에서 선언한 전역변수인 int w와 h가 보임
		// ****매개변수로 넘겨받을 필요 없음*****!!!!!!
		int length = (w + h) * 2;		
		// int length 같은 결과를 담아낼 공간이
		// calLength()가 보이는 부분에 선언되어 있다면 그 변수 사용하면 됨
		// but, 보이는 곳에 그 변수가 없다면 그 메소드 안에서 필요한 변수 선언
		// Rect{} class에 int length 는 없으니까 선언!

		return length;
		// 해당 메소드() 가 계산해서 나온 결과값을 담아낼 멤버변수가 있는지 check!
		// 없으면 사용할 변수 메소드() 안에 선언!
		// 그리고 return 자료형 = 선언한 변수 자료형
		// 그리고 그 변수 return 해주면 됨

		// length는 calLength 메소드가 끝나면 소멸됨
		// calLength 가 일 끝나면 length 변수 더 이상 사용할 필요 없게 되는 것
	}

	int calArea()		// 넓이 계산() → 가로*세로
	{
		// 주요 변수 선언
		int area;

		// 연산 및 처리 → 선언한 변수들에 값 담아내기
		area = w * h;

		// 최종 결과 반환
		return area;

		// 위에 3줄 안쓰고 아래처럼 한 줄로 해도 되기는 함
		//return w * h; 
	}

//내가 한거 => 학교에서 이미 접해서 이렇게 바로 한 듯 ㅋㅋ
/*
	void print()			// 결과 출력()
	{
		// 출력형식 예)
		// 가로 : 10
		// 세로 : 20
		// 넓이 : xxx
		// 둘레 : xxx
		

		System.out.println("가로 : " + w); 
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " + calArea());
		System.out.println("둘레 : " + calLength());
	}
*/
// 쌤
	void print(int length, int area)			// 결과 출력()
	{
		/* 출력형식 예)
		가로 : 10
		세로 : 20
		둘레 : xxx
		넓이 : xxx
		*/

		System.out.println("가로 : " + w); 
		System.out.println("세로 : " + h);
		System.out.println("둘레 : " + length);
		System.out.println("넓이 : " + area);
	}
}

public class Test072
{
	public static void main(String[] args)
	{
		//new Rect();
		// => 하면, 메모리에 올라가기는 함
		// 근데 다시 그 값 찾아가지는 못 함...
		// 그 값 사용 못 함..
		
		// Rect 클래스 기반의 인스턴스 생성
		Rect rect = new Rect();

		// 내가 한 걸로 하면 이거 두 개만 선언하면 가능함
		//rect.input();
		//rect.print();

		// 입력 메소드 호출
		rect.input();

		// 둘레 연산 메소드 호출
		int length = rect.calLength();

		// 넓이 연산 메소드 호출
		int area = rect.calArea();

		// 출력 메소드 호출
		rect.print(length, area);
	}
}

// 실행 결과
/*
가로 입력 : 20
세로 입력 : 30
가로 : 20
세로 : 30
둘레 : 100
넓이 : 600
계속하려면 아무 키나 누르십시오 . . .
*/