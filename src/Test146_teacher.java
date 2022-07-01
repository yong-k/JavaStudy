 /*=======================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
=========================================*/

// Calendar Ŭ����
/*
�� �ǽ� ����
   ������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������
   Ȯ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.

   �� ���� ��¥�� �������� �� �� ���ϴ� ���� �޼ҵ� Ȱ��
      �� API ���� ã�ƺ��� 

   ���� ��)
   ���� ��¥ : 2022-2-3 �����
   �� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

   ===========[Ȯ�� ���]===========
   200�� �� : XXXX-X-X X����
   =================================
   ����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test146_teacher
{
	public static void main(String[] args) 
	{
		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		int nalsu;			//-- ����ڷκ��� �Է¹��� �� ��
		int y, m, d, w;		//-- ��, ��, ��, ����
		String[] week = { "��", "��", "ȭ", "��", "��", "��", "��" };

		// ������ ��, ��, ��, ���� Ȯ��(�������� : get())
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1;	//-- ��+1�� check~!!!
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		// ������ ��, ��, ��, ���� Ȯ�� ��� ���
		System.out.printf("���� ��¥ : %d-%d-%d %s����\n", y, m, d, week[w - 1]);

		// ����� �Է� �ޱ�
		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu < 1);
	
		// check~!!!
		now.add(Calendar.DATE, nalsu);

		// ��� ���
		System.out.println("\n===========[Ȯ�� ���]===========");

		System.out.printf("%d�� �� : %tF %tA\n", nalsu, now, now);
		//-- check~!!!
		// %tF : ����-��-�� 
		// %tA : ����

		System.out.println("=================================");
		
	}
}

// ���� ���
/*
���� ��¥ : 2022-2-3 �����
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

===========[Ȯ�� ���]===========
200�� �� : 2022-08-22 ������
=================================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/