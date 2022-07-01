 /*=======================================
   ■■■ 주민등록번호 유효성 검사 ■■■
=========================================*/
/*
○ 주민등록번호 검증 공식

	1) 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.
		ex) 
			123456-1234567 (주민번호)
			****** ******* ------------------------각 자릿수에 곱하기
			234567-892345  (각 자리에 곱해질 수)

	2) 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.
		ex)
			7 5 0 6 1 5 - 1 8 6 2 1 3 3
			* * * * * *   * * * * * * 
			2 3 4 5 6 7   8 9 2 3 4 5
			----------------------------
			→ 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15

				== 217

	3) 더해진 결과값을 11로 나누어 『나머지』를 취한다.
			  19 → 몫(X)
    	    ---------
		11 | 217
		     11
			 ----
			 107
			  99
			 ----
			   8 → 나머지(O)

	4) 11에서 나머지 8을 뺀 결과값을 구한다.

		11 - 8 = 3

		※ 3) 의 처리 과정에서 나머지가 0인 경우 → 11 - 0 = 11
							   나머지가 1인 경우 → 11 - 1 = 10

		   이를 다시 10으로 나누어 나머지를 취한다.		11 → 1
		   												10 → 0

	5) 4)의 연산 결과가 주민번호를 구성하는 마지막 숫자와 일치하는지의 여부를 비교한다.

		일치   → 유효한 주민번호
		불일치 → 잘못된 주민번호

실행 예)
주민번호입력(xxxxxx-xxxxxxx) : 123456-12345678		// → 입력 개수 초과된 상황
>> 입력 오류
계속하려면 아무 키나 누르세요...

주민번호입력(xxxxxx-xxxxxxx) : 123456-123456		// → 입력 개수 모자른 상황
>> 입력 오류
계속하려면 아무 키나 누르세요...

주민번호입력(xxxxxx-xxxxxxx) : 750615-1252085		// → 유효한 주민번호
>> 정확한 주민번호
계속하려면 아무 키나 누르세요...

주민번호입력(xxxxxx-xxxxxxx) : 750615-1252086		// → 유효하지 않은 주민번호
>> 잘못된 주민번호
계속하려면 아무 키나 누르세요...

※ 문제 해결을 위한 추가 팁~!!!
	배열.length						→ 배열의 길이(배열방의 개수) 반환
	문자열.length()					→ 문자열의 길이 반환
	문자열.substring(int a, int b)	→ 문자열 추출 
					--------------
					문자열의 a 번째에서 b - 1 번째까지 추출(인덱스는 0부터)
	문자열.substring(int a)			→ a부터 문자열 끝까지 추출(인덱스는 0부터)
		ex) strTemp = "ABCDEFGH";
			System.out.println(strTemp.substring(3,7));
			==> DEFG	==> 3번째부터 7-1 번째까지 뽑아냄
			System.out.println(strTemp.substring(3,57));
			==>	런타임에러. StringIndexOutOfBoundsException	==> 인덱스 안에 57 없음
*/ 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test108_teacher
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력받는 주민번호(문자열 형태)
		String str;

		// 주민번호의 각 자릿수에 곱하게 될 수 → 배열 형태로 구성
		//	          7  5  0  6  1  5  -  1  8  6  2  1  3  3
		int[] chk = { 2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5 };
		//							   ---
		//							  check~!!!

		// 곱셈 연산후 누적합 (각 곱셈의 결과를 더해 나가라...)
		// ---------   ======> 이기 때문에 0으로 초기화!!
		int tot = 0;

		System.out.print("주민번호입력(xxxxxx-xxxxxxx) : ");	// "750615-1862133"
		//Integer.parseInt(br.readLine());
		str = br.readLine();

		if (str.length() != 14)
		{
			System.out.println(">> 입력 오류");
			return;		//-- 메소드 종료 → main() 메소드 종료 → 프로그램 종료
		}

		for (int i = 0; i < 13; i++)
		{
			if (i == 6)
				continue;	//-- 뒷부분 무시하고 계속해라

			tot += chk[i] * Integer.parseInt(str.substring(i, (i + 1)));	// 뒷부분
		}

		//----------------- 여기까지 수행하면 1)과 2)를 모두 끝낸 상황이며
		//					규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한 값은
		//					변수 tot 에 담겨있는 상황이 된다.

		 int su = 11 - tot % 11;

		 //---------------- 여기까지 수행하면 3)과 4)를 모두 끝낸 상황이지만
		 //					su 에 대한 연산 결과 두 자리로 나올 경우
		 //					주민번호 마지막 자리의 숫자와 비교를 수행할 수 없는 상황

		 su %= 10;

		 if (su == Integer.parseInt(str.substring(13)))
			 System.out.println(">> 정확한 주민번호");
		 else
			System.out.println(">> 잘못된 주민번호");

	}
}

// 실행 결과
/*

*/