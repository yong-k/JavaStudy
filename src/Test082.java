 /*===================
   ���� �迭 ����
=====================*/

// �迭�� �⺻�� Ȱ��
/*
������ �������� ����ִ� �迭�� ���� �����͵� ��
¦���� ��Ҹ� ��� ����ϰ�, 3�� ����� ��Ҹ� ��� ����ϴ� 
���α׷��� �����Ѵ�.

�迭�� �����ϴ� ������ ���� = 4 7 9 1 3 2 5 6 8

���� ��)
�迭 ��� ��ü ���
4 7 9 1 3 2 5 6 8
¦�� ������ ���
4 2 6 8
3�� ��� ������ ���
9 3 6 
����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test082
{
	public static void main(String[] args)
	{
// ��
/*  
		int[] arr = { 4, 7, 9, 1, 3, 2, 5, 6, 8 };
		int[] arrEven = new int[4];
		int[] arrThree = new int[3];

		int countEven = 0; 
		int countThree = 0;

		// �迭 ��� ����
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 0)
			{	
				arrEven[countEven] = arr[i];
				countEven++;
			}

			if (arr[i] % 3 == 0)
			{
				arrThree[countThree] = arr[i];
				countThree++;
			}
		}

		// �迭 ��� ���
		System.out.println("�迭 ��� ��ü ���");
		for (int i = 0; i < 8; i++)
		{
			System.out.printf("%d ", arr[i]);
		}

		System.out.println("\n¦�� ������ ���");
		for (int i = 0; i < 4; i++)
		{
			System.out.printf("%d ", arrEven[i]);
		}


		System.out.println("\n3�� ��� ������ ���");
		for (int i = 0; i < 3; i++)
		{
			System.out.printf("%d ", arrThree[i]);
		}
		System.out.println();
*/
//��

		// �迭 ���� �� �ʱ�ȭ
		int[] arr = { 4, 7, 9, 1, 3, 2, 5, 6, 8 };

		System.out.println(arr);
		//==> [I@15db9742
		// �� �Ϲ����� ������ ��� ������ ����ϴ� ����(���)���δ�
		//    �迭�� ��� �����͵��� ����� �� ����.

		// �� �迭 arr�� ���� Ȯ�� : arr.length
		System.out.println("�迭 ��� ��ü ���");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("¦�� ������ ���");
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 0)
				System.out.print(arr[i] + " ");
			
		}
		System.out.println();

		System.out.println("3�� ��� ������ ���");
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 3 == 0)
				System.out.print(arr[i] + " " );
		}
		System.out.println();

	}
}

// ���� ���
/*
�迭 ��� ��ü ���
4 7 9 1 3 2 5 6 8
¦�� ������ ���
4 2 6 8
3�� ��� ������ ���
9 3 6
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/