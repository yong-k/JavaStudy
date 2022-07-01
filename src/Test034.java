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
정수를 입력받아 홀수/짝수 판별하는 프로그램을 구현한다.
단, 단일 if 구문을 사용한다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;
		String result;

		// 연산 및 처리
		System.out.print("숫자 하나 입력 : ");
		num = Integer.parseInt(br.readLine());

		if (num % 2 == 0)
			result = "짝수";
		else
			result = "홀수";

/* 쌤이 원했던 단일 if 구문 사용
		if (num % 2 == 0)
			result = "짝수";
		
		if (num %2 != 0)
			result = "홀수";
*/

		// 최종 결과 출력
		System.out.printf("[[결과]] %d → %s\n", num, result);
	}
}

// 실행 결과
/*
숫자 하나 입력 : 1
[[결과]] 1 → 홀수
계속하려면 아무 키나 누르십시오 . . .

숫자 하나 입력 : 82
[[결과]] 82 → 짝수
계속하려면 아무 키나 누르십시오 . . .
*/