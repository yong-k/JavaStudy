 /*===================
   ���� �迭 ����
=====================*/

// �迭�� ����� �ʱ�ȭ
// �迭�� �⺻�� Ȱ��
/*
����ڷκ��� �ο����� �Է¹ް�
�Է¹��� �ο� �� ��ŭ�� �л� �̸��� ��ȭ��ȣ�� �Է¹ް�
�̸� �̸� �迭�� ��ȭ��ȣ �迭�� �����Ͽ�
����� ����� �� �ִ� ���α׷��� �����Ѵ�.

���� ��)
�Է� ó���� �л� �� �Է�[(��), 1~10] : 27
�Է� ó���� �л� �� �Է�[(��), 1~10] : -5
�Է� ó���� �л� �� �Է�[(��), 1~10] : 3
�̸� ��ȭ��ȣ �Է�[1](���� ����) : ������ 010-1111-1111
�̸� ��ȭ��ȣ �Է�[2](���� ����) : �Ž��� 010-2222-2222
�̸� ��ȭ��ȣ �Է�[3](���� ����) : ���̻� 010-3333-3333

---------------------------------------------------------
��ü �л� �� : 3��
----------------------
----------------------
�̸�	��ȭ��ȣ
������	010-1111-1111
�Ž���	010-2222-2222
���̻�	010-3333-3333
----------------------
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.util.Scanner;

public class Test084
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
//��
/*
		int studentNum = 0;				// �Է� ó���� �л� ��
		String[] studentName = null;	// �̸� �迭 ����
		String[] studentPhone = null;	// ��ȭ��ȣ �迭 ����
		int count = 1;					// while �ݺ��� ���� ����

		
		while (count != 0)
		{
			System.out.print("�Է� ó���� �л� �� �Է�[(��), 1~10] : ");
			studentNum = sc.nextInt();

			if (studentNum < 1 || studentNum > 10)	
				continue;
			
			count = studentNum;
			studentName = new String[studentNum];
			studentPhone = new String[studentNum];

			for (int i = 0; i < studentNum; i++, count--)
			{
				System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ", i);
				studentName[i] = sc.next();
				studentPhone[i] = sc.next();
			}
		}
		
		System.out.println("---------------------------------------------------------");
		System.out.printf("��ü �л� �� : %d��\n", studentNum);
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("�̸�	��ȭ��ȣ");
	
		for (int i = 0; i < studentNum; i++)
		{
			System.out.printf("%s\t", studentName[i + 1]);
			System.out.printf("%s\n", studentPhone[i + 1]);
		}

		System.out.println("----------------------");
*/
//��	
		// ����ڰ� �Է��ϴ� �л� ��
		int memberCount;
		
		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�[(��), 1~10] : ");
			memberCount = sc.nextInt();
		}
		while (memberCount < 1 || memberCount > 10);

		// �ο� �� ��ŭ�� �̸� ���� �迭 ����
		String[] names = new String[memberCount];

		// �ο� �� ��ŭ�� ��ȭ��ȣ ���� �迭 ����
		String[] tels = new String[names.length];

		// �ο� �� ��ŭ�� �ȳ� �޼��� ��� �� �Է°� ��Ƴ���
		for (int i = 0; i < memberCount; i++)
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ", (i + 1));
			names[i] = sc.next();
			tels[i] = sc.next();
		}

		// ���� ���(�̸�, ��ȭ��ȣ) ���
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.printf("��ü �л� �� : %d��\n", memberCount);
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("�̸�	��ȭ��ȣ");
	
		for (int i = 0; i < memberCount; i++)
			System.out.printf("%s\t%s\n", names[i], tels[i]);

		System.out.println("----------------------");
	}
}

// ���� ���
/*
�Է� ó���� �л� �� �Է�[(��), 1~10] : 100
�Է� ó���� �л� �� �Է�[(��), 1~10] : -3
�Է� ó���� �л� �� �Է�[(��), 1~10] : 3
�̸� ��ȭ��ȣ �Է�[1](���� ����) : ������ 010-1111-1111
�̸� ��ȭ��ȣ �Է�[2](���� ����) : �Ž��� 010-2222-2222
�̸� ��ȭ��ȣ �Է�[3](���� ����) : ���̻� 010-3333-3333

---------------------------------------------------------
��ü �л� �� : 3��
----------------------
----------------------
�̸�    ��ȭ��ȣ
������  010-1111-1111
�Ž���  010-2222-2222
���̻�  010-3333-3333
----------------------
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/