 /*================================
   ���� Ŭ������ �ν��Ͻ� ����
==================================*/

// Ŭ���� ����
// �迭 Ȱ��
// �������������ڿ� ��������
/*
����ڷκ��� ��, ��, ���� �Է¹޾�
�ش� ��¥�� ������ ����ϴ� ���α׷��� �����Ѵ�.
��, �޷� Ŭ����(Calendar)�� ������� �ʴ´�.
����, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�. (WeekDay Ŭ���� ����)
�׸���, �迭�� ���䵵 ������� �ۼ��� �� �ֵ��� �Ѵ�.
���������������� ���䵵 Ȯ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
���������� WeekDay Ŭ���� ���踦 ����
Test101 Ŭ������ main() �޼ҵ尡 ���������� ���α׷� ����� �� �ֵ��� �Ѵ�.

�� 1�� 1�� 1�� �� ������
   1�� 1�� 1�� ���� ��ĥ�� �귶���� ����ϸ� �ٷ� ���� ����
�� ����(2��: 29��),���(2��: 28��) �� ����
	year % 4 == 0 && year % 100 != 0 || year % 400 == 0
�� ���� �迭��

���� ��)
�� �� �� �Է�(���� ����) : 2022 1 19
2022�� 1�� 19�� �� ������
����Ϸ��� �ƹ� Ű�� ��������...

�� �� �� �Է�(���� ����) : 2000 5 4 
2000�� 5�� 4�� �� �����
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.util.Scanner;

class WeekDay2
{
	private int year, month, day, weekday;
	//private String weekDay;					//-����

	// 1�� ~ 12�������� days
		// �ϴ� 2���� ���(28��) �������� �� �־����
	private int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private String[] weekDays = { "������", "ȭ����", "������", "�����", "�ݿ���", "�����", "�Ͽ���" };

	// ��, ��, �� �Է¹���
	void input()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �� �� �Է�(���� ����) : ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
	}

	// 1�� 1�� 1�Ϻ��� ����ڰ� �Է��� �������� ���� �� ���� ���ؼ�
	// �װɷ� ���� ����
	String calWeekDay()
	{	
		int totalDays = 0;
		String weekDay;

		// year
		for (int i = 1; i < year; i++)
		{
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
				totalDays += 366;
			else
				totalDays += 365;
		}

		// month
		for (int i = 0; i < month - 1; i++)
			totalDays += months[i];

			// months �迭�� 2���� 28�Ϸ� �س���,
			// ����, ����ڰ� �Է��� �ذ� �����̰� && �Է��� ���� 3��~12�� �̶��,
			//		totalDays += 1; ����� ��
		if ( (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) && month >= 3 )
			totalDays+= 1;


		// day
		totalDays += day;

		
		// ���� ���ϱ�
		weekDay = weekDays[(totalDays - 1) % 7];

		return weekDay;
	}

	// ���
	void printWeekDay(String weekDay)
	{
		System.out.printf("%d�� %d�� %d�� �� %s\n", year, month, day, weekDay);
	}
}

public class Test101_�޷�1_���Ͼ˾Ƴ���
{
	public static void main(String[] args)
	{
		WeekDay2 day = new WeekDay2();
		day.input();
		day.printWeekDay(day.calWeekDay());
	}
}

// ���� ���
/*

*/