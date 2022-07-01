/*====================================
   ���� �ڹ� �⺻ ���α׷��� ����
======================================*/

// ������ �ڷ���
// �ڹ��� �⺻ ����� : BufferedReader Ŭ����

// BufferedReader => Ű���� ���� ��ġ

// ���� �������� �Է��ϼ���: xxx
// >> �������� xx�� ���� ���̴� ??? �̸�,
// >> �������� xx�� ���� �ѷ��� ??? �̴�.
// ��� �Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		// Ű���� ����(����)
		//	-> BufferedReader Ŭ���� ����� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//-----------------------------------  --------------------- ----------
		//	 ���� �Է��� �о���̴� ��ġ	   ����Ʈ -> ���� ������  ����Ʈ �Է°�

		// �ֿ� ���� ����
		int r;
		final double PI = 3.141592;
		double area, length;

		// ���� �� ó��
		//	1) ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� �������� �Է��ϼ��� : ");

		//	2) ����ڰ� �Է��� ���� �޾ƿ� ������ ���� r�� ��Ƴ���
		//r = br.readline();		
		// BufferedReader�� readline() -> ���ڿ��� ��ȯ�ϹǷ� int r�� ���� �� ����
		// int r = "80"; �̷��� �ż� ������

		// Integer.parseInt()
		//	-> ���ڷ� �̷���� [���ڿ�]�� ������ �ٲ���
		//						[����]�� XX
		//	-> �Ű������� �Ѱܹ��� ���ڿ� �����͸� ���������� ��ȯ
		//	   ��, �� �� �Ѱܹ޴� ���ڿ� �����ʹ� ���ڸ���̾�� �Ѵ�.
		//										  (NumberFormat)

		r = Integer.parseInt(br.readLine());
		// ����ڰ� �Է��� ���� BufferedReader(br)�� readLine()
		// �޼ҵ带 Ȱ���Ͽ� ���ڿ� ���·� �о���� ��
		// �� ���� Integer.parseInt() �� ���� ������(������)���� ��ȯ�� ��
		// ���� ������ ������ ���� r�� ��Ƴ���

		//	3) ���� �� �ѷ� ���(����)
		area = r * r * PI;
		length = r * 2 * PI;

		// ���� ��� ���
		System.out.printf("�������� %d�� ���� ���̴� %.2f �̸�,\n", r, area);
		System.out.printf("�������� %d�� ���� �ѷ��� %.2f �̴�.\n", r, length);
	}
}

// ���� ���
/*
���� �������� �Է��ϼ��� : 45
�������� 45�� ���� ���̴� 6361.72 �̸�,
�������� 45�� ���� �ѷ��� 282.74 �̴�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/