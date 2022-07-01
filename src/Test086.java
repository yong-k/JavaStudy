 /*===================
   ■■■ 배열 ■■■
=====================*/

// 배열의 기본적 활용
/*  <<<<< 과제 >>>>
사용자로부터 임의의 학생 수를 입력받고
그 만큼의 점수(정수 형태)를 입력받아
전체 학생 점수의 합, 평균, 편차를 구하여
결과를 출력하는 프로그램을 구현한다.
단, 배열을 활용하여 처리할 수 있도록 한다.

-편차 = 평균 - 점수

실행 예)
학생 수 입력 : 5
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 82
3번 학생의 점수 입력 : 64
4번 학생의 점수 입력 : 36
5번 학생의 점수 입력 : 98

>> 합   : 370
>> 평균 : 74.0
>> 편차 
90 : -16.0
82 : -8.0
64 : 10.0
36 : 38.0
98 : -24.0
계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;

public class Test086
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int studentNum;		//-- 학생 수
		int sum = 0;		//-- 합
		double avg;			//-- 평균
		
		// 사용자가 입력한 학생 수를 길이로 하는, 점수를 담을 scores[] 배열 생성
		System.out.print("학생 수 입력 : ");
		studentNum = sc.nextInt();
		
		int[] scores = new int[studentNum];
		
		// scores[] 길이만큼 반복하며 학생 점수 입력받고 배열에 저장 
		//		+ 그 값을 sum 변수에 누적시켜서 합을 구함
		for (int i = 0; i < scores.length; i++)
		{
			System.out.printf("%d번 학생의 점수 입력 : ", (i + 1));
			scores[i] = sc.nextInt();

			sum += scores[i];
		}
		
		// 평균 계산
		avg = (double)sum / studentNum;
	
		// 결과 출력
		System.out.println();
		System.out.printf(">> 합   : %d\n", sum);
		System.out.printf(">> 평균 : %.1f\n", avg);
		System.out.println(">> 편차");
		
		// scores[] 배열 돌면서 편차 계산하여 출력
		for (int i = 0; i < scores.length; i++)
			System.out.printf("%d : %.1f\n", scores[i], (avg - scores[i]));

	}
}

// 실행 결과
/*
학생 수 입력 : 5
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 82
3번 학생의 점수 입력 : 64
4번 학생의 점수 입력 : 36
5번 학생의 점수 입력 : 98

>> 합   : 370
>> 평균 : 74.0
>> 편차
90 : -16.0
82 : -8.0
64 : 10.0
36 : 38.0
98 : -24.0
계속하려면 아무 키나 누르십시오 . . .
*/