/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

// if ~ else 문 실습
/* << 과제 >>
사용자로부터 임의의 문자를 하나 입력받아
대문자이면 소문자로, 소문자이면 대문자로 
알파벳이 아닌 기타 문자이면 입력오류 처리하는 프로그램을 구현한다.

실행 예)
문자 하나 입력 : A
>> A → a
계속하려면 아무 키나 누르세요...

문자 하나 입력 : b
>> b → B
계속하려면 아무 키나 누르세요...

문자 하나 입력 : 7
>> 입력 오류
계속하려면 아무 키나 누르세요...
*/

/* 생각
아스키코드
A(65)	a(97)
B(66)	b(98)
==> 32씩 차이남

대문자 => 65~90
소문자 => 97~122

[대문자면 +32, 소문자면 -32, 둘 다 아니면 그대로] char 로 출력
*/

import java.io.IOException;

public class Test042
{
		public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		int numAscii;					//--아스키번호 저장
		int changeUpper, changeLower;	//--대,소문자 변환
		int result;						//--변환결과 저장

		// 연산 및 처리
		System.out.print("문자 하나 입력 : ");
		numAscii = System.in.read();

		changeLower = numAscii + 32;	//--대문자 → 소문자
		changeUpper = numAscii - 32;	//--소문자 → 대문자
			
			// [if 대문자면 소문자로] [else if 소문자면 대문자로] [else 알파벳 아니면 입력오류 알리고 끝]
		if (numAscii >= 'A' && numAscii <= 'Z')		   
			result = changeLower;
		else if (numAscii >= 'a' && numAscii <= 'z')   
			result = changeUpper;
		else
		{
			System.out.println("입력 오류");
			return;
		}

		// 최종 결과 출력
		System.out.printf(">> %c → %c\n", numAscii, result);
	}
}

// 실행 결과
/*
문자 하나 입력 : Z
>> Z → z
계속하려면 아무 키나 누르십시오 . . .

문자 하나 입력 : y
>> y → Y
계속하려면 아무 키나 누르십시오 . . .

문자 하나 입력 : +
입력 오류
계속하려면 아무 키나 누르십시오 . . .
*/
