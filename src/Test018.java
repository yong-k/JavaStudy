/*====================================
   ■■■ 자바 기본 프로그래밍 ■■■
======================================*/

// 자바의 기본 입출력 : System.out.printf()

public class Test018
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");

		System.out.println();	// 개행
		//System.out.print();	
		// ==> 에러 발생 (컴파일 에러)

		System.out.printf("1234567890");
		System.out.printf("1234567890\n");	// \n => 개행
		System.out.printf("123456789%n");	// printf 에서는 %n도 개행

		//System.out.printf();
		// ==> 에러 발생 (컴파일 에러)

		System.out.printf("%d + %d = %d\n", 10, 20, 30);

		System.out.printf("%d\n", 123);
		System.out.printf("%10d\n", 123);
		// %10d => 자리 10칸 확보하고, 끝에부터 채움
		// (%10d, 123) => 자리 10칸 확보. 앞에 7칸 공백, 나머지 3칸 숫자 채움
		System.out.printf("%8d\n", 1234);
		System.out.printf("%010d\n", 123);
		// %010d => 자리 10칸 확보하고, 끝에부터 채움. 공백은 0으로 채움
		// (%10d, 123) => 자리 10칸 확보. 앞에 7칸 공백 0으로 채움, 나머지 3칸 숫자 채움

		// 둘 다 양수 +365로 나옴
		System.out.printf("%+d\n", 365);	// 문법적으로는 이게 더 맞음
		System.out.printf("+%d\n", 365);	// 시각적 인지로는 이게 더 잘 됨

		System.out.printf("%d\n", -365);	// -365 로 나오지만
		System.out.printf("%d\n", +365);	// 365로 + 생략되서 나옴
		// 양수인 거 강조하고 싶을 때는 +%d, %+d 로 쓰면 됨

		//System.out.printf("%-d\n", 365);	
			// => 음수는 %-d 로 쓰면 에러남
		System.out.printf("-%d\n", 365);

		//System.out.printf("%d\n", 'A');
		// ==> 에러 발생 (런타임 에러)
		// 문자는 %d 말고 %c 에 담아서 써야 함
		System.out.printf("%c\n", 'A');

		//System.out.printf("%c\n", "ABCD");
		// ==> 에러 발생 (런타임 에러)
		// 문자열은 %c 말고 %s 에 담아서 써야 함
		System.out.printf("%s\n", "ABCD");

		System.out.printf("%h\n", 365);		// h => HEX (16진수)
		System.out.printf("%o\n", 24);		// o => OCT (8진수)

		//System.out.printf("%d\n", true);
		//System.out.printf("%d\n", false);
		// => true, false 는 boolean 형이기 때문에 에러남 => %b 에 담아야 함
		System.out.printf("%b\n", true);
		System.out.printf("%b\n", false);

		System.out.printf("%f\n", 123.23);
		System.out.printf("%.2f\n", 123.23);
		// 반올림 발생함
		System.out.printf("%.2f\n", 123.231);	// 123.23
		System.out.printf("%.2f\n", 123.235);	// 123.24

		System.out.printf("%8.2f\n", 123.236);
		// 전체 공간 8칸 확보
		// 소수점도 한 자리 차지함
		// 소수점 이하 2자리 까지 반올림 돼서 출력 => 123.24
		// %8.2f => 자리 8칸 확보. 앞에 2칸 공백, 나머지 6칸 숫자 채움
		System.out.printf("%2.2f\n", 123.236);
		// **내가 표현해야하는 데이터보다 공간 적게 잡으면 그냥 무시됨
		// 잘리거나 그러는 거 아니고 무시됨

	}
}

// 실행 결과
/*
AAABBBCCC

12345678901234567890
123456789
10 + 20 = 30
123
       123
    1234
0000000123
+365
+365
-365
365
-365
A
ABCD
16d
30
true
false
123.230000
123.23
123.23
123.24
  123.24
123.24
계속하려면 아무 키나 누르십시오 . . .
*/