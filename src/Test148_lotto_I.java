 /*=======================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
=========================================*/

// Random Ŭ����
/*
�� java.util.Random Ŭ������

   ���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
   Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵
   ������ �����ϴ� �޼ҵ�������
   0.0 ~ 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
   �ʿ��� ���� ������ ������ ������ ���ؼ���
   �߰����� ������ �����ؾ� �Ѵ�.
   �׷��� �ڹٴ� ���� ������ ������ �߻������ִ�
   ���� Ŭ������ Random Ŭ������ ������ �����ϰ� �ִ�.
*/
/*
�ζ� ��ȣ ������ (���� �߻� ���α׷�)

���α׷��� ����Ǹ� �⺻������ �ζǸ� 
5���� �����ϴ� ���α׷��� �����Ѵ�.

���� ��)
 3  5 12 24 31 41
 1  2  8 36 41 42
 4  9 11 13 22 30
 5 10 13 15 27 40
22 31 32 33 40 41
����Ϸ��� �ƹ� Ű�� ��������...

- �ߺ��� ���� ������ �� ��
- �����ؼ� ���
- 1 ~ 45
*/

import java.util.Random;

class Lotto
{
	Random rd = new Random();
	int[] lotto = new int[6];

	// ���� ��ȣ ���� + �ߺ� ���� ����
	// => i-- ���ִ� ���
	public void random()
	{
		for (int i = 0; i < lotto.length; i++)
		{
			lotto[i] = rd.nextInt(45) + 1;

			for (int j = 0; j < i; j++)
			{
				if (lotto[i] == lotto[j])
				{
					i--;
					break;
				}
			}
		}
	}

	private void sorting()
	{
		boolean flag;

		for (int i = lotto.length - 1; i > 0; i--)
		{
			flag = false;
			for (int j = 0; j < i; j++)
			{
				if (lotto[j] > lotto[j + 1])
				{
					lotto[j]     = lotto[j] ^ lotto[j + 1];
					lotto[j + 1] = lotto[j + 1] ^ lotto[j];
					lotto[j]     = lotto[j] ^ lotto[j + 1];

					flag = true;
				}
			}

			if (flag == false)
				break;
		}
	}

	void print()
	{
		sorting();

		for (int i = 0; i < lotto.length; i++)
			System.out.printf("%4d", lotto[i]);
		System.out.println();
	}
	



}

public class Test148_lotto_I
{
	public static void main(String[] args)
	{
		// Lotto Ŭ���� ��� �ν��Ͻ� ����
		Lotto lotto = new Lotto();

		// �⺻ 5 ����
		for (int i = 1; i <= 5; i++)
		{
			// �ζ� ���� ����
			lotto.random();

			// ��� ���
			lotto.print();
		}
	}
}

// ���� ���
/*
   5   9  16  23  26  36
   3   7  10  23  28  44
   5   7  13  19  24  35
  31  35  37  38  40  41
   3  12  15  17  21  37
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/