/*===========================================
   ���� ���� �帧�� ��Ʈ�� (���) ����
============================================*/

// �ݺ���(while��) �ǽ�
/*  << ���� >>
����ڷκ��� ������ ������ �Է¹޾�
1���� �Է¹��� �� ����������
��ü �԰�, ¦���� �հ�, Ȧ���� ����
���� ��������� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
������ ���� �Է� : 280
>> 1 ~ 280 ���� ������ �� : xxxx
>> 1 ~ 280 ���� ¦���� �� : xxxx
>> 1 ~ 280 ���� Ȧ���� �� : xxxx
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.util.Scanner;

public class Test055
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ���� �� �ʱ�ȭ
		Scanner sc = new Scanner(System.in);
		
		int inputNum;							//-- ����� �Է� ����
		int n = 1;								//-- �ݺ������� ����� ����
		int sum = 0, evenSum = 0, oddSum = 0;	//-- ����,¦��,Ȧ���� �� ����

		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		inputNum = sc.nextInt();

		while (n <= inputNum)
		{
			sum += n;

			if (n % 2 == 0)
				evenSum += n;
			else if (n % 2 != 0)
				oddSum += n;
			else
			{
				System.out.println("�Ǻ� �Ұ�");
				System.out.println("==== ���α׷� ���� ====");
				return;
			}

			n++;
		}

		// ��� ���
		System.out.printf(">> 1 ~ %d ���� ������ �� : %d\n", inputNum, sum);
		System.out.printf(">> 1 ~ %d ���� ¦���� �� : %d\n", inputNum, evenSum);
		System.out.printf(">> 1 ~ %d ���� Ȧ���� �� : %d\n", inputNum, oddSum);
	}
}

// ���� ���
/*
������ ���� �Է� : 100
>> 1 ~ 100 ���� ������ �� : 5050
>> 1 ~ 100 ���� ¦���� �� : 2550
>> 1 ~ 100 ���� Ȧ���� �� : 2500
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/