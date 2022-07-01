 /*=======================================
   ■■■ 자바의 주요(중요) 클래스 ■■■
=========================================*/

// ※ Test128.java 와 비교~!!!

//import java.lang.*;

public class Test129	//extends Object
{
	/*
	...

	public String toString() 
	{
		...;
	}

	...
	*/

	@Override
	public String toString()
	{
		return "재정의한 toString()...";
	}

	public static void main(String[] args)
	{
		Test129 ob = new Test129();

		System.out.println(ob.toString());
		//--==> 재정의한 toString()...

		System.out.println(ob);
		//--==> 재정의한 toString()...
		//-- '아.. println() 에서 쓰는 toString() 메소드도 같은 메소드 맞구나~!'
		//-- 오버라이딩 된 건 덮어쓰기 되니까!
	}
}

// 실행 결과
/*
재정의한 toString()...
재정의한 toString()...
계속하려면 아무 키나 누르십시오 . . .
*/