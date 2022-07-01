// 단일행 주석문

/* 
다중행
주석문
*/


// 클래스 이름은 => Test001		파일 이름: Test001   ==> 이름 대소문자까지 같아야함
// 자바 프로그램의 클래스 이름은 첫 글자를 대문자로 시작
// 자바 프로그램 시작할 때 클래스(class)와 main 함수(메소드)를 기본적으로 입력
// 소스코드 저장 시, 클래스 이름과 동일한 파일 이름으로 저장
//		단, 이 때 확장자는 [.java]
public class Test001
{
	// main() 이라는 이름을 가진 함수(메소드)
	// main() : 자바 인터프리터가 처음 찾는 함수(메소드)
	// 자바에서의 모든 함수: 독립적으로 외출 불가 !!꼭 클래스 안에만 있어야 함!!
	public static void main(String[] args)
	{

		//
		// 당분간 우리가 코딩할 영역: main() 내부
		//

		System.out.println("처음 작성한 프로그램");
		System.out.println("내 이름은 김정용");
		
		// 이름() : 이 이름을 가진 함수(메소드)를 호출
		// ***자바에서의 함수는 독립적으로 존재할 수 없고,
		//	클래스에 정의되는 형태로 만들어져야 한다. *** -> 메소드

		// 메소드 호출 구문 ex) println();

		// 함수, 즉 메소드는 (기능, 동작, 행위)의 의미
		// 그렇기 때문에 [정의]가 이루어져야 함
		// 그렇게 정의되어 있어야 [호출]해서 사용함

		// 공구창고.공구함.망치()
		// 구급약통.먹는약상자.소화제()
		// 구급약통.바르는약상자.마데카솔()
		// => System.out.println()
		//		System 클래스의 out 객체의 println() 메소드

	}
}


// 실행 결과
/*
처음 작성한 프로그램
내 이름은 김정용
계속하려면 아무 키나 누르십시오 . . .
*/

// => 앞으로 실행 결과 어느 환경에서라도 볼 수 있도록 아래에 주석처리 해놓기
// 콘솔 복사할 때는, 블록잡은 후에 enter 누르면 복사됨