 /*=======================================
   ■■■ 자바의 주요(중요) 클래스 ■■■
=========================================*/

// Calendar 클래스
/*
※ Calendar  클래스는 추상 클래스이기 때문에 객체를 생성할 수 없다.
   (추상 클래스 : 미완성된 클래스)

   Calendar ob = new Calendar();
   → 이와 같은 구문을 통해 인스턴스 생성 불가

○ Calendar 클래스 객체(인스턴스)를 생성할 수 있는 방법

   1. Calendar ob1 = Calendar.getInstance();

   2. Calendar ob2 = new GregorianCalendar();
   // 위에 문장을 보고 생각할 수 있는 것
   => GregorianCalendar 라는 클래스가 있겠구나.
   => GregorianCalendar 는 Calendar의 하위클래스겠구나
      Calendar라는 추상클래스를 상속받았겠구나
   => Calendar의 추상메소드 구현해서 본인은 abstract 꼬리표를 뗐구나
   => 업캐스팅 구문이구나
   
   ==> 현재 우리가 사용하고 있는 달력 시스템 : Gregorian력

   3. GregorianCalendar ob3 = new GregorianCalendar();

   (※ GregorianCalendar : Calendar 클래스의 하위 클래스)
*/

// 연, 월, 일, 요일을 Calendar 객체로부터 가져와서 출력

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test144
{
	public static void main(String[] args)
	{
		// Calendar 클래스 기반 인스턴스 생성
		//Calendar ob = new Calendar();	
		//--==> error: Calendar is abstract; cannot be instantiated
		Calendar rightNow = Calendar.getInstance();

		// 생성된 달력(Calendar) 인스턴스를 통해 
		// 날짜 관련 정보를 얻어낼 수 있는 메소드 → 『get()』
	
		// 오늘 날짜 : 2022년 2월 3일 목요일
		int y = rightNow.get(Calendar.YEAR);
		// YEAR => static final
		System.out.println(y);	// 2022

		int m = rightNow.get(Calendar.MONTH);
		System.out.println(m);	// 1
		//--> 배열 인덱스처럼 처리되고 있음
		// 가지고 올 때는 +1 해줘야 하고,
		// 값 넣을 때는   -1 해줘야 한다.
		m = rightNow.get(Calendar.MONTH) + 1;	//-- 『+1』 check~!!!
		System.out.println(m);	// 2

		int d = rightNow.get(Calendar.DATE);
		System.out.println(d);	// 3


		int w = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println(d);	// 5  (→ 목요일)

		// 테스트
		System.out.println(Calendar.SUNDAY);	// 1
		System.out.println(Calendar.MONDAY);	// 2
		System.out.println(Calendar.TUESDAY);	// 3
		System.out.println(Calendar.WEDNESDAY); // 4
		System.out.println(Calendar.THURSDAY);	// 5
		System.out.println(Calendar.FRIDAY);	// 6
		System.out.println(Calendar.SATURDAY);	// 7
	
		System.out.println();
		System.out.println(y + "-" + m + "-" + d + " "  + w);
		//--==> 2022-2-3 5
		
		String week = "";
		switch (w)
		{
		case 1: 
			week = "일요일"; break;
		case 2: 
			week = "월요일"; break;
		case 3: 
			week = "화요일"; break;
		case 4: 
			week = "수요일"; break;
		case 5: 
			week = "목요일"; break;
		case 6: 
			week = "금요일"; break;
		case 7: 
			week = "토요일"; break;
		}

		System.out.println(y + "-" + m + "-" + d + " "  + week);
		//--==> 2022-2-3 목요일

		System.out.println("/////////////////////////////////////////////");

		// Calendar 클래스 기반 인스턴스 생성
		Calendar rightNow2 = new GregorianCalendar();

		String[] week2 = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };

		// 달력의 날짜 세팅 → 『set()』 메소드 활용
		// 수업 수료 날짜 : 2022년 6월 20일 
		//rightNow2.set(2022, 6, 20);	//--> 이렇게 하면 7월이 됨!!! -1 해줘야 함
		rightNow2.set(2022, 5, 20);		// 6월 -- 『-1』 check~!!!

		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));	
		//--==> 2

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK) - 1]);
		//--==> 월요일

	}	
}

// 실행 결과
/*

*/