/*====================================
   ■■■ 자바 기본 프로그래밍 ■■■
======================================*/

// 자바의 기본 입출력 : java.util.Scanner

// ※ java.util.Scanner
//	단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//	디폴트(default)로 사용되는 단락문자는 공백이다.
//	작성된 다음 토큰은 next() 메소드를 사용
//	다른 형태(자료형)의 값으로 변환할 수 있다.

// 값 입력할 때 공백으로 안 하고 개행으로 해도 제대로 나옴
// 공백이나 개행을 통해서 구별하는 건  ==> Scanner 의 Default(기본) 서비스

import java.util.Scanner;

public class Test020
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		Scanner sc = new Scanner(System.in);
		//java.util.Scanner sc = new java.util.Scanner(System.in);
		// => import java.util.Scanner; 안써도 위에처럼 쓸 수 있음
		// but,,,,
		// 이렇게 되면 Scanner 쓸 때마다 저렇게 써줘야함,,,ㅎvㅎ,,,,
		
		String name;
		int kor, eng, math;
		int total = 0;

		// 연산 및 처리
		System.out.print("이름 국어 영어 수학 입력(공백 구분) : ");

		// - 사용자가 입력한 데이터를 각 변수에 한 번에 담아내기
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();

		// - 총점 산출
		total = kor + eng + math;

		// 결과 출력
		System.out.println();
		System.out.printf(">> 이름 : %s\n", name);
		System.out.printf(">> 총점 : %d\n", total);
	}
}

// 실행 결과
/*
이름 국어 영어 수학 입력(공백 구분) : yong 90 80 70

>> 이름 : yong
>> 총점 : 240
계속하려면 아무 키나 누르십시오 . .
*/