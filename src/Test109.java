 /*==================================
   ■■■ 정렬(Sort) 알고리즘 ■■■
====================================*/
/*
○ 정렬
	: 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

○ 정렬의 목적
	: 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
	→ 보기 좋게... 검색하기 위함

○ 정렬의 종류
	: 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬, ....
	
○
*/
// 선택 정렬(Selection Sort)
// => 하나 기준 정해놓고 다음꺼다음꺼다음꺼~
/*
실행 예)
Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
계속하려면 아무 키나 누르세요...
*/

public class Test109
{
	public static void main(String[] args)
	{
		int[] a = { 52, 42, 12, 62, 60 };
		/*	
		52 42 12 62 60
		== --
		42 52 12 62 60
		==    --
		12 52 42 62 60
		==       --
		12 52 42 62 60
		==          --
	    ------------------------------ 1회전(가장 왼쪽의 가장 작은 수 확정)	
		12 52 42 62 60
		   == --
		12 42 52 62 60
		   ==    --
		12 42 52 62 60
		   ==       --
		------------------------------ 2회전(2번째 작은 수까지 확정)	
		12 42 52 62 60
		      == --
		12 42 52 62 60
		      ==    --
		------------------------------ 3회전(3번째 작은 수까지 확정)	
		12 42 52 62 60
				 == --
		12 42 52 60 62
		------------------------------ 4회전 (정렬 끝)
		*/
		// 출력 (정렬 전)
		System.out.print("Source Data : ");
		/*
		for (int i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.println();
		*/
		// 향상된 for문 (for each 구문)
		// => 자료구조를 몽땅 다 털어낼 때 사용
		//	반복문 어디서부터, 언제까지 돌아야되는지 상관없이
		//	순차적으로 돌면서 다~ 꺼내야할 때 사용
		// → 항상 콜론 뒤에부터 먼저 작성!!!
		//for (해당 자료구조 안에서 요소 하나 꺼냈을 때, : 자료구조)
		//     그게 어떤 데이터 타입인지  + 변수명 맘대로
		// 자료구조의 length 만큼 돌면서, 
		//	1바퀴돌고 int n에 넣고 반복문 처리, 2바퀴돌고 n에 넣고 반복문 처리~~~ ...
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
		

		// Selection Sort
		for (int i = 0; i < a.length - 1; i++)	// i 는 맨 마지막 꺼는 비교할 필요없음
		{
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[i] > a[j])	// 오름차순 정렬
				//if (a[i] < a[j])	// 내림차순 정렬
				{
					// 자리바꾸기
					a[i] = a[i] ^ a[j];
					a[j] = a[j] ^ a[i];
					a[i] = a[i] ^ a[j];
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