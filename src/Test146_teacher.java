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

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test146_teacher
{
	public static void main(String[] args) 
	{
		// 주요 변수 선언
		Scanner sc = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		int nalsu;			//-- 사용자로부터 입력받은 날 수
		int y, m, d, w;		//-- 연, 월, 일, 요일
		String[] week = { "일", "월", "화", "수", "목", "금", "토" };

		// 현재의 연, 월, 일, 요일 확인(가져오기 : get())
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1;	//-- 『+1』 check~!!!
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		// 현재의 연, 월, 일, 요일 확인 결과 출력
		System.out.printf("오늘 날짜 : %d-%d-%d %s요일\n", y, m, d, week[w - 1]);

		// 사용자 입력 받기
		do
		{
			System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu < 1);
	
		// check~!!!
		now.add(Calendar.DATE, nalsu);

		// 결과 출력
		System.out.println("\n===========[확인 결과]===========");

		System.out.printf("%d일 후 : %tF %tA\n", nalsu, now, now);
		//-- check~!!!
		// %tF : 연도-월-일 
		// %tA : 요일

		System.out.println("=================================");
		
	}
}

// 실행 결과
/*
오늘 날짜 : 2022-2-3 목요일
몇 일 후의 날짜를 확인하고자 하십니까? : 200

===========[확인 결과]===========
200일 후 : 2022-08-22 월요일
=================================
계속하려면 아무 키나 누르십시오 . . .
*/