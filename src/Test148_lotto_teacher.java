 /*=======================================
   ■■■ 자바의 주요(중요) 클래스 ■■■
=========================================*/

// Random 클래스
/*
○ java.util.Random 클래스는

   여러 형태의 난수를 발생시켜 제공하는 클래스이다.
   Math 클래스의 정적 메소드인 random() 메소드도
   난수를 제공하는 메소드이지만
   0.0 ~ 1.0 사이의 실수 형태만 발생하게 되므로
   필요한 여러 형태의 난수를 만들어내기 위해서는
   추가적인 연산을 수행해야 한다.
   그래서 자바는 여러 형태의 난수를 발생시켜주는
   전용 클래스인 Random 클래스를 별도로 제공하고 있다.
*/
/*
로또 번호 생성기 (난수 발생 프로그램)

프로그램이 실행되면 기본적으로 로또를 
5게임 수행하는 프로그램을 구현한다.

실행 예)
 3  5 12 24 31 41
 1  2  8 36 41 42
 4  9 11 13 22 30
 5 10 13 15 27 40
22 31 32 33 40 41
계속하려면 아무 키나 누르세요...

- 중복된 숫자 있으면 안 됨
- 정렬해서 출력
- 1 ~ 45
*/

// 쌤이 가급적 사용하지 말라고 했던
// break 레이블
// 사용해서 만들어볼꺼임

import java.util.Random;
import java.util.Arrays;

class Lotto2
{
	// 배열 변수 선언 및 메모리 할당 → 로또 번호를 담아둘 배열방 6칸
	private int[] num;

	// 생성자
	Lotto2()
	{
		num = new int[6];
	}
	
	// getter
	public int[] getNum()
	{
		return num;
	}
	
	// 6개의 난수를 발생시키는 메소드 정의
	public void start()
	{
		Random rd = new Random();
		int n;
		int cnt = 0;
		
		jump:
		while (cnt < 6)				// 0 1 2 3 4 5
		{
			n = rd.nextInt(45) + 1;	// 1 ~ 45

			for (int i = 0; i < cnt; i++)
			{
				if (num[i] == n)
					continue jump;
			}

			num[cnt++] = n;			// num[0] num[1] num[2] num[3] num[4] num[5]
		}

		// 정렬 메소드 호출
		sorting();
	}
	
	// 정렬 메소드 정의
	private void sorting()
	{
		// Arrays 에 sort 있음
		Arrays.sort(num);
	}
}

public class Test148_lotto_teacher
{
	public static void main(String[] args)
	{
		// Lotto 클래스 기반 인스턴스 생성
		Lotto2 lotto = new Lotto2();

		// 기본 5 게임
		for (int i = 1; i <= 5; i++)
		{
			// 로또 게임 수행
			lotto.start();

			// 결과 출력
			for (int n : lotto.getNum())
				System.out.printf("%4d", n);
			System.out.println();
		}
	}
}

// 실행 결과
/*
   2  14  22  26  38  41
   9  19  30  39  41  44
   1  15  19  31  41  42
   4  16  17  25  32  35
   3  10  12  15  40  43
계속하려면 아무 키나 누르십시오 . . .
*/