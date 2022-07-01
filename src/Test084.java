 /*===================
   ■■■ 배열 ■■■
=====================*/

// 배열의 선언과 초기화
// 배열의 기본적 활용
/*
사용자로부터 인원수를 입력받고
입력받은 인원 수 만큼의 학생 이름과 전화번호를 입력받고
이를 이름 배열과 전화번호 배열로 구성하여
결과를 출력할 수 있는 프로그램을 구현한다.

실행 예)
입력 처리할 학생 수 입력[(명), 1~10] : 27
입력 처리할 학생 수 입력[(명), 1~10] : -5
입력 처리할 학생 수 입력[(명), 1~10] : 3
이름 전화번호 입력[1](공백 구분) : 박현수 010-1111-1111
이름 전화번호 입력[2](공백 구분) : 신시은 010-2222-2222
이름 전화번호 입력[3](공백 구분) : 오이삭 010-3333-3333

---------------------------------------------------------
전체 학생 수 : 3명
----------------------
----------------------
이름	전화번호
박현수	010-1111-1111
신시은	010-2222-2222
오이삭	010-3333-3333
----------------------
계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;

public class Test084
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
//나
/*
		int studentNum = 0;				// 입력 처리할 학생 수
		String[] studentName = null;	// 이름 배열 생성
		String[] studentPhone = null;	// 전화번호 배열 생성
		int count = 1;					// while 반복문 끝낼 조건

		
		while (count != 0)
		{
			System.out.print("입력 처리할 학생 수 입력[(명), 1~10] : ");
			studentNum = sc.nextInt();

			if (studentNum < 1 || studentNum > 10)	
				continue;
			
			count = studentNum;
			studentName = new String[studentNum];
			studentPhone = new String[studentNum];

			for (int i = 0; i < studentNum; i++, count--)
			{
				System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", i);
				studentName[i] = sc.next();
				studentPhone[i] = sc.next();
			}
		}
		
		System.out.println("---------------------------------------------------------");
		System.out.printf("전체 학생 수 : %d명\n", studentNum);
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("이름	전화번호");
	
		for (int i = 0; i < studentNum; i++)
		{
			System.out.printf("%s\t", studentName[i + 1]);
			System.out.printf("%s\n", studentPhone[i + 1]);
		}

		System.out.println("----------------------");
*/
//쌤	
		// 사용자가 입력하는 학생 수
		int memberCount;
		
		do
		{
			System.out.print("입력 처리할 학생 수 입력[(명), 1~10] : ");
			memberCount = sc.nextInt();
		}
		while (memberCount < 1 || memberCount > 10);

		// 인원 수 만큼의 이름 저장 배열 구성
		String[] names = new String[memberCount];

		// 인원 수 만큼의 전화번호 저장 배열 구성
		String[] tels = new String[names.length];

		// 인원 수 만큼의 안내 메세지 출력 및 입력값 담아내기
		for (int i = 0; i < memberCount; i++)
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", (i + 1));
			names[i] = sc.next();
			tels[i] = sc.next();
		}

		// 최종 결과(이름, 전화번호) 출력
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.printf("전체 학생 수 : %d명\n", memberCount);
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("이름	전화번호");
	
		for (int i = 0; i < memberCount; i++)
			System.out.printf("%s\t%s\n", names[i], tels[i]);

		System.out.println("----------------------");
	}
}

// 실행 결과
/*
입력 처리할 학생 수 입력[(명), 1~10] : 100
입력 처리할 학생 수 입력[(명), 1~10] : -3
입력 처리할 학생 수 입력[(명), 1~10] : 3
이름 전화번호 입력[1](공백 구분) : 박현수 010-1111-1111
이름 전화번호 입력[2](공백 구분) : 신시은 010-2222-2222
이름 전화번호 입력[3](공백 구분) : 오이삭 010-3333-3333

---------------------------------------------------------
전체 학생 수 : 3명
----------------------
----------------------
이름    전화번호
박현수  010-1111-1111
신시은  010-2222-2222
오이삭  010-3333-3333
----------------------
계속하려면 아무 키나 누르십시오 . . .
*/