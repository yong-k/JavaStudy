/*===========================================
   ���� ���� �帧�� ��Ʈ�� (���) ����
============================================*/

// �ݺ���(while��) �ǽ�
/*
����ڷκ��� ������ �� ������ �Է¹޾�
���� �� ���� ū �� ������ ���� ���Ͽ�
����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 20
>> 10 ~ 20 ������ �� : xxx
����Ϸ��� �ƹ� Ű�� ��������...

ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2
>> 2 ~ 10 ������ �� : xx
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test054
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ���� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2;
		int sum = 0;
		int backupNum1;		//num1 �� �Űܴ�� ���� �ݺ��� �ȿ��� ���� ������ Ȱ��

		// ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());

		if (num1 > num2)
		{
			num1 = num1 ^ num2;
			num2 = num2 ^ num1;
			num1 = num1 ^ num2;
		}
		
		// �ݺ� ���� ����
		// �ݺ� ������ �����ϱ� ����
		// ���� ���� ���� �����Ͽ� ���� ������ Ȱ���Ѵ�.
		// ��� ��� �������� �Է¹��� ���� ���� �ʿ��ѵ�
		// �� ���� �ݺ��������� ����ϰ� �Ǹ� 
		// ������ ���� Ȯ���� �� ���� ������ !

		backupNum1 = num1;

		while (backupNum1 <= num2)
		{
			sum += backupNum1;
			backupNum1++;
		}

		// ��� ���
		System.out.printf("%d ~ %d ������ �� : %d\n", num1, num2, sum);
	}
}

// ���� ���
/*
ù ��° ���� �Է� : 1
�� ��° ���� �Է� : 10
1 ~ 10 ������ �� : 55
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 1
1 ~ 10 ������ �� : 55
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 2
�� ��° ���� �Է� : 2
2 ~ 2 ������ �� : 2
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/