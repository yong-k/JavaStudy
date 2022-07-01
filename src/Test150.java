 /*===================================
   ���� ����(Exception) ó�� ����
======================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test150
{
	private String[] data = new String[3];
	
	public void proc() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n = 0;

		System.out.print("�̸� �Է� [����:Ctrl+z] : ");

		while ( (str = br.readLine()) != null )
		{
			data[n++] = str;
			System.out.print("�̸� �Է� [����:Ctrl+z] : ");
			// aa
			// bb
			// cc
			// dd
			// �Է��ϸ� Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
			// �߻��ϱ�� ������, unchecked exception �̶� ó�������൵ ��
		}

		// ctrl+z ������ ����ġ�� "�Էµ� ����..." ��µȴٴ� ����
		// bufferedReader �� readLine���� [Ctrl+z] ==> null �̶�� �ǹ�
		System.out.println("�Էµ� ����...");

		for (String s : data)
			if (s != null)	
				System.out.println(s);
				
	}

	public static void main(String[] args) throws IOException
	{
		Test150 ob = new Test150();
		ob.proc();
	}
}

// ���� ���
/*

*/