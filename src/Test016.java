/*====================================
   ���� �ڹ� �⺻ ���α׷��� ����
======================================*/

// ������ �ڷ���
// �ڹ��� �⺻ ����� : BufferedReader Ŭ����

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

/*
���� ��)
�̸��� �Է��ϼ��� :  ������
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

====[���]====
�̸� : ������
���� :  240
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test016
{
	public static void main(String[] args) throws IOException
	{
		String name;
		int scoreKorean, scoreEnglish, scoreMath;
		int scoreSum = 0;

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("�̸��� �Է��ϼ��� : ");
		name = br.readLine();
		System.out.print("���� ���� �Է� : ");
		scoreKorean = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� : ");
		scoreEnglish = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� : ");
		scoreMath = Integer.parseInt(br.readLine());

		scoreSum = scoreKorean + scoreEnglish + scoreMath;

		System.out.println("\n====[���]====");
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %d\n", scoreSum);
	}
}

// ���� ���
/*
�̸��� �Է��ϼ��� : ������
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

====[���]====
�̸� : ������
���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/