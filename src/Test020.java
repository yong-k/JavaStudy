/*====================================
   ���� �ڹ� �⺻ ���α׷��� ����
======================================*/

// �ڹ��� �⺻ ����� : java.util.Scanner

// �� java.util.Scanner
//	�ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//	����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
//	�ۼ��� ���� ��ū�� next() �޼ҵ带 ���
//	�ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.

// �� �Է��� �� �������� �� �ϰ� �������� �ص� ����� ����
// �����̳� ������ ���ؼ� �����ϴ� ��  ==> Scanner �� Default(�⺻) ����

import java.util.Scanner;

public class Test020
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		//java.util.Scanner sc = new java.util.Scanner(System.in);
		// => import java.util.Scanner; �Ƚᵵ ����ó�� �� �� ����
		// but,,,,
		// �̷��� �Ǹ� Scanner �� ������ ������ �������,,,��v��,,,,
		
		String name;
		int kor, eng, math;
		int total = 0;

		// ���� �� ó��
		System.out.print("�̸� ���� ���� ���� �Է�(���� ����) : ");

		// - ����ڰ� �Է��� �����͸� �� ������ �� ���� ��Ƴ���
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();

		// - ���� ����
		total = kor + eng + math;

		// ��� ���
		System.out.println();
		System.out.printf(">> �̸� : %s\n", name);
		System.out.printf(">> ���� : %d\n", total);
	}
}

// ���� ���
/*
�̸� ���� ���� ���� �Է�(���� ����) : yong 90 80 70

>> �̸� : yong
>> ���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . .
*/