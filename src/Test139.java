 /*=======================================
   ■■■ 자바의 주요(중요) 클래스 ■■■
=========================================*/

// String 클래스

public class Test139
{
	public static void main(String[] args)
	{
		String s = "seoul korea";	
		System.out.println(s);		// seoul korea


		// ○ 문자열 추출
		System.out.println(s.substring(6, 9));	// kor

		// ※ 『String.substring(s, e)』
		//    String 문자열을 대상으로
		//    s 번째에서 ... e-1 번째까지 추출
		//    (단, 인덱스는 0부터 시작)

		System.out.println(s.substring(7));		// orea

		// ※ 『String.substring(s)』
		//    String 문자열을 대상으로
		//    s 번째에서 ... 끝까지 추출
		//    (즉, 문자열이 가진 길이만큼...)


		// ○ 문자열의 데이터(값) 비교 : 대소문자 구분	  
		//	  『String.equals(s)』
		System.out.println(s.equals("seoul korea"));	// true
		System.out.println(s.equals("seoul Korea"));	// false


		// ○ 문자열의 데이터(값) 비교 : 대소문자 구분 X  
		//    『String.equalsIgnoreCase(s)』
		System.out.println(s.equalsIgnoreCase("seoul Korea"));	// true


		// ○ 찾고자 하는 대상 문자열(s)에 『kor』 문자열이 존재할까?
		//    존재한다면... 그 위치는 어떻게 될까?
		//   『String.indexOf(s)』
		//    => 내용을 넘겨서 그게 몇 번째 인덱스에 있는지 확인해줌
		// s = "seoul korea"
		//      012345678910
		System.out.println(s.indexOf("kor"));	// 6
		System.out.println(s.indexOf("ea"));	// 9
		//	=> ea가 붙어있는 걸 찾기 때문에 9번째
		System.out.println(s.indexOf("e"));		// 1
		//  => seoul 에서 e가 제일 먼저 있기 때문에 1번째
		System.out.println(s.indexOf("tt"));	// -1
		//-- 찾고자 하는 문자열이 대상 문자열에 존재할 경우
		//   그 문자열의 인덱스를 반환하지만
		//   존재하지 않을 경우 음수를 반환하게 된다. (-1)


		// ○ 대상 문자열(s)이 『rea』 로 끝나는지의 여부 확인
		//	  (true / false)
		//   『String.endsWith(s)』
		System.out.println(s.endsWith("rea"));	// true
		System.out.println(s.endsWith("oul"));	// false


		// ○ 찾고자 하는 대상 문자열(s)에 『e』 문자열이 존재할까?
		//    존재한다면... 그 위치는 어떻게 될까?
		//	  (단, 뒤에서 부터 검사)
		//   『String.lastIndexOf(s)』

		// s = "seoul korea"
		//---앞에서부터 찾다가, 찾으면 stop
		System.out.println(s.indexOf("e"));		// 1	
		System.out.println(s.indexOf("o"));		// 2

		//---뒤에서부터 찾다가, 찾으면 stop
		System.out.println(s.lastIndexOf("e"));	// 9	
		System.out.println(s.lastIndexOf("o"));	// 7
		// => 뒤에서 부터 찾고, 앞에서부터 인덱스 세서 해당 인덱스 반환하는 거임


		// ○ 대상 문자열(s) 중 
		//   『6』번째 인덱스 위치의 문자는?
		//   『String.charAt(int n)』
		// s = "seoul korea"
		System.out.println(s.charAt(6));	// k	
		//System.out.println(s.charAt(22));	
		//--==> 에러 발생 (런타임 에러)
		// Exception in thread "main" java.lang.StringIndexOutOfBoundsException
		// 존재하지 않는 인덱스 넣으면 에러남

		
		// ○ 대상 문자열(s) 과 비교 문자열 『seoul corea』 중
		//    어떤 문자열이 더 큰가? → 문자열에 대한 크기 비교
		//   『String.compareTo(s)』
		//	  ==> 두 문자열이 같다면   → 0
		//		  두 문자열이 다르다면 → 차이를 확인 (사전식 배열)
		System.out.println(s.compareTo("seoul korea"));	// 0
		System.out.println(s.compareTo("seoul corea"));	// 8
		//-- c 와 k의 차이를 비교해줌 → c ~ k → defghijk → 8칸 차이


		// ○ 대상 문자열(s) 중 
		//    해당 문자열을 찾아서 원하는 형태로 수정
		//   『String.replaceAll(s)』

		s = "우리나라 대한민국 대한독립 만세";
		s = s.replaceAll("대한", "자주");
		System.out.println("처리 결과 : " + s);	
		//--==> 처리 결과 : 우리나라 자주민국 자주독립 만세


		// ○ 공백 제거
		//   『String.trim(s)』
		//=> 손톱깍기 생각하면 됨
		//   중간부분 못 자름. 가장자리부터 시작해서 자름
		//   (손톱 자른거 버리는 것 처럼)
		//   어떤 문자열에 특정 기능 수행하게 되면,
		//   기능을 수행한 걸 버리고 남아있는 걸 취함!
		//=> 양쪽 가장자리 다 제거해줌
		//   (오라클에서는 ltrim, rtrim 해서 왼쪽, 오른쪽 구분있음)
		s = "          사          랑          ";	// 공백 10칸씩
		System.out.println("|||" + s + "|||");	
		//--==> |||          사          랑          |||
		System.out.println("|||" + s.trim() + "|||");	
		//--==> |||사          랑|||
		// 양쪽 가장자리 공백 제거하고, 사이 공백은 제거 못함

		// 안에 있는 공백 제거하고 싶으면, 
		System.out.println("|||" + s.replaceAll(" ", "") + "|||");
		//--==> |||사랑|||


		// "30"
		int temp = Integer.parseInt("30");
		System.out.printf("%d\n", temp);	// 30
		s = Integer.toString(30);
		System.out.printf("%s\n", s);		// 30
		// Object 가 갖고 있던 toString()을 Integer가 overriding해서 사용
		// 정수 건네주면 문자열로 반환해줌


		// ○ format 형식 있음 ==> 지금까지 봐왔던 것과 달리 static !
		//   『String.format(s)』
		//   => 사용법은 printf와 format과 동일한데
		//      '이런 형태로 출력해라' 가 아니라
		//		String.format() 은 '이런 형태로 문자열로 반환해라' 이다.
		//		==> 출력을 시키는게 아니라 문자열로 반환해주는 것이 차이!
		int n = 2345678;
		System.out.printf("%d\n", n);	// 2345678
		System.out.format("%d\n", n);	// 2345678

		s = String.format("%d", n);
		System.out.println(s);			// 2345678
		
		// printf 에서 쓸 수 있는 형식 다 쓸 수 있다고 보면 됨
		s = String.format("%,d", n);
		System.out.println(s);			// 2,345,678
	
		
	
		// ○ 구분자로 문자열 잘라서 배열로 반환
		//   『String.split(구분자)』
		//	=> 문자열 형식의 배열로 반환해줌
		// 문자열에다 『.』 찍어도 String 메소드 사용 가능 !!
		String[] strArr = "기본,열정,배려".split(",");

		for (String str : strArr)
			System.out.print(str + " ");
		System.out.println();
		//--==> 기본 열정 배려
	}
}

// 실행 결과
/*
seoul korea
kor
orea
true
false
true
6
9
1
-1
true
false
1
2
9
7
k
0
8
처리 결과 : 우리나라 자주민국 자주독립 만세
|||          사          랑          |||
|||사          랑|||
|||사랑|||
30
30
2345678
2345678
2345678
2,345,678
기본 열정 배려
계속하려면 아무 키나 누르십시오 . . .
*/