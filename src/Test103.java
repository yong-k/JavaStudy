 /*================================
   ���� Ŭ������ �ν��Ͻ� ����
==================================*/

// Ŭ������ �ν��Ͻ� Ȱ��
/*
�л����� ��������, ��������, ���������� �Է¹޾�
����, ����� ����ϴ� ���α׷��� �����Ѵ�.
����, �� �������� �迭�� ���������� Ȱ���� �� �ֵ��� �Ѵ�.
Ŭ���� ����� ������ ���̵���ο� ���� ������ �� �ֵ��� �Ѵ�.

���α׷��� �����ϴ� Ŭ����
1. Record Ŭ����
	- �Ӽ��� �����ϴ� Ŭ������ ������ �� => �׳� ������ ������
		=> Sungjuk Ŭ�������� Record�� �ϳ��� �ڷ���ó�� Ȱ���ϰԲ�

2. Sungjuk Ŭ����
	- �ο� ���� �Է¹޾�, �Է¹��� �ο� �� ��ŭ 
	  �̸�, ��������, ��������, ���������� �Է¹ް�
	  ������ ����� �����ϴ� Ŭ������ ������ ��
		@ �Ӽ�: �ο���, Record ������ �迭
		@ ���: �ο��� �Է�, �� ������ �Է�, ���� �� ��� ����, ��� ���

3. Test103 Ŭ����
	- main() �޼ҵ尡 �����ϴ� �ܺ� Ŭ������ ������ ��

���� ��)
�ο� �� �Է�(1 ~ 100) : 102
�ο� �� �Է�(1 ~ 100) : -10
�ο� �� �Է�(1 ~ 100) : 3

1��° �л��� �̸� �Է� : ����
���� ���� : 90
���� ���� : 80
���� ���� : 70

2��° �л��� �̸� �Է� : �Ӽҹ�
���� ���� : 92
���� ���� : 82
���� ���� : 72

3��° �л��� �̸� �Է� : �̿���
���� ���� : 82
���� ���� : 72
���� ���� : 62

 �̸�   ����  ����  ����   ����  ���   ���� 
����   90    80    70    240   xx.xx    2
�Ӽҹ�   92    82    72    xxx   xx.xx    1
�̿���   82    72    62    xxx   xx.xx    3
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.util.Scanner;

// Record ��ü 1�� => �л� 1��
class Record
{
	// �л� 1���� ǥ���� �� �ִ� �Ӽ���� �����ض�
	String name = "";
	//int korScore, engScore, mathScore;
	int[] score = new int[3];	//-- ����, ����, �������� ���
	int total = 0;
	double avg;
	int rank = 1;
}

class Sungjuk
{
	Scanner sc = new Scanner(System.in);
	int personNum;	//--�ο���
	Record[] rec;

	// �ο��� �Է� �޼ҵ� 
	public void inputPersonNum()
	{
		while (personNum < 1 || personNum > 100)
		{
			System.out.print("�ο� �� �Է�(1 ~ 100) : ");
			personNum = sc.nextInt();
		}
		
		rec = new Record[personNum];
	}

	// �� ������ �Է� �޼ҵ� + ���� �� ��� ���� ���⼭ ����
	public void inputData()
	{	
		System.out.println();
		for (int i = 0; i < rec.length; i++)
		{
			rec[i] = new Record();	//-- ***** �̰� ���Ծ �� �ƾ��� ��,��
			System.out.printf("%d��° �л��� �̸� �Է� : ", i + 1);
			rec[i].name = sc.next();
			System.out.print("���� ���� : ");
			rec[i].score[0] = sc.nextInt();
			System.out.print("���� ���� : ");
			rec[i].score[1] = sc.nextInt();
			System.out.print("���� ���� : ");
			rec[i].score[2] = sc.nextInt();

			// ���� �� ��� ����
			rec[i].total = rec[i].score[0] + rec[i].score[1] + rec[i].score[2];
			rec[i].avg = rec[i].total / 3.0;

			System.out.println();
		}
	}
/*
	// ���� �� ��� ���� �޼ҵ�
	public void calculate()
	{
		for (int i = 0; i < rec.length; i++)
		{
			rec[i].total = rec[i].korScore + rec[i].engScore + rec[i].mathScore;
			rec[i].avg = rec[i].total / 3.0;
		}
	}
*/
	// ��� ��� �޼ҵ�
	public void printResult()
	{
		// ranking() �޼ҵ� ȣ�������μ� �����Ŵ
		ranking();

		System.out.println(" �̸�  ����  ����  ����  ����  ���  ���� ");
		for (int i = 0; i < rec.length; i++)
		{
			System.out.printf("%3s %3d %5d %5d  %5d  %.2f %3d\n", 
				rec[i].name, rec[i].score[0], rec[i].score[1], rec[i].score[2],
				rec[i].total, rec[i].avg, rec[i].rank);
		}
	}

	// ���� ���� �޼ҵ�
	//--��) rank = 1 �� �ʱ�ȭ�س���, ���� ���ϸ鼭 ���� ���� +1 ����
	private void ranking()
	{	
		for (int i = 0; i < personNum - 1; i++)
		{
			for (int j = i + 1; j < personNum; j++)
			{
				if (rec[i].avg > rec[j].avg)
					rec[j].rank++;
				else if (rec[i].avg < rec[j].avg)
					rec[i].rank++;
			}
		}
	}


}

public class Test103
{
	public static void main(String[] args)
	{
		Sungjuk sj = new Sungjuk();
		sj.inputPersonNum();
		sj.inputData();
		sj.printResult();
	}
}

// ���� ���
/*

*/