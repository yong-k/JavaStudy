/*====================================
   ■■■ 자바 기본 프로그래밍 ■■■
======================================*/

// 변수와 자료형
// 자바의 기본 입출력 : BufferedReader 클래스

// BufferedReader => 키보드 같은 장치

// 원의 반지름을 입력하세요: xxx
// >> 반지름이 xx인 원의 넓이는 ??? 이며,
// >> 반지름이 xx인 원의 둘레는 ??? 이다.
// 계속 하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		// 키보드 장착(생성)
		//	-> BufferedReader 클래스 기반의 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//-----------------------------------  --------------------- ----------
		//	 문자 입력을 읽어들이는 장치	   바이트 -> 문자 번역기  바이트 입력값

		// 주요 변수 선언
		int r;
		final double PI = 3.141592;
		double area, length;

		// 연산 및 처리
		//	1) 사용자에게 안내 메세지 출력
		System.out.print("원의 반지름을 입력하세요 : ");

		//	2) 사용자가 입력한 값을 받아와 반지름 변수 r에 담아내기
		//r = br.readline();		
		// BufferedReader의 readline() -> 문자열을 반환하므로 int r에 담을 수 없음
		// int r = "80"; 이렇게 돼서 오류남

		// Integer.parseInt()
		//	-> 숫자로 이루어진 [문자열]을 정수로 바꿔줌
		//						[문자]는 XX
		//	-> 매개변수로 넘겨받은 문자열 데이터를 정수형으로 변환
		//	   단, 이 때 넘겨받는 문자열 데이터는 숫자모양이어야 한다.
		//										  (NumberFormat)

		r = Integer.parseInt(br.readLine());
		// 사용자가 입력한 값을 BufferedReader(br)의 readLine()
		// 메소드를 활용하여 문자열 형태로 읽어들인 후
		// 그 값을 Integer.parseInt() 를 통해 숫자형(정수형)으로 변환한 후
		// 정수 형태의 반지름 변수 r에 담아내기

		//	3) 넓이 및 둘레 계산(연산)
		area = r * r * PI;
		length = r * 2 * PI;

		// 최종 결과 출력
		System.out.printf("반지름이 %d인 원의 넓이는 %.2f 이며,\n", r, area);
		System.out.printf("반지름이 %d인 원의 둘레는 %.2f 이다.\n", r, length);
	}
}

// 실행 결과
/*
원의 반지름을 입력하세요 : 45
반지름이 45인 원의 넓이는 6361.72 이며,
반지름이 45인 원의 둘레는 282.74 이다.
계속하려면 아무 키나 누르십시오 . . .
*/