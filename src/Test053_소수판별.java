/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

// 반복문(while문) 실습
/*
사용자로부터 임의의 정수를 입력받아 (BufferedReader 사용)
입력받은 정수가 소수인지 아닌지 판별하여
결과를 출력하는 프로그램을 구현한다.

- 소수: 1 또는 자기 자신의 값 이외에 어떤 수로도 나누어 떨어지지 않는 수
		단, 1은 소수 아님

실행 예)
임의의 정수 입력 : 10
10 → 소수 아님
계속하려면 아무 키나 누르세요...

임의의 정수 입력 : 11
11 → 소수
계속하려면 아무 키나 누르세요...

Hint>> 
임의의 정수 입력 : 967  했으면,
967 가지고 1~966까지 나눠보고, 나누어떨어지는 값 있으면 ==> 소수 X
	나누어 떨어지지 않으면, 대상이 1인지 아닌지 보고 ==> 1 아니면 ==> 소수 O
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053_소수판별
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//나
/*
		int inputNum;
		int n = 2;
		int count = 0;

		// 연산 및 처리 + 출력
		System.out.print("임의의 정수 입력 : ");
		inputNum = Integer.parseInt(br.readLine());

		while (n < inputNum)
		{
			if (inputNum % n == 0)
			{
				count += 1;
				break;
			}
			n++;
		}

		if (count == 0 && inputNum > 1)
			System.out.println(inputNum + " → 소수");
		else
			System.out.println(inputNum + " → 소수 아님");
*/
//쌤
		int num;
		int n = 2;
		boolean flag = true;	//--'num은 소수일 것이다' 를 기본값으로 해놓음

		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		while (n < num)
		{
			if (num % n == 0)
			{
				flag = false;
				break;
				// *** num 이 소수가 아닌게 결정되면 반복문 계속 돌 필요 없음!! ***
				// break 는 break를 감싸는 가장 가까운 반복문을 빠져나감
			}
			n++;
		}

		if (flag && num != 1)
			System.out.println(num + " → 소수");
		else
			System.out.println(num + " → 소수 아님");
	}
}

// 실행 결과
/*
임의의 정수 입력 : 10
10 → 소수 아님
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 11
11 → 소수 아님
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : -1
-1 → 소수 아님
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 1
1 → 소수 아님
계속하려면 아무 키나 누르십시오 . . .
*/