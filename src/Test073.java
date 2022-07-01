 /*=================================
   ■■■ 클래스와 인스턴스 ■■■
===================================*/

// ※ CircleTest.java 파일과 세트 ※ 

/*
원의 넓이와 둘레 구하기
원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다.
(클래스명 : CircleTest) → CircleTest.java
BufferedReader 의 ReadLine() 사용

원의 넓이 = 반지름 * 반지름 * 3.141592
원의 둘레 = 반지름 * 2 * 3.141592

실행 예)
반지름 입력 : xx

>> 반지름이 xx 인 원의
>> 넓이 : xxx.xx
>> 둘레 : xxx.xx
계속하려면 아무 키나 누르세요...
*/

import java.io.IOException;

public class Test073
{
	public static void main(String[] args) throws IOException
	{
		// CircleTest 클래스 기반 인스턴스 생성
		// CircleTest 인스턴스 생성
		// CircleTest 객체 생성
		CircleTest circle = new CircleTest();
		// Test073 과 CircleTest 가 같은 디렉토리 안에 있어서
		// import ~~.CircleTest 없이 그냥 객체 만들 수 있음

		circle.input();
		// main() 에서 폭탄(IOException)을 갖고 있는 input()을 호출해서
		// main() 에 폭탄이 떠넘겨짐
		// ==> main() 도 폭탄 다른애한테 떠 넘길 준비 해야함
		// throws IOException 써놔야함

		double circleArea = circle.calCircleArea();
		double circleLength = circle.calCircleLength();

		circle.print(circleArea, circleLength);
	}
}

// 실행 결과
/*
반지름 입력 : 10

>> 반지름이 10인 원의
>> 넓이 : 314.16
>> 둘레 : 62.83
계속하려면 아무 키나 누르십시오 . . .
*/