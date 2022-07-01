 /*===================================
   ���� ����(Exception) ó�� ����
======================================*/
/*
�� ���α׷����� �߻��ϴ� ����(Error)��

   �� �߸��� ������ ����ϰų� ���� ���� �������� ���� ���¿���
      ��������ν� ������ �ܰ迡�� �߻��ϴ� �������� ����(Error)��

   �� ���α׷��� �����ϴ� �������� �߻��Ǵ� ��Ÿ�� ����(Error)�� ���� �� �ִ�.

   	  - �����ڰ� ���� �м��� �߸��ϰų� �Ǽ��� ����
	    ������ ����� �������� �Ǵ� ������ ����(Error)��
	
	  - �ý��� �̻󿡼� �߻��Ǵ� �ý��� ����(Error), �׸���

	  - ���α׷� ���� �� �߻��Ǵ� ���������� ��Ȳ�� �ǹ��ϴ� 
	    ���ܻ���(Exception)�� �ִ�.

		���� ���,
		�� � ���� 0���� �����ų�... 
		�� �迭 ÷�ڸ� ����� ��Ȳ�� �߻��ϰų�...
		�� �������� �ʴ� ������ �����Ͽ� �о���δٰų�...
	
	==> �����ڰ� �̷� ���� ������ �߻��� ��츦 �̸� �����Ͽ�
	    ������ �����ϱ� ���� ������ �����ϵ��� ������ ������ ���� ��
		��.��.ó.��.

�� ������ ���� ����~!!! (�� Exception Ŭ����)

   - ���ܴ� ���α׷� ���� �߿� �߻��� �� �ִ�
     ��ɾ��� �������� �帧�� �����ϴ� �̺�Ʈ��
	 �ڹٿ��� ���ܴ� �ϳ��� ������Ʈ(Object, ��ü)�̴�.

   - ���α׷� ���� �߿� �޼ҵ� �ȿ��� ����(Error)�� �߻��ϰ� �� ���,
     �޼ҵ�� �� ������ �ش��ϴ� ���� ������Ʈ�� �����
	 �װ��� �ڹ� ��Ÿ�� �ý���(Runtime System)�� ������ �ش�.

   - �ڹٿ����� ��� ���� Ŭ������ Throwable Ŭ������
     Throwable Ŭ������ ���� Ŭ������ ��ӹ޾� ����Ѵ�.

   - Throwable Ŭ������ ���ܸ� �����ϴ� �����̳�
     ���ܰ� �߻��� ���� ���α׷��� ���¿� ���� ������ �����ϰ� �ִ�.

   - Throwable Ŭ�������� �Ļ��� Ŭ����
     
	 Exception Ŭ����
	 Exception ���� Ŭ������ �Ϲ������� ���α׷��ӿ� ����
	 ������ �� �ִ� ���� ��Ȳ����
	 �޼ҵ尡 ���� �߿� ������ ���ܸ� ����Ų��.

	 Error Ŭ����
	 �ɰ��� ������ ���·� �����ڰ� ������ �� ���� ������ �����̴�.

�� ������ ����

   - checked exception
   	 �޼ҵ� ������ ���ܰ� �߻��� ���
	 �޼ҵ带 ������ �� ��throws������ �޼ҵ� ������ �߻��� �� �ִ�
	 ���ܵ��� ����� �ְų� �Ǵ� �� ���ܸ� ��try-catch���ؼ�
	 ó���� �־�߸� �ϴ� �����̴�.
	 �����Ϸ��� ������ �ϴ� �������� ��checked exception����
	 ��throws���Ǵ°��� ���� Ȥ�� ��try-catch���Ǵ����� ���θ� �Ǵ��Ͽ�
	 ���α׷����� ���ܸ� � ������ε� ó������ ������
	 ������ ��ü�� �Ұ����ϴ�.

   - unchecked exception
     ������ ó������ �ʾƵ� �����Ϸ��� üũ���� �ʴ�
	 ��Ÿ�� �ÿ� �߻��� �� �ִ� �����̴�.
*/
/*
�� java.lang.Throwable Ŭ������ �ֿ� �޼ҵ�

   - String toString()
     : Throwable ������ ���� ������ ���ڿ� ���·� ��ȯ�Ѵ�.
   - void printStackTrace(PrintStream s)
   - void printStackTrace(PrintWriter w)
     : ǥ�� ��� ��Ʈ���� ���� ȣ�� ����� ������ �޼ҵ���� ����Ѵ�.

�� �ֿ� ��Ÿ�� ���� Ŭ����

   - ArithmeticException
     : ��ġ ������ ���� (0���� ������ ��)

   - ArrayStoreException
     : �迭�� �߸��� ������ ���� �����Ϸ� ���� ��� �߻��ϴ� ����

   - IndexOutOfBoundsException => �� �� ���ٰ� �迭 ������ ���� ����(unchecked exception)
     : �迭, ���ڿ�, ���� ��� �ε��� ������ ��� ��� �߻��ϴ� ����

   - ClassCastException
     : Ŭ���� ��ȯ�� �߸��� ��� �߻��ϴ� ����

   - NullPointerException
     : �� ��ü�� �����ϴ� ��� (�ʱ�ȭ ���� ���� ���� ��� ��) �߻��ϴ� ����

   - SecurityException
     : �ڹ��� ���� ���� ������ �����Ͽ��� ��� �߻��ϴ� ����
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test149
{										   // ����ó�� ��� �� 
	public static void main(String[] args) //throws IOException
	{
		// BufferedReader Ŭ���� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		// �ֿ� ���� ����
		int a, b, c;
		
		// ����ó�� ��� ��
/*
		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			//--> ������ �ƴ� 'a' �Է��ϸ� ��Ÿ�� ���� ��
			//    Exception in thread "main" java.lang.NumberFormatException
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("��� : " + c);
		}
		catch (IOException e)
		{
			// IOException �� checked exception
			//-- �޼ҵ带 �����ϴ� �������� throws �� ����
			//   ��Ƴ��ų� ������ ���� ��� ������ ���� �߻�
			System.out.println(e.toString());
		}
*/

		// ����ó�� ��� ��
		// �����Է� �ƴ� �� NumberFormatException �� try-catch
