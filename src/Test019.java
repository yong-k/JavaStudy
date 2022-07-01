/*====================================
   ■■■ 자바 기본 프로그래밍 ■■■
======================================*/

// 자바의 기본 입출력 : java.util.Scanner

// ※ java.util.Scanner
//	단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//	디폴트(default)로 사용되는 단락문자는 공백이다.
//	작성된 다음 토큰은 next() 메소드를 사용
//	다른 형태(자료형)의 값으로 변환할 수 있다.

/*
Scanner 입력 방법

1) 
이름: 
...
나이 :
...
체중:
...

2) 이름과 나이와 체중 입력 (공백 구분) : 홍길동 25 65

3) 이름과 나이와 체중 입력 (/ 구분) : 홍길동/25/65
*/

import java.util.Scanner;
//import java.io.InputStreamReader;	=> Scanner 쓰면 필요 없음
//import java.io.IOException;		=> Scanner 쓰면 필요 없음

public class Test019
{
	// Scanner 는 'throws IOException' 필요 없음
	public static void main(String[] args)
	{
		// Scanner 클래스 기반의 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		// Scanner 가 BufferedReader 보다 기능 많음
		// 성능은 BufferedReader 가 더 좋음

		// 주요 변수 선언
		String name;			//이름
		int kor, eng, math;		//국어, 영어, 수학

		// 연산 및 처리
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		// sc.next() => 문자열 형태로 받아들여옴

		System.out.print("국어 점수 입력 : ");
		//kor = Integer.parseInt(sc.next());
		//	=> 이렇게 할 필요 없음
		kor = sc.nextInt();
		//	=> Scanner 안에 nextInt(), nextDouble() 등등 메소드들 있음
		//	별도의 형 변환 과정 거칠 필요 없음

		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();

		System.out.print("수학 점수 입력 : ");
		math = sc.nextInt();
		
		System.out.println();

		// 결과 출력
		System.out.printf("이름 : %s\n", name);
		System.out.printf("총점 : %d 점\n", (kor + eng + math));

	}
}

// 실행 결과
/*
이름을 입력하세요 : 정용
국어 점수 입력 : 90
영어 점수 입력 : 80
수학 점수 입력 : 70

이름 : 정용
총점 : 240 점
계속하려면 아무 키나 누르십시오 . . .
*/