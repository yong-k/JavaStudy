/*===========================================
   ���� ���� �帧�� ��Ʈ�� (���) ����
============================================*/

// switch �� �ǽ�

/*
����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
�ش� �������� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
��, switch ���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
���� ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.

���� ��)
ù ��° ���� �Է�       : 3
�� ��° ���� �Է�       : 17
������ �Է� [ + - * / ] : -

>> 3 - 17 = -14
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test045
{
		public static void main(String[] args) throws IOException
		{
//��
/*
			// �ֿ� ���� ����
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int num1, num2, result = 0;
			char op;

			// ���� �� ó��
			System.out.print("ù ��° ���� �Է�       : ");
			num1 = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է�       : ");
			num2 = Integer.parseInt(br.readLine());
			System.out.print("������ �Է� [ + - * / ] : ");
			op = (char)(System.in.read());

			if (num2 == 0 && op == '/')	
				System.out.println("\n<<< ���� >>> �и� 0: ������ ���� �Ұ�\n");
					
			switch (op)
			{
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2; break;
			case '/': result = num1 / num2; break;
			default: System.out.println("������ �Է� ����"); break;
			}

			// ���� ��� ���
			System.out.printf(">> %d %c %d = %d\n", num1, op, num2, result);
*/			
//�� �ذ��� 2��
	// 1) ������ int type ���� ����
/*
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a, b, result, op;

			System.out.print("ù ��° ���� �Է�       : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է�       : ");
			b = Integer.parseInt(br.readLine());
			System.out.print("������ �Է� [ + - * / ] : ");
			op = System.in.read();

			// �ƽ�Ű�ڵ�
			// +: 43, -: 45, *: 42, /: 47
			switch (op)
			{
				case 43: result = a + b; break;
				case 45: result = a - b; break;
				case 42: result = a * b; break;
				case 47: result = a / b; break;
				default: return;	
						// return	
						//	  1. ���� ��ȯ	
						//	  2. �޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� ����
 			}

			System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
				// op : int type�̾��µ� %c�� ����� ���ε�, ���ڷ� ǥ���Ǿ���
		}
*/
	// 2) ������ char type ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, result;
		char op;

		System.out.print("ù ��° ���� �Է�       : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է�       : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է� [ + - * / ] : ");
		op = (char)(System.in.read());

		// �ʱ⿡�� switch => byte, short, int, long type�� �� �� �־�����
		// jdk ������Ʈ �Ǹ鼭 ������
		// �� �Ӹ� �ƴ϶� char, string, enum type �� ������
		// jdk 1.5 �̸� byte, short, int, long type�� ����
		// jdk 1.6 �̸� string �Ұ�
		switch (op)
		{
			case '+': result = a + b; break;
			case '-': result = a - b; break;
			case '*': result = a * b; break;
			case '/': result = a / b; break;
			default: return;
		}

		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);

	}
}

// ���� ���
/*
ù ��° ���� �Է�       : 3
�� ��° ���� �Է�       : 17
������ �Է� [ + - * / ] : -
>> 3 - 17 = -14
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


ù ��° ���� �Է�       : 57
�� ��° ���� �Է�       : 0
������ �Է� [ + - * / ] : /

<<< ���� >>> �и� 0: ������ ���� �Ұ�

Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test045.main(Test045.java:52)
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/