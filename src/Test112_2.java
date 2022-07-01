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

class Student
{
	String name;
	int score;
}

public class Test112_2
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		int num;			//-- ����� �Է¹��� [�ο� ��]
		boolean flag;		//-- ���� ���� ���Ŀ��� ����� flag ����
		Student[] std;

		// ���� �� ó��
		System.out.print("�ο� �� �Է� : ");
		num = sc.nextInt();
		
		//---- �Է¹��� [�ο� ��] ���� ��ŭ Student type �迭 ����
		std = new Student[num];

		// �迭���̸�ŭ �ݺ��� ����, �̸�&���� ä������
		for (int i = 0; i < std.length; i++)
		{
			std[i] = new Student();		//--- ***** check *****
			System.out.printf("%d) �̸� ���� �Է�(���� ����) : ", i + 1);
			std[i].name  = sc.next();
			std[i].score = sc.nextInt();

			if (std[i].score < 0 || std[i].score > 100)
			{
				System.out.println("\n! ���� �Է� ���� !");
				System.out.println("=== ���α׷� ���� ===\n");
				return;
			}
		}

		// ���� ���� ����
		flag = false;

		for (int i = 1; i < std.length; i++)
		{
			flag = false;

			for (int j = 0; j < std.length - i; j++)
			{
				if (std[j].score < std[j + 1].score)
				{
					// String ���� XOR ������(^) ��� �Ұ�
					// => Student type �� temp ����ؼ� �� ���� �ڸ��ٲ�
					Student temp = new Student();

					temp = std[j];
					std[j] = std[j + 1];
					std[j + 1] = temp;
				}
			}

			if (flag == true)
				break;
		}


		// ��� ���
		System.out.println();
		System.out.println("==================");
		
		for (int i = 0; i < std.length; i++)
			System.out.printf("  %d�� %s %d\n", (i + 1), std[i].name, std[i].score);

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