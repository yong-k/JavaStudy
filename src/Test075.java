 /*=================================
   ���� Ŭ������ �ν��Ͻ� ����
===================================*/

/*
����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
�ش� ������ �����ϴ� ���α׷��� �����Ѵ�.
��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
 - Scanner ���

���� ��)
������ �� ���� �Է�(�������� ����) : 10 5
������ ������ �Է� [ +  -  *  / ]  : +
>> 10 + 5 = 15
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// �ֿ� ���� ����
	int num1, num2;
	String op;
	//char op;

	// �޼ҵ� ����(��� : �Է�)
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(�������� ����) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		System.out.print("������ ������ �Է� [ +  -  *  / ]  : ");
		op = sc.next();
		//op = (char)System.in.read();
	}

	// �޼ҵ� ����(��� : ����)
	int cal()
	{
		int result = 0;
/*
		if (op == '+')
			result = num1 + num2; 
		else if (op == '-')
			result = num1 - num2;
		else if (op == '*')
			result = num1 * num2;
		else if (op == '/')
			result = num1 / num2;
		else
			System.out.println("������[ +  -  *  / ] �Է� ����");
*/
// ����� Scanner�� ���ڿ� == �� �� �� �𸣹Ƿ�,
// Scanner ��� �� switch�� op ����
		switch (op)
		{
		case "+" : 
			result = num1 + num2; 
			break;
		case "-" :
			result = num1 - num2; 
			break;
		case "*" :
			result = num1 * num2; 
			break;
		case "/" :
			result = num1 / num2; 
			break;
		/*
		default:
			System.out.println("������[ +  -  *  / ] �Է� ����"); 
			break;		
		==> �� ó�� ���⼭ �ϴ� �� �ٶ������� ����
		==> int type�� ��ȯ�ϴ� �޼ҵ��̱� ����
		    default ���� ȥ�� String type ��ȯ�ϴ� �� �ٶ������� X
		==> ���� ������ ��, �� ���꿡�� ������ ���� ����
		                      -9999999 �� ��ȯ�ϴ°� �� ����
		*/
		}
		
		return result;
	}

	// �޼ҵ� ����(��� : ���)
	void print(int result)
	{
		System.out.printf(">> %d %s %d = %d\n", num1, op, num2, result);
	}
}

public class Test075
{
	public static void main(String[] args) throws IOException
	{
		Calculate cal = new Calculate();
		cal.input();
		int result = cal.cal();
		cal.print(result);
	}
}

// ���� ���
/*
������ �� ���� �Է�(�������� ����) : 10 2
������ ������ �Է� [ +  -  *  / ]  : +
>> 10 + 2 = 12
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ �� ���� �Է�(�������� ����) : 10 2
������ ������ �Է� [ +  -  *  / ]  : /
>> 10 / 2 = 5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/