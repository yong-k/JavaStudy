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

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Aclass
{
	protected int x, y;
	protected char op;

	Aclass()
	{}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}

// Aclass �� ��ӹ޴� Ŭ������ ����
class Bclass extends Aclass
{
	Bclass()
	{}

	// �Է��� ������ 2�� �ƴϸ� false�� ó��
	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s;

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		s = br.readLine().split(" ");

		if (s.length != 2)
			return false;

		x = Integer.parseInt(s[0]);
		y = Integer.parseInt(s[1]);


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
public class Test115_split
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();

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