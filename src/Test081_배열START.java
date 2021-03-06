 /*===================
   ■■■ 배열 ■■■
=====================*/

// 배열 선언과 초기화
/*
- 배열 : 참조타입 
		 따라가보면 값이 있는게 아니라, 주소값이 들어있음

- 배열	1) 동질성격 데이터로 구성
		2) 길이 변화 불가
		   => 배열은 첫번째 주소만 가지고 있고, 그 뒤로 연결된 구조라
		      뒤에 바로 다른 자료가 있을 수 있으므로 길이 조절이 원래 불가
		=> 가변배열 있음
			if, 길이 4 짜리 만들었다가 6 짜리로 늘려서 쓰는거면
		=> [0] [1] [2] [3] ==다른 자료=== 
		   ====다른 자료=================
		   === [0] [1] [2] [3] [4] [5] [6]
		=> 이런식으로 그냥 새로운 곳에 공간 잡아서 거기의 [0]번에 주소 참조하는 것
		=> 가비지 컬렉터가 돌면서 원래 있던 거는 수거해감
		=> 원래 있던 곳 뒤에 자리를 늘리는 게 아님
		=> 사용자에게는 그냥 길이가 변하는 것처럼 느껴지는 것

- 배열의 개요

	1. 배열이란 크기와 성격이 같은 일련의 원소들이 모여
	   공동의 집합 구조를 갖는 자료의 집합체를 의미하는 것으로
	   『동질적인 성격을 가진 자료들』에 대해
	   개별적인 자료형(Data Type)을 부여하지 않고
	   하나의 이름을 가지고 일괄적으로 처리할 목적으로 사용된다.

	2. 자바에서의 배열은 다음과 같은 순서에 의해 사용된다.
	   배열 선언 → 배열에 메모리 할당 → 배열 요소 접근(배열 요소의 사용)

- 형식 및 구조
  
  자료형[] 변수명;
  변수명 = new 자료형[요소크기];
  변수명[인덱스] = 값;

  int[] arr;
  
  int arr[];
  arr = new int[3];
  ==> int arr[] = new int[3];

  arr[0] = 10;
  arr[1] = 20;
  arr[2] = 30;

  main(String[] args)
  main(String args[])
  => 둘 다 가능
*/

public class Test081_배열START
{
	public static void main(String[] args)
	{
		// 배열 선언
		int[] arr;

		// 메모리 할당
		arr = new int[10];

		// 배열은 다음과 같이 선언과 동시에 메모리 할당 및 초기화가 가능하다.
		int[] arr2 = new int[10];
		int[] arr3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }; 
		int arr4[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }; 

		// 배열 요소 접근(사용)
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		// ※ 값을 할당하지 않은 나머지 배열 공간은 자동으로 초기화된다.
		//		→ 0 (int형 배열)
		System.out.println(arr[3]);		// 0

		int num = 10;
		System.out.println("num : " + num);		// num : 10

		System.out.println("arr : " + arr);		// arr : [I@15db9742
		// 자바는 주소값을 알려주지 않음. 오픈하지 않음
		// 메모리의 주소값 아님
		// 배열을 출력하기 위해 배열변수를 일반 변수처럼 사용하여
		// 출력하는 구문으로 작성하게 되면
		// 배열의 각 방에 들어있는 데이터가 출력되는 것이 아니라
		// 우리가 알아볼 수 없는 코드가 출력된다.
		// (자바는 메모리 주소값에 사용자가 직접 접근하는 것을 허용하지 않기 때문에)

		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		System.out.println("arr[2] : " + arr[2]);

		System.out.println();
		// 반복문을 활용하여 배열에 담긴 데이터 전체 출력
		for (int i = 0; i < 10; i++)
		{
			System.out.printf("arr[%d] : %d\n", i, arr[i]); 
		}
		System.out.println();
	}
}

// 실행 결과
/*
0
num : 10
arr : [I@15db9742
arr[0] : 1
arr[1] : 2
arr[2] : 3

arr[0] : 1
arr[1] : 2
arr[2] : 3
arr[3] : 0
arr[4] : 0
arr[5] : 0
arr[6] : 0
arr[7] : 0
arr[8] : 0
arr[9] : 0

계속하려면 아무 키나 누르십시오 . . .
*/