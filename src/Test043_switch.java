/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

// switch 문 실습
/*
- 다중 선택문이라 하며, switch 문 다음의 수식 값에 따라
  실행 순서를 여러 방향으로 분기할 때 사용하는 문장이다.

- 형식 및 구조
  switch(수식)
  {
		case 상수1 : 문장1; [break;]
		case 상수2 : 문장2; [break;]
	 		:
		[default : 문장n+1; [break;]]
  }

  // if 구문의 else와 마찬가지로 switch의 default도
	 반드시 있어야 하는 건 아님. 없다고 문법적 오류 아님
	 실행문에 '어디에 값을 대입한다'는 내용이 있으면 그 변수 초기화 미리 해두면 문제 없음
	 but, 초기화 안해놨는데 else, default 문 없으면 에러남

  switch 문의 <수식> 과 case의 <상수> 는 
  byte, short, int, long 형이어야 한다.

  -case 문 뒤에 break; 가 없는 형태인 경우
  다음 case 문의 문장을 계속해서(이어서) 수행하게 된다. (→ 기본 모델)
  -case 문 뒤에	break; 가 존재할 경우
  해당 지점에서 수행을 멈춘 후 switch 문을 빠져나간다.  (→ 일반 모델)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test043_switch
{
		public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;						//--이름
		int korScore, engScore, mathScore;	//--국어, 영어, 수학점수
		int total;							//--총점
		//double avg;							//--평균
		//	switch문에서 double 해결 못하니 편의상 int로 선언함
		int avg;
		char grade;							//--등급

		System.out.print("이름 입력 : ");
		name = br.readLine();
		System.out.print("국어점수 입력 : ");
		korScore = Integer.parseInt(br.readLine());
		System.out.print("영어점수 입력 : ");
		engScore = Integer.parseInt(br.readLine());
		System.out.print("수학점수 입력 : ");
		mathScore = Integer.parseInt(br.readLine());

		total = korScore + engScore + mathScore;
		avg = total / 3;
		
		switch (avg / 10)
		{
		case 10: 
		case 9 : 
			grade = 'A'; 
			break;
		case 8:	
			grade = 'B'; 
			break;
		case 7: 
			grade = 'C'; 
			break;
		case 6: 
			grade = 'D'; 
			break;
		default : 
			grade = 'F'; 
			break;
		}

		System.out.println();
		System.out.printf(">> 이름 : %s\n", name);
		System.out.printf(">> 총점 : %d점\n", total);	
		System.out.printf(">> 평균 : %d점\n", avg);	
		System.out.printf(">> 등급 : %c\n", grade);
	}
}

// 실행 결과
/*
이름 입력 : 정용
국어점수 입력 : 92
영어점수 입력 : 98
수학점수 입력 : 62

>> 이름 : 정용
>> 총점 : 252점
>> 평균 : 84점
>> 등급 : B
계속하려면 아무 키나 누르십시오 . . .
*/
