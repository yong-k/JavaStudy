 /*===================
   ■■■ 배열 ■■■
=====================*/

// 배열과 난수 처리 (※ Random 클래스 활용)
/*
사용자로부터 임의의 정수를 입력받아
그 정수의 개수만큼 난수(1~100)를 발생시켜 매열에 담고
배열에 담겨있는 데이터들 중
가장 큰 값과 가장 작은 값을 선택하여 
결과를 출력하는 프로그램을 구현한다.

실행 예)
발생시킬 난수의 개수 입력 : 10
(50 7 24 81 72 45 61 38 1 99 → 무작위로 발생한 정수들...)
(int[] arr = { 50, 7, 24, 81, 72, 45, 61, 38, 1, 99 }; → 배열에 담아내기 (배열 구성))

>> 가장 큰 값 : 99
>> 가장 작은 값 :1
계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;
import java.util.Random;

public class Test097_random난수
{
	public static void main(String[] args)
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		// 안내 메세지 출력
		System.out.print("발생시킬 난수의 개수 입력 : ");
		int size = sc.nextInt();

		// size 변수에 담아낸 수 만큼의 배열 방 만들기
		// (배열 선언 및 메모리 할당)
		int[] arr = new int[size];

		// 무작위 정수(난수)를 발생시키기 위해서는
		// 난수 발생 전용 객체가 필요하다.
		// → 『java.util.Random』
		Random rd = new Random();

		// ※ Random 클래스의 『nextInt()』 메소드
		//	  0 ~ 매개변수로 넘겨받은 정수 n-1 까지의 수 중
		//    무작위 정수(난수) 1개를 발생시킨다.

		//rd.nextInt(10);		// 0 ~ 9 중 난수 1개 발생

		// 테스트
		//System.out.println("발생한 난수 : " + rd.nextInt(10));
		// 0 ~ 9 까지의 범위 내에서 무작위 정수 한 개 발생~!!!

		// 배열 구성
		for (int i = 0; i < arr.length; i++)
		{
			//우리가 원하는 난수 : 1 ~ 100
			//rd.nextInt(101);		// 0 ~ 100 난수 발생
			arr[i] = rd.nextInt(100) + 1;	// (0 ~ 99 난수 발생) + 1
		}
		//-- rd.nextInt(100)		→ 0 ~  99 까지의 난수 한 개 발생
		//-- rd.nextInt(100) + 1;	→ 1 ~ 100 까지의 난수 한 개 발생

		// 테스트 → 구성된 배열의 전체 요소 출력

		for (int i = 0; i < arr.length; i++)
		{
			System.out.printf("%d  ", arr[i]);
		}
		System.out.println();

		// 가장 작은 값, 가장 큰 값 출력
		int minValue = arr[0];
		int maxValue = arr[0];

		for (int i = 0; i < arr.length; i++)
		{
			if (minValue > arr[i])
				minValue = arr[i];

			if (maxValue < arr[i])
				maxValue = arr[i];
		}
		
		System.out.println();
		System.out.printf(">> 가장 작은 값 : %d\n", minValue);
		System.out.printf(">> 가장   큰 값 : %d\n", maxValue);
	}
}

// 실행 결과
/*
발생시킬 난수의 개수 입력 : 10
78  86  70  53  53  14  83  44  27  66

>> 가장 작은 값 : 14
>> 가장   큰 값 : 86
계속하려면 아무 키나 누르십시오 . . .


발생시킬 난수의 개수 입력 : 10
10  35  38  53  78  98  21  68  63  53

>> 가장 작은 값 : 10
>> 가장   큰 값 : 98
계속하려면 아무 키나 누르십시오 . . .
*/