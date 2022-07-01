 /*=================================
   ■■■ 클래스와 인스턴스 ■■■
===================================*/

// ※ Test073.java 파일과 세트 ※

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest
{
	// 멤버 변수 → 주요 속성(데이터)
	int r;							// 반지름
	final double PI = 3.141592;		// 원주율 (변수의 상수화)

	// 멤버 메소드 → 주요 기능(동작, 행위)

	// 반지름 입력 기능 → 메소드 정의
	void input() throws IOException
		// input() 을 호출하는 메소드에 폭탄을(IOException) 던지게(떠넘기게) 됨
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}

	// 넓이 계산 기능 → 메소드 정의
	double calCircleArea()
	{
		double circleArea = r * r * PI;

		return circleArea;
	}
	
	// 둘레 계산 기능 → 메소드 정의
	double calCircleLength()
	{
		double circleLength = r * 2 * PI;

		return circleLength;
	}

	// 결과 출력 → 메소드 정의
	void print(double circleArea, double circleLength)
	{
		System.out.println();
		System.out.printf(">> 반지름이 %d인 원의\n", r);
		System.out.printf(">> 넓이 : %.2f\n", circleArea);
		System.out.printf(">> 둘레 : %.2f\n", circleLength);
	}
}