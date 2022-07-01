 /*=======================================
   ■■■ 자바의 주요(중요) 클래스 ■■■
=========================================*/

// Calendar 클래스
/*
○ 실습 문제
   오늘을 기준으로 입력받는 날짜만큼 후의 연, 월, 일, 요일을
   확인하여 결과를 출력하는 프로그램을 구현한다.

   ※ 현재 날짜를 기준으로 날 수 더하는 연산 메소드 활용
      → API 에서 찾아보기 

   실행 예)
   오늘 날짜 : 2022-2-3 목요일
   몇 일 후의 날짜를 확인하고자 하십니까? : 200

   ===========[확인 결과]===========
   200일 후 : XXXX-X-X X요일
   =================================
   계속하려면 아무 키나 누르세요...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test146
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Calendar cal = new GregorianCalendar();
		String[] week = { "일", "월", "화", "수", "목", "금", "토" };
		int dayAfter;	//-- 사용자 입력 일 수

	
		// 오늘 날짜 출력
		System.out.printf("오늘 날짜 : %d-%d-%d %s요일\n", 
			cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1,
			cal.get(Calendar.DATE), week[cal.get(Calendar.DAY_OF_WEEK) - 1]);

		// 사용자 입력 받기
		System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
		dayAfter = Integer.parseInt(br.readLine());
	
		// 오늘 날짜 + 사용자입력 일 
		cal.add(Calendar.DATE, dayAfter);

		// 결과 출력
		System.out.println("\n===========[확인 결과]===========");

		System.out.printf("%d일 후 : %d-%d-%d %s요일\n", dayAfter, 
			cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1,
			cal.get(Calendar.DATE), week[cal.get(Calendar.DAY_OF_WEEK) - 1]);

		System.out.println("=================================");
		
	}
}

// 실행 결과
/*
오늘 날짜 : 2022-2-3 목요일
몇 일 후의 날짜를 확인하고자 하십니까? : 200

===========[확인 결과]===========
200일 후 : 2022-8-22 월요일
=================================
계속하려면 아무 키나 누르십시오 . . .
*/