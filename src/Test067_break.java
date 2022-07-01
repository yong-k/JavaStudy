/*===========================================
   ���� ���� �帧�� ��Ʈ�� (���) ����
============================================*/

// break �ǽ�
// break Ű���尡 ���ϴ� �ǹ�
// ����� + (�׸��� ����������.)
/*
������ ���� ó���� �̷������ ���α׷��� �����Ѵ�.
��, �Է¹��� ������ 1 ~ 100 ���� �ȿ����� �����ϵ��� �ۼ��Ѵ�.

���� ��)
������ ���� �Է� : -10

������ ���� �Է� : 0

������ ���� �Է� : 2022

������ ���� �Է� : 10
>> 1 ~ 10 ������ �� : 55
����Ͻðڽ��ϱ�? (Y/N) : y   ==> ��ҹ��� ��� x

������ ���� �Է� : 100
>> 1 ~ 100 ������ �� : 5050
����Ͻðڽ��ϱ�? (Y/N) : N
����Ϸ��� �ƹ� Ű�� ��������...  => ���α׷� ����
*/

import java.util.Scanner;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test067_break
{
	public static void main(String[] args) throws IOException
	{
//��

		// �ֿ� ���� ���� �� �ʱ�ȭ
		Scanner sc = new Scanner(System.in);
		int inputNum, sum; char yesOrNo = 'y';

		// ���� �� ó��
		while (yesOrNo == 'y'|| yesOrNo == 'Y')
		{
			System.out.print("������ ���� �Է� : ");
			inputNum = sc.nextInt();

			if (inputNum < 1 || inputNum > 100)	{
				System.out.println();
				continue;
			}
			
			sum = 0;

			for (int i = 1; i <= inputNum; i++)
				sum += i;

			System.out.printf(">> 1 ~ %d ������ �� : %d\n", inputNum, sum);

			System.out.print("����Ͻðڽ��ϱ�? (Y/N) : ");
			yesOrNo = (char)System.in.read();

			System.out.println();
		}

//��
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, s, i;
			// n : ����� �Է� ���� ��Ƶ� ����
			// s : ������ ���� ����� ��Ƴ� ����
			// i : 1���� 1�� ������� �Է°����� ������ ����
		char ch;	// ���μ����� ��� �������� ������ ���θ� ��Ƶ� ����

		while (true)
		{
			do
			{
				System.out.print("\n������ ���� �Է� : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n < 1 || n > 100);

			//�׽�Ʈ (Ȯ��)
			//System.out.println("��ȿ�� ���� �Է� �Ϸ�~!!!");

			s = 0;	//-- **������ ������ �ʱ�ȭ ��ġ**

			for (i = 1; i <= n; i++)
				s += i;

			System.out.printf(">> 1 ~ %d ������ �� : %d\n", n, s);

			System.out.print("����Ͻðڽ��ϱ�? (Y/N) : ");
			ch = (char)System.in.read();	
				// y + ����(\r\n) �Է��ϰ� ��
				// y ������ �ٽ� ó������ ���� ������ ���� �Է��϶�� ���µ�
				// bufferedreader�� \r\n ������ �ͼ� �������·� ����ȯ�Ϸ��� �ϴϱ�
				// ���� ����� ��!
				// y �̿ܿ� ���� ���� �������
				// �Է� ��⿭�� ���ҽ� �����ֱ�� ������ ���α׷� ����Ǹ鼭
				// �Է� ��⿭�� �ִ� �ֵ� �׳� �ֹߴ�� ����
				// but, yes �Է��ϸ� �� �����ִ� �ֵ� ������ �ͼ� ���� ����

			// �׸��ҷ� �ǻ�ǥ��
				//���� y, Y �� �´����� Ȯ����
				//�ٸ�Ű ������ �׳� NO ��� �޾Ƶ��� (����)
				// [ N �Ǵ� n �Է��� �� �¾�? ]		  ��� ����°� �ƴ϶�
				// [ Y �Ǵ� y �Է��� �� �ƴѰ� Ȯ����? ]��� ���
			//if (ch == 'N' || ch == 'n')

			// *** || ���� �ȵ�!!!!! ***
			// || ���� => y ������ Y �ƴϴϱ� false�� ��
			if (ch != 'Y' && ch != 'y')		
			{
				// �ݺ����� ���߰� �������� �� �ִ� �ڵ� �ۼ� �ʿ�
				// ���� ���� �ǻ� ǥ���� �ߴٸ�
				// �׵��� �����ߴ� �ݺ����� ���߰� ���������� �Ѵ�.
				break;	// *** ����� + �׸��� ����������. ***
			}//end if

			// ���Ͱ�(\r\n) ó��
			System.in.skip(2);

		}//end while
*/
	}//end main()
}//end class

// ���� ���
/*
������ ���� �Է� : -1

������ ���� �Է� : 2020

������ ���� �Է� : 10
>> 1 ~ 10 ������ �� : 55
����Ͻðڽ��ϱ�? (Y/N) : y

������ ���� �Է� : 100
>> 1 ~ 100 ������ �� : 5050
����Ͻðڽ��ϱ�? (Y/N) : n

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/