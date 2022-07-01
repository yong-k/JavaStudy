 /*=======================================
   ■■■ 자바의 기본 입출력(I/O) ■■■
=========================================*/

// Reader Writer 실습

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.IOException;

public class Test178
{
	public void process(InputStream is)	// System.in 넘겨받으며 업캐스팅 일어남
										// InputStream 객체로 넘겨받으며 
										// process() 에서 일하기 시작함
	{
		int data;

		System.out.println("문자열 입력(종료:Ctrl+z)");

		try
		{
			// 매개변수 is 라는 바이트 기반 객체(InputStream)를
			// 문자 스트림으로 변환하여
			// (→ InputStreamReader 가 수행)
			// Reader 타입의 rd 에서 참조할 수 있도록 처리
			Reader rd = new InputStreamReader(is);
			//								 ----바이트기반의 스트링
			//              -----------------바이트기반 → 문자기반으로 바꿈
			// 그걸 Reader 로 읽어옴

			// 바이트 기반 스트림인 자바 기본 출력 스트림(System.out)을
			// 문자 스트림으로 변환하여
			// (→ OutputStreamWriter 가 수행)
			// Writer 타입의 wt 에서 참조할 수 있도록 처리
			Writer wt = new OutputStreamWriter(System.out);
			//                               ------------출력기반 바이트기반 스트링
			//             --------------------바이트기반 → 문자기반으로 바꿈

			//→ 받아들이는 것도, 내보내는 것도 문자스트림으로 통일됨

			while ( (data = rd.read()) != -1 )
			{
				wt.write(data);	//-- 내보내는 스트림 물줄기에 기록
				wt.flush();		//-- 기록한 스트림을 밀어내어 내보냄
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args)
	{
		Test178 ob = new Test178();
		ob.process(System.in);
		//		   -----------자바의 기본 입력 스트림 객체를 매개변수로 던짐
	}
}

// 실행 결과
/*
문자열 입력(종료:Ctrl+z)
abcd
abcd
1234
1234
가나다라
가나다라
^Z
계속하려면 아무 키나 누르십시오 . . .
*/