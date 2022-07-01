 /*==================================
   ■■■ 정렬(Sort) 알고리즘 ■■■
====================================*/

// 버블 정렬(거품 정렬, Bubble Sort)
// => 거품 서로 인접한 곳에서 계속계속 생겨남
// => 인접한 곳 비교해서 정렬
/*
실행 예)
Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
계속하려면 아무 키나 누르세요...
*/

public class Test110
{
	public static void main(String[] args)
	{
		int[] a = { 52, 42, 12, 62, 60 };
		/*
		52 42 12 62 60 
		== --
		42 52 12 62 60
		   == --
		42 12 52 62 60
		      == --
		42 12 52 62 60
				 == --
		42 12 52 60 62
		------------------------------ 1회전(가장 오른쪽의 가장 큰 수 확정)	
		42 12 52 60 62
		== --
		12 42 52 60 62
		   == --
		12 42 52 60 62
		      == --
		------------------------------ 2회전(2번째 큰 수까지 확정)
		12 42 52 60 62
		== --
		12 42 52 60 62
		   == --
		------------------------------ 3회전(3번째 큰 수까지 확정)
		12 42 52 60 62
		== --
		------------------------------ 4회전 (정렬 끝)
		*/
		// 출력 (정렬 전)
		System.out.print("Source Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();

		// Bubble Sort
//나

		for (int i = 0; i < a.length - 1; i++)
		{
			for (int j = 1; j < a.length - i; j++)
			{
				if (a[j - 1] > a[j])	// 오름차순
				{
					a[j - 1] = a[j - 1] ^ a[j];
					a[j]	 = a[j] ^ a[j - 1];
					a[j - 1] = a[j - 1] ^ a[j];
				}
			}
		}

//자료구조책
/*
		for (int i = a.length - 1; i > 0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				if (a[j] > a[j + 1])
				{
					a[j]     = a[j] ^ a[j + 1];
					a[j + 1] = a[j + 1] ^ a[j];
					a[j]     = a[j] ^ a[j + 1];
				}
			}
		}
*/
//쌤

		for (int i = 1; i < a.length; i++)	// 뒤에서 비교 대상을 하나씩 줄여주는 역할
		{
			for (int j = 0; j < a.length - i; j++)
			{
				if (a[j] > a[j + 1])
				{
					a[j]     = a[j] ^ a[j + 1];
					a[j + 1] = a[j + 1] ^ a[j];
					a[j]     = a[j] ^ a[j + 1];
				}
			}
		}

		// 출력 (정렬 후)
		System.out.print("Sorted Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
	}
}

// 실행 결과
/*
Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
계속하려면 아무 키나 누르십시오 . . .
*/