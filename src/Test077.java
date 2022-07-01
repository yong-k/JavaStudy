 /*=================================
   ■■■ 클래스와 인스턴스 ■■■
===================================*/

// 생성자 (Constructor)

class NumberTest2
{
	int num;
	
	// 사용자 정의 생성자가 정의되어 있으므로 default 생성자 자동으로 삽입 X
	//NumberTest2() {}

	// 생성자 → 사용자 정의 생성자
	NumberTest2(int n)
	{
		num = n;
		System.out.println("생성자 호출 시 매개변수 전달 : " + n);
	}

	int getNum()
	{
		return num;
	}
}

public class Test077
{
	public static void main(String[] args)
	{
		// NumberTest2 인스턴스 생성
		//NumberTest2 nt = new NumberTest2();
		//==> 에러 발생 (컴파일 에러)
		//-- NumberTest2 클래스에는
		//   사용자 정의 생성자가 존재하고 있는 상황이기 때문에
		//   default 생성자가 자동으로 삽입되지 않으며
		//   사용자가 정의한 생성자는 매개변수를 갖는 형태이기 때문에
		//   위와 같이 매개변수 없는 생성자 호출 시 문제가 발생하게 된다.
		NumberTest2 nt1 = new NumberTest2(10);
		System.out.println("메소드 반환 값 : " + nt1.getNum());	// 10

		NumberTest2 nt2 = new NumberTest2(3564);
		System.out.println("메소드 반환 값 : " + nt2.getNum());	// 3564
	}
}

// 실행 결과
/*
생성자 호출 시 매개변수 전달 : 10
메소드 반환 값 : 10
생성자 호출 시 매개변수 전달 : 3564
메소드 반환 값 : 3564
계속하려면 아무 키나 누르십시오 . . .
*/