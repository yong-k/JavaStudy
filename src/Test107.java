 /*======================
   ■■■ 만년달력 ■■■
=========================*/
/*
다음과 같은 기능의 프로그램을 구현한다.

실행 예)
『연도』를 입력하세요 : 2022
『월』을 입력하세요   : 6

	  [ 2022년 6월 ]
 일  월  화  수  목  금  토
===========================
              1   2   3   4
  5   6   7   8   9  10  11
 12  13  14  15  16  17  18
 			: 
 26  27  28  29  30
===========================
계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;

public class Test107
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		Scanner sc = new Scanner(System.in);
		int year, month;
		int totalDays = 0;
		String[] days = { "일", "월", "화", "수", "목", "금", "토" };
		int[] months = { 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[][] calendar = new int[6][7];
		//int[] calendarMonth;

		// 연산 및 처리
		System.out.print("『연도』를 입력하세요 : ");
		year = sc.nextInt();
		System.out.print("『월』을 입력하세요 : ");
		month = sc.nextInt();
		
		//----윤년,평년 구별 후 months[] 에 2월 날짜 채워주기
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			months[1] = 29;
		else 
			months[1] = 28;
		
		//-- 사용자 입력 month의 day공간 갖는 배열 생성
		//0calendarMonth = new int[months[month - 1]];

		//----사용자가 입력한 month 의 1일 시작요일 알아내기
		//--1) 1년 ~ (year - 1) 까지 누적 일 수
		totalDays = (year - 1) * 365 + ((year - 1) / 4) - ((year - 1) / 100) 
					+ ((year - 1) / 400);
		
		//--2) 1월 ~ (month - 1) 까지 누적 일 수
		for (int i = 0; i < (month - 1); i++)
			totalDays += months[i];

		//--3) 거기에 +1일 해주면 year년 month월 1일이 됨
		totalDays += 1;           
		
		//요일
		//System.out.println(days[totalDays % 7]);

		// 결과 출력
		System.out.println();
		System.out.printf("\t[ %d년 %d월 ]\n", year, month);

		//----요일출력
		for (int i = 0; i < days.length; i++)
			System.out.printf("%3s", days[i]);

		System.out.println();
		System.out.println("=============================");
		
		int n = 1;
		for (int i = 0; i < calendar.length; i++)
		{
			for (int j = 0; j < calendar[i].length; j++)
			{
				if (i == 0)
				{
					calendar[i][(totalDays % 7) + j] = n++;

					if ( ((totalDays % 7) + j) != 0 && ((totalDays % 7) + j) % 6 == 0)
					break;
				}
				else
					calendar[i][j] = n++;

				if (n > months[month-1])
					break;
			}
			if (n > months[month-1])
				break;
		}

		//--달력출력
		for (int i = 0; i < calendar.length; i++)
		{
			if (i == calendar.length - 1 && calendar[i][0] == 0)
				break;

			for (int j = 0; j < calendar[i].length; j++)
			{
				if (calendar[i][j] == 0)
					System.out.print("    ");
				else
					System.out.printf("%4d", calendar[i][j]);
			}
			System.out.println();
		}

		System.out.println("=============================");


	}
}

// 실행 결과
/*
『연도』를 입력하세요 : 2022
『월』을 입력하세요 : 4

        [ 2022년 4월 ]
  일  월  화  수  목  금  토
=============================
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
=============================
계속하려면 아무 키나 누르십시오 . . .
*/