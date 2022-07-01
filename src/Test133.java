 /*=======================================
   ■■■ 자바의 주요(중요) 클래스 ■■■
=========================================*/

// Wrapper 클래스

public class Test133
{
	public static void main(String[] args)
	{
		boolean bi = true;
		Boolean wrapBi = new Boolean(bi);
		Boolean wBi = bi;			//-- 오토 박싱

		int n = 300;
		Integer wrapN = new Integer(n);
		int n2 = wrapN;				//-- 오토 언박싱

		float f = 300.3f;
		Float wrapF = new Float(f);	//-- 박싱
		
		// 클래스명@해시코드 나오는게 아니라, 들어가있는 값이 직접 보여짐
		System.out.println(wrapBi.toString());	// true
		System.out.println(wrapN.toString());	// 300
		System.out.println(wrapF.toString());	// 300.3
		
		// toString() 빼고 그냥 객체를 println()에 넘겨줬음
		// 그런데 출력되는거 위랑 동일함
		// Wrapper 타입의 아이들은 객체 타입으로 처리될까봐 걱정안해도 됨. 자동으로 처리해줌
		System.out.println(wrapBi);				// true
		System.out.println(wrapN);				// 300
		System.out.println(wrapF);				// 300.3

		
		// Integer 클래스

		String sn = "12";
		int ni = Integer.parseInt(sn);			//-- 정수형태 문자열 → 정수 로 바꿔줌
												// 매개변수 하나  넘겨받는 parseInt(String)
		System.out.printf("ni : %3d\n", ni);	// ni :  12

		ni = Integer.parseInt("0101", 2);		// 매개변수 두 개 넘겨받는 parseInt(String, int) 
												//-- String을 int진법일 때의 값으로 바꿈
												// ==> ! 오버로딩 !
		System.out.printf("ni : %3d\n", ni);	// ni :   5  => (0101을 2진수로)

		ni = Integer.parseInt("12", 8);
		System.out.printf("ni : %3d\n", ni);	// ni :  10  => (12를 8진수로)

		ni = Integer.parseInt("A", 16);
		System.out.printf("ni : %3d\n", ni);	// ni :  10  => (A를 16진수로)

		sn = Integer.toBinaryString(20);		
		System.out.printf("sn : %s\n", sn);		// sn : 10100	=> 2진수

		sn = Integer.toOctalString(31);
		System.out.printf("sn : %s\n", sn);		// sn : 37		=> 8진수

		sn = Integer.toHexString(31);
		System.out.printf("sn : %s\n", sn);		// sn : 1f		=> 16진수

		Integer num = new Integer(50);
		System.out.println(num.toString());		// 50

		int n3 = 345;
		Integer n4 = Integer.valueOf(n3);
		System.out.println(n4);					// 345

		/*
		- 아 이거는 메소드 이름은 같은데 받는 매개변수 개수 또는 type이
			다르니까 오버로딩이겠구나
		- parseInt, toBinaryString 은 static 이겠구나
			클래스이름.parseInt() 로 호출하니까
		- 이름 앞에 to 붙어있으면 주로 변환을 수행하는 메소드구나
			마치 toString() 처럼

		이런 생각들 많이많이 하면서 코딩하기!!!!
		*/
	}
}

// 실행 결과
/*
true
300
300.3
true
300
300.3
ni :  12
ni :   5
ni :  10
ni :  10
sn : 10100
sn : 37
sn : 1f
50
345
계속하려면 아무 키나 누르십시오 . . .
*/