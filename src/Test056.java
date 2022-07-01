/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

// 반복문(while문) 실습
/*
사용자로부터 원하는 단(구구단)을 입력받아
해당하는 구구단을 출력하는 프로그램을 구현한다.
단, 1단 ~ 9단 사이의 수를 입력받은 상황이 아니라면
이에 대한 안내를 한 후 프로그램을 종료하도록 처리한다.

실행 예)
<< 1 ~ 9 사이의 정수를 입력해주세요 >>
원하는 단(구구단) 입력 : 7
7 * 1 = 7
7 * 2 = 14
	:
7 * 9 = 63
계속하려면 아무 키나 누르세요...

원하는 단(구구단) 입력 : 11
1부터 9까지의 정수만 입력이 가능합니다.
계속하려면 아무 키나 누르세요...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test056
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputNum;
		int n = 1;

		// 연산 및 처리
		System.out.println("<< 1 ~ 9 사이의 정수를 입력해주세요 >>");
		System.out.print("원하는 단(구구단) 입력 : ");
		inputNum = Integer.parseInt(br.readLine());

		if (inputNum < 1 || inputNum > 9)
		{
			System.out.println("1부터 9까지의 정수만 입력이 가능합니다.");
			System.out.println("=== 프로그램 종료 ===");
			return;
		}

		while (n <= 9)
		{
			System.out.printf("%d x %d = %d\n", inputNum, n, (inputNum * n));
			n++;
		}

		System.out.println("== 프로그램 종료 ==");
	}
}

// 실행 결과
/*
<< 1 ~ 9 사이의 정수를 입력해주세요 >>
원하는 단(구구단) 입력 : 6
6 x 1 = 6
6 x 2 = 12
6 x 3 = 18
6 x 4 = 24
6 x 5 = 30
6 x 6 = 36
6 x 7 = 42
6 x 8 = 48
6 x 9 = 54
== 프로그램 종료 ==
계속하려면 아무 키나 누르십시오 . . .

<< 1 ~ 9 사이의 정수를 입력해주세요 >>
원하는 단(구구단) 입력 : 14
1부터 9까지의 정수만 입력이 가능합니다.
=== 프로그램 종료 ===
계속하려면 아무 키나 누르십시오 . . .
*/