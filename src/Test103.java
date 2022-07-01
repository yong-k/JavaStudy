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
class Record
{
	// 학생 1명을 표현할 수 있는 속성들로 구성해라
	String name = "";
	//int korScore, engScore, mathScore;
	int[] score = new int[3];	//-- 국어, 영어, 수학점수 담기
	int total = 0;
	double avg;
	int rank = 1;
}

class Sungjuk
{
	Scanner sc = new Scanner(System.in);
	int personNum;	//--인원수
	Record[] rec;

	// 인원수 입력 메소드 
	public void inputPersonNum()
	{
		while (personNum < 1 || personNum > 100)
		{
			System.out.print("인원 수 입력(1 ~ 100) : ");
			personNum = sc.nextInt();
		}
		
		rec = new Record[personNum];
	}

	// 상세 데이터 입력 메소드 + 총점 및 평균 연산 여기서 같이
	public void inputData()
	{	
		System.out.println();
		for (int i = 0; i < rec.length; i++)
		{
			rec[i] = new Record();	//-- ***** 이거 빼먹어서 안 됐었음 ㅠ,ㅠ
			System.out.printf("%d번째 학생의 이름 입력 : ", i + 1);
			rec[i].name = sc.next();
			System.out.print("국어 점수 : ");
			rec[i].score[0] = sc.nextInt();
			System.out.print("영어 점수 : ");
			rec[i].score[1] = sc.nextInt();
			System.out.print("수학 점수 : ");
			rec[i].score[2] = sc.nextInt();

			// 총점 및 평균 연산
			rec[i].total = rec[i].score[0] + rec[i].score[1] + rec[i].score[2];
			rec[i].avg = rec[i].total / 3.0;

			System.out.println();
		}
	}
/*
	// 총점 및 평균 연산 메소드
	public void calculate()
	{
		for (int i = 0; i < rec.length; i++)
		{
			rec[i].total = rec[i].korScore + rec[i].engScore + rec[i].mathScore;
			rec[i].avg = rec[i].total / 3.0;
		}
	}
*/
	// 결과 출력 메소드
	public void printResult()
	{
		// ranking() 메소드 호출함으로서 실행시킴
		ranking();

		System.out.println(" 이름  국어  영어  수학  총점  평균  석차 ");
		for (int i = 0; i < rec.length; i++)
		{
			System.out.printf("%3s %3d %5d %5d  %5d  %.2f %3d\n", 
				rec[i].name, rec[i].score[0], rec[i].score[1], rec[i].score[2],
				rec[i].total, rec[i].avg, rec[i].rank);
		}
	}

	// 석차 연산 메소드
	//--쌤) rank = 1 로 초기화해놓고, 서로 비교하면서 작은 수에 +1 해줌
	private void ranking()
	{	
		for (int i = 0; i < personNum - 1; i++)
		{
			for (int j = i + 1; j < personNum; j++)
			{
				if (rec[i].avg > rec[j].avg)
					rec[j].rank++;
				else if (rec[i].avg < rec[j].avg)
					rec[i].rank++;
			}
		}
	}


}

public class Test103
{
	public static void main(String[] args)
	{
		Sungjuk sj = new Sungjuk();
		sj.inputPersonNum();
		sj.inputData();
		sj.printResult();
	}
}

// 실행 결과
/*

*/