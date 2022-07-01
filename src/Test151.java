 /*===================================
   ■■■ 예외(Exception) 처리 ■■■
======================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test151
{
	private String[] data = new String[3];
	
	public void proc() //throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n = 0;

		try 
		{ 
			System.out.print("이름 입력 [종료:Ctrl+z] : ");

			while ( (str = br.readLine()) != null ) 
			{
				data[n++] = str;
				System.out.print("이름 입력 [종료:Ctrl+z] : ");
			}
		}
		catch (IOException e) 
		{
			System.out.println("e.toString() : " + e.toString());
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("!!! 예외 발생 !!!");
			System.out.println("getMessage : " + e.getMessage());
			System.out.println("toString   : " + e.toString());
			System.out.println("printStackTrace .........");
			e.printStackTrace();
		}

		System.out.println("입력된 내용...");

		for (String s : data)
			if (s != null)	
				System.out.println(s);
				
	}
										   // ↓ 해줄 필요 없음
										   // ↓ 위에서 throws로 폭탄 던지지 않고,
										   // ↓        try-catch로 처리했기 때문에
	public static void main(String[] args) //throws IOException
	{
		Test151 ob = new Test151();
		ob.proc();
	}
}

// 실행 결과
/*

*/