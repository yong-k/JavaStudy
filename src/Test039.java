/*===========================================
   ���� ���� �帧�� ��Ʈ�� (���) ����
============================================*/

// if ~ else �� �ǽ�

/*
����ڷκ��� ������ ���� �� ���� �Է¹޾�
���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.
���� ���� ó���Ǿ�� ��

Hint)) 7 40 42
1) ù ��° ���� vs �� ��° ����	  ũ�� �� �� �ڸ� �ٲ�
2) ù ��° ���� vs �� ��° ����   ũ�� �� �� �ڸ� �ٲ�
3) �� ��° ���� vs �� ��° ����   ũ�� �� �� �ڸ� �ٲ�

���� ��)
ù ��° ���� �Է� : 7
�� ��° ���� �Է� : 70
�� ��° ���� �Է� : 42

>> ���� ��� : 7 42 70
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test039
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2, num3;		//����� �Է� ����
		int first, second, third;	//���� ��ġ
		int temp;					//�� ����

		// ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		num3 = Integer.parseInt(br.readLine());

		first = num1; 
		second = num2; 
		third = num3;

//���1) temp ���� Ȱ��
/*
			// 1) if ù ��° ���� > �� ��° ����, �ڸ��ٲ�
		if (first > second)
		{
			temp = first;
			first = second;
			second = temp;
		}
			// 2) if ù ��° ���� vs �� ��° ����, �ڸ��ٲ�
		if (first > third)
		{
			temp = first;
			first = third;
			third = temp;
		}
			// 3) if �� ��° ���� vs �� ��° ����, �ڸ��ٲ�
		if (second > third)
		{
			temp = second;
			second = third;
			third = temp;
		}

		// ���� ��� ���
		System.out.printf(">> ���� ��� : %d %d %d\n", first, second, third);
*/
//���2) xor ������ Ȱ��
			// 1) if ù ��° ���� > �� ��° ����, �ڸ��ٲ�
		if (first > second)
		{
			first  = first ^ second;
			second = second ^ first;
			first  = first ^ second;
		}
			// 2) if ù ��° ���� vs �� ��° ����, �ڸ��ٲ�
		if (first > third)
		{
			first = first ^ third;
			third = third ^ first;
			first = first ^ third;
		}
			// 3) if �� ��° ���� vs �� ��° ����, �ڸ��ٲ�
		if (second > third)
		{
			second = second ^ third;
			third  = third ^ second;
			second = second ^ third;
		}

		// ���� ��� ���
		System.out.printf(">> ���� ��� : %d %d %d\n", first, second, third);
	}
}

// ���� ���
/*
ù ��° ���� �Է� : 7
�� ��° ���� �Է� : 40
�� ��° ���� �Է� : 42
>> ���� ��� : 7 40 42
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 26
�� ��° ���� �Է� : 72
�� ��° ���� �Է� : 40
>> ���� ��� : 26 40 72
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 89
�� ��° ���� �Է� : 4
�� ��° ���� �Է� : 4
>> ���� ��� : 4 4 89
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/