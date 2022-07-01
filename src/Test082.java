 /*===================
   ■■■ 배열 ■■■
=====================*/

// 배열의 기본적 활용
/*
임의의 정수들이 들어있는 배열의 숫자 데이터들 중
짝수인 요소만 골라서 출력하고, 3의 배수인 요소만 골라서 출력하는 
프로그램을 구현한다.

배열을 구성하는 임의의 정수 = 4 7 9 1 3 2 5 6 8

실행 예)
배열 요소 전체 출력
4 7 9 1 3 2 5 6 8
짝수 선택적 출력
4 2 6 8
3의 배수 선택적 출력
9 3 6 
계속하려면 아무 키나 누르세요...
*/

public class Test082
{
	public static void main(String[] args)
	{
// 나
/*  
		int[] arr = { 4, 7, 9, 1, 3, 2, 5, 6, 8 };
		int[] arrEven = new int[4];
		int[] arrThree = new int[3];

		int countEven = 0; 
		int countThree = 0;

		// 배열 요소 저장
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 0)
			{	
				arrEven[countEven] = arr[i];
				countEven++;
			}

			if (arr[i] % 3 == 0)
			{
				arrThree[countThree] = arr[i];
				countThree++;
			}
		}

		// 배열 요소 출력
		System.out.println("배열 요소 전체 출력");
		for (int i = 0; i < 8; i++)
		{
			System.out.printf("%d ", arr[i]);
		}

		System.out.println("\n짝수 선택적 출력");
		for (int i = 0; i < 4; i++)
		{
			System.out.printf("%d ", arrEven[i]);
		}


		System.out.println("\n3의 배수 선택적 출력");
		for (int i = 0; i < 3; i++)
		{
			System.out.printf("%d ", arrThree[i]);
		}
		System.out.println();
*/
//쌤

		// 배열 선언 및 초기화
		int[] arr = { 4, 7, 9, 1, 3, 2, 5, 6, 8 };

		System.out.println(arr);
		//==> [I@15db9742
		// ※ 일반적인 변수에 담긴 내용을 출력하는 형식(방법)으로는
		//    배열에 담긴 데이터들을 출력할 수 없다.

		// ※ 배열 arr의 길이 확인 : arr.length
		System.out.println("배열 요소 전체 출력");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("짝수 선택적 출력");
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 0)
				System.out.print(arr[i] + " ");
			
		}
		System.out.println();

		System.out.println("3의 배수 선택적 출력");
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 3 == 0)
				System.out.print(arr[i] + " " );
		}
		System.out.println();

	}
}

// 실행 결과
/*
배열 요소 전체 출력
4 7 9 1 3 2 5 6 8
짝수 선택적 출력
4 2 6 8
3의 배수 선택적 출력
9 3 6
계속하려면 아무 키나 누르십시오 . . .
*/