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

// ���� ������ ������� ����� �ߴ�
// break ���̺�
// ����ؼ� ��������

import java.util.Random;
import java.util.Arrays;

class Lotto2
{
	// �迭 ���� ���� �� �޸� �Ҵ� �� �ζ� ��ȣ�� ��Ƶ� �迭�� 6ĭ
	private int[] num;

	// ������
	Lotto2()
	{
		num = new int[6];
	}
	
	// getter
	public int[] getNum()
	{
		return num;
	}
	
	// 6���� ������ �߻���Ű�� �޼ҵ� ����
	public void start()
	{
		Random rd = new Random();
		int n;
		int cnt = 0;
		
		jump:
		while (cnt < 6)				// 0 1 2 3 4 5
		{
			n = rd.nextInt(45) + 1;	// 1 ~ 45

			for (int i = 0; i < cnt; i++)
			{
				if (num[i] == n)
					continue jump;
			}

			num[cnt++] = n;			// num[0] num[1] num[2] num[3] num[4] num[5]
		}

		// ���� �޼ҵ� ȣ��
		sorting();
	}
	
	// ���� �޼ҵ� ����
	private void sorting()
	{
		// Arrays �� sort ����
		Arrays.sort(num);
	}
}

public class Test148_lotto_teacher
{
	public static void main(String[] args)
	{
		// Lotto Ŭ���� ��� �ν��Ͻ� ����
		Lotto2 lotto = new Lotto2();

		// �⺻ 5 ����
		for (int i = 1; i <= 5; i++)
		{
			// �ζ� ���� ����
			lotto.start();

			// ��� ���
			for (int n : lotto.getNum())
				System.out.printf("%4d", n);
			System.out.println();
		}
	}
}

// ���� ���
/*
   2  14  22  26  38  41
   9  19  30  39  41  44
   1  15  19  31  41  42
   4  16  17  25  32  35
   3  10  12  15  40  43
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/