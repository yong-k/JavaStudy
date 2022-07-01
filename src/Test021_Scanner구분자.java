/*====================================
   ■■■ 자바 기본 프로그래밍 ■■■
======================================*/

// 자바의 기본 입출력 : java.util.Scanner

// ※ java.util.Scanner
//	단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//	디폴트(default)로 사용되는 단락문자는 공백이다.
//	작성된 다음 토큰은 next() 메소드를 사용
//	다른 형태(자료형)의 값으로 변환할 수 있다.

import java.util.Scanner;

public class Test021_Scanner구분자
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		Scanner sc = new Scanner(System.in);	// ex1) int a = 10;
		String name;
		int kor, eng, math, total;

		// 연산 및 처리 
		System.out.print("이름,국어,영어,수학 입력 [','로 구분] : ");
		//sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");	// sc 다시 갱신함 ex1) a = 20;
		//				-----------
		//				가장 먼저 처리됨 (위에 선언한 sc는 여기서만 쓰이고 이제 새로 갱신됨)
		//              => 입력값 yong,90,80,70 들어옴
		// => sc = new Scanner(yong,90,80,70).useDelimiter("\\s*,\\s*");
		// "\\s*, \\s*" => 사실상 표현하고 싶은 건 "\s*,\s"
		// => \s*       , \s*
		// => 모든문자열, 모든문자열
		// ==> 주인공은 ',' 이다.

		/*--복습하면서 인터넷 검색
		정규식 설명
		\s   : 공백 1개
		*    : 앞의 값이 없거나 한 번 이상 나옴
		--==>> (\\s*,\\s*)
		: 처음에 공백(\s)이 없거나 한 번 이상 나온다.
		  그 다음 쉼표가 나오고
		  다시 공백(\s)이 없거나 한 번 이상 나온다.
		*/


		// "" 안에 \ 등장하면 읽어내지 않음
		// java가 자신에게 \n, \r 등 특별한 메세지를 남기려고 썼다고 생각함
		// ==> \\ 로 써야 \ 자체로 인식됨

		// ====> , 를 구분자로 sc.next() 가 받아들인 내용 잘라서 sc 덮어쓰기함
		
		// ***입력시 사이에 공백 넣으면 안 됨!

		// 그렇게 잘린 걸 변수에 각각 대입
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();

		total = kor + eng + math;

		// 결과 출력
		System.out.println();
		System.out.printf(">> 이름 : %s\n", name);
		System.out.printf(">> 총점 : %d\n", total);

	}
}

// 실행 결과
/*
이름,국어,영어,수학 입력 [','로 구분] : yong,90,80,70

>> 이름 : yong
>> 총점 : 240
계속하려면 아무 키나 누르십시오 . . .
*/