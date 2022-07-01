 /*===================================
   ■■■ 예외(Exception) 처리 ■■■
======================================*/

// Test153.java 파일과 비교~!!!

class Demo3
{
	private int value;	//-- int type 전역변수라 자동으로 0으로 초기화 됨

	public void setValue(int value)
	{
		if (value <= 0)
			return;		//-- 종료 → 메소드 종료

		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}

public class Test152
{
	public static void main(String[] args)
	{
		Demo3 ob = new Demo3();
		ob.setValue(-3);
		int result = ob.getValue();
		System.out.println(result);
	}
}

//==> int type 전역변수라 자동으로 0으로 초기화 됨
//==> 우리가 원하는 대로 처리되지 않았음

// 실행 결과
/*
0
계속하려면 아무 키나 누르십시오 . . .
*/