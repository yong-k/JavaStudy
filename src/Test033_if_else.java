/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

// if ~ else 문 실습

/*
1. 프로그램을 작성할 때 주어진 조건에 따라
   분기 방향을 정하기 위해 사용하는 제어문에는
   if문, if~else문, 조건연산자, 복합 if문(if문 중첩),

 2. if문은 if 다음의 조건이 참일 경우,
    특정 문장을 수행하고자 할 때 사용되는 구문이다.
*/

/*
사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
다음과 같은 형태로 출력하는 프로그램을 작성한다.
등급은 평균 점수를 기준으로 처리한다.

90점 ~ 100점 : A
80점 ~  89점 : B
70점 ~  79점 : C
60점 ~  69점 : D
60점 미만    : F

단, BufferedReader 의 readLine() 메소드를 통해 입력받을 수 있도록 하며,
printf() 메소드를 통해 출력할 수 있도록 구현한다.

실행 예)
이름 입력 : 김정용
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70

>> 당신의 이름은 김정용입니다.
>> 국어 점수는 90점,
>> 영어 점수는 80점,
>> 수학 점수는 70점,
>> 총점은 240점이고, 평균은 80점 입니다.
>> 등급은 B 입니다.
>> 계속하려면 아무 키나 누르세요...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033_if_else
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String name;
		int korScore, engScore, mathScore;	// 국어, 영어, 수학 점수
		double numSubject = 3.0;		// 과목 개수
		int total;			// 과목 총점
		double avg;			// 과목 평균
		char grade;			// 등급

		// 연산 및 처리
		System.out.println("<< 점수는 0 ~ 100 사이의 정수를 입력해주세요 >>");
		System.out.print("이름 입력 : ");
		name = br.readLine();
		System.out.print("국어 점수 : ");
		korScore = Integer.parseInt(br.readLine());
		System.out.print("영어 점수 : ");
		engScore = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 : ");
		mathScore = Integer.parseInt(br.readLine());

		
		total = korScore + engScore + mathScore;
		avg = total / numSubject;

		// ****
		// grade를 출력해야하기 때문에
		// grade 값을 초기화 해놓던가, else 를 명시해줘야 한다!!
		if (avg >= 90 && avg <= 100)
			grade = 'A';
		else if (avg >= 80 && avg < 90)
			grade = 'B';
		else if (avg >= 70 && avg < 80)
			grade = 'C';
		else if (avg >= 60 && avg < 70)
			grade = 'D';
		else
			grade = 'F';

		/*
		//쌤
		grade = 'F';

		if (avg >= 90)
			grade = 'A';
		else if (avg >= 80)		// 평균이 90 미만 조건 포함
			grade = 'B';
		else if (avg >= 70)		// 평균이 80 미만 조건 포함
			grade = 'C';
		else if (avg >= 60)		// 평균이 70 미만 조건 포함
			grade = 'D';
		*/

		// 최종 결과 출력
		System.out.println();
		System.out.printf(">> 당신의 이름은 %s입니다.\n", name);
		System.out.printf(">> 국어 점수는 %d점,\n", korScore);
		System.out.printf(">> 영어 점수는 %d점,\n", engScore);
		System.out.printf(">> 수학 점수는 %d점,\n", mathScore);
		System.out.printf(">> 총점은 %d점이고, 평균은 %.2f점 입니다.\n", total, avg);
		System.out.printf(">> 등급은 %c 입니다.\n", grade);
		
	}
}

// 실행 결과
/*
<< 점수는 0 ~ 100 사이의 정수를 입력해주세요 >>
이름 입력 : yong
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70

>> 당신의 이름은 yong입니다.
>> 국어 점수는 90점,
>> 영어 점수는 80점,
>> 수학 점수는 70점,
>> 총점은 240점이고, 평균은 80.00점 입니다.
>> 등급은 B 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/