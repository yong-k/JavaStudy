 /*===================
   ■■■ 배열 ■■■
=====================*/

// 배열의 선언과 초기화
// 배열의 기본적 활용
/*
『char』 자료형의 배열을 만들어
그 배열의 각 방에 알파벳 대문자를 채우고
채워진 그 배열의 전체 요소를 출력하는 프로그램을 구현한다.
단, 채우는 구문과 출력하는 구문은 따로 분리하여 처리한다.

실행 예)
A B C D E F G H I ... W X Y Z
계속하려면 아무 키나 누르세요...
*/

public class Test083
{
	public static void main(String[] args)
	{
		 char[] alphabet = new char[26];
		 int asciiValue = 65;

		 for (int i = 0; i < alphabet.length; i++)
		 {
			 alphabet[i] = (char)asciiValue;
			 asciiValue++;
		 }
		 // asciiValue선언, asciiValue++ 증감식 for문 조건쓰는데
		 // 써도 됨

		 for (int i = 0; i < alphabet.length; i++)
			 System.out.print(alphabet[i] + " " );
		 System.out.println();
	}
}

// 실행 결과
/*
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
계속하려면 아무 키나 누르십시오 . . .
*/