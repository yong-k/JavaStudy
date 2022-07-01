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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test146
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Calendar cal = new GregorianCalendar();
		String[] week = { "��", "��", "ȭ", "��", "��", "��", "��" };
		int dayAfter;	//-- ����� �Է� �� ��

	
		// ���� ��¥ ���
		System.out.printf("���� ��¥ : %d-%d-%d %s����\n", 
			cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1,
			cal.get(Calendar.DATE), week[cal.get(Calendar.DAY_OF_WEEK) - 1]);

		// ����� �Է� �ޱ�
		System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
		dayAfter = Integer.parseInt(br.readLine());
	
		// ���� ��¥ + ������Է� �� 
		cal.add(Calendar.DATE, dayAfter);

		// ��� ���
		System.out.println("\n===========[Ȯ�� ���]===========");

		System.out.printf("%d�� �� : %d-%d-%d %s����\n", dayAfter, 
			cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1,
			cal.get(Calendar.DATE), week[cal.get(Calendar.DAY_OF_WEEK) - 1]);

		System.out.println("=================================");
		
	}
}

// ���� ���
/*
���� ��¥ : 2022-2-3 �����
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

===========[Ȯ�� ���]===========
200�� �� : 2022-8-22 ������
=================================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/