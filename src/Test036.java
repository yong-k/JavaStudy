/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

// if ~ else 문 실습

/*
사용자로부터 임의의 정수를 입력받아
다음과 같은 판별 결과를 출력하는 프로그램을 구현한다.

2의 배수 / 3의 배수 / 2와 3의 배수 / 2와 3의 배수 아님

실행 예)
임의의 정수 입력 : 4
4 → 2의 배수
계속하려면 아무키나 누르세요...

임의의 정수 입력 : 9
9 → 3의 배수
계속하려면 아무키나 누르세요...

임의의 정수 입력 : 6
6 → 2와 3의 배수
계속하려면 아무키나 누르세요...

임의의 정수 입력 : 17
17 → 2와 3의 배수 아님
계속하려면 아무키나 누르세요...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;
		String result;

		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		if (num % 2 == 0 && num % 3 == 0)
			result = "2와 3의 배수";
		else if (num % 2 == 0)
			result = "2의 배수";
		else if (num % 3 == 0)
			result = "3의 배수";
		else if (num % 2 != 0 && num % 3 != 0)
			result = "2와 3의 배수 아님";
		else
			result = "판정 불가";

		// 최종 결과 출력
		System.out.printf("%d → %s\n", num, result);
	}
}

// 실행 결과
/*
임의의 정수 입력 : 4
4 → 2의 배수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 9
9 → 3의 배수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 6
6 → 2와 3의 배수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 17
17 → 2와 3의 배수 아님
계속하려면 아무 키나 누르십시오 . . .
*/
