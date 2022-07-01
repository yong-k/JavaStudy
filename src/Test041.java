/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

// if ~ else 문 실습

/*  << 과제 >>
사용자로부터 임의의 알파벳 한 문자를 입력받아
이를 판별하여 입력받은 알파벳이 모음일 경우만
결과를 출력하는 프로그램을 구현한다.
단, 대소문자를 모두 적용할 수 있도록 처리한다.
또한, 알파벳 이외의 문자가 입력되었을 경우
입력 오류에 대한 내용을 사용자에게 안내해 줄 수 있도록 한다.

- 모음 아닐 경우에 그냥 별도의 안내 없이 프로그램 종료시키기

실행 예)
임의의 알파벳 한 문자 입력 : A
>> 모음 OK
계속하려면 아무 키나...

임의의 알파벳 한 문자 입력 : e
>> 모음 OK
계속하려면 아무 키나...

임의의 알파벳 한 문자 입력 : B	
계속하려면 아무 키나...

임의의 알파벳 한 문자 입력 : 1
>> 입력 오류
계속하려면 아무 키나...
*/

import java.io.IOException;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		int numAscii;	//--아스키번호 저장변수

		// 연산 및 처리 + 출력
		System.out.print("임의의 알파벳 한 문자 입력 : ");
		numAscii = System.in.read();

		if (numAscii == 'a' || numAscii == 'e' || numAscii == 'i' || numAscii == 'o' || numAscii == 'u' ||
			numAscii == 'A' || numAscii == 'E' || numAscii == 'I' || numAscii == 'O' || numAscii == 'U')
		{
			System.out.println("모음 OK");
		}
		else
		{	
			//모음이 아닌 알파벳인 경우, 그냥 프로그램 종료
			if ( (numAscii >= 'A' && numAscii <= 'Z') || (numAscii >= 'a' && numAscii <= 'z'))
				return;		
			//알파벳이 아닌 경우, 입력 오류 메세지 출력
			else
				System.out.println("입력 오류");
		}
	}
}

// 실행 결과
/*
임의의 알파벳 한 문자 입력 : E
모음 OK
계속하려면 아무 키나 누르십시오 . . .

임의의 알파벳 한 문자 입력 : i
모음 OK
계속하려면 아무 키나 누르십시오 . . .

임의의 알파벳 한 문자 입력 : q
계속하려면 아무 키나 누르십시오 . . .

임의의 알파벳 한 문자 입력 : ^
입력 오류
계속하려면 아무 키나 누르십시오 . . .
*/
