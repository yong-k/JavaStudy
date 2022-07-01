 /*=======================================
   ■■■ 자바의 주요(중요) 클래스 ■■■
=========================================*/

// StringBuffer 클래스
/*
○ StringBuffer 클래스는
   문자열을 처리하는 클래스로 String 클래스와의 차이점은
   String 클래스는 내부 문자열 데이터의 수정이 불가능하지만
   StringBuffer 클래스는 문자열을 사용할 때
   내부 문자열을 실행 단계에서 변경할 수 있다.

   즉, StringBuffer 객체는 가변적인 길이를 가지므로
   객체를 생성하는 시점에서 미리 그 크기나 값을 지정하거나
   실행 시점에 버퍼의 크기를 바꿀 수 있는 기능을 제공한다.

   또한, JDK 1.5 이후부터는
   문자열을 처리하는 StringBuilder 라는 클래스도 제공한다.
   StringBuilder 클래스의 기능은 StringBuffer 클래스와 동일하지만
   가장 큰 차이점은 multi-thread unsafe 라는 점이다.
   					------------------> (다중 작업에 대해 안전하지 않음)
   즉, Syncronization 이 없기 때문에
   StringBuffer 보다 빠르며 동시성(동기화) 문제가 없다면
   StringBuilder 를 사용하는 것이 성능을 향상시킬 수 있다.

   기능은 StringBuffer  가 더 좋음
   성능은 StringBuilder 가 더 좋음

   StringBuilder는 StringBuilder 객체
   StringBuffer 는 StringBuffer  객체
   String 은       String 객체
   ==> 얘네 다 따로임 !!
*/

public class Test140
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		// 『==』로 객체비교하면 주소값을 가지고 비교하게 된다.
		//	new로 각기 다른 메모리 할당했기 때문에 주소값 서로 다르다. => false
		System.out.println(sb1 == sb2);				// false

		// 『String.equals(s)』는 equals()를 overriding 해서
		//	데이터값을 비교하므로 true가 나왔겠지만,
		// 『StringBuffer.equals(sb)』는 false 가 나온걸로 봐서 overriding 안했다.
		//	여기서는 『Object.equals()』 메소드를 그대로 사용하고 있다.
		//	=> 두 객체의 주소값을 비교한다.
		System.out.println(sb1.equals(sb2));		// false

		System.out.println(sb1);					// korea

		System.out.println(sb1.toString());			// korea
		// 『Object.toString()』 는 클래스명@해시코드 나오는데, 이거는 그렇지 않음
		//=> 『StringBuffer.toString()』 는 그거 overriding 해서 String으로 반환해줌


		// "korea" 라는 문자열과 "korea"라는 문자열을 비교하게 됨
		System.out.println(sb1.toString().equals(sb2.toString()));	// true
		//				   --------------        ----------------
		//						String				 String

		System.out.println("-------------------------------------");

		// StringBuffer는 String과 달리 buffer를 달고 있다. 
		StringBuffer sb3 = new StringBuffer();
		//-- StringBuffer 기본 생성자 호출(인스턴스 생성 과정)
		//   기본적으로 생성되는 버퍼의 크기는 『16』
		//   버퍼 크기 확인 가능하다.

		System.out.println("버퍼 크기 : " + sb3.capacity()); 
		//--==> 버퍼 크기 : 16

		///////////////////////////////////////////////////////////////

		System.out.println(sb3);	// 아무것도 안나오는 상태

		// String 에서 문자열 더할 때
		String name = "홍길동";
		name += "이순신";
		name += "강감찬";
		System.out.println(name);	// 홍길동이순신강감찬

		// StringBuffer 에서 문자열 더할 때 : 『StringBuffer.append(s);』 
		sb3.append("seoul");
		sb3.append("korea");
		sb3.append("우리나라");
		sb3.append("대한민국");

		System.out.println(sb3);			// seoulkorea우리나라대한민국

		System.out.println(sb3.toString());	// seoulkorea우리나라대한민국
		//				  ----
		//			   StringBuffer 
		//				  ----------------
		//					    String 

		System.out.println("버퍼 크기 : " + sb3.capacity()); 
		//--==> 버퍼 크기 : 34
		// 내용물 늘어나니까 버퍼 크기 커짐

		///////////////////////////////////////////////////////////////
		
		String temp1 = "java and oracle";

		// 『String.toUpperCase()』 : 소문자 → 대문자로 변환
		System.out.println(temp1.toUpperCase());	// JAVA AND ORACLE

		// 『String.toLowerCase()』 : 대문자 → 소문자로 변환
		System.out.println(temp1.toLowerCase());	// java and oracle

		// StringBuffer를 가지고는 toUpperCase(), toLowerCase() 실행 불가
		// => String 클래스에는 있지만, StringBuffer 클래스에는 해당 메소드 없음 !
		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.toLowerCase());

		// StringBuffer 는 buffer 관련한 처리 메소드들이 많음
		// 그 외에 다른 작업들은 String에 많음
		// 그렇다고 StringBuffer에서 그거 사용 불가? NO!!
		// 어떻게?
		// sb.toString()   으로 해서 사용하면 String type 된다.

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());	
		//--==> SEOULKOREA우리나라대한민국

		System.out.println(sb3.toString().toUpperCase());	
		//--==> SEOULKOREA우리나라대한민국

		// sb3 = "seoulkorea우리나라대한민국";
		// 위에 작업한다고 sb3 바뀌는거 아님 !!
		// 원본 sb3는 그대로 있고, sb3.toString() 한 문자열을
		// 가지고 다른 작업한 결과를 반환해주는 거임

		
		// ○ 대상 문자열(sb3) 중 seoul 앞에
		//    "한국" 이라는 문자열 추가
		//	  → 한국seoulkorea우리나라대한민국
		//    『StringBuffer.insert(넣을index, s)』
		sb3.insert(0, "한국");
		System.out.println("seoul 앞에 『한국』 추가 : " + sb3.toString());
		//--==> seoul 앞에 『한국』 추가 : 한국seoulkorea우리나라대한민국


		// ○ 대상 문자열(sb3) 중 korea 문자열 뒤에
		//    "사랑" 이라는 문자열 추가
		//	  → 한국seoulkorea사랑우리나라대한민국
		//	  단, 대상 문자열의 인덱스를 눈으로 직접 확인하지 말고...

		// 내가 한 거
		//sb3.insert(sb3.toString().indexOf("korea") + 5, "사랑");
		// => sb3.toString() 할 필요 없음
		//    StringBuffer에도 indexOf() 메소드 있음 !

		//sb3.insert(sb3.indexOf("korea") + 5, "사랑");
		sb3.insert(sb3.indexOf("korea") + "korea".length(), "사랑");

		//--(그냥 내가 해 봄)--> 둘 다 출력 되네..? ㅎ
		//System.out.println("korea 뒤에 『사랑』 추가 : " + sb3.toString());
		System.out.println("korea 뒤에 『사랑』 추가 : " + sb3);
		//--==> korea 뒤에 『사랑』 추가 : 한국seoulkorea사랑우리나라대한민국
		
		//--(그냥 내가 해 봄)--> 이것도 되네
		// --> 됨. StringBuffer 타입으로 print한거임
		System.out.printf("%s\n", sb3);


		// ○ 대상 문자열(sb3) 중 seoul 앞에
		//    『우리나라』 문자열 삭제
		//    『StringBuffer.delete(삭제할시작index, 삭제할마지막index + 1)』
		//sb3.delete(14, 18);
		//System.out.println(sb3);
		//--==> 한국seoulkorea사랑대한민국


		// ○ 대상 문자열(sb3) 중 seoul 앞에
		//    『우리나라』 문자열 삭제
		//	  단, 대상 문자열의 인덱스를 눈으로 직접 확인하지 말고...
		sb3.delete(sb3.indexOf("우리나라"), (sb3.indexOf("우리나라") + "우리나라".length()));
		System.out.println(sb3);
		//--==> 한국seoulkorea사랑대한민국


		// ○ 대상 문자열(sb3) 에서 
		//    『korea』 이후 문자열 삭제 (korea 포함)
		//sb3.delete(7, 18);
		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3);
		//--==> 한국seoul	

		///////////////////////////////////////////////////////////////
	
		// 버퍼 크기 확인
		System.out.println("버퍼 크기 : " + sb3.capacity()); 
		//--==> 버퍼 크기 : 34

		// 버퍼 크기 처음에 16이었는데, 문자열 붙이다보니까
		// 자기가 혼자 34까지 늘어났었는데, 지금도 버퍼 크기 34
		// 자기가 혼자 늘어나기는 하지만, 줄어들지는 않는다.

		// 문자열(sb3)의 길이 확인
		System.out.println("문자열의 길이 : " + sb3.length());
		//--==> 문자열의 길이 : 7
		// StringBuffer 에도 String 처럼 length() 메소드 존재함


		// 버퍼 크기 조절
		// → 현재 문자열을 담아둘 수 있는 버퍼의 크기로...
		// 『StringBuffer.trimToSize()』
		sb3.trimToSize();

		// 버퍼 크기 조절 이후 버퍼 크기 확인
		System.out.println("버퍼 크기 : " + sb3.capacity()); 
		//--==> 버퍼 크기 : 7 

		}
}

// 실행 결과
/*
false
false
korea
korea
true
-------------------------------------
버퍼 크기 : 16

홍길동이순신강감찬
seoulkorea우리나라대한민국
seoulkorea우리나라대한민국
버퍼 크기 : 34
JAVA AND ORACLE
java and oracle
SEOULKOREA우리나라대한민국
SEOULKOREA우리나라대한민국
seoul 앞에 『한국』 추가 : 한국seoulkorea우리나라대한민국
korea 뒤에 『사랑』 추가 : 한국seoulkorea사랑우리나라대한민국
한국seoulkorea사랑우리나라대한민국
한국seoulkorea사랑대한민국
한국seoul
버퍼 크기 : 34
문자열의 길이 : 7
버퍼 크기 : 7
계속하려면 아무 키나 누르십시오 . . .
*/