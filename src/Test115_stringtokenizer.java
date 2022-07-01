 /*==========================
   ■■■ 클래스 고급 ■■■
============================*/

// 상속(Inheritance) 
/*
다음과 같은 프로그램을 구현한다.
단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

실행 예)
임의의 두 정수 입력(공백 구분) : 20 15
연산자 입력 [ + - * / ] : -
>> 20 - 15 = 5.00
계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;
import java.io.IOException;
import java.util.StringTokenizer;

class Aclass2
{
	protected int x, y;
	protected char op;

	Aclass2()
	{}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}

// Aclass 를 상속받는 클래스로 설계
class Bclass2 extends Aclass2
{
	Bclass2()
	{}

	// 입력한 정수가 2개 아니면 false로 처리
	boolean input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		String s;

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		s = sc.nextLine();

		StringTokenizer st = new StringTokenizer(s);

		if (st.countTokens() != 2)
			return false;

		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());

		System.out.print("연산자 입력 [ + - * / ] : ");
		op = (char)System.in.read();
		
		// 연산자 [ + - * / ] 아니면 Error...
		if ( !(op == '+' || op == '-' || op == '*' || op == '/') )
			return false;

		return true;
	}

	double calc()
	{
		double result;

		if (op == '+')
			result = (double)x + y;
		else if (op == '-')
			result = (double)x - y;
		else if (op == '*')
			result = (double)x * y;
		else if (op == '/')
			result = (double)x / y;
		else
			result = 9999999.99999999;

		return result;
	}
}

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test115_stringtokenizer
{
	public static void main(String[] args) throws IOException
	{
		Bclass2 ob = new Bclass2();

		if (!ob.input())
		{
			System.out.println("Error...");
			return;
		}

		double result = ob.calc();

		ob.write(result);
	}
}

// 실행 결과
/*

*/