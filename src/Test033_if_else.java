/*===========================================
   ���� ���� �帧�� ��Ʈ�� (���) ����
============================================*/

// if ~ else �� �ǽ�

/*
1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
   �б� ������ ���ϱ� ���� ����ϴ� �������
   if��, if~else��, ���ǿ�����, ���� if��(if�� ��ø),

 2. if���� if ������ ������ ���� ���,
    Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.
*/

/*
����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
������ ���� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�.
����� ��� ������ �������� ó���Ѵ�.

90�� ~ 100�� : A
80�� ~  89�� : B
70�� ~  79�� : C
60�� ~  69�� : D
60�� �̸�    : F

��, BufferedReader �� readLine() �޼ҵ带 ���� �Է¹��� �� �ֵ��� �ϸ�,
printf() �޼ҵ带 ���� ����� �� �ֵ��� �����Ѵ�.

���� ��)
�̸� �Է� : ������
���� ���� : 90
���� ���� : 80
���� ���� : 70

>> ����� �̸��� �������Դϴ�.
>> ���� ������ 90��,
>> ���� ������ 80��,
>> ���� ������ 70��,
>> ������ 240���̰�, ����� 80�� �Դϴ�.
>> ����� B �Դϴ�.
>> ����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033_if_else
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String name;
		int korScore, engScore, mathScore;	// ����, ����, ���� ����
		double numSubject = 3.0;		// ���� ����
		int total;			// ���� ����
		double avg;			// ���� ���
		char grade;			// ���

		// ���� �� ó��
		System.out.println("<< ������ 0 ~ 100 ������ ������ �Է����ּ��� >>");
		System.out.print("�̸� �Է� : ");
		name = br.readLine();
		System.out.print("���� ���� : ");
		korScore = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		engScore = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		mathScore = Integer.parseInt(br.readLine());

		
		total = korScore + engScore + mathScore;
		avg = total / numSubject;

		// ****
		// grade�� ����ؾ��ϱ� ������
		// grade ���� �ʱ�ȭ �س�����, else �� �������� �Ѵ�!!
		if (avg >= 90 && avg <= 100)
			grade = 'A';
		else if (avg >= 80 && avg < 90)
			grade = 'B';
		else if (avg >= 70 && avg < 80)
			grade = 'C';
		else if (avg >= 60 && avg < 70)
			grade = 'D';
		else
			grade = 'F';

		/*
		//��
		grade = 'F';

		if (avg >= 90)
			grade = 'A';
		else if (avg >= 80)		// ����� 90 �̸� ���� ����
			grade = 'B';
		else if (avg >= 70)		// ����� 80 �̸� ���� ����
			grade = 'C';
		else if (avg >= 60)		// ����� 70 �̸� ���� ����
			grade = 'D';
		*/

		// ���� ��� ���
		System.out.println();
		System.out.printf(">> ����� �̸��� %s�Դϴ�.\n", name);
		System.out.printf(">> ���� ������ %d��,\n", korScore);
		System.out.printf(">> ���� ������ %d��,\n", engScore);
		System.out.printf(">> ���� ������ %d��,\n", mathScore);
		System.out.printf(">> ������ %d���̰�, ����� %.2f�� �Դϴ�.\n", total, avg);
		System.out.printf(">> ����� %c �Դϴ�.\n", grade);
		
	}
}

// ���� ���
/*
<< ������ 0 ~ 100 ������ ������ �Է����ּ��� >>
�̸� �Է� : yong
���� ���� : 90
���� ���� : 80
���� ���� : 70

>> ����� �̸��� yong�Դϴ�.
>> ���� ������ 90��,
>> ���� ������ 80��,
>> ���� ������ 70��,
>> ������ 240���̰�, ����� 80.00�� �Դϴ�.
>> ����� B �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/