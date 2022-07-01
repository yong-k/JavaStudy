 /*=======================================
   ���� �ֹε�Ϲ�ȣ ��ȿ�� �˻� ����
=========================================*/
/*
�� �ֹε�Ϲ�ȣ ���� ����

	1) ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.
		ex) 
			123456-1234567 (�ֹι�ȣ)
			****** ******* ------------------------�� �ڸ����� ���ϱ�
			234567-892345  (�� �ڸ��� ������ ��)

	2) ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.
		ex)
			7 5 0 6 1 5 - 1 8 6 2 1 3 3
			* * * * * *   * * * * * * 
			2 3 4 5 6 7   8 9 2 3 4 5
			----------------------------
			�� 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15

				== 217

	3) ������ ������� 11�� ������ ������������ ���Ѵ�.
			  19 �� ��(X)
    	    ---------
		11 | 217
		     11
			 ----
			 107
			  99
			 ----
			   8 �� ������(O)

	4) 11���� ������ 8�� �� ������� ���Ѵ�.

		11 - 8 = 3

		�� 3) �� ó�� �������� �������� 0�� ��� �� 11 - 0 = 11
							   �������� 1�� ��� �� 11 - 1 = 10

		   �̸� �ٽ� 10���� ������ �������� ���Ѵ�.		11 �� 1
		   												10 �� 0

	5) 4)�� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ� ��ġ�ϴ����� ���θ� ���Ѵ�.

		��ġ   �� ��ȿ�� �ֹι�ȣ
		����ġ �� �߸��� �ֹι�ȣ

���� ��)
�ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 123456-12345678		// �� �Է� ���� �ʰ��� ��Ȳ
>> �Է� ����
����Ϸ��� �ƹ� Ű�� ��������...

�ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 123456-123456		// �� �Է� ���� ���ڸ� ��Ȳ
>> �Է� ����
����Ϸ��� �ƹ� Ű�� ��������...

�ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 750615-1252085		// �� ��ȿ�� �ֹι�ȣ
>> ��Ȯ�� �ֹι�ȣ
����Ϸ��� �ƹ� Ű�� ��������...

�ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 750615-1252086		// �� ��ȿ���� ���� �ֹι�ȣ
>> �߸��� �ֹι�ȣ
����Ϸ��� �ƹ� Ű�� ��������...

�� ���� �ذ��� ���� �߰� ��~!!!
	�迭.length						�� �迭�� ����(�迭���� ����) ��ȯ
	���ڿ�.length()					�� ���ڿ��� ���� ��ȯ
	���ڿ�.substring(int a, int b)	�� ���ڿ� ���� 
					--------------
					���ڿ��� a ��°���� b - 1 ��°���� ����(�ε����� 0����)
	���ڿ�.substring(int a)			�� a���� ���ڿ� ������ ����(�ε����� 0����)
		ex) strTemp = "ABCDEFGH";
			System.out.println(strTemp.substring(3,7));
			==> DEFG	==> 3��°���� 7-1 ��°���� �̾Ƴ�
			System.out.println(strTemp.substring(3,57));
			==>	��Ÿ�ӿ���. StringIndexOutOfBoundsException	==> �ε��� �ȿ� 57 ����
*/ 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test108_teacher
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �Է¹޴� �ֹι�ȣ(���ڿ� ����)
		String str;

		// �ֹι�ȣ�� �� �ڸ����� ���ϰ� �� �� �� �迭 ���·� ����
		//	          7  5  0  6  1  5  -  1  8  6  2  1  3  3
		int[] chk = { 2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5 };
		//							   ---
		//							  check~!!!

		// ���� ������ ������ (�� ������ ����� ���� ������...)
		// ---------   ======> �̱� ������ 0���� �ʱ�ȭ!!
		int tot = 0;

		System.out.print("�ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : ");	// "750615-1862133"
		//Integer.parseInt(br.readLine());
		str = br.readLine();

		if (str.length() != 14)
		{
			System.out.println(">> �Է� ����");
			return;		//-- �޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� ����
		}

		for (int i = 0; i < 13; i++)
		{
			if (i == 6)
				continue;	//-- �޺κ� �����ϰ� ����ض�

			tot += chk[i] * Integer.parseInt(str.substring(i, (i + 1)));	// �޺κ�
		}

		//----------------- ������� �����ϸ� 1)�� 2)�� ��� ���� ��Ȳ�̸�
		//					��Ģ�� �°� ���� ������ ������ ����� ��� ���� ����
		//					���� tot �� ����ִ� ��Ȳ�� �ȴ�.

		 int su = 11 - tot % 11;

		 //---------------- ������� �����ϸ� 3)�� 4)�� ��� ���� ��Ȳ������
		 //					su �� ���� ���� ��� �� �ڸ��� ���� ���
		 //					�ֹι�ȣ ������ �ڸ��� ���ڿ� �񱳸� ������ �� ���� ��Ȳ

		 su %= 10;

		 if (su == Integer.parseInt(str.substring(13)))
			 System.out.println(">> ��Ȯ�� �ֹι�ȣ");
		 else
			System.out.println(">> �߸��� �ֹι�ȣ");

	}
}

// ���� ���
/*

*/