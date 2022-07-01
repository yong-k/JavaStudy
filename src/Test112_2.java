 /*==================================
   ■■■ 정렬(Sort) 알고리즘 ■■■
====================================*/
/*	<<< 과제 >>>
사용자로부터 여러 학생의 성적 데이터를 입력받아
점수가 높은 학생부터 낮은 순으로 등수를 부여하여
결과를 출력하는 프로그램을 구현한다.
단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

실행 예)
인원 수 입력 : 5
1) 이름 점수 입력(공백 구분) : 이아린 90
2) 이름 점수 입력(공백 구분) : 박현수 80
3) 이름 점수 입력(공백 구분) : 이지연 85
4) 이름 점수 입력(공백 구분) : 서민지 75
5) 이름 점수 입력(공백 구분) : 김민성 95

==================
  1등 김민성 95
  2등 이아린 90
  3등 이지연 85
  4등 박현수 80
  5등 서민지 75
==================
계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;

class Student
{
	String name;
	int score;
}

public class Test112_2
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		Scanner sc = new Scanner(System.in);
		int num;			//-- 사용자 입력받을 [인원 수]
		boolean flag;		//-- 향상된 버블 정렬에서 사용할 flag 변수
		Student[] std;

		// 연산 및 처리
		System.out.print("인원 수 입력 : ");
		num = sc.nextInt();
		
		//---- 입력받은 [인원 수] 길이 만큼 Student type 배열 생성
		std = new Student[num];

		// 배열길이만큼 반복문 돌며, 이름&점수 채워넣음
		for (int i = 0; i < std.length; i++)
		{
			std[i] = new Student();		//--- ***** check *****
			System.out.printf("%d) 이름 점수 입력(공백 구분) : ", i + 1);
			std[i].name  = sc.next();
			std[i].score = sc.nextInt();

			if (std[i].score < 0 || std[i].score > 100)
			{
				System.out.println("\n! 점수 입력 오류 !");
				System.out.println("=== 프로그램 종료 ===\n");
				return;
			}
		}

		// 향상된 버블 정렬
		flag = false;

		for (int i = 1; i < std.length; i++)
		{
			flag = false;

			for (int j = 0; j < std.length - i; j++)
			{
				if (std[j].score < std[j + 1].score)
				{
					// String 에는 XOR 연산자(^) 사용 불가
					// => Student type 의 temp 사용해서 한 번에 자리바꿈
					Student temp = new Student();

					temp = std[j];
					std[j] = std[j + 1];
					std[j + 1] = temp;
				}
			}

			if (flag == true)
				break;
		}


		// 결과 출력
		System.out.println();
		System.out.println("==================");
		
		for (int i = 0; i < std.length; i++)
			System.out.printf("  %d등 %s %d\n", (i + 1), std[i].name, std[i].score);

		System.out.println("==================");

	}
}

// 실행 결과
/*
인원 수 입력 : 5
1) 이름 점수 입력(공백 구분) : aaa 72
2) 이름 점수 입력(공백 구분) : bbb 54
3) 이름 점수 입력(공백 구분) : ccc 99
4) 이름 점수 입력(공백 구분) : ddd 24
5) 이름 점수 입력(공백 구분) : eee 32

==================
  1등 ccc 99
  2등 aaa 72
  3등 bbb 54
  4등 eee 32
  5등 ddd 24
==================
계속하려면 아무 키나 누르십시오 . . .
*/