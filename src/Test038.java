/*===========================================
   ���� ���� �帧�� ��Ʈ�� (���) ����
============================================*/

// if ~ else �� �ǽ�

/*
����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
�ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�
���� ����� ���ǻ� ���� ������� ó���� �� �ֵ��� �Ѵ�.

���� ��)
ù ��° ���� �Է�      : 10
�� ��° ���� �Է�      : 3
������ �Է�[ + - * / ] : +

>> 10 + 3 = 13
����Ϸ��� �ƹ� Ű�� ��������..
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	//���� �� ��	
		int num1, num2, result;
		char op;

		// ���� �� ó��
		System.out.print("ù ��° ���� �Է�      : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է�      : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.println("<< + - * / �� ���ڸ� �Է��ϸ� '999999999' ��� >>");
		System.out.print("������ �Է�[ + - * / ] : ");
		op = (char)(System.in.read());
	
		//�ܹ����� ��쿡 ũ��� ���� (�ƽ�Ű�ڵ� �� �̿��ؼ�)
		if (op == '+')
			result = num1 + num2;
		else if (op == '-')
			result = num1 - num2;
		else if (op == '*')
			result = num1 * num2;
		else if (op == '/')
			result = num1 / num2;
		else
			result = 999999999;

		// ���� ��� ���
		System.out.printf("%d %c %d = %d\n", num1, op, num2, result);


/*���� �� ��
//��� 1 : op�� char�� �޾Ƽ� �ƽ�Ű�ڵ�� �� (�� ����� ����)
//��� 2 : op�� ������ �޾Ƽ� �ƽ�Ű�ڵ� ��ȣ �̿�
		int num1, num2, op, result;	
		
		System.out.print("ù ��° ���� �Է�      : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է�      : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[ + - * / ] : ");
		op = System.in.read();

		if (op == 43)
			result = num1 + num2;
		else if (op == 45)
			result = num1 - num2;
		else if (op == 42)
			result = num1 * num2;
		else if (op == 47)
			result = num1 / num2;
		else
			result = 999999999;

		System.out.printf("%d %c %d = %d\n", num1, op, num2, result);

//��� 3 : ����� �� ���� �� �� ó�� ������ %c�� ���
		System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
		
		//���� ���1, 2������ ���� ���ǹ����� ��¹� ����߾���
		//���� �����Ƽ� �Է¾��Ѱ�,,,��,,
*/

	}
}

// ���� ���
/*
ù ��° ���� �Է�      : 10
�� ��° ���� �Է�      : 3
������ �Է�[ + - * / ] : +
10 + 3 = 13
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
