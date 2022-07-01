 /*===================================
   ■■■ 예외(Exception) 처리 ■■■
======================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test150
{
	private String[] data = new String[3];
	
	public void proc() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n = 0;

		System.out.print("이름 입력 [종료:Ctrl+z] : ");

		while ( (str = br.readLine()) != null )
		{
			data[n++] = str;
			System.out.print("이름 입력 [종료:Ctrl+z] : ");
			// aa
			// bb
			// cc
			// dd
			// 입력하면 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
			// 발생하기는 하지만, unchecked exception 이라 처리안해줘도 됨
		}

		// ctrl+z 누르고 엔터치면 "입력된 내용..." 출력된다는 것은
		// bufferedReader 의 readLine으로 [Ctrl+z] ==> null 이라는 의미
		System.out.println("입력된 내용...");

		for (String s : data)
			if (s != null)	
				System.out.println(s);
				
	}

	public static void main(String[] args) throws IOException
	{
		Test150 ob = new Test150();
		ob.proc();
	}
}

// 실행 결과
/*

*/