/*
		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("��� : " + c);
		}
		catch (IOException e1)
		{
			// IOException �� checked exception
			//-- �޼ҵ带 �����ϴ� �������� throws �� ����
			//   ��Ƴ��ų� ������ ���� ��� ������ ���� �߻�
			System.out.println(e1.toString());
		}
		catch (NumberFormatException e2)
		{
			// NumerFormatException �� unchecked exception
			//-- ��Ÿ�� �� �߻��� �� �ִ� ���ܷ�
			//   �ݵ�� ���� �ʿ䵵, ��Ƴ� �ʿ䵵 ����.
			System.out.println("e2.toString() : " + e2.toString());
			System.out.println("!!! ���� ������ �����͸� �Է��ؾ� �մϴ� !!!");
		}
*/

		// ����ó�� ��� ��
		// Exception ���� �׳� �� ���� ó���ϱ�
/*
		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("��� : " + c);
		}
		catch (Exception e)
		{
			System.out.println("e.toString() : " + e.toString());
			System.out.println("e.getMessage() : " + e.getMessage());
			System.out.println("printStackTrace...");
			e.printStackTrace();
		}
*/
		
		// ����ó�� ��� ��
		// finally ��� ���
		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("��� : " + c);
		}
		catch (Exception e)
		{
			System.out.println("e.toString() : " + e.toString());
		}
		finally
		{
			// ���ܰ� �߻��ϰų� �߻����� �ʰų� ������ ����Ǵ� ����
			System.out.println("��� �����̽��ϴ�. �����մϴ�.");
		}

	}
}

// ���� ���
/*

*/