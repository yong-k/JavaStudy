 /*=======================================
   ■■■ 자바의 기본 입출력(I/O) ■■■
=========================================*/

// OutputStream 실습

import java.io.OutputStream;
import java.io.IOException;

// 여기서는 버퍼가 없음. 버퍼와 상관없음
public class Test175
{
	public static void main(String[] args) throws IOException
	{
		// System.in  : 자바의 표준 입력 스트림
		// System.out : 자바의 표준 출력 스트림
		// ① 수도꼭지 ON: 물줄기 틀어놓은 상태
		OutputStream out = System.out;
	//					   ----------로 그대로 쓰면 버퍼가 있지만
	//  -------------로 쓰면 버퍼가 없음
	// 지금은 OutputStream 의 객체 out 을 쓰는것
	// 모든 바이트스트림은 OutputStream 의 하위객체이다.
	// OutputStream out = System.out;
	//------------조상	  -----------이거 자체가 객체  
	// →→ 우리 눈높이로 보자면 '업캐스팅' 된 것

	// InputStream	OutputStream → '바이트스트림의 조상'이라고 생각하면 됨

		// 배열 구성
		byte[] ch = new byte[3];	//-- 바이트 배열
		ch[0] = 65;		// A
		ch[1] = 97;		// a
		ch[2] = 122;	// z

		// ② 거기에 A, a, z 종이배 하나씩 띄우는 작업
		out.write(ch);	//-- 밖으로 내보낼 데이터(변수)를 스트림에 기록

		// ③ 주사기 쭉 누르면 안에 내용물 쭉 다 나옴 → 그 작업 수행하는 거임
		//    버퍼가 있으면 웅덩이에 물이 고여서 안나갈 수 있으니, 
		//    그거 꼭! flush() 해서 다 밀어내는 작업 해줘야 함!
		out.flush();	//-- 기록된 스트림을 내보내는(밀어내는) 기능을 수행
						//   지금은 Buffer 를 활용하지 않고 있는 상황이기 때문에
						//   생략이 가능한 코드
						//   (Buffered 되어 있는 스트림(stream)일 경우 생략 불가)
		
		// ④ 수도꼭지 OFF: 물줄기 끔
		out.close();	//-- 출력 스트림(물줄기)에 대한 리소스 반납
						//   (out 스트림을(수도꼭지를) 잠가버린 상황)

		// System.out.println() 에 대한 우리의 신뢰도 100% 임
		// 뭔가 출력이 안되면, System.out.println() 을 의심하는 게 아니라
		// 다른 코드에 문제가 있나 확인하게 됨
		// but!!!
		// out.close() 로 수도꼭지 잠가서 
		// System.out.println() 실행 안됨
		//--==> 앞으로는 얘도 의심해야 함!! 절대적 신뢰 갖고 있으면 안됨..
		System.out.println("절대적인 신뢰를 갖고 있는 구문...");
		//-- 『out.close()』 를 작성한 이후 출력되지 않는 구문
		//   출력되는 스트림(물줄기)을 닫았기 때문에...
	}
}

// 실행 결과
/*
Aaz계속하려면 아무 키나 누르십시오 . . .
*/
// A, a, z 스트림타고 바깥으로 출력된 거 확인할 수 있음