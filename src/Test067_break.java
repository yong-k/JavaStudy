/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

// break 실습
// break 키워드가 지니는 의미
// 멈춘다 + (그리고 빠져나간다.)
/*
다음과 같은 처리가 이루어지는 프로그램을 구현한다.
단, 입력받은 정수는 1 ~ 100 범위 안에서만 가능하도록 작성한다.

실행 예)
임의의 정수 입력 : -10

임의의 정수 입력 : 0

임의의 정수 입력 : 2022

임의의 정수 입력 : 10
>> 1 ~ 10 까지의 합 : 55
계속하시겠습니까? (Y/N) : y   ==> 대소문자 상관 x

임의의 정수 입력 : 100
>> 1 ~ 100 까지의 합 : 5050
계속하시겠습니까? (Y/N) : N
계속하려면 아무 키나 누르세요...  => 프로그램 종료
*/

import java.util.Scanner;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test067_break
{
	public static void main(String[] args) throws IOException
	{
//나

		// 주요 변수 선언 및 초기화
		Scanner sc = new Scanner(System.in);
		int inputNum, sum; char yesOrNo = 'y';

		// 연산 및 처리
		while (yesOrNo == 'y'|| yesOrNo == 'Y')
		{
			System.out.print("임의의 정수 입력 : ");
			inputNum = sc.nextInt();

			if (inputNum < 1 || inputNum > 100)	{
				System.out.println();
				continue;
			}
			
			sum = 0;

			for (int i = 1; i <= inputNum; i++)
				sum += i;

			System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", inputNum, sum);

			System.out.print("계속하시겠습니까? (Y/N) : ");
			yesOrNo = (char)System.in.read();

			System.out.println();
		}

//쌤
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, s, i;
			// n : 사용자 입력 값을 담아둘 변수
			// s : 누적합 연산 결과를 담아낼 변수
			// i : 1부터 1씩 사용자의 입력값까지 증가할 변수
		char ch;	// 프로세스를 계속 진행할지 말지의 여부를 담아둘 변수

		while (true)
		{
			do
			{
				System.out.print("\n임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n < 1 || n > 100);

			//테스트 (확인)
			//System.out.println("유효한 정수 입력 완료~!!!");

			s = 0;	//-- **누적합 변수의 초기화 위치**

			for (i = 1; i <= n; i++)
				s += i;

			System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", n, s);

			System.out.print("계속하시겠습니까? (Y/N) : ");
			ch = (char)System.in.read();	
				// y + 엔터(\r\n) 입력하게 됨
				// y 눌러서 다시 처음으로 가서 임의의 정수 입력하라고 떴는데
				// bufferedreader가 \r\n 데리고 와서 정수형태로 형변환하려고 하니까
				// 문제 생기는 것!
				// y 이외에 끝날 때는 상관없음
				// 입력 대기열에 리소스 남아있기는 하지만 프로그램 종료되면서
				// 입력 대기열에 있던 애들 그냥 휘발대고 끝남
				// but, yes 입력하면 그 남아있는 애들 데리고 와서 문제 생김

			// 그만할래 의사표현
				//보통 y, Y 가 맞는지를 확인함
				//다른키 누르면 그냥 NO 라고 받아들임 (관습)
				// [ N 또는 n 입력한 거 맞아? ]		  라고 물어보는게 아니라
				// [ Y 또는 y 입력한 거 아닌게 확실해? ]라고 물어봄
			//if (ch == 'N' || ch == 'n')

			// *** || 쓰면 안됨!!!!! ***
			// || 쓰면 => y 눌러도 Y 아니니까 false가 됨
			if (ch != 'Y' && ch != 'y')		
			{
				// 반복문을 멈추고 빠져나갈 수 있는 코드 작성 필요
				// 위와 같은 의사 표현을 했다면
				// 그동안 수행했던 반복문을 멈추고 빠져나가야 한다.
				break;	// *** 멈춘다 + 그리고 빠져나간다. ***
			}//end if

			// 엔터값(\r\n) 처리
			System.in.skip(2);

		}//end while
*/
	}//end main()
}//end class

// 실행 결과
/*
임의의 정수 입력 : -1

임의의 정수 입력 : 2020

임의의 정수 입력 : 10
>> 1 ~ 10 까지의 합 : 55
계속하시겠습니까? (Y/N) : y

임의의 정수 입력 : 100
>> 1 ~ 100 까지의 합 : 5050
계속하시겠습니까? (Y/N) : n

계속하려면 아무 키나 누르십시오 . . .
*/