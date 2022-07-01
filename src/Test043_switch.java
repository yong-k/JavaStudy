/*===========================================
   ���� ���� �帧�� ��Ʈ�� (���) ����
============================================*/

// switch �� �ǽ�
/*
- ���� ���ù��̶� �ϸ�, switch �� ������ ���� ���� ����
  ���� ������ ���� �������� �б��� �� ����ϴ� �����̴�.

- ���� �� ����
  switch(����)
  {
		case ���1 : ����1; [break;]
		case ���2 : ����2; [break;]
	 		:
		[default : ����n+1; [break;]]
  }

  // if ������ else�� ���������� switch�� default��
	 �ݵ�� �־�� �ϴ� �� �ƴ�. ���ٰ� ������ ���� �ƴ�
	 ���๮�� '��� ���� �����Ѵ�'�� ������ ������ �� ���� �ʱ�ȭ �̸� �صθ� ���� ����
	 but, �ʱ�ȭ ���س��µ� else, default �� ������ ������

  switch ���� <����> �� case�� <���> �� 
  byte, short, int, long ���̾�� �Ѵ�.

  -case �� �ڿ� break; �� ���� ������ ���
  ���� case ���� ������ ����ؼ�(�̾) �����ϰ� �ȴ�. (�� �⺻ ��)
  -case �� �ڿ�	break; �� ������ ���
  �ش� �������� ������ ���� �� switch ���� ����������.  (�� �Ϲ� ��)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test043_switch
{
		public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;						//--�̸�
		int korScore, engScore, mathScore;	//--����, ����, ��������
		int total;							//--����
		//double avg;							//--���
		//	switch������ double �ذ� ���ϴ� ���ǻ� int�� ������
		int avg;
		char grade;							//--���

		System.out.print("�̸� �Է� : ");
		name = br.readLine();
		System.out.print("�������� �Է� : ");
		korScore = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է� : ");
		engScore = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է� : ");
		mathScore = Integer.parseInt(br.readLine());

		total = korScore + engScore + mathScore;
		avg = total / 3;
		
		switch (avg / 10)
		{
		case 10: 
		case 9 : 
			grade = 'A'; 
			break;
		case 8:	
			grade = 'B'; 
			break;
		case 7: 
			grade = 'C'; 
			break;
		case 6: 
			grade = 'D'; 
			break;
		default : 
			grade = 'F'; 
			break;
		}

		System.out.println();
		System.out.printf(">> �̸� : %s\n", name);
		System.out.printf(">> ���� : %d��\n", total);	
		System.out.printf(">> ��� : %d��\n", avg);	
		System.out.printf(">> ��� : %c\n", grade);
	}
}

// ���� ���
/*
�̸� �Է� : ����
�������� �Է� : 92
�������� �Է� : 98
�������� �Է� : 62

>> �̸� : ����
>> ���� : 252��
>> ��� : 84��
>> ��� : B
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
