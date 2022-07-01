 /*===================
   ■■■ 배열 ■■■
=====================*/

// 배열의 배열(2차원 배열)
/*		<<<< 과제 >>>>
배열의 배열(다차원 배열)을 활용하여
다음과 같은 데이터를 요소로 취하는 배열을 구성하고
그 결과를 출력하는 프로그램을 구현한다.

실행 예)
  A  
  C  B  
  D  E  F  
  J  I  H  G  
  K  L  M  N  O
계속하려면 아무 키나 누르세요...
*/

public class Test096_배열문제8
{
	public static void main(String[] args)
	{
		char[][] alphabets = new char[5][5];	// 5x5 배열 생성
		char alpA = 'A';

		// 배열에 값 채우기
		for (int i = 0; i < alphabets.length; i++)
		{
			// 직각삼각형 모양 틀에만 값 채움
			for (int j = 0; j < (i + 1); j++)
			{
				if (i % 2 == 0)		//-- i가 0, 2, 4 일 때는 알파벳 값을 차례대로 채워넣음
					alphabets[i][j] = alpA++;
				else				//-- i가    1, 3 일 때는 알파벳 값을 역순으로 채워넣음
					alphabets[i][i-j] = alpA++;
			}
		}

		// 배열 출력
		for (int i = 0; i < alphabets.length; i++)
		{
			for (int j = 0; j < alphabets[i].length; j++)
			{
				System.out.printf("%3c", alphabets[i][j]);
			}
			System.out.println();
		}
	}
}

// 실행 결과
/*
  A
  C  B
  D  E  F
  J  I  H  G
  K  L  M  N  O
계속하려면 아무 키나 누르십시오 . . .
*/