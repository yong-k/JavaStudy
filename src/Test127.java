 /*==========================
   ■■■ 클래스 고급 ■■■
============================*/

// 중첩 클래스
/*
○ Annonymous 클래스(익명의 클래스 : 무명 클래스)

   - awt나 안드로이드 이벤트 처리에서 일반적으로 사용
   - 상위 클래스 메소드를 하나 정도 재정의할 필요성이 있을 때 사용
   - 클래스의 객체가 필요하면 또 다시 클래스를 생성해야 하는
     번거로움 때문에 익명의 클래스를 생성하여 처리한다.

○ 형식 및 구조

   new 상위클래스의 생성자()
   {
	   접근제어지시자 자료형 메소드()
	   {
			...;
	   }
   };	//-- 세미콜론 check~!!!
*/

// 우리 눈에 보이지 않지만 이렇게 되어있음
//import java.lang.*;

class Test3	//extends Object
{
	// 우리 눈에 보이지 않지만 있는 것들 꽤 있음
	//Test3() {}
	/*
	Object 클래스의 멤버들...
	...

	public String toString()		// Object 클래스가 가지고 있는 메소드
	{
		...;
	}
	*/

	public Object getString()
	{
		/*
		return new Object();
			   -------------- Object 형

		return new Object() { 특정메소드재구성(튜닝) };
		*/
		// 『Test3$1.class』 로 클래스파일명 만들어짐
		// 익명 클래스 하나 더 만들면,『Test3$2.class』
		return new Object()
		{
			@Override
			public String toString()
			{
				return "익명의 클래스...";
			}
		};		// ← 세미콜론 (미작성 시 에러 발생)
	}
}

public class Test127	// extends Object
{
	/*
	Object 가 갖고있는 멤버들...
	*/

	public static void main(String[] args)
	{
		Test3 ob1 = new Test3();

		System.out.println(ob1.toString());
		//--==> Test3@15db9742

		System.out.println(ob1.getString());
		//--==> 익명의 클래스...
		// 객체 넘겨준건데 toString()을 오버라이딩(재정의)했음
		// 메소드는 한 번 오버라이딩하면 덮어쓰기
		// 그래서 '익명의 클래스...' 출력된 것

		//==> 둘 다 똑같이 내부적으로는 toString() 메소드를 사용한거지만,
		//	  ob1에서 toString() 메소드를 getString()으로 오버라이딩해서 사용
	}
}

// 실행 결과
/*

*/