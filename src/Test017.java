/*====================================
   ���� �ڹ� �⺻ ���α׷��� ����
======================================*/

// �ڹ��� �⺻ ����� : System.in.read()

/*
System.in.read() �޼ҵ�� �� ���ڸ� �����´�.
��, �Է¹��� �ϳ��� ���ڸ� ���� �״�� �������� ���� �ƴ϶�
ASCII Code ������ ��ȯ�Ѵ�. 
*/

/*
���� ��)
�� ���� �Է� : A
�� �ڸ� ���� �Է� : 8

�Է��� ���� : A
�Է��� ���� : 8
����Ϸ��� �ƹ� Ű��....
*/

// �ƽ�Ű�ڵ�
// Enter=13		0=48	A=65	a=97
import java.io.IOException;

public class Test017
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		char ch;
		char ch2; int num;

		char temp;
		
		/* ���� �� ��

		// ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� �ϳ� �Է��ϼ��� : ");
		//ch = System.in.read();
		// System.in.read() �� int �� �������� ������ char ch �� �� �� ����
		// int�� char�� �ڵ� �� ��ȯ �Ұ�
		// => ������
		ch = (char)System.in.read();

		System.in.read();
		System.in.read();

		// ��� ���
		System.out.printf("�Է��� ���ڴ� [ %c ] �Դϴ�.\n", ch);
		
		System.out.println("\n=====================================\n");
		System.out.print("�� ���� �Է� : ");
		ch2 = (char)System.in.read();
		
		// ���� ���ͳݿ� �ļ� ���� ��
		// System.in.read(); 
		// => ����Ű�� ������ ���Ͱ��� �ԷµǱ� ������ �� ���� �о������ν� ������� �Ѵ�.
		// ����: \r + \n
		// ==> System.in.read() 2�� ���ָ� ��
		System.in.read();
		System.in.read();

		System.out.print("�� �ڸ� ���� �Է� : ");
		num = System.in.read();
		
		System.in.read();
		System.in.read();

		System.out.println();
		System.out.printf("�Է��� ���� : %c\n", ch2);
		System.out.printf("�Է��� ���� : %c\n", num);
		*/

		//���� �� �� 
		System.out.print("�� ���� �Է� : ");
		ch2 = (char)System.in.read();

		
		// �Է� ��⿭�� �����ִ� \r �� \n �� ��ŵ(�ǳʶٱ�) => System.in.skip(�ǳ� �� ����);
		System.in.skip(2);
		// => �Ű�����(2)�� ���� �� ���ڸ� ���� �ʰ� �ǳʶڴ�. (������)

		// ��� 1)
		System.out.print("�� �ڸ� ���� �Է� : ");
		num = System.in.read();

		System.in.skip(2); 

		// ���� �Է��ϸ� �׿� �ش�Ǵ� �ƽ�Ű�ڵ�� �����
		// ex)
		//	1 -> 49
		//	2 -> 50
		//	3 -> 51
		//	:
		//	9 -> 57
		
		// �Է¹��� n�� 48��ŭ ���ҽ��Ѷ�
		num -= 48;

		// ��� 2) 
		System.out.print("�� �ڸ� ���� �Է� : ");
		temp = (char)System.in.read();

		System.in.skip(2);

		System.out.println();
		System.out.printf("�Է��� ���� : %c\n", ch2);
		System.out.printf("[�˰�����]�Է��� ���� : %d\n", num);
		System.out.printf("[���ڷ� ����] �Է��� ���� : %c\n", temp);
		

	}
}

// ���� ���
/*
// ���� �� ��
���� �ϳ� �Է��ϼ��� : A
�Է��� ���ڴ� [ A ] �Դϴ�.

=====================================

�� ���� �Է� : B
�� �ڸ� ���� �Է� : 5

�Է��� ���� : B
�Է��� ���� : 5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
// ���� �� ��
�� ���� �Է� : A
�� �ڸ� ���� �Է� : 1
�� �ڸ� ���� �Է� : 2

�Է��� ���� : A
[�˰�����]�Է��� ���� : 1
[���ڷ� ����] �Է��� ���� : 2
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/