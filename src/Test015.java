/*====================================
   ■■■ 자바 기본 프로그래밍 ■■■
======================================*/

// 퀴즈
// 삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
// 이 삼각형의 넓이를 구하는 프로그램을 구현한다.

// 실행 예시)
// ■ 삼각형의 넓이 구하기 ■
// - 삼각형의 밑변 입력 : 3
// - 삼각형의 높이 입력 : 5

// >> 밑변이 3, 높이가 5인 삼각형의 넓이 : xxx
// 계속하려면 아무 키나...

// *문제 인식 및 분석
// 삼각형의 넓이 = 밑변 * 높이 / 2
// 사용자로부터 데이터를 입력 받아서 처리 -> BufferedReader 활용

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 위에 3개 다 io 안에 있는 거 쓰는거니까
//import java.io.*;
// 이렇게 써도 가능은 하지만, 3개 다 그냥 쓰는 걸 권장함
// import java.io.*;로 하면 io 패키지 안에 있는 3개 말고도 다른 것도 다 열람해야하니까..

public class Test015
{
	public static void main(String[] args) throws IOException
	{
		int bottomLine, height;
		double area;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("■ 삼각형의 넓이 구하기 ■");

		System.out.print("- 삼각형의 밑변 입력 : ");
		bottomLine = Integer.parseInt(br.readLine());
		
		System.out.print("- 삼각형의 높이 입력 : ");
		height = Integer.parseInt(br.readLine());

		area = bottomLine * height / 2.0;	// check해두기 ***
		// area = (double)(bottomLine * height / 2);	=> (X)
		//		=> 이미 정수기반으로 계산완료 된 걸 실수로만 바꿔주는 거,,
		// area = (double)bottomLine * height / 2;		=> (O)
		// area = bottomLine * (double)height / 2;		=> (O)
		
		/*
		실수 기반 자료형이 결과 값으로 나오는 과정에서 
		실수 기반의 연산이 필요한 상황이다.
		정수형 2 가 아닌, 실수형 2.0 으로 나눗셈 연산을 수행하게 되면
		이 연산은 실수 기반으로 처리된다.
		*/

		System.out.printf("\n>>밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f\n", 
			bottomLine, height, area);

		// System.out.print(); ==> 에러남
		// System.out.println(); ==> 개행
	}
}

// 실행 결과
/*
■ 삼각형의 넓이 구하기 ■
- 삼각형의 밑변 입력 : 3
- 삼각형의 높이 입력 : 5

>>밑변이 3, 높이가 5인 삼각형의 넓이 : 7.50
계속하려면 아무 키나 누르십시오 . . .
*/