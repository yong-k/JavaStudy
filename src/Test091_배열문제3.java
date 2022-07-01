 /*===================
   ■■■ 배열 ■■■
=====================*/

// 배열의 배열(2차원 배열)
/*
배열의 배열(다차원 배열)을 활용하여
다음과 같은 데이터를 요소로 취하는 배열을 구성하고
그 결과를 출력하는 프로그램을 구현한다.

실행 예)
  1  8  9 16 17
  2  7 10 15 18
  3  6 11 14 19
  4  5 12 13 20
계속하려면 아무 키나 누르세요...
*/

public class Test091_배열문제3
{
	public static void main(String[] args)
	{
		int[][] arr = new int[4][5];
		int n = 1;
		
// 나
/*
		for (int i = 0; i < 5; i++)
		{
			if (i % 2 == 0)
			{
				for (int j = 0; j < 4; j++)		
					arr[j][i] = n++;
			}
			else
			{
				for (int j = 3; j >= 0; j--)
				{
					arr[j][i] = n++;
				}
			}
		}
*/
//쌤
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				if (i % 2 == 0)
					arr[j][i] = n++;
				else
					arr[3-j][i] = n++;
			}
		}
			
		// 출력 부분
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
}

// 실행 결과
/*
   1   8   9  16  17
   2   7  10  15  18
   3   6  11  14  19
   4   5  12  13  20
계속하려면 아무 키나 누르십시오 . . .
*/