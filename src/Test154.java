 /*===================================
   ■■■ 예외(Exception) 처리 ■■■
======================================*/

// 예외 다시 던지기

public class Test154
{
	public static void main(String[] args)
	{
		Test154 ob = new Test154();

		try
		{
			int a = ob.getValue(-2);		// ⑦ 예외 발생
			System.out.println("a : " + a);
		}
		catch (Exception e)					// ⑧ 예외 잡아내기
		{
			// ⑨ 잡아낸 예외 처리
			System.out.println("ⓑ printStackTrace..........");
			e.printStackTrace();
		}

	}

	public int getData(int data) throws Exception
	{
		if (data < 0)
			throw new Exception("data 가 0 보다 작습니다.");
			// ① 예외 발생 
			// --> 폭탄던지기로 처리
		
		return data + 10;
	}
								   // ⑥ 잡아낸 예외를 다시 던지는 것이 가능하도록 처리
	public int getValue(int value) throws Exception
	{
		int a = 0;
		
		//a = getData(-2);		// ② 예외 발생
		//--> try-catch 로 처리
		
		try
		{
			a = getData(-2);	// ② 예외 발생
		}
		catch (Exception e)		// ③ 예외 잡아내기
		{
			// ④ 잡아낸 예외에 대한 처리
			System.out.println("ⓐ printStackTrace..........");
			e.printStackTrace();

			// try-catch 로 잡았기 때문에 이걸 받는 쪽에서는 throws 할 필요 없지만,
			// check ~!!!
			// ⑤ 잡아낸 예외를 다시 던지기
			throw e;

			// 잡아낸 예외 다시 던지려면, 해당 메소드에도
			// throws 구문 써줘야 함

			// 잡아낸 예외를 왜 다시 던질까?
			// 배에서 물 새면, 선원이 그거 처리함
			// 선원이 그거 자기 혼자만 알고 있는거 아니고, 다시 던지는거
			// 1등 항해사한테
			// 1등 항해사는 저런 일 발생한거 확인하고 거기에 대한 처리함
			// 그거 또 선장한테 던짐
			// 선장이 그거 처리함

			// 뭐 날치 잡은거 보고할 필요 없으니까 그런거는 보고 없이 끝내면 되지만,
			// 보고해야하는 상황일 때는 보고하는 것 !

			//==> 잡은 예외를 나를 호출한 곳에 전달할 필요성이 있어서 다시 던지는 것 
		}
		return a;
	}
}

// 실행 결과
/*

*/