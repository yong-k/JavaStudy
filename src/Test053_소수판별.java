/*===========================================
   ���� ���� �帧�� ��Ʈ�� (���) ����
============================================*/

// �ݺ���(while��) �ǽ�
/*
����ڷκ��� ������ ������ �Է¹޾� (BufferedReader ���)
�Է¹��� ������ �Ҽ����� �ƴ��� �Ǻ��Ͽ�
����� ����ϴ� ���α׷��� �����Ѵ�.

- �Ҽ�: 1 �Ǵ� �ڱ� �ڽ��� �� �̿ܿ� � ���ε� ������ �������� �ʴ� ��
		��, 1�� �Ҽ� �ƴ�

���� ��)
������ ���� �Է� : 10
10 �� �Ҽ� �ƴ�
����Ϸ��� �ƹ� Ű�� ��������...

������ ���� �Է� : 11
11 �� �Ҽ�
����Ϸ��� �ƹ� Ű�� ��������...

Hint>> 
������ ���� �Է� : 967  ������,
967 ������ 1~966���� ��������, ����������� �� ������ ==> �Ҽ� X
	������ �������� ������, ����� 1���� �ƴ��� ���� ==> 1 �ƴϸ� ==> �Ҽ� O
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053_�Ҽ��Ǻ�
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ���� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//��
/*
		int inputNum;
		int n = 2;
		int count = 0;

		// ���� �� ó�� + ���
		System.out.print("������ ���� �Է� : ");
		inputNum = Integer.parseInt(br.readLine());

		while (n < inputNum)
		{
			if (inputNum % n == 0)
			{
				count += 1;
				break;
			}
			n++;
		}

		if (count == 0 && inputNum > 1)
			System.out.println(inputNum + " �� �Ҽ�");
		else
			System.out.println(inputNum + " �� �Ҽ� �ƴ�");
*/
//��
		int num;
		int n = 2;
		boolean flag = true;	//--'num�� �Ҽ��� ���̴�' �� �⺻������ �س���

		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());

		while (n < num)
		{
			if (num % n == 0)
			{
				flag = false;
				break;
				// *** num �� �Ҽ��� �ƴѰ� �����Ǹ� �ݺ��� ��� �� �ʿ� ����!! ***
				// break �� break�� ���δ� ���� ����� �ݺ����� ��������
			}
			n++;
		}

		if (flag && num != 1)
			System.out.println(num + " �� �Ҽ�");
		else
			System.out.println(num + " �� �Ҽ� �ƴ�");
	}
}

// ���� ���
/*
������ ���� �Է� : 10
10 �� �Ҽ� �ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 11
11 �� �Ҽ� �ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : -1
-1 �� �Ҽ� �ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 1
1 �� �Ҽ� �ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/