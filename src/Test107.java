 /*======================
   ���� ����޷� ����
=========================*/
/*
������ ���� ����� ���α׷��� �����Ѵ�.

���� ��)
���������� �Է��ϼ��� : 2022
�������� �Է��ϼ���   : 6

	  [ 2022�� 6�� ]
 ��  ��  ȭ  ��  ��  ��  ��
===========================
              1   2   3   4
  5   6   7   8   9  10  11
 12  13  14  15  16  17  18
 			: 
 26  27  28  29  30
===========================
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.util.Scanner;

public class Test107
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		int year, month;
		int totalDays = 0;
		String[] days = { "��", "��", "ȭ", "��", "��", "��", "��" };
		int[] months = { 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[][] calendar = new int[6][7];
		//int[] calendarMonth;

		// ���� �� ó��
		System.out.print("���������� �Է��ϼ��� : ");
		year = sc.nextInt();
		System.out.print("�������� �Է��ϼ��� : ");
		month = sc.nextInt();
		
		//----����,��� ���� �� months[] �� 2�� ��¥ ä���ֱ�
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			months[1] = 29;
		else 
			months[1] = 28;
		
		//-- ����� �Է� month�� day���� ���� �迭 ����
		//0calendarMonth = new int[months[month - 1]];

		//----����ڰ� �Է��� month �� 1�� ���ۿ��� �˾Ƴ���
		//--1) 1�� ~ (year - 1) ���� ���� �� ��
		totalDays = (year - 1) * 365 + ((year - 1) / 4) - ((year - 1) / 100) 
					+ ((year - 1) / 400);
		
		//--2) 1�� ~ (month - 1) ���� ���� �� ��
		for (int i = 0; i < (month - 1); i++)
			totalDays += months[i];

		//--3) �ű⿡ +1�� ���ָ� year�� month�� 1���� ��
		totalDays += 1;           
		
		//����
		//System.out.println(days[totalDays % 7]);

		// ��� ���
		System.out.println();
		System.out.printf("\t[ %d�� %d�� ]\n", year, month);

		//----�������
		for (int i = 0; i < days.length; i++)
			System.out.printf("%3s", days[i]);

		System.out.println();
		System.out.println("=============================");
		
		int n = 1;
		for (int i = 0; i < calendar.length; i++)
		{
			for (int j = 0; j < calendar[i].length; j++)
			{
				if (i == 0)
				{
					calendar[i][(totalDays % 7) + j] = n++;

					if ( ((totalDays % 7) + j) != 0 && ((totalDays % 7) + j) % 6 == 0)
					break;
				}
				else
					calendar[i][j] = n++;

				if (n > months[month-1])
					break;
			}
			if (n > months[month-1])
				break;
		}

		//--�޷����
		for (int i = 0; i < calendar.length; i++)
		{
			if (i == calendar.length - 1 && calendar[i][0] == 0)
				break;

			for (int j = 0; j < calendar[i].length; j++)
			{
				if (calendar[i][j] == 0)
					System.out.print("    ");
				else
					System.out.printf("%4d", calendar[i][j]);
			}
			System.out.println();
		}

		System.out.println("=============================");


	}
}

// ���� ���
/*
���������� �Է��ϼ��� : 2022
�������� �Է��ϼ��� : 4

        [ 2022�� 4�� ]
  ��  ��  ȭ  ��  ��  ��  ��
=============================
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
=============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/