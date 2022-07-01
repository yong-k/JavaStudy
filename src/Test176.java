 /*=======================================
   ■■■ 자바의 기본 입출력(I/O) ■■■
=========================================*/

// Reader 실습

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test176
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;
	
		// System.in         : 자바 표준 입력 스트림 → 바이트 기반 스트림
		// InputStreamReader : 바이트 기반 스트림을 → 문자 기반 스트림으로 변환해 주는 역할 수행
		// Reader			 : 문자 기반 스트림 객체
		Reader rd = new InputStreamReader(System.in);

		System.out.println("문자열 입력(종료:Ctrl+z)");

		// Test174 : data = System.in.read() 이렇게 했었음 → 바이트기반
/*
		while ( (data = rd.read()) != -1 )
		//              ---------
		//				문자기반으로 읽어들여옴
		{
			ch = (char)data;

			System.out.print(ch);
			//    ----------
			//    문자기반 출력
		}
*/
		/*
		문자열 입력(종료:Ctrl+z)
		abcd
		abcd
		1234
		1234
		가나다라
		가나다라
		*/

		while ( (data = rd.read()) != -1 )
		//              ---------
		//				문자기반으로 읽어들여옴
		{
			ch = (char)data;

			System.out.write(ch);
			//    ----------
			//    바이트기반 출력
		}
		/*
		문자열 입력(종료:Ctrl+z)
		abcd
		abcd
		1234
		1234
		가나다라
		 섆|
		^Z
		*/
	}
}

// 실행 결과
/*

*/