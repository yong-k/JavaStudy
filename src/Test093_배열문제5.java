 /*===================
   ■■■ 배열 ■■■
=====================*/

// 배열의 배열(2차원 배열)
/*
배열의 배열(다차원 배열)을 활용하여
다음과 같은 데이터를 요소로 취하는 배열을 구성하고
그 결과를 출력하는 프로그램을 구현한다.

실행 예)
   1   2   3   4  10
   5   6   7   8  26
   9  10  11  12  42
  13  14  15  16  58
  28  32  36  40 136
계속하려면 아무 키나 누르세요...
*/

public class Test093_배열문제5
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		int n;
		int sum, colSum, rowSum;

//쌤 
/* 반복문 돌면서 변수 3개 값 누적되는 현황
1 찍을 때는 변수 3개 값 += 증가 => (0,4)(4,0)(4,4)
2 찍을 때					    => (0,4)(4,1)(4,4)
3								=> (0,4)(4,2)(4,4)
:
5 찍을 때						=> (1,4)(4,0)(4,4)
:
*/
		n = 0;
		for (int i = 0; i < arr.length - 1; i++)		// i -> 0 1 2 3 
		{
			for (int j = 0; j < arr[i].length - 1; j++)	// j -> 0 1 2 3
			{
				n++;	// 1 2 3 4 5 6 ... 16
				arr[i][j] = n;

				arr[i][arr[i].length-1] += arr[i][j];				// arr[i][4] += arr[i][j];
				arr[arr.length-1][j] += arr[i][j];					// arr[4][j] += arr[i][j];
				arr[arr.length-1][arr[i].length-1] += arr[i][j];	// arr[4][4] += arr[i][j];
			}	
		}
//나
/*
		// 1) 4*4 배열에 숫자 채우기 & (0,4)(1,4)(2,4)(3,4) & (4,4) 값 채우기
		n = 1;
		for (int i = 0; i < 4; i++)
		{
			colSum = 0;
			for (int j = 0; j < 4; j++)
			{
				arr[i][j] = n++;
				colSum += arr[i][j];
				arr[4][4] += arr[i][j];
			}
			arr[i][4] = colSum;
		}

		// 2) (4,0)(4,1)(4,2)(4,3) 값 채우기
		for (int i = 0; i < 4; i++)
		{
			rowSum = 0;
			for (int j = 0; j < 4; j++)
				rowSum += arr[j][i];
			
			arr[4][i] = rowSum;
		}
*/

		// 결과 출력
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
   1   2   3   4  10
   5   6   7   8  26
   9  10  11  12  42
  13  14  15  16  58
  28  32  36  40 136
계속하려면 아무 키나 누르십시오 . . .
*/