/*====================================
   ���� �ڹ� �⺻ ���α׷��� ����
======================================*/

// �ڹ��� �⺻ ����� : java.util.Scanner

// �� java.util.Scanner
//	�ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//	����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
//	�ۼ��� ���� ��ū�� next() �޼ҵ带 ���
//	�ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.

/*
Scanner �Է� ���

1) 
�̸�: 
...
���� :
...
ü��:
...

2) �̸��� ���̿� ü�� �Է� (���� ����) : ȫ�浿 25 65

3) �̸��� ���̿� ü�� �Է� (/ ����) : ȫ�浿/25/65
*/

import java.util.Scanner;
//import java.io.InputStreamReader;	=> Scanner ���� �ʿ� ����
//import java.io.IOException;		=> Scanner ���� �ʿ� ����

public class Test019
{
	// Scanner �� 'throws IOException' �ʿ� ����
	public static void main(String[] args)
	{
		// Scanner Ŭ���� ����� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		// Scanner �� BufferedReader ���� ��� ����
		// ������ BufferedReader �� �� ����

		// �ֿ� ���� ����
		String name;			//�̸�
		int kor, eng, math;		//����, ����, ����

		// ���� �� ó��
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.next();
		// sc.next() => ���ڿ� ���·� �޾Ƶ鿩��

		System.out.print("���� ���� �Է� : ");
		//kor = Integer.parseInt(sc.next());
		//	=> �̷��� �� �ʿ� ����
		kor = sc.nextInt();
		//	=> Scanner �ȿ� nextInt(), nextDouble() ��� �޼ҵ�� ����
		//	������ �� ��ȯ ���� ��ĥ �ʿ� ����

		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		math = sc.nextInt();
		
		System.out.println();

		// ��� ���
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %d ��\n", (kor + eng + math));

	}
}

// ���� ���
/*
�̸��� �Է��ϼ��� : ����
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

�̸� : ����
���� : 240 ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/