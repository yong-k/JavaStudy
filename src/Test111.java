 /*==================================
   ■■■ 정렬(Sort) 알고리즘 ■■■
====================================*/

// 향상된 버블 정렬(Bubble Sort)
/*
※ 앞에서 본 Selection Sort(Test109), Bubble Sort(Test110)의 성능은 같다.
	(→ 성능 : 반복의 횟수로 추정)
	하지만, 향상된 Bubble Sort 는 대상 데이터의 구조에 따라서
	일반 Bubble Sort 나 Selection Sort 보다 성능이 좋을 수 있다.

ex)
원본 데이터 : 61 15 20 22 30

61 15 20 22 30
== --
15 61 20 22 30
   == --
15 20 61 22 30
      == --
15 20 22 61 30
		 == --
15 20 22 30 61 
------------------- 1회전(스왑 발생했는지 확인 → true) → 다음 회전 진행 ○
15 20 22 30 61
== --
   == -- 
      == -- 
	     == --
------------------- 2회전(스왑 발생했는지 확인 → false) → 다음 회전 진행 X
==> 반복문 덜 돌 수 있음
==> 1회전 수행... 2회전 수행... 을 해봤더니
	2회전에서 스왑(자리바꿈)이 전혀 일어나지 않았기 때문에
	불필요한 추가 연산(더 이상의 회전)은 무의미한 것으로 판단하여
	수행하지 않는다.
*/

public class Test111
{
	public static void main(String[] args)
	{
		int[] a = { 10, 50, 20, 30, 40 };
		int swapCount;

		// 출력 (정렬 전)
		System.out.print("Source Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();

		// 향상된 Bubble Sort
//나
/*
		for (int i = 1; i < a.length; i++)
		{	
			swapCount = 0;
			for (int j = 0; j < a.length - 1; j++)
			{
				if (a[j] > a[j + 1])
				{
					a[j]     = a[j] ^ a[j + 1];
					a[j + 1] = a[j + 1] ^ a[j];
					a[j]     = a[j] ^ a[j + 1];

					swapCount++;	// 스왑 발생하면 count 1 증가
				}
			}
			// 회전 결과, 스왑이 발생하지 않았다면 정렬 종료
			if (swapCount == 0)	
					break;
		}
*/
//쌤
//반복문 하나로 Bubble Sort 구현해봄 (pass 변수 사용해서)
// 최소 1회전은 해봐야 함! => do~while 문에 적합한 모델

		int pass = 0;
		boolean flag;

		do
		{
			flag = false;	// [전제] 이번 회전에서는 자리 바꿈이 일어나지 않을 것이다..
			pass++;

			for (int i = 0; i <a.length-pass; i++)
			{

				if (a[i] > a[i + 1])
					{
						// 자리바꿈
						a[i]     = a[i] ^ a[i + 1];
						a[i + 1] = a[i + 1] ^ a[i];
						a[i]     = a[i] ^ a[i + 1];

						flag = true;
						//-- 단 한 번이라도 스왑(자리바꿈)이 발생하게 되면
						//	 flag 변수는 true 로 변경~!!!
					}	
			}
		}
		while (flag);
		//-- flag 변수가 false 라는 것은
		//	 회전이 구분적으로 발생하는 동안 스왑이 일어나지 않은 경우로
		//	 더 이상의 반복문 수행은 무의미한 것으로 판단 가능~!!!


		// 출력 (정렬 후)
		System.out.print("Sorted Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
	}
}

// 실행 결과
/*
Source Data : 10 50 20 30 40
Sorted Data : 10 20 30 40 50
계속하려면 아무 키나 누르십시오 . . .
*/