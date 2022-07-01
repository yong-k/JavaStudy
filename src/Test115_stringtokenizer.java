 /*==========================
   ���� Ŭ���� ��� ����
============================*/

// ���(Inheritance) 
/*
������ ���� ���α׷��� �����Ѵ�.
��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

���� ��)
������ �� ���� �Է�(���� ����) : 20 15
������ �Է� [ + - * / ] : -
>> 20 - 15 = 5.00
����Ϸ��� �ƹ� Ű�� ��������...
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

// Aclass �� ��ӹ޴� Ŭ������ ����
class Bclass2 extends Aclass2
{
	Bclass2()
	{}

	// �Է��� ������ 2�� �ƴϸ� false�� ó��
	boolean input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		String s;

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		s = sc.nextLine();

		StringTokenizer st = new StringTokenizer(s);

		if (st.countTokens() != 2)
			return false;

		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());

		System.out.print("������ �Է� [ + - * / ] : ");
		op = (char)System.in.read();
		
		// ������ [ + - * / ] �ƴϸ� Error...
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

// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
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

// ���� ���
/*

*/