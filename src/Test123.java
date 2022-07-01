 /*==========================
   ■■■ 클래스 고급 ■■■
============================*/

// 인터페이스(Interface)
/*
○ 실습 문제
성적 처리 프로그램을 구현한다.
단, 인터페이스를 활용할 수 있도록 한다.

실행 예)
인원 수 입력(1~10) : 2
1번째 학생의 학번 이름 입력(공백 구분) : 2280946 홍은혜
국어 영어 수학 점수 입력   (공백 구분) : 90 100 85
2번째 학생의 학번 이름 입력(공백 구분) : 2290847 최문정
국어 영어 수학 점수 입력   (공백 구분) : 85 70 65

				국어 영어 수학		총학점		평균
2280946 홍은혜	 90  100   85		  xxx        xx
				 수   수   우
2290847 최문정	 85   70   65		  xxx        xx
				 우   미   양

계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;

// 속성만 존재하는 클래스 → 자료형 활용
class Record3
{
	String hak, name;	//-- 학번, 이름
	int kor, eng, mat;	//-- 국어, 영어, 수학 점수
	int tot, avg;		//-- 총점, 평균(편의상 정수 처리)
}

// 인터페이스
interface Sungjuk3
{
	public void set();		//-- 인원 세팅
	public void input();	//-- 데이터 입력
	public void print();	//-- 결과 출력
}

// 문제 해결 과정에서 설계해야 할 클래스 → Sungjuk 인터페이스를 구현하는 클래스
class SungjukImpl implements Sungjuk3
{
	private int inwon;
	private Record3[] rec;

	// 인원 세팅
	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("인원 수 입력(1~10) : ");
		inwon = sc.nextInt();

		System.out.println();

		// 입력받은 인원수 길이로 Record type 배열 생성
		rec = new Record3[inwon];
	} 

	// 데이터 입력
	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < rec.length; i++)
		{
			// Record type 배열 길이만큼 Record type 객체 생성
			rec[i] = new Record3();

			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ", i + 1);
			rec[i].hak  = sc.next();
			rec[i].name = sc.next();
			System.out.print("국어 영어 수학 점수 입력   (공백 구분) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot / 3;
		}
	}

	// 내부적으로 등급에 대한 판정을 수행할 메소드
	private String panjung(int score)
	{
		String result;

		if (score >= 90 && score <= 100)
			result = "수";
		else if (score >= 80)
			result = "우";
		else if (score >= 70)
			result = "미";
		else if (score >= 60)
			result = "양";
		else if (score >= 0)
			result = "가";
		else
			result = "??";

		return result;
	}

	// 결과 출력
	@Override
	public void print()
	{
		System.out.println("\n=============================================");
		System.out.println("  학번    이름   국어 영어 수학  총점  평균");
		System.out.println("---------------------------------------------");
		
		for (int i = 0; i < rec.length; i++)
		{
			// [학점 이름 점수 총점 평균] 출력
			System.out.printf("%s %s\t %3d  %3d  %3d\t  %d\t%d\n",
				rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat,
				rec[i].tot, rec[i].avg);

			System.out.println(); 

			// 국영수 판정 출력
			System.out.printf("\t\t%3s %3s %3s\n", 
				panjung(rec[i].kor), panjung(rec[i].eng), panjung(rec[i].mat));

			if (i != rec.length - 1)
				System.out.println("---------------------------------------------");
		}
		

		System.out.println("=============================================\n");
	}
}

public class Test123
{
	public static void main(String[] args)
	{
		Sungjuk3 ob = new SungjukImpl();

		// 문제 해결 과정에서 작성해야 할 ob 구성
		ob.set();
		ob.input();
		ob.print();
	}
}

// 실행 결과
/*

*/