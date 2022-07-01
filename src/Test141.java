 /*=======================================
   ■■■ 자바의 주요(중요) 클래스 ■■■
=========================================*/

// StringBuffer 클래스

public class Test141
{
	public static void main(String[] args)
	{
		String s1 = "123456789";
		s1 = (s1 + "123").replace('2', 'A');
		System.out.println(s1);
		// --==> 1A34567891A3
		// 123456789 → 123456789123  
		//  → (2 라는 문자열 보이면 A 로 바꿔라) →1A34567891A3

		StringBuffer s2 = new StringBuffer("123456789");
		s2.delete(0, 3).replace(1, 3, "24").delete(4, 6);
		System.out.println(s2);
		//--==> 4247
		// 123456789 → 456789 → 424789 → 4247

		StringBuffer s3 = new StringBuffer("123456789");
		String s4 = s3.substring(3, 6);
		System.out.println(s4);
		//--==> 456
		// 123456789 → (3 ~(6-1) 번까지 뽑아라) → 456

		StringBuffer s5 = new StringBuffer("123456789");
		s5.delete(0, 3).delete(1, 3).delete(2, 5).insert(1, "24");
		System.out.println(s5);
		//--==>
		// 123456789 → 456789 → 4789 → 47 → 4247
	}
}

// 실행 결과
/*

*/