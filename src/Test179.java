 /*=================================================
   ■■■ 객체 직렬화(Object Serialization) ■■■
===================================================*/
/*
○ 객체 직렬화(Object Serialization)

   메모리에 생성된 클래스 객체의 멤버 변수의 현재 상태를
   그대로 보존해서 파일에 저장하거나
   네트워크를 통해 전달할 수 있는 기능으로
   멤버 변수의 값을 보존한다거나
   다른 네트워크에 있는 호스트에 값을 보낼 경우 사용하게 된다.

   즉, 객체 직렬화는 내용물을 바이트 단위로 변환하여
   파일 또는 네트워크를 통해 송수신(스트림)이 가능하게
   만들어주는 것으로 이 때, 객체란 멤버 변수의 메모리만으로 구성된 것을 말한다.

   따라서, 메소드와 생성자는 객체 직렬화의 대상에서 제외된다.
   					------
					상속의 대상에서도 제외됨

○ 객체 직렬화의 장점
   
   객체 자체의 내용을 입출력 형식에 구애받지 않고
   객체를 파일에 저장함으로써 영속성을 제공할 수 있으며
   객체 자체를 네트워크를 통해 손쉽게 교환할 수 있게 된다.

   객체 직렬화는 자바 1.1 이후에 도입되었는데
   그 이유는 RMI 와 Bean 때문이었다.
   RMI 는 원래 객체 통신을 지원해야 하기 때문에
   객체가 그대로 이동할 수 있어야 한다.
   따라서 이를 지원하기 위해서는 객체 직렬화가 필수적이었다.

   또한, Bean 은 설계 시 상태에 대한 정보를 저장할 때
   이 객체 직렬화를 사용하면 편하게 객체 상태를 저장할 수 있다.

※ RMI(Remote Method Invocation)  
   서로 다른 가상 기계장치에 존재하는 함수를
   호출하고 실행하는 기능을 담당한다.
   서로 다른 통신 구조에 위치한 각각의 원격 객체들 간의
   통신 구조를 지원하는 개념으로 이해하면 좋겠다.
   // → 요즘에 많이 안 쓰여서 그냥 한 번 읽어보는 식으로 해도 됨

※ Bean(빈) ***
   C/S 구조적 모델에서 서버측 구조에 해당하며,
   재사용 가능한 소프트웨어 개체를 만들 수 있게 하는 컴포넌트 기술.
   작성된 개체의 공유가 가능하며 프로젝트에 쉽게 포함시킬 수 있도록 한다.
   클라이언트에게 빈이라는 프로그램 컴포넌트를 분배하는 방식으로 처리.
   // → 되게되게 중요함. 나중에 Spring에서 적극적으로 사용함

○ Serializable 인터페이스

   객체 직렬화를 하기 위해 먼저 객체 직렬화가 가능하도록
   java.io.Serializable 인터페이스를 구현해 주어야 한다.
   이 인터페이스는 객체 직렬화가 제공되어야 한다는 사실을
   JVM 에게 알려주는 역할을 수행한다.
   또한, Serializable 인터페이스는
   다른 인터페이스와 달리 구현해야 할 메소드가 없기 때문에
   단지 선언만 해주면 된다.

   형식)
   ① 
   public class 클래스명 implements Serializable
   {
		// ...
   }

   ②
   Serializable 인터페이스를 구현한 후,
   ObjectInputStream 클래스와 ObjectOutputStream 클래스를 이용하여
   객체 단위로 입출력을 수행하게 된다.

   ※ 멤버 변수가 static 으로 선언된 경우
      (즉, 클래스 변수일 경우)
	  객체 직렬화의 대상에서 제외된다.

○ Object Stream
   
   java.io.ObjectInputStream
   ObjectInputStream 클래스는 ObjectOutputStream 클래스에 의해
   ----------------------------------------------------
   (→ 바이트 기반으로 object 읽어들이고 내보내는 클래스)
   파일에 저장되어 있는 객체나 네트워크를 통해 전달된 객체의
   직렬화를 해제하는 기능을 제공한다.
   단, java.io.Serializable 인터페이스와
   java.io.Externalizable 인터페이스를 지원해주는 객체에 대해서만
   사용이 가능하다.
   즉, Serializable 인터페이스와 Externalizable 인터페이스를
   구현한 객체에서만 사용이 가능하다는 것이다.
   이 때, readObject() 메소드를 이용하여
   스트림으로부터 직렬화된 객체를 읽을 수 있으며

   이렇게 읽은 객체는 배열, 문자열 또는 각 객체 등
   원래의 형(Type)으로 캐스팅 해 주어야 한다.
*/

import java.io.File;
import java.util.Hashtable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Enumeration;

public class Test179
{
	public static void main(String[] args) throws Exception
	{
		String appDir = System.getProperty("user.dir");
		//              -------------------
		//			default character set 얻어올 때 써본 적 있음

		// 테스트
		System.out.println(appDir);
		//--=> D:\JavaStudy

		// 파일 객체 생성
		File f0 = new File(appDir, "\\data\\test.ser");
		//-- appDir → D:\JavaStudy
		//-- 저 경로에 . 찍고 \\ 는 문자열 안에서 \ 하나 나타냄
		//   dir 안에 test 안에 직렬화 관련된 파일
		//-- appDir 위치를 기준으로(중심으로) "\\data\\test.ser" 를
		//   구성하겠다는 의미
		//   결과적으로 『D:\JavaStudy\data\test.ser』 구성

		// 테스트 ①
		System.out.println(f0.getParentFile().exists());
		//--==> false
		//-- 『test.ser』 파일이 만들어질 디렉토리 경로가 구성되어 있지 않다.

		// 테스트 ②
		// 『D:\JavaStudy』 경로에 『data』 디렉터리 생성 후 다시 확인
		System.out.println(f0.getParentFile().exists());
		//--==> true
		//-- 『test.ser』 파일이 만들어질 디렉터리 경로가 구성되어 있다.

		// 『test.ser』 파일이 만들어질 디렉터리 경로가 구성되어 있지 않다면...
		if (!f0.getParentFile().exists())
		{
			// 디렉터리를 만들겠다.
			f0.getParentFile().mkdirs();
		}


		// Hashtable 자료구조 인스턴스 생성
		Hashtable<String, String> h1 = new Hashtable<String, String>();

		// 생성한 h1 이라는 Hashtable 자료구조에 요소 추가
		h1.put("2202091", "이호석");
		h1.put("2202097", "김정용");
		h1.put("2202090", "최문정");
		h1.put("2202094", "최선하");
		h1.put("2202099", "김태형");

		// 테스트
		System.out.println(h1.get("2202094"));
		//--==> 최선하

		// ↓ 여기서부터 직렬화에 대한 내용 적용

		// << 직렬화 >> 
		
		// 파일 전용 출력 스트림 생성(수도꼭지 열기)
		FileOutputStream fos = new FileOutputStream(f0);
		//-- 파일 전용 출력 스트림(물줄기)에 
		//   f0 라는 파일 객체를 띄우겠다....
		//InputStreamReader isr = new InputStreamReader(System.in);
		// 이렇게 쓴거랑 똑같은 거임 ㅎvㅎ
		//-- 파일 없을 수도 있기 때문에 check exception 포함하고 있음
		//   → throws Exception 해줘야 함
		//      ------------------하면 따로 import 구문 작성하지 않아도 됨

		// 객체 전용 출력 스트림 생성
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//-- 객체 전용 출력 스트림(물줄기)으로 
		//   fos 라는 파일 전용 출력 스트림을 감싸겠다.
		//BufferedReader br = new BufferedReader(isr);
		// 이렇게 쓴거랑 똑같은 거임 ㅎvㅎ

		// 위의 line155 ~ 167 과 동일한 구문
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f0));
		 
		// line 170 의 개념과 비교할 구문(구조적으로 동일한 구문)
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ※ ObjectOutputStream 클래스는
		//    객체들을 출력하는 기능을 제공하는 클래스로
		//    출력 스트림에 출력하기 전에
		//    내부적으로 객체 직렬화를 수행하게 된다.
		//    자바 기본형 데이터 또는 객체들을
		//    파일에 저장하거나 네트워크를 통해 전달하기 위해
		//    전달할 객체를 직렬화하는 기능을 제공하는 것이다.

		oos.writeObject(h1);
		//-- 생성된 스트림에 내보낼 객체를 기록
		// 버퍼가 달려있지 않기 때문에, flush() 수행할 필요 없이 close() 수행

		oos.close();
		//-- ObjectOutputStream 리소스 반납

		fos.close();
		//-- FileOutputStream 리소스 반납

		// 열었던 순서와 반대로 닫아주면 됨

		// ↑ 여기까지 하면, (객체를 직렬화하여 파일로) 내보내기 끝 ~!!!

		// 실행하면 d드라이브 안에 javastudy 파일 안에
		// data 안에 test.ser 파일 생겨있고,
		// 그 안에는 h1 객체 있고, 그 안에는 이호석 ~ 김태형 까지의 객체 들어있음
		//------------------------------------------------------------------------


		// (객체를 직렬화하여 내보낸 파일) 읽어들이기 시작~!!!

		// f0 파일 객체가 존재한다면...
		if (f0.exists())	
		{
			FileInputStream fis = new FileInputStream(f0);
			ObjectInputStream ois = new ObjectInputStream(fis);

			// ois(ObjectInputStream)로 부터 읽어들인 객체(Object)를
			// 캐스팅(Hashtable) 하여 
			// h2 라는 Hashtable 자료구조에 담아내기
			Hashtable h2 = (Hashtable)ois.readObject();
			// 캐스팅 안하면
			// Object obj = ois.readObject();
			// 하고 담아낼 수 있음
			// 읽어들인 객체는 사실상 Hashtable 객체이기 때문에
			// 222 번은 다운캐스팅 구문
			// 실제 만들어진건 Hashtable 객체지만, Object 타입으로 받았으니까
			// 그걸 다시 Hashtable 로 캐스팅

			ois.close();
			//-- ois 반납 → ObjectInputStream 리소스 반납

			fis.close();
			//-- fis 반납 → FileInputStream 리소스 반납
			
			//------------------------------ 여기까지 수행하면 읽어들이는 작업 끝~!!

			// << 역직렬화 >> 

			// 읽어들인 h2 객체의 내용 확인

			String key;
			String value;

			// ※ Hashtable → Iterator 사용할 수 없음~!!!
			//				   Enumeration 사용해야 함!!

			Enumeration e = h2.keys();

			while (e.hasMoreElements())
			{
				key = (String)e.nextElement();
				//           ----------------- Object니까 String 으로 형변환
				//-- Hashtable 자료구조를 대상으로 key 값을 읽어들이는 과정

				// 테스트
				//System.out.println(key);
				//--==>
				/*
				2202091
				2202099
				2202090
				2202097
				2202094
				*/

				value = (String)h2.get(key);
				//-- Hashtable 자료구조를 대상으로 key 를 활용하여 value 를 얻어내는 과정

				System.out.println(key + " → " + value);
			}
		}
	}
}

// 실행 결과
/*
2202091 → 이호석
2202099 → 김태형
2202090 → 최문정
2202097 → 김정용
2202094 → 최선하
*/
// 순서는 상관없음!
// key-value 잘 맞춰서 보여지면 됨!!