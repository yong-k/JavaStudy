/*====================================
   ■■■ 자바 기본 프로그래밍 ■■■
======================================*/

// 변수와 자료형
// 키워드 및 식별자

public class Test006
{
	public static void main(String[] args)
	{
		double height = 172.8;
		int age = 27;
		char degree = 'A';

		System.out.println("height = " + height);
		System.out.println("age = " + age);
		System.out.println("degree = " + degree);

		String name = "김정용";
		// 스코프 영역 안에서 변수명은 식별자! 
		// 다른 타입이더라도 같은 이름 사용 불가!

		System.out.println("name : " + name);

		// String #name = "정용";
		// => #name 변수 이름으로 불가
		// $와 _ 를 제외한 특수문자는 변수의 이름으로 활용할 수 없다.
		// 하지만, 그나마 사용 가능한 특수문자도 함부로 사용하는 것은 고려해야 한다.
		// 특수문자 사용 제한되어 있다보니까, 팀 내에서 어떤 정책을 만들어놓고
		// 사용하는 것이 일반적이기 때문!

		// int tel = 01012345678;
		// 숫자로만 구성되어 있더라도 0으로 시작하는 건 절대 불가!
		// 0으로 시작되게 하려면 '문자열'형태로 해주기

		String tel = "01012345678";
		// String 주소; => 한글로 하지 말기
		// 문법적으로는 한글 단어를 변수명으로 사용할 수 있지만
		// 실무적인 측면에서 접근한다면, 절대로 한글 단어를 변수명으로 사용해서는 안된다.
		String address = "서울시 마포구";

		System.out.println("tel : " + tel);
		System.out.println("address : " + address);

	}
}

// 실행 결과
/*
height = 172.8
age = 27
degree = A
name : 김정용
tel : 01012345678
address : 서울시 마포구
계속하려면 아무 키나 누르십시오 . . .
*/