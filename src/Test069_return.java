/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

// return 실습
// return 키워드가 지니는 두 가지 의미
//	1) 값의 반환 => 무엇을 return 할 건지 return 뒤에 붙어있음
//	2) 메소드 종료 => return; 단독으로 쓰일 경우

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test069_return
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	

		int n, s;

		System.out.print("임의의 정수 입력(10 이상) : ");
		n = Integer.parseInt(br.readLine());

		if (n < 10)
		{
			System.out.println("10 이상의 정수를 입력해야 합니다.");
			return;
			//-- 메소드 종료 -> 종료 대상 : main() 메소드 -> 프로그램 종료
		}

		s = 0;
		for (int i = 1; i <= n; i++)
		{
			s += i;
		}

		System.out.println("결과 : " + s);
	}
}

// 실행 결과
/*

*/