 /*==================================================
   ■■■ 메소드 중복정의(Method Overloading) ■■■
====================================================*/
/*
- 메소드 오버로딩의 개요
  메소드 오버로딩(Overloading)이란
  메소드가 처리하는 기능은 같고
  메소드 괄호 속에 오는 인수(인자, 매개변수, 파라미터)의 개수가 다르거나
  자료형(Data Type)이 다른 경우
  메소드의 이름을 동일한 이름으로 부여하여 메소드를 정의할 수 있도록
  문법적으로 허용하게 되는데
  이를 메소드 오버로딩(Method Overloading)이라고 한다.

  System.out.println(); System.out.printf(); 도 메소드 오버로딩
	ex)
	System.out.println(10);
	System.out.println("ABCD");
	System.out.println('K');
	System.out.println(3.141592);
	System.out.println(true);

	System.out.printf("%d\n", 10);
	System.out.printf("%d + %d = %d\n", 10, 20, 30);7
*/ 

public class Test105
{
	public static void main(String[] args)
	{
		//drawLine();	// 이렇게 못 부름. main() 메소드는 static 메소드라 
						// 아직 drawLine() 이 탄생하지 않음
		// 방법1) drawLine()에 static 안 붙이고, Test105 인스턴스 생성한다.
		Test105 ob = new Test105();
		ob.drawLine();

		// 방법2) drawLine() 메소드에 static 붙여준다.
		drawLine();
		
		drawLine('-');

		drawLine('<');

		drawLine('+', 30); 

		drawLine('/', 50);
	}

	// 선을 그리는 메소드 정의
	//public void drawLine()
	public static void drawLine()
	{
		System.out.println("====================");
	}
	
	// 선의 형태를 바꾸어 그리는 메소드 정의
	public static void drawLine(char c)
	{
		for (int i = 0; i < 20; i++)
			System.out.print(c);

		System.out.println();
	}

	// 선의 형태와 길이를 바꾸어 그리는 메소드 정의
	public static void drawLine(char c, int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print(c);

		System.out.println();
	}
}

// 실행 결과
/*
====================
====================
--------------------
<<<<<<<<<<<<<<<<<<<<
++++++++++++++++++++++++++++++
//////////////////////////////////////////////////
계속하려면 아무 키나 누르십시오 . . .
*/