/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

// switch 문 실습

/*
사용자로부터 임의의 두 정수와 연산자를 입력받아
해당 연산자의 처리 결과를 출력하는 프로그램을 구현한다.
단, switch 문을 활용하여 처리할 수 있도록 하며,
연산 결과는 편의상 정수 형태로 처리할 수 있도록 한다.

실행 예)
첫 번째 정수 입력       : 3
두 번째 정수 입력       : 17
연산자 입력 [ + - * / ] : -

>> 3 - 17 = -14
계속하려면 아무 키나 누르세요...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test045
{
		public static void main(String[] args) throws IOException
		{
//나
/*
			// 주요 변수 선언
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int num1, num2, result = 0;
			char op;

			// 연산 및 처리
			System.out.print("첫 번째 정수 입력       : ");
			num1 = Integer.parseInt(br.readLine());
			System.out.print("두 번째 정수 입력       : ");
			num2 = Integer.parseInt(br.readLine());
			System.out.print("연산자 입력 [ + - * / ] : ");
			op = (char)(System.in.read());

			if (num2 == 0 && op == '/')	
				System.out.println("\n<<< 에러 >>> 분모 0: 나눗셈 연산 불가\n");
					
			switch (op)
			{
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2; break;
			case '/': result = num1 / num2; break;
			default: System.out.println("연산자 입력 오류"); break;
			}

			// 최종 결과 출력
			System.out.printf(">> %d %c %d = %d\n", num1, op, num2, result);
*/			
//쌤 해결방법 2개
	// 1) 연산자 int type 으로 선언
/*
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a, b, result, op;

			System.out.print("첫 번째 정수 입력       : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("두 번째 정수 입력       : ");
			b = Integer.parseInt(br.readLine());
			System.out.print("연산자 입력 [ + - * / ] : ");
			op = System.in.read();

			// 아스키코드
			// +: 43, -: 45, *: 42, /: 47
			switch (op)
			{
				case 43: result = a + b; break;
				case 45: result = a - b; break;
				case 42: result = a * b; break;
				case 47: result = a / b; break;
				default: return;	
						// return	
						//	  1. 값의 반환	
						//	  2. 메소드 종료 → main() 메소드 종료 → 프로그램 종료
 			}

			System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
				// op : int type이었는데 %c에 담았을 뿐인데, 문자로 표현되었음
		}
*/
	// 2) 연산자 char type 으로 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, result;
		char op;

		System.out.print("첫 번째 정수 입력       : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력       : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력 [ + - * / ] : ");
		op = (char)(System.in.read());

		// 초기에는 switch => byte, short, int, long type만 쓸 수 있었으나
		// jdk 업데이트 되면서 지금은
		// 그 뿐만 아니라 char, string, enum type 도 가능함
		// jdk 1.5 이면 byte, short, int, long type만 가능
		// jdk 1.6 이면 string 불가
		switch (op)
		{
			case '+': result = a + b; break;
			case '-': result = a - b; break;
			case '*': result = a * b; break;
			case '/': result = a / b; break;
			default: return;
		}

		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);

	}
}

// 실행 결과
/*
첫 번째 정수 입력       : 3
두 번째 정수 입력       : 17
연산자 입력 [ + - * / ] : -
>> 3 - 17 = -14
계속하려면 아무 키나 누르십시오 . . .


첫 번째 정수 입력       : 57
두 번째 정수 입력       : 0
연산자 입력 [ + - * / ] : /

<<< 에러 >>> 분모 0: 나눗셈 연산 불가

Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test045.main(Test045.java:52)
계속하려면 아무 키나 누르십시오 . . .
*/