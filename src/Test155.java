 /*===================================
   ■■■ 예외(Exception) 처리 ■■■
======================================*/

// 다른 예외 다시 던지기
// 내가 받은 예외는 빨간폭탄인데, 다시 던지는 건 파란색인 개념

public class Test155
{
	public int getValue(int value) throws Exception				// ⑦ 예외 던지기 (파란 폭탄)
	{
		int a = 0;

		//a = getData(-2);		// ④ 예외 발생 (빨간 폭탄) => try-catch로 처리
		try
		{
			a = getData(-2);									// ③ 예외 발생 (빨간 폭탄)
		}
		catch (Exception e)										
		{
			// ⑤ 예외 처리 (빨간 폭탄)
			// 여기로 떨어진 예외(빨간 폭탄)는 얘가 처리한거고,
			System.out.println("printStackTrace.........");
			e.printStackTrace();

			// ⑥ 예외 발생 (파란 폭탄)
			//throw e;	//--> 그냥 예외 전달
			// 이번에는 잡은 예외를 그대로 전달하는게 아니라
			// 파란 폭탄을 만들어서 던짐
			throw new Exception("value 가 음수입니다.");
		}

		

		return a;
	}

	public int getData(int data) throws Exception				// ② 예외 넘기기 (빨간 폭탄)
	{
		if (data < 0)
		{
			throw new Exception("data 가 0 보다 작습니다.");	// ① 예외 발생 (빨간 폭탄)
		}

		return data + 10;
	}

	public static void main(String[] args)
	{
		Test155 ob = new Test155();

		//int a = ob.getValue(-2);		// ⑧ 예외 발생 (파란 폭탄) => try-catch로 처리
		try
		{
			int a = ob.getValue(-2);							// ⑧ 예외 발생 (파란 폭탄)

			System.out.println("a : " + a);
		}
		catch (Exception e)										// ⑨ 예외 잡아내기 (파란 폭탄)
		{
			// ⑩ 예외 처리 (파란 폭탄)
			System.out.println("printStackTrace.........");
			e.printStackTrace();
		}
	}
}

// 실행 결과
/*
printStackTrace.........
java.lang.Exception: data 가 0 보다 작습니다.
        at Test155.getData(Test155.java:42)
        at Test155.getValue(Test155.java:17)
        at Test155.main(Test155.java:55)
------------------------------------------------------> 빨간 폭탄에 대한 처리

printStackTrace.........
java.lang.Exception: value 가 음수입니다.
        at Test155.getValue(Test155.java:30)
        at Test155.main(Test155.java:55)
------------------------------------------------------> 파란 폭탄에 대한 처리
계속하려면 아무 키나 누르십시오 . . .
*/