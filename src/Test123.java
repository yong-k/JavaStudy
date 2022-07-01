 /*==========================
   ���� Ŭ���� ��� ����
============================*/

// �������̽�(Interface)
/*
�� �ǽ� ����
���� ó�� ���α׷��� �����Ѵ�.
��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

���� ��)
�ο� �� �Է�(1~10) : 2
1��° �л��� �й� �̸� �Է�(���� ����) : 2280946 ȫ����
���� ���� ���� ���� �Է�   (���� ����) : 90 100 85
2��° �л��� �й� �̸� �Է�(���� ����) : 2290847 �ֹ���
���� ���� ���� ���� �Է�   (���� ����) : 85 70 65

				���� ���� ����		������		���
2280946 ȫ����	 90  100   85		  xxx        xx
				 ��   ��   ��
2290847 �ֹ���	 85   70   65		  xxx        xx
				 ��   ��   ��

����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.util.Scanner;

// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��
class Record3
{
	String hak, name;	//-- �й�, �̸�
	int kor, eng, mat;	//-- ����, ����, ���� ����
	int tot, avg;		//-- ����, ���(���ǻ� ���� ó��)
}

// �������̽�
interface Sungjuk3
{
	public void set();		//-- �ο� ����
	public void input();	//-- ������ �Է�
	public void print();	//-- ��� ���
}

// ���� �ذ� �������� �����ؾ� �� Ŭ���� �� Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl implements Sungjuk3
{
	private int inwon;
	private Record3[] rec;

	// �ο� ����
	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("�ο� �� �Է�(1~10) : ");
		inwon = sc.nextInt();

		System.out.println();

		// �Է¹��� �ο��� ���̷� Record type �迭 ����
		rec = new Record3[inwon];
	} 

	// ������ �Է�
	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < rec.length; i++)
		{
			// Record type �迭 ���̸�ŭ Record type ��ü ����
			rec[i] = new Record3();

			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ", i + 1);
			rec[i].hak  = sc.next();
			rec[i].name = sc.next();
			System.out.print("���� ���� ���� ���� �Է�   (���� ����) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot / 3;
		}
	}

	// ���������� ��޿� ���� ������ ������ �޼ҵ�
	private String panjung(int score)
	{
		String result;

		if (score >= 90 && score <= 100)
			result = "��";
		else if (score >= 80)
			result = "��";
		else if (score >= 70)
			result = "��";
		else if (score >= 60)
			result = "��";
		else if (score >= 0)
			result = "��";
		else
			result = "??";

		return result;
	}

	// ��� ���
	@Override
	public void print()
	{
		System.out.println("\n=============================================");
		System.out.println("  �й�    �̸�   ���� ���� ����  ����  ���");
		System.out.println("---------------------------------------------");
		
		for (int i = 0; i < rec.length; i++)
		{
			// [���� �̸� ���� ���� ���] ���
			System.out.printf("%s %s\t %3d  %3d  %3d\t  %d\t%d\n",
				rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat,
				rec[i].tot, rec[i].avg);

			System.out.println(); 

			// ������ ���� ���
			System.out.printf("\t\t%3s %3s %3s\n", 
				panjung(rec[i].kor), panjung(rec[i].eng), panjung(rec[i].mat));

			if (i != rec.length - 1)
				System.out.println("---------------------------------------------");
		}
		

		System.out.println("=============================================\n");
	}
}

public class Test123
{
	public static void main(String[] args)
	{
		Sungjuk3 ob = new SungjukImpl();

		// ���� �ذ� �������� �ۼ��ؾ� �� ob ����
		ob.set();
		ob.input();
		ob.print();
	}
}

// ���� ���
/*

*/