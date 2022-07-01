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

class RpsGame2 
{
	private int user;
	private int com;

	// 컴퓨터의 가위바위보
	private void runCom()
	{
		Random rd = new Random();
		com = rd.nextInt(3) + 1;
	}

	// 유저의 가위바위보
	public void input()
	{
		// 유저가 가위바위보 하기 전에, 컴퓨터(주최측) 먼저 가위바위보
		// => 유저가 뭐 내는지 보고 하면,,,ㅎvㅎ,,,,!
		runCom();

		Scanner sc = new Scanner(System.in);
	
		do
		{
			System.out.print("[[ 1:가위  2:바위  3:보 ]] 중 입력(1 ~ 3) : ");
			user = sc.nextInt();
		}
		while (user < 1 || user > 3);
	}

	// 중간 결과 출력
	public void middleCalc()
	{
		String[] str = { "가위", "바위", "보" };

		System.out.println();
		System.out.println("- 유저   : " + str[user - 1]);
		System.out.println("- 컴퓨터 : " + str[com - 1]);
	}

	// 승부에 대한 최종 결과 연산
	public String resultCalc()
	{
		String result = "~ 무승부 ~";

		if ((user == 1 && com == 3) || (user == 2 && com == 1)|| (user == 3 && com == 2))
			result = "유저 WIN !";
		else if ((user == 1 && com == 2) || (user == 2 && com == 3)|| (user == 3 && com == 1))
			result = "컴퓨터 WIN !";

		return result;
	}

	public void print(String result)
	{
		System.out.println();
		System.out.printf(">> 승부 최종 결과 : %s\n", result);
	}

}// end class RpsGame

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test104_teacher
{
	public static void main(String[] args)
	{
		RpsGame2 rps = new RpsGame2();
		rps.input();
		rps.middleCalc();
		String result = rps.resultCalc();
		rps.print(result);
		
	}
}

// 실행 결과
/*

*/