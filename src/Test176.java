 /*=======================================
   ���� �ڹ��� �⺻ �����(I/O) ����
=========================================*/

// Reader �ǽ�

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test176
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;
	
		// System.in         : �ڹ� ǥ�� �Է� ��Ʈ�� �� ����Ʈ ��� ��Ʈ��
		// InputStreamReader : ����Ʈ ��� ��Ʈ���� �� ���� ��� ��Ʈ������ ��ȯ�� �ִ� ���� ����
		// Reader			 : ���� ��� ��Ʈ�� ��ü
		Reader rd = new InputStreamReader(System.in);

		System.out.println("���ڿ� �Է�(����:Ctrl+z)");

		// Test174 : data = System.in.read() �̷��� �߾��� �� ����Ʈ���
/*
		while ( (data = rd.read()) != -1 )
		//              ---------
		//				���ڱ������ �о�鿩��
		{
			ch = (char)data;

			System.out.print(ch);
			//    ----------
			//    ���ڱ�� ���
		}
*/
		/*
		���ڿ� �Է�(����:Ctrl+z)
		abcd
		abcd
		1234
		1234
		�����ٶ�
		�����ٶ�
		*/

		while ( (data = rd.read()) != -1 )
		//              ---------
		//				���ڱ������ �о�鿩��
		{
			ch = (char)data;

			System.out.write(ch);
			//    ----------
			//    ����Ʈ��� ���
		}
		/*
		���ڿ� �Է�(����:Ctrl+z)
		abcd
		abcd
		1234
		1234
		�����ٶ�
		 ��|
		^Z
		*/
	}
}

// ���� ���
/*

*/