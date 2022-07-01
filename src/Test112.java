 /*==================================
   ���� ����(Sort) �˰��� ����
====================================*/
/*	<<< ���� >>>
����ڷκ��� ���� �л��� ���� �����͸� �Է¹޾�
������ ���� �л����� ���� ������ ����� �ο��Ͽ�
����� ����ϴ� ���α׷��� �����Ѵ�.
��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

���� ��)
�ο� �� �Է� : 5
1) �̸� ���� �Է�(���� ����) : �̾Ƹ� 90
2) �̸� ���� �Է�(���� ����) : ������ 80
3) �̸� ���� �Է�(���� ����) : ������ 85
4) �̸� ���� �Է�(���� ����) : ������ 75
5) �̸� ���� �Է�(���� ����) : ��μ� 95

==================
  1�� ��μ� 95
  2�� �̾Ƹ� 90
  3�� ������ 85
  4�� ������ 80
  5�� ������ 75
==================
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.util.Scanner;

public class Test112
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		int num;			//-- ����� �Է¹��� [�ο� ��]
		String[] names;		//-- �̸� �迭
		int[] scores;		//-- ���� �迭
		String temp;		//-- String���� swap �� ���
		boolean flag;		//-- ���� ���� ���Ŀ��� ����� flag ����

		// ���� �� ó��
		System.out.print("�ο� �� �Է� : ");
		num = sc.nextInt();
		
		//---- �Է¹��� [�ο� ��] ���� ��ŭ names[], scores[] �迭 ����
		names  = new String[num];
		scores = new int[num];

		// �迭���̸�ŭ �ݺ��� ����, �̸�&���� ä������
		for (int i = 0; i < names.length; i++)
		{
			System.out.printf("%d) �̸� ���� �Է�(���� ����) : ", i + 1);
			names[i]  = sc.next();
			scores[i] = sc.nextInt();

			if (scores[i] < 0 || scores[i] > 100)
			{
				System.out.println("\n! ���� �Է� ���� !");
				System.out.println("=== ���α׷� ���� ===\n");
				return;
			}
		}

		// ���� ���� ����
		flag = false;

		for (int i = 1; i < scores.length; i++)
		{
			flag = false;

			for (int j = 0; j < scores.length - i; j++)
			{
				if (scores[j] < scores[j + 1])
				{
					// ����[]�� �̸�[] �ε��� ¦ �����ֱ� ���ؼ�
					// ����[], �̸�[] �� �ڸ� �ٲ���
					scores[j]     = scores[j] ^ scores[j + 1];
					scores[j + 1] = scores[j + 1] ^ scores[j];
					scores[j]     = scores[j] ^ scores[j + 1];

					// String�� ^ ������ ��� �Ұ�
					temp = names[j];
					names[j] = names[j + 1];
					names[j + 1] = temp;

					flag = true;
				}
			}

			if (flag == false)
				break;
		}


		// ��� ���
		System.out.println();
		System.out.println("==================");
		
		for (int i = 0; i < names.length; i++)
			System.out.printf("  %d�� %s %d\n", (i + 1), names[i], scores[i]);

		System.out.println("==================");

	}
}

// ���� ���
/*
�ο� �� �Է� : 5
1) �̸� ���� �Է�(���� ����) : aaa 72
2) �̸� ���� �Է�(���� ����) : bbb 54
3) �̸� ���� �Է�(���� ����) : ccc 99
4) �̸� ���� �Է�(���� ����) : ddd 24
5) �̸� ���� �Է�(���� ����) : eee 32

==================
  1�� ccc 99
  2�� aaa 72
  3�� bbb 54
  4�� eee 32
  5�� ddd 24
==================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/