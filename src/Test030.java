/*====================================
   ■■■ 연산자 (Operator) ■■■
======================================*/

// 조건 연산자 == 삼항 연산자

/*
사용자로부터 임의의 정수를 입력받아
입력받은 정수가 양수인지, 음수인지, 0인지 구분하여
이 결과를 출력하는 프로그램을 구현한다.
단, 입력 데이터는 BufferedReader의 readLine()을 통해 넘겨받을 수 있도록 한다.
또한, 조건연산자(삼항연산자)를 활용하여 기능을 구현할 수 있도록 한다.

<<< Hint: 조건연산자 중첩 >>>
조건연산자 중첩 개수에 제한은 없음
but, 중첩했을 때, 가독성 좋지 않음,,,!
	 많이 중첩하는 건 바람직하지 않음
	 => 앞으로는 조건 연산자 써야할 때, 조건문 쓸 거임

실행 예)
임의의 정수 입력 : -12
-12 → [ 음수 ] 입니다.
계속하려면 아무 키나 누르세요...

임의의 정수 입력 : 257
257 → [ 양수 ] 입니다.
계속하려면 아무 키나 누르세요...

임의의 정수 입력 : 0
0 → [ 0 ] 입니다.
계속하려면 아무 키나 누르세요...
*/

// class 설계보다만 먼저 입력하면 되고,
// 서로의 순서는 상관없음
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		int num;
		String strResult;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		strResult = (num == 0) ? "0" : ((num > 0) ? "양수" : "음수");
		
		// 최종 결과 출력
		System.out.printf("%d → [ %s ] 입니다.\n", num, strResult);
		
	}
}

// 실행 결과
/*
임의의 정수 입력 : -12
-12 → [ 음수 ] 입니다.
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 257
257 → [ 양수 ] 입니다.
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 0
0 → [ 0 ] 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/