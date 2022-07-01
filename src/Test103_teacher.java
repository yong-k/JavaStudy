 /*================================
   ■■■ 클래스와 인스턴스 ■■■
==================================*/

// 클래스와 인스턴스 활용
/*
학생별로 국어점수, 영어점수, 수학점수를 입력받아
총점, 평균을 계산하는 프로그램을 구현한다.
또한, 이 과정에서 배열을 적극적으로 활용할 수 있도록 한다.
클래스 설계는 다음의 가이드라인에 따라 진행할 수 있도록 한다.

프로그램을 구성하는 클래스
1. Record 클래스
	- 속성만 존재하는 클래스로 설계할 것 => 그냥 변수만 만들어라
		=> Sungjuk 클래스에서 Record를 하나의 자료형처럼 활용하게끔

2. Sungjuk 클래스
	- 인원 수를 입력받아, 입력받은 인원 수 만큼 
	  이름, 국어점수, 영어점수, 수학점수를 입력받고
	  총점과 평균을 산출하는 클래스로 설계할 것
		@ 속성: 인원수, Record 형태의 배열
		@ 기능: 인원수 입력, 상세 데이터 입력, 총점 및 평균 연산, 결과 출력

3. Test103 클래스
	- main() 메소드가 존재하는 외부 클래스로 설계할 것

실행 예)
인원 수 입력(1 ~ 100) : 102
인원 수 입력(1 ~ 100) : -10
인원 수 입력(1 ~ 100) : 3

1번째 학생의 이름 입력 : 김상기
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70

2번째 학생의 이름 입력 : 임소민
국어 점수 : 92
영어 점수 : 82
수학 점수 : 72

3번째 학생의 이름 입력 : 이연주
국어 점수 : 82
영어 점수 : 72
수학 점수 : 62

 이름   국어  영어  수학   총점  평균   석차 
김상기   90    80    70    240   xx.xx    2
임소민   92    82    72    xxx   xx.xx    1
이연주   82    72    62    xxx   xx.xx    3
계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;

// Record 객체 1개 => 학생 1명
class Record2
{
	// 학생 1명을 표현할 수 있는 속성들로 구성해라
	String name;
	//int korScore, engScore, mathScore; 3개 담을 score[] 선언
	int[] score = new int[3];	
	int tot;		//-- 전역변수라 자동으로 0으로 초기화
	double avg;	
	int rank;		//-- 클래스변수 아님,,ㅎㅎㅎㅎ!!!!
					//-- 이거 자체를 1로 초기화하는거 
					//   등수 구하는데 기능상으로 이상이 있는 건 아니지만 바람직하지 않음
					// => 새로 객체 만들면 걔는 그냥 등수를 1로 갖고 생성되는거니까
					// 기본값 0으로 놔두고 해당 메소드에서 설정해주는게 좋음
}

class Sungjuk2
{
	
	// 주요 속성 구성
	int inwon;		//-- 인원 수
	Record2[] rec;	//-- Record 배열(학생 한 명 당 Record 배열 방 한 개 활용)
					//   Record를 기반으로 생성된 객체만 담아낼 수 있는 배열
					// 배열은 한 번 만들어두면 방의 개수를 늘이거나 줄일 수 없음
					// Record[] rec = new Record[inwon]; 하면 안됨
					// 여기서는 사용자가 나중에 입력할 inwon이 안보이기 때문

		// 이거 여기에 쓰면 Scanner, Record 쓰지 않는 메소드에서도 
		// 얘네 다 불러오게 됨,,,, 문법적으로 잘못된 거 아니고, 이렇게 해야할 때도 있음
		//		=> 나중에 뭐 static 이런거 ,,,,할 때,,
		// 그치만 클래스에다 그냥 인스턴스 생성구문 박아놓는거 좋지 않음
		// 여기저기에서 다 쓴다고 해도,,!
		// ***이름만 다 보이게 해놓고, 그 메소드 안에서 인스턴스 생성해주는게 일반적***
		// ==> Scanner sc; 
	//Scanner sc = new Scanner(System.in);
	//Record rec = new Record();


	// 주요 메소드 정의(기능 구성)
	// 1) 인원 수 입력 메소드 
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1 ~ 100) : ");
			inwon = sc.nextInt();
		}
		while (inwon < 1 || inwon > 100);
		
		// check ~!!!
		// ****얘는 Record 객체가 생성된 게 절대로 아님****!!!!!!
		// Record 클래스를 기반으로 생성된 객체(인스턴스)를 담을 수 있는
		// 배열방을 inwon 만큼 생성한 것이지
		// Record 클래스의 인스턴스를 생성한 것은 아니다 ******!!!
		// Record 클래스의 인스턴스를 담기 위한 그릇이 생성된 것!!!!!		
		rec = new Record2[inwon];
	}


	// 2) 상세 데이터 입력 메소드 (총점 및 평균 산출 기능 포함)
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		String[] title = { "국어 점수 : ", "영어 점수 : ", "수학 점수 : " };

		for (int i = 0; i < rec.length; i++)
		{
			// check~!!!
			// ***Record 클래스 기반의 인스턴스 생성이 가장 먼저 일어나야 함!!!!
			//	==> 이거는 반드시 반복문 안에 있어야 함
			// 아까 생성한 [[Record 클래스의 인스턴스를 담기 위한 그릇]]에 
			// 인스턴스 생성해서 넣어주면 됨
			rec[i] = new Record2();	

			System.out.printf("%d번째 학생의 이름 입력 : ", i + 1);
			rec[i].name = sc.next();

			for (int j = 0; j < title.length; j++)
			{
				// 안내 메세지 출력
				System.out.print(title[j]);

				// score[] 배열에 사용자가 입력한 데이터 담기
				rec[i].score[j] = sc.nextInt();

				// 국어, 영어, 수학 점수 데이터를 반복적으로 입력받는 동안
				// 총점 누적하기
				rec[i].tot += rec[i].score[j];
			}

			// 평균 산출하기
			rec[i].avg = rec[i].tot / 3.0;

		}//end outer for

	}//end input()


	// 3) 결과 출력 메소드
	public void print()
	{ 
		// 석차 산출 메소드 호출
		ranking();

		// 개행
		System.out.println();

		// 학생 한 명 당 반복 출력 구문 구성
		for (int i = 0; i < rec.length; i++)
		{
			// 이름 출력
			System.out.printf("%5s", rec[i].name);

			// 성적(국어, 영어, 수학) 반복 출력
			for (int j = 0; j < 3; j ++)
			{
				System.out.printf("%4d", rec[i].score[j]);
			}

			// 총점, 평균 출력
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f", rec[i].avg);

			// check ~!!!
			// 석차 출력 구문 추가 !
			System.out.printf("%5d", rec[i].rank);        

			// 개행
			System.out.println();
		}	
	}

	// 4) 석차 연산 메소드
	//		- 석차 산출 과정에서 연산에 필요한 데이터가 이미 존재하는 상황 
	//			→ 매개변수 없어도 됨
	//		- Record 배열의 rank 속성 초기화 기능 수행 → 반환 자료형 void
	//		- 클래스 내부에서 활용할 메소드로 정의 → 접근제어 지시자 private
	//			=> 같은 클래스 안에 있는 print() 메소드에서만 호출해줄거라 
	//			   접근제어지시자 private 여도 상관없음
	private void ranking()
	{
		// 모든 학생들의 등수(석차 rank)를 1로 초기화
		for (int i = 0; i < inwon; i++)
			rec[i].rank = 1;

		// 등수 산출							//   4명이라고 했을 때,
		for (int i = 0; i < inwon - 1; i++)		//-- 비교기준 →[i]  0   1   2   
		{										//				[j] 123  23  3
 			for (int j = i + 1; j < inwon; j++)	// j가 i보다 1 크니까 범위는 inwon 까지
			{
				// 비교기준의 평균이 비교대상의 평균보다 크다면
				// 비교대상의 rank 를 1만큼 증가
				if (rec[i].avg > rec[j].avg)
					rec[j].rank++;

				// 비교대상의 평균이 비교기준의 평균보다 크다면
				// 비교기준의 rank 를 1만큼 증가
				else if (rec[i].avg < rec[j].avg)
					rec[i].rank++;
			}
		}
	}

}

public class Test103_teacher
{
	public static void main(String[] args)
	{
		Sungjuk2 sj = new Sungjuk2();
		sj.set();
		sj.input();
		sj.print();
	}
}

// 실행 결과
/*

*/