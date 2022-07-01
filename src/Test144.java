 /*=======================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
=========================================*/

// Calendar Ŭ����
/*
�� Calendar  Ŭ������ �߻� Ŭ�����̱� ������ ��ü�� ������ �� ����.
   (�߻� Ŭ���� : �̿ϼ��� Ŭ����)

   Calendar ob = new Calendar();
   �� �̿� ���� ������ ���� �ν��Ͻ� ���� �Ұ�

�� Calendar Ŭ���� ��ü(�ν��Ͻ�)�� ������ �� �ִ� ���

   1. Calendar ob1 = Calendar.getInstance();

   2. Calendar ob2 = new GregorianCalendar();
   // ���� ������ ���� ������ �� �ִ� ��
   => GregorianCalendar ��� Ŭ������ �ְڱ���.
   => GregorianCalendar �� Calendar�� ����Ŭ�����ڱ���
      Calendar��� �߻�Ŭ������ ��ӹ޾Ұڱ���
   => Calendar�� �߻�޼ҵ� �����ؼ� ������ abstract ����ǥ�� �ñ���
   => ��ĳ���� �����̱���
   
   ==> ���� �츮�� ����ϰ� �ִ� �޷� �ý��� : Gregorian��

   3. GregorianCalendar ob3 = new GregorianCalendar();

   (�� GregorianCalendar : Calendar Ŭ������ ���� Ŭ����)
*/

// ��, ��, ��, ������ Calendar ��ü�κ��� �����ͼ� ���

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test144
{
	public static void main(String[] args)
	{
		// Calendar Ŭ���� ��� �ν��Ͻ� ����
		//Calendar ob = new Calendar();	
		//--==> error: Calendar is abstract; cannot be instantiated
		Calendar rightNow = Calendar.getInstance();

		// ������ �޷�(Calendar) �ν��Ͻ��� ���� 
		// ��¥ ���� ������ �� �� �ִ� �޼ҵ� �� ��get()��
	
		// ���� ��¥ : 2022�� 2�� 3�� �����
		int y = rightNow.get(Calendar.YEAR);
		// YEAR => static final
		System.out.println(y);	// 2022

		int m = rightNow.get(Calendar.MONTH);
		System.out.println(m);	// 1
		//--> �迭 �ε���ó�� ó���ǰ� ����
		// ������ �� ���� +1 ����� �ϰ�,
		// �� ���� ����   -1 ����� �Ѵ�.
		m = rightNow.get(Calendar.MONTH) + 1;	//-- ��+1�� check~!!!
		System.out.println(m);	// 2

		int d = rightNow.get(Calendar.DATE);
		System.out.println(d);	// 3


		int w = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println(d);	// 5  (�� �����)

		// �׽�Ʈ
		System.out.println(Calendar.SUNDAY);	// 1
		System.out.println(Calendar.MONDAY);	// 2
		System.out.println(Calendar.TUESDAY);	// 3
		System.out.println(Calendar.WEDNESDAY); // 4
		System.out.println(Calendar.THURSDAY);	// 5
		System.out.println(Calendar.FRIDAY);	// 6
		System.out.println(Calendar.SATURDAY);	// 7
	
		System.out.println();
		System.out.println(y + "-" + m + "-" + d + " "  + w);
		//--==> 2022-2-3 5
		
		String week = "";
		switch (w)
		{
		case 1: 
			week = "�Ͽ���"; break;
		case 2: 
			week = "������"; break;
		case 3: 
			week = "ȭ����"; break;
		case 4: 
			week = "������"; break;
		case 5: 
			week = "�����"; break;
		case 6: 
			week = "�ݿ���"; break;
		case 7: 
			week = "�����"; break;
		}

		System.out.println(y + "-" + m + "-" + d + " "  + week);
		//--==> 2022-2-3 �����

		System.out.println("/////////////////////////////////////////////");

		// Calendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar rightNow2 = new GregorianCalendar();

		String[] week2 = { "�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����" };

		// �޷��� ��¥ ���� �� ��set()�� �޼ҵ� Ȱ��
		// ���� ���� ��¥ : 2022�� 6�� 20�� 
		//rightNow2.set(2022, 6, 20);	//--> �̷��� �ϸ� 7���� ��!!! -1 ����� ��
		rightNow2.set(2022, 5, 20);		// 6�� -- ��-1�� check~!!!

		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));	
		//--==> 2

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK) - 1]);
		//--==> ������

	}	
}

// ���� ���
/*

*/