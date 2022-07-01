/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

// if ~ else 문 실습

/*
사용자로부터 임의의 정수 세 개를 입력받아
작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.
같은 수도 처리되어야 함

Hint)) 7 40 42
1) 첫 번째 정수 vs 두 번째 정수	  크기 비교 및 자리 바꿈
2) 첫 번째 정수 vs 세 번째 정수   크기 비교 및 자리 바꿈
3) 두 번째 정수 vs 세 번째 정수   크기 비교 및 자리 바꿈

실행 예)
첫 번째 정수 입력 : 7
두 번째 정수 입력 : 70
세 번째 정수 입력 : 42

>> 정렬 결과 : 7 42 70
계속하려면 아무 키나 누르세요...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test039
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2, num3;		//사용자 입력 정수
		int first, second, third;	//정렬 위치
		int temp;					//빈 변수

		// 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("세 번째 정수 입력 : ");
		num3 = Integer.parseInt(br.readLine());

		first = num1; 
		second = num2; 
		third = num3;

//방법1) temp 변수 활용
/*
			// 1) if 첫 번째 정수 > 두 번째 정수, 자리바꿈
		if (first > second)
		{
			temp = first;
			first = second;
			second = temp;
		}
			// 2) if 첫 번째 정수 vs 세 번째 정수, 자리바꿈
		if (first > third)
		{
			temp = first;
			first = third;
			third = temp;
		}
			// 3) if 두 번째 정수 vs 세 번째 정수, 자리바꿈
		if (second > third)
		{
			temp = second;
			second = third;
			third = temp;
		}

		// 최종 결과 출력
		System.out.printf(">> 정렬 결과 : %d %d %d\n", first, second, third);
*/
//방법2) xor 연산자 활용
			// 1) if 첫 번째 정수 > 두 번째 정수, 자리바꿈
		if (first > second)
		{
			first  = first ^ second;
			second = second ^ first;
			first  = first ^ second;
		}
			// 2) if 첫 번째 정수 vs 세 번째 정수, 자리바꿈
		if (first > third)
		{
			first = first ^ third;
			third = third ^ first;
			first = first ^ third;
		}
			// 3) if 두 번째 정수 vs 세 번째 정수, 자리바꿈
		if (second > third)
		{
			second = second ^ third;
			third  = third ^ second;
			second = second ^ third;
		}

		// 최종 결과 출력
		System.out.printf(">> 정렬 결과 : %d %d %d\n", first, second, third);
	}
}

// 실행 결과
/*
첫 번째 정수 입력 : 7
두 번째 정수 입력 : 40
세 번째 정수 입력 : 42
>> 정렬 결과 : 7 40 42
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 26
두 번째 정수 입력 : 72
세 번째 정수 입력 : 40
>> 정렬 결과 : 26 40 72
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 89
두 번째 정수 입력 : 4
세 번째 정수 입력 : 4
>> 정렬 결과 : 4 4 89
계속하려면 아무 키나 누르십시오 . . .
*/