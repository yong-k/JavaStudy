/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

// if ~ else 문 실습

/*
사용자로부터 임의의 두 정수와 연산자를 입력받아
해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
단, if 조건문을 활용하여 처리할 수 있도록 하며
연산 결과는 편의상 정수 기반으로 처리될 수 있도록 한다.

실행 예)
첫 번째 정수 입력      : 10
두 번째 정수 입력      : 3
연산자 입력[ + - * / ] : +

>> 10 + 3 = 13
계속하려면 아무 키나 누르세요..
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	//내가 한 거	
		int num1, num2, result;
		char op;

		// 연산 및 처리
		System.out.print("첫 번째 정수 입력      : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력      : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.println("<< + - * / 외 문자를 입력하면 '999999999' 출력 >>");
		System.out.print("연산자 입력[ + - * / ] : ");
		op = (char)(System.in.read());
	
		//단문자일 경우에 크기비교 가능 (아스키코드 값 이용해서)
		if (op == '+')
			result = num1 + num2;
		else if (op == '-')
			result = num1 - num2;
		else if (op == '*')
			result = num1 * num2;
		else if (op == '/')
			result = num1 / num2;
		else
			result = 999999999;

		// 최종 결과 출력
		System.out.printf("%d %c %d = %d\n", num1, op, num2, result);


/*쌤이 한 거
//방법 1 : op를 char로 받아서 아스키코드로 비교 (내 방법과 동일)
//방법 2 : op를 정수로 받아서 아스키코드 번호 이용
		int num1, num2, op, result;	
		
		System.out.print("첫 번째 정수 입력      : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력      : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력[ + - * / ] : ");
		op = System.in.read();

		if (op == 43)
			result = num1 + num2;
		else if (op == 45)
			result = num1 - num2;
		else if (op == 42)
			result = num1 * num2;
		else if (op == 47)
			result = num1 / num2;
		else
			result = 999999999;

		System.out.printf("%d %c %d = %d\n", num1, op, num2, result);

//방법 3 : 출력할 때 내가 한 거 처럼 연산자 %c로 출력
		System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
		
		//위에 방법1, 2에서는 각각 조건문마다 출력문 사용했었음
		//내가 귀찮아서 입력안한거,,,ㅎ,,
*/

	}
}

// 실행 결과
/*
첫 번째 정수 입력      : 10
두 번째 정수 입력      : 3
연산자 입력[ + - * / ] : +
10 + 3 = 13
계속하려면 아무 키나 누르십시오 . . .
*/
