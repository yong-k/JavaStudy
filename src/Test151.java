 /*===================================
   ���� ����(Exception) ó�� ����
======================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test151
{
	private String[] data = new String[3];
	
	public void proc() //throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n = 0;

		try 
		{ 
			System.out.print("�̸� �Է� [����:Ctrl+z] : ");

			while ( (str = br.readLine()) != null ) 
			{
				data[n++] = str;
				System.out.print("�̸� �Է� [����:Ctrl+z] : ");
			}
		}
		catch (IOException e) 
		{
			System.out.println("e.toString() : " + e.toString());
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("!!! ���� �߻� !!!");
			System.out.println("getMessage : " + e.getMessage());
			System.out.println("toString   : " + e.toString());
			System.out.println("printStackTrace .........");
			e.printStackTrace();
		}

		System.out.println("�Էµ� ����...");

		for (String s : data)
			if (s != null)	
				System.out.println(s);
				
	}
										   // �� ���� �ʿ� ����
										   // �� ������ throws�� ��ź ������ �ʰ�,
										   // ��        try-catch�� ó���߱� ������
	public static void main(String[] args) //throws IOException
	{
		Test151 ob = new Test151();
		ob.proc();
	}
}

// ���� ���
/*

*/