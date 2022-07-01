/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

// 반복문(while문) 실습
/*
사용자로부터 임의의 두 정수를 입력받아
작은 수 부터 큰 수 까지의 합을 구하여
결과를 출력하는 프로그램을 구현한다.

실행 예)
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 20
>> 10 ~ 20 까지의 합 : xxx
계속하려면 아무 키나 누르세요...

첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2
>> 2 ~ 10 까지의 합 : xx
계속하려면 아무 키나 누르세요...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test054
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2;
		int sum = 0;
		int backupNum1;		//num1 값 옮겨담아 놓고 반복문 안에서 루프 변수로 활용

		// 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());

		if (num1 > num2)
		{
			num1 = num1 ^ num2;
			num2 = num2 ^ num1;
			num1 = num1 ^ num2;
		}
		
		// 반복 연산 수행
		// 반복 연산을 수행하기 전에
		// 작은 수를 따로 저장하여 루프 변수로 활용한다.
		// 결과 출력 과정에서 입력받은 작은 수가 필요한데
		// 그 수를 반복과정에서 사용하게 되면 
		// 원래의 값을 확인할 수 없기 때문에 !

		backupNum1 = num1;

		while (backupNum1 <= num2)
		{
			sum += backupNum1;
			backupNum1++;
		}

		// 결과 출력
		System.out.printf("%d ~ %d 까지의 합 : %d\n", num1, num2, sum);
	}
}

// 실행 결과
/*
첫 번째 정수 입력 : 1
두 번째 정수 입력 : 10
1 ~ 10 까지의 합 : 55
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 10
두 번째 정수 입력 : 1
1 ~ 10 까지의 합 : 55
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 2
두 번째 정수 입력 : 2
2 ~ 2 까지의 합 : 2
계속하려면 아무 키나 누르십시오 . . .
*/