 /*=======================================
   ���� �ڹ��� �⺻ �����(I/O) ����
=========================================*/

// Reader Writer �ǽ�

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.IOException;

public class Test178
{
	public void process(InputStream is)	// System.in �Ѱܹ����� ��ĳ���� �Ͼ
										// InputStream ��ü�� �Ѱܹ����� 
										// process() ���� ���ϱ� ������
	{
		int data;

		System.out.println("���ڿ� �Է�(����:Ctrl+z)");

		try
		{
			// �Ű����� is ��� ����Ʈ ��� ��ü(InputStream)��
			// ���� ��Ʈ������ ��ȯ�Ͽ�
			// (�� InputStreamReader �� ����)
			// Reader Ÿ���� rd ���� ������ �� �ֵ��� ó��
			Reader rd = new InputStreamReader(is);
			//								 ----����Ʈ����� ��Ʈ��
			//              -----------------����Ʈ��� �� ���ڱ������ �ٲ�
			// �װ� Reader �� �о��

			// ����Ʈ ��� ��Ʈ���� �ڹ� �⺻ ��� ��Ʈ��(System.out)��
			// ���� ��Ʈ������ ��ȯ�Ͽ�
			// (�� OutputStreamWriter �� ����)
			// Writer Ÿ���� wt ���� ������ �� �ֵ��� ó��
			Writer wt = new OutputStreamWriter(System.out);
			//                               ------------��±�� ����Ʈ��� ��Ʈ��
			//             --------------------����Ʈ��� �� ���ڱ������ �ٲ�

			//�� �޾Ƶ��̴� �͵�, �������� �͵� ���ڽ�Ʈ������ ���ϵ�

			while ( (data = rd.read()) != -1 )
			{
				wt.write(data);	//-- �������� ��Ʈ�� ���ٱ⿡ ���
				wt.flush();		//-- ����� ��Ʈ���� �о�� ������
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args)
	{
		Test178 ob = new Test178();
		ob.process(System.in);
		//		   -----------�ڹ��� �⺻ �Է� ��Ʈ�� ��ü�� �Ű������� ����
	}
}

// ���� ���
/*
���ڿ� �Է�(����:Ctrl+z)
abcd
abcd
1234
1234
�����ٶ�
�����ٶ�
^Z
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/