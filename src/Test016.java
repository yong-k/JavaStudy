/*====================================
   ■■■ 자바 기본 프로그래밍 ■■■
======================================*/

// 변수와 자료형
// 자바의 기본 입출력 : BufferedReader 클래스

// 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 이름과 총점을 출력하는 프로그램을 구현한다.

/*
실행 예)
이름을 입력하세요 :  김정용
국어 점수 입력 : 90
영어 점수 입력 : 80
수학 점수 입력 : 70

====[결과]====
이름 : 김정용
총점 :  240
계속하려면 아무 키나 누르세요...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test016
{
	public static void main(String[] args) throws IOException
	{
		String name;
		int scoreKorean, scoreEnglish, scoreMath;
		int scoreSum = 0;

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("이름을 입력하세요 : ");
		name = br.readLine();
		System.out.print("국어 점수 입력 : ");
		scoreKorean = Integer.parseInt(br.readLine());
		System.out.print("영어 점수 입력 : ");
		scoreEnglish = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 입력 : ");
		scoreMath = Integer.parseInt(br.readLine());

		scoreSum = scoreKorean + scoreEnglish + scoreMath;

		System.out.println("\n====[결과]====");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("총점 : %d\n", scoreSum);
	}
}

// 실행 결과
/*
이름을 입력하세요 : 김정용
국어 점수 입력 : 90
영어 점수 입력 : 80
수학 점수 입력 : 70

====[결과]====
이름 : 김정용
총점 : 240
계속하려면 아무 키나 누르십시오 . . .
*/