/*===========================================
   ���� ���� �帧�� ��Ʈ�� (���) ����
============================================*/

// switch �� �ǽ�
/*
����ڷκ��� 1���� 3������ ���� �� �ϳ��� �Է¹޾�
�Է¹��� ������ŭ�� ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
��, �� ���� ������� ������ �� �ֵ��� �Ѵ�.

1) swtich ���� �Ϲ� ���� ���
2) swtich ���� �⺻ ���� ����ϵ�, break�� �� �� ���� ����� �� �ֵ��� ����

���� ��)
������ ���� �Է� (1~3) : 3
�ڡڡ�
����Ϸ��� �ƹ� Ű��...

������ ���� �Է� (1~3) : 1
��
����Ϸ��� �ƹ� Ű��...

������ ���� �Է� (1~3) : 7
xxx�Է� ����xxx
����Ϸ��� �ƹ� Ű��...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test044
{
		public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int num;

		// ���� �� ó��
		System.out.print("������ ���� �Է� (1~3) : ");
		num = Integer.parseInt(br.readLine());

		String printStar = "";

// 1) swtich ���� �Ϲ� ���� ���
		System.out.println("\n<<< 1) swtich ���� �Ϲ� ���� ��� >>>");

		switch (num)
		{	
		case 3: printStar += "��";
		case 2: printStar += "��";
		case 1: printStar += "��";	break;
		default: printStar = "xxx�Է� ����xxx"; break;
		}
		System.out.println(printStar);
		System.out.println();

		//��
/*		switch (num)
		{	
		case 1: System.out.println("��"); break;
		case 2: System.out.println("�ڡ�"); break;
		case 3: System.out.println("�ڡڡ�"); break;
		default: System.out.println("xxx�Է� ����xxx"); break;
		}
*/
// 2) swtich ���� �⺻ ���� ����ϵ�, break�� �� �� ���� ����� �� �ֵ��� ����
		System.out.println("\n<<< 2) swtich ���� �⺻ ���� ���(break�� �� ���� ���) >>>");

		printStar = "";

		switch (num)
		{
		default : printStar = "xxx�Է� ����xxx"; break;
		case 3: printStar += "��";
		case 2: printStar += "��";
		case 1: printStar += "��";	
		}
		
		System.out.println(printStar);
		System.out.println();
		
	}
}

// ���� ���
/*

*/