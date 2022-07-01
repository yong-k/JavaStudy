 /*=================================
   ■■■ 메소드의 재귀 호출 ■■■
====================================*/

public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(10);
	}

	// 코드 내에서 2군데 위치 바꿔서 오류 없애기
/*
	public static void showHi(int cnt)
	{
		System.out.println("Hi~");
		showHi(cnt--);
		if (cnt == 1)
			return;
	}
*/
	// 변경 후
	public static void showHi(int cnt)
	{
		System.out.println("Hi~");

		if (cnt == 1)
			return;

		showHi(--cnt);
	}
}


