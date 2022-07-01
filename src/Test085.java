 /*===================
   ■■■ 배열 ■■■
=====================*/

// 배열의 기본적 활용
/*  <<<<< 과제 >>>>
사용자로부터 임의의 정수를 임의의 개수만큼 입력받아
입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 작성한다.
단, 배열을 활용하여 구현할 수 있도록 한다.

실행 예)
입력할 데이터의 개수   : 12  
데이터 입력(공백 구분) : 74 65 13 91 5 67 33 41 2 50 11 38
>> 가장 큰 수 → 91
계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;

public class Test085
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;		//-- 입력할 데이터 개수
		int maxValue;	//-- 최댓값 저장

		// 사용자에게 입력받은 개수를 길이로 하는, int타입 arr[] 배열 생성
		System.out.print("입력할 데이터의 개수   : ");
		num = sc.nextInt();
		int arr[] = new int[num];

		// arr[] 의 길이만큼 반복문 돌면서 입력받은 데이터를 배열에 넣음
		System.out.print("데이터 입력(공백 구분) : ");
		for (int i = 0; i < arr.length; i++) 
			arr[i] = sc.nextInt();

		// 최댓값 구하기
		maxValue = arr[0];
		for (int i = 0; i < arr.length; i++)
			if (maxValue < arr[i])	maxValue = arr[i];

		// 최종 결과 출력
		System.out.printf(">> 가장 큰 수 → %d\n", maxValue);
	}
}

// 실행 결과
/*
입력할 데이터의 개수   : 12
데이터 입력(공백 구분) : 74 65 13 91 5 67 33 41 2 50 11 38
>> 가장 큰 수 → 91
계속하려면 아무 키나 누르십시오 . . .
*/ 