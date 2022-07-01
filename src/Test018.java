/*====================================
   ���� �ڹ� �⺻ ���α׷��� ����
======================================*/

// �ڹ��� �⺻ ����� : System.out.printf()

public class Test018
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");

		System.out.println();	// ����
		//System.out.print();	
		// ==> ���� �߻� (������ ����)

		System.out.printf("1234567890");
		System.out.printf("1234567890\n");	// \n => ����
		System.out.printf("123456789%n");	// printf ������ %n�� ����

		//System.out.printf();
		// ==> ���� �߻� (������ ����)

		System.out.printf("%d + %d = %d\n", 10, 20, 30);

		System.out.printf("%d\n", 123);
		System.out.printf("%10d\n", 123);
		// %10d => �ڸ� 10ĭ Ȯ���ϰ�, �������� ä��
		// (%10d, 123) => �ڸ� 10ĭ Ȯ��. �տ� 7ĭ ����, ������ 3ĭ ���� ä��
		System.out.printf("%8d\n", 1234);
		System.out.printf("%010d\n", 123);
		// %010d => �ڸ� 10ĭ Ȯ���ϰ�, �������� ä��. ������ 0���� ä��
		// (%10d, 123) => �ڸ� 10ĭ Ȯ��. �տ� 7ĭ ���� 0���� ä��, ������ 3ĭ ���� ä��

		// �� �� ��� +365�� ����
		System.out.printf("%+d\n", 365);	// ���������δ� �̰� �� ����
		System.out.printf("+%d\n", 365);	// �ð��� �����δ� �̰� �� �� ��

		System.out.printf("%d\n", -365);	// -365 �� ��������
		System.out.printf("%d\n", +365);	// 365�� + �����Ǽ� ����
		// ����� �� �����ϰ� ���� ���� +%d, %+d �� ���� ��

		//System.out.printf("%-d\n", 365);	
			// => ������ %-d �� ���� ������
		System.out.printf("-%d\n", 365);

		//System.out.printf("%d\n", 'A');
		// ==> ���� �߻� (��Ÿ�� ����)
		// ���ڴ� %d ���� %c �� ��Ƽ� ��� ��
		System.out.printf("%c\n", 'A');

		//System.out.printf("%c\n", "ABCD");
		// ==> ���� �߻� (��Ÿ�� ����)
		// ���ڿ��� %c ���� %s �� ��Ƽ� ��� ��
		System.out.printf("%s\n", "ABCD");

		System.out.printf("%h\n", 365);		// h => HEX (16����)
		System.out.printf("%o\n", 24);		// o => OCT (8����)

		//System.out.printf("%d\n", true);
		//System.out.printf("%d\n", false);
		// => true, false �� boolean ���̱� ������ ������ => %b �� ��ƾ� ��
		System.out.printf("%b\n", true);
		System.out.printf("%b\n", false);

		System.out.printf("%f\n", 123.23);
		System.out.printf("%.2f\n", 123.23);
		// �ݿø� �߻���
		System.out.printf("%.2f\n", 123.231);	// 123.23
		System.out.printf("%.2f\n", 123.235);	// 123.24

		System.out.printf("%8.2f\n", 123.236);
		// ��ü ���� 8ĭ Ȯ��
		// �Ҽ����� �� �ڸ� ������
		// �Ҽ��� ���� 2�ڸ� ���� �ݿø� �ż� ��� => 123.24
		// %8.2f => �ڸ� 8ĭ Ȯ��. �տ� 2ĭ ����, ������ 6ĭ ���� ä��
		System.out.printf("%2.2f\n", 123.236);
		// **���� ǥ���ؾ��ϴ� �����ͺ��� ���� ���� ������ �׳� ���õ�
		// �߸��ų� �׷��� �� �ƴϰ� ���õ�

	}
}

// ���� ���
/*
AAABBBCCC

12345678901234567890
123456789
10 + 20 = 30
123
       123
    1234
0000000123
+365
+365
-365
365
-365
A
ABCD
16d
30
true
false
123.230000
123.23
123.23
123.24
  123.24
123.24
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/