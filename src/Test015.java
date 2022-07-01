/*====================================
   ���� �ڹ� �⺻ ���α׷��� ����
======================================*/

// ����
// �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
// �� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.

// ���� ����)
// �� �ﰢ���� ���� ���ϱ� ��
// - �ﰢ���� �غ� �Է� : 3
// - �ﰢ���� ���� �Է� : 5

// >> �غ��� 3, ���̰� 5�� �ﰢ���� ���� : xxx
// ����Ϸ��� �ƹ� Ű��...

// *���� �ν� �� �м�
// �ﰢ���� ���� = �غ� * ���� / 2
// ����ڷκ��� �����͸� �Է� �޾Ƽ� ó�� -> BufferedReader Ȱ��

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// ���� 3�� �� io �ȿ� �ִ� �� ���°Ŵϱ�
//import java.io.*;
// �̷��� �ᵵ ������ ������, 3�� �� �׳� ���� �� ������
// import java.io.*;�� �ϸ� io ��Ű�� �ȿ� �ִ� 3�� ���� �ٸ� �͵� �� �����ؾ��ϴϱ�..

public class Test015
{
	public static void main(String[] args) throws IOException
	{
		int bottomLine, height;
		double area;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("�� �ﰢ���� ���� ���ϱ� ��");

		System.out.print("- �ﰢ���� �غ� �Է� : ");
		bottomLine = Integer.parseInt(br.readLine());
		
		System.out.print("- �ﰢ���� ���� �Է� : ");
		height = Integer.parseInt(br.readLine());

		area = bottomLine * height / 2.0;	// check�صα� ***
		// area = (double)(bottomLine * height / 2);	=> (X)
		//		=> �̹� ����������� ���Ϸ� �� �� �Ǽ��θ� �ٲ��ִ� ��,,
		// area = (double)bottomLine * height / 2;		=> (O)
		// area = bottomLine * (double)height / 2;		=> (O)
		
		/*
		�Ǽ� ��� �ڷ����� ��� ������ ������ �������� 
		�Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
		������ 2 �� �ƴ�, �Ǽ��� 2.0 ���� ������ ������ �����ϰ� �Ǹ�
		�� ������ �Ǽ� ������� ó���ȴ�.
		*/

		System.out.printf("\n>>�غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f\n", 
			bottomLine, height, area);

		// System.out.print(); ==> ������
		// System.out.println(); ==> ����
	}
}

// ���� ���
/*
�� �ﰢ���� ���� ���ϱ� ��
- �ﰢ���� �غ� �Է� : 3
- �ﰢ���� ���� �Է� : 5

>>�غ��� 3, ���̰� 5�� �ﰢ���� ���� : 7.50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/