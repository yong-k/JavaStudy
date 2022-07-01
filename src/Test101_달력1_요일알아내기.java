 /*================================
   ■■■ 클래스와 인스턴스 ■■■
==================================*/

// 클래스 설계
// 배열 활용
// 접근제어지시자와 정보은닉
/*
사용자로부터 년, 월, 일을 입력받아
해당 날짜의 요일을 출력하는 프로그램을 구현한다.
단, 달력 클래스(Calendar)는 사용하지 않는다.
또한, 클래스의 개념을 활용하여 작성할 수 있도록 한다. (WeekDay 클래스 설계)
그리고, 배열의 개념도 적용시켜 작성할 수 있도록 한다.
접근제어지시자의 개념도 확인하여 작성할 수 있도록 한다.
최종적으로 WeekDay 클래스 설계를 통해
Test101 클래스의 main() 메소드가 정상적으로 프로그램 실행될 수 있도록 한다.

※ 1년 1월 1일 → 월요일
   1년 1월 1일 부터 며칠이 흘렀는지 계산하면 바로 요일 나옴
※ 윤년(2월: 29일),평년(2월: 28일) 도 적용
	year % 4 == 0 && year % 100 != 0 || year % 400 == 0
※ 月을 배열로

실행 예)
년 월 일 입력(공백 구분) : 2022 1 19
2022년 1월 19일 → 수요일
계속하려면 아무 키나 누르세요...

년 월 일 입력(공백 구분) : 2000 5 4 
2000년 5월 4일 → 목요일
계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;

class WeekDay2
{
	private int year, month, day, weekday;
	//private String weekDay;					//-요일

	// 1월 ~ 12월까지의 days
		// 일단 2월은 평년(28일) 기준으로 값 넣어놓음
	private int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private String[] weekDays = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };

	// 년, 월, 일 입력받음
	void input()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년 월 일 입력(공백 구분) : ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
	}

	// 1년 1월 1일부터 사용자가 입력한 날까지의 누적 일 수를 구해서
	// 그걸로 요일 구함
	String calWeekDay()
	{	
		int totalDays = 0;
		String weekDay;

		// year
		for (int i = 1; i < year; i++)
		{
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
				totalDays += 366;
			else
				totalDays += 365;
		}

		// month
		for (int i = 0; i < month - 1; i++)
			totalDays += months[i];

			// months 배열에 2월을 28일로 해놔서,
			// 만약, 사용자가 입력한 해가 윤년이고 && 입력한 달이 3월~12월 이라면,
			//		totalDays += 1; 해줘야 함
		if ( (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) && month >= 3 )
			totalDays+= 1;


		// day
		totalDays += day;

		
		// 요일 구하기
		weekDay = weekDays[(totalDays - 1) % 7];

		return weekDay;
	}

	// 출력
	void printWeekDay(String weekDay)
	{
		System.out.printf("%d년 %d월 %d일 → %s\n", year, month, day, weekDay);
	}
}

public class Test101_달력1_요일알아내기
{
	public static void main(String[] args)
	{
		WeekDay2 day = new WeekDay2();
		day.input();
		day.printWeekDay(day.calWeekDay());
	}
}

// 실행 결과
/*

*/