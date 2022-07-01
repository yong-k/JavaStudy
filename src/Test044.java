/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

// switch 문 실습
/*
사용자로부터 1부터 3까지의 정수 중 하나를 입력받아
입력받은 정수만큼의 별문자(★)가 출력되는 프로그램을 작성한다.
단, 두 가지 방법으로 구현할 수 있도록 한다.

1) swtich 문의 일반 모델을 사용
2) swtich 문의 기본 모델을 사용하되, break를 딱 한 번만 사용할 수 있도록 구성

실행 예)
임의의 정수 입력 (1~3) : 3
★★★
계속하려면 아무 키나...

임의의 정수 입력 (1~3) : 1
★
계속하려면 아무 키나...

임의의 정수 입력 (1~3) : 7
xxx입력 오류xxx
계속하려면 아무 키나...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test044
{
		public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int num;

		// 연산 및 처리
		System.out.print("임의의 정수 입력 (1~3) : ");
		num = Integer.parseInt(br.readLine());

		String printStar = "";

// 1) swtich 문의 일반 모델을 사용
		System.out.println("\n<<< 1) swtich 문의 일반 모델을 사용 >>>");

		switch (num)
		{	
		case 3: printStar += "★";
		case 2: printStar += "★";
		case 1: printStar += "★";	break;
		default: printStar = "xxx입력 오류xxx"; break;
		}
		System.out.println(printStar);
		System.out.println();

		//쌤
/*		switch (num)
		{	
		case 1: System.out.println("★"); break;
		case 2: System.out.println("★★"); break;
		case 3: System.out.println("★★★"); break;
		default: System.out.println("xxx입력 오류xxx"); break;
		}
*/
// 2) swtich 문의 기본 모델을 사용하되, break를 딱 한 번만 사용할 수 있도록 구성
		System.out.println("\n<<< 2) swtich 문의 기본 모델을 사용(break를 한 번만 사용) >>>");

		printStar = "";

		switch (num)
		{
		default : printStar = "xxx입력 오류xxx"; break;
		case 3: printStar += "★";
		case 2: printStar += "★";
		case 1: printStar += "★";	
		}
		
		System.out.println(printStar);
		System.out.println();
		
	}
}

// 실행 결과
/*

*/