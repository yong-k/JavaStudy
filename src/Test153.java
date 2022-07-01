 /*===================================
   ■■■ 예외(Exception) 처리 ■■■
======================================*/

// Test152.java 파일과 비교~!!!

// ※ throw		cf) throws
// 지금까지 우리가 사용했던 throws와 다른거임 !!! 잘 보기 !!

// throw  : 예외를 발생시킬 때 사용
// throws : 툭 튀어나온 예외를 밖으로 던질 때 사용

class Demo4
{
	private int value;	//-- int type 전역변수라 자동으로 0으로 초기화 됨

	public void setValue(int value) throws Exception
	{
		if (value <= 0)
		{	
			//return;		

			// 예외도 객체
			// new Exception("value 는 0보다 작거나 같을 수 없습니다.") 
			// 이렇게 생긴 객체를 만들겠다(throw)
			//-- 예외 객체 생성
			throw new Exception("value 는 0보다 작거나 같을 수 없습니다.");	
			// 이렇게 만들면 문제가 생김. 폭탄을 품고있는 거니까
			// setValue() 메소드가 살아남으려면
			// => throws 하거나, try-catch 해야함
		}

		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}

public class Test153
{
	public static void main(String[] args) //throws Exception
	{
		Demo4 ob = new Demo4();

		try
		{
			ob.setValue(-3);
			int result = ob.getValue();
			System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.println("e.toString() : " + e.toString());
		}
	}
}

// 실행 결과
/*
e.toString() : java.lang.Exception: value 는 0보다 작거나 같을 수 없습니다.
계속하려면 아무 키나 누르십시오 . . .
*/