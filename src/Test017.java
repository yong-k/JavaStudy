/*====================================
   ■■■ 자바 기본 프로그래밍 ■■■
======================================*/

// 자바의 기본 입출력 : System.in.read()

/*
System.in.read() 메소드는 한 문자만 가져온다.
단, 입력받은 하나의 문자를 문자 그대로 가져오는 것이 아니라
ASCII Code 값으로 반환한다. 
*/

/*
실행 예)
한 문자 입력 : A
한 자리 정수 입력 : 8

입력한 문자 : A
입력한 정수 : 8
계속하려면 아무 키나....
*/

// 아스키코드
// Enter=13		0=48	A=65	a=97
import java.io.IOException;

public class Test017
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		char ch;
		char ch2; int num;

		char temp;
		
		/* 내가 한 거

		// 사용자에게 안내 메세지 출력
		System.out.print("문자 하나 입력하세요 : ");
		//ch = System.in.read();
		// System.in.read() 는 int 로 가져오기 때문에 char ch 에 들어갈 수 없음
		// int를 char로 자동 형 변환 불가
		// => 에러남
		ch = (char)System.in.read();

		System.in.read();
		System.in.read();

		// 결과 출력
		System.out.printf("입력한 문자는 [ %c ] 입니다.\n", ch);
		
		System.out.println("\n=====================================\n");
		System.out.print("한 문자 입력 : ");
		ch2 = (char)System.in.read();
		
		// 내가 인터넷에 쳐서 얻은 거
		// System.in.read(); 
		// => 엔터키를 눌러도 엔터값이 입력되기 때문에 그 값을 읽어줌으로써 없애줘야 한다.
		// 엔터: \r + \n
		// ==> System.in.read() 2개 써주면 됨
		System.in.read();
		System.in.read();

		System.out.print("한 자리 정수 입력 : ");
		num = System.in.read();
		
		System.in.read();
		System.in.read();

		System.out.println();
		System.out.printf("입력한 문자 : %c\n", ch2);
		System.out.printf("입력한 정수 : %c\n", num);
		*/

		//쌤이 한 거 
		System.out.print("한 문자 입력 : ");
		ch2 = (char)System.in.read();

		
		// 입력 대기열에 남아있는 \r 과 \n 을 스킵(건너뛰기) => System.in.skip(건너 뛸 개수);
		System.in.skip(2);
		// => 매개변수(2)에 의해 두 글자를 읽지 않고 건너뛴다. (버린다)

		// 방법 1)
		System.out.print("한 자리 정수 입력 : ");
		num = System.in.read();

		System.in.skip(2); 

		// 숫자 입력하면 그에 해당되는 아스키코드로 저장됨
		// ex)
		//	1 -> 49
		//	2 -> 50
		//	3 -> 51
		//	:
		//	9 -> 57
		
		// 입력받은 n을 48만큼 감소시켜라
		num -= 48;

		// 방법 2) 
		System.out.print("한 자리 정수 입력 : ");
		temp = (char)System.in.read();

		System.in.skip(2);

		System.out.println();
		System.out.printf("입력한 문자 : %c\n", ch2);
		System.out.printf("[알고리즘사용]입력한 정수 : %d\n", num);
		System.out.printf("[문자로 받음] 입력한 정수 : %c\n", temp);
		

	}
}

// 실행 결과
/*
// 내가 한 거
문자 하나 입력하세요 : A
입력한 문자는 [ A ] 입니다.

=====================================

한 문자 입력 : B
한 자리 정수 입력 : 5

입력한 문자 : B
입력한 정수 : 5
계속하려면 아무 키나 누르십시오 . . .
*/

/*
// 쌤이 한 거
한 문자 입력 : A
한 자리 정수 입력 : 1
한 자리 정수 입력 : 2

입력한 문자 : A
[알고리즘사용]입력한 정수 : 1
[문자로 받음] 입력한 정수 : 2
계속하려면 아무 키나 누르십시오 . . .
*/