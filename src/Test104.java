 /*================================
   ■■■ 클래스와 인스턴스 ■■■
==================================*/

// 클래스와 인스턴스 활용
/*
1 ~ 3 사이의 난수를 발생시켜서 
가위, 바위, 보 게임 프로그램을 구현한다.
단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
또한, 배열을 활용하여 처리할 수 있도록 한다.

※ 기준 데이터 → 1: 가위, 2: 바위, 3: 보

실행 예)
[[ 1:가위  2:바위  3:보 ]] 중 입력(1 ~ 3) : 4
[[ 1:가위  2:바위  3:보 ]] 중 입력(1 ~ 3) : -2
[[ 1:가위  2:바위  3:보 ]] 중 입력(1 ~ 3) : 2

- 유저   : 바위
- 컴퓨터 : 보

>> 승부 최종 결과 : 컴퓨터 WIN !
계속하려면 아무 키나 누르세요...
*/
import java.util.Random;
import java.util.Scanner;

class RpsGame 
{
	private int user, com;
	private String userRps, comRps;

	// 사용자 가위,바위,보 int로 입력
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		while (user < 1 || user > 3)
		{
			System.out.print("[[ 1:가위  2:바위  3:보 ]] 중 입력(1 ~ 3) : ");
			user = sc.nextInt();
		}
		
		if (user == 1)
			userRps = "가위";
		else if (user == 2)
			userRps = "바위";
		else
			userRps = "보";	
	}
	
	// 컴퓨터 가위,바위,보 난수 발생
	public void randomCom()
	{
		Random rd = new Random();
		com = rd.nextInt(3) + 1;		//-- 1 ~ 3 난수 발생

		if (com == 1)
			comRps = "가위";
		else if (com == 2)
			comRps = "바위";
		else
			comRps = "보";	
	}

	// user VS com 승부 결정
	public String calRps()
	{
		String result;	//-- 가위바위보 승부 결과 담음

		if (user == com)			
			result = "~ 무승부 ~";
		else if ((user == 1 && com == 3) || (user == 2 && com == 1)|| (user == 3 && com == 2))
			result = "유저 WIN !";
		else
			result = "컴퓨터 WIN !";

		return result;
	}

	public void print(String result)
	{
		System.out.println();
		System.out.printf("- 유저   : %s\n", userRps);
		System.out.printf("- 컴퓨터 : %s\n", comRps);
		System.out.println();
		System.out.printf(">> 승부 최종 결과 : %s\n", result);
	}
}

public class Test104
{
	public static void main(String[] args)
	{
		RpsGame rps = new RpsGame();
		rps.input();
		rps.randomCom();
		rps.print(rps.calRps());
	}
}

// 실행 결과
/*
[[ 1:가위  2:바위  3:보 ]] 중 입력(1 ~ 3) : 4
[[ 1:가위  2:바위  3:보 ]] 중 입력(1 ~ 3) : 1

- 유저   : 가위
- 컴퓨터 : 보

>> 승부 최종 결과 : 유저 WIN !
계속하려면 아무 키나 누르십시오 . . .
*/