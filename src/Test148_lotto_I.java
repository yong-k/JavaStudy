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

import java.util.Random;

class Lotto
{
	Random rd = new Random();
	int[] lotto = new int[6];

	// 랜덤 번호 생성 + 중복 숫자 제거
	// => i-- 해주는 방식
	public void random()
	{
		for (int i = 0; i < lotto.length; i++)
		{
			lotto[i] = rd.nextInt(45) + 1;

			for (int j = 0; j < i; j++)
			{
				if (lotto[i] == lotto[j])
				{
					i--;
					break;
				}
			}
		}
	}

	private void sorting()
	{
		boolean flag;

		for (int i = lotto.length - 1; i > 0; i--)
		{
			flag = false;
			for (int j = 0; j < i; j++)
			{
				if (lotto[j] > lotto[j + 1])
				{
					lotto[j]     = lotto[j] ^ lotto[j + 1];
					lotto[j + 1] = lotto[j + 1] ^ lotto[j];
					lotto[j]     = lotto[j] ^ lotto[j + 1];

					flag = true;
				}
			}

			if (flag == false)
				break;
		}
	}

	void print()
	{
		sorting();

		for (int i = 0; i < lotto.length; i++)
			System.out.printf("%4d", lotto[i]);
		System.out.println();
	}
	



}

public class Test148_lotto_I
{
	public static void main(String[] args)
	{
		// Lotto 클래스 기반 인스턴스 생성
		Lotto lotto = new Lotto();

		// 기본 5 게임
		for (int i = 1; i <= 5; i++)
		{
			// 로또 게임 수행
			lotto.random();

			// 결과 출력
			lotto.print();
		}
	}
}

// 실행 결과
/*
   5   9  16  23  26  36
   3   7  10  23  28  44
   5   7  13  19  24  35
  31  35  37  38  40  41
   3  12  15  17  21  37
계속하려면 아무 키나 누르십시오 . . .
*/