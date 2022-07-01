 /*========================================================
   ���� �÷��� �����ӿ�ũ(Collection Framework) ����
==========================================================*/
/*
�� ť(Queue)

   ť(Queue)�� FIFO(First Input First Output, ���Լ���) ������
   ���� �Էµ� �ڷḦ ���� ����ϸ�
   Queue �������̽��� ������ Ŭ������ ť�� ���õ� �پ��� ����� �����Ѵ�.

�� Queue �������̽��� �ν��Ͻ��� �����ϱ� ���ؼ��� 
   new �����ڸ� �̿��Ͽ� Queue �������̽��� ������(implements)
   Ŭ������ �����ڸ� ȣ���Ѵ�.
   ==> ť�� ������ ���� �ν��Ͻ� ������ �Ұ��ϴ�.
       Queue ob = new Queue();  ==> (X)

   ex) Queue ob = new LinkedList();

�� �ֿ� �޼ҵ�

���⼭�� E : �����ڷ��� �ڸ��� ������ 
==> �׳� Element �� �ڷ����� ���ϰڴٴ� ����

   - E element()
     ť�� head ��Ҹ� ��ȯ�ϸ� �������� �ʴ´�.

   - boolean offer(E o)
     ������ ��Ҹ� ť�� �����Ѵ�.

   - E peek()
     ť�� head ��Ҹ� ��ȯ�ϰ� �������� ������
	 ť �ڷᱸ���� empty �� ��� null �� ��ȯ�Ѵ�.

   - E poll()
     ť�� head ��Ҹ� ��ȯ�ϰ� �����ϸ�
	 ť �ڷᱸ���� empty �� ��� null �� ��ȯ�Ѵ�.

   - E remove()
     ť�� head ��Ҹ� ��ȯ�ϰ� �����Ѵ�.
*/

import java.util.Queue;
import java.util.LinkedList;

public class Test158
{
	public static void main(String[] args)
	{	
		// Queue �ڷᱸ�� ����
		//Queue myQue = new Queue();	//--(X)
		//-- Queue �������̽��Ƿ� ���� ��ü���� �Ұ�
		//   ��ǥ������ LinkedList �̿��ؼ� ��ü���� ��
		Queue<Object> myQue = new LinkedList<Object>();

		// ������ �غ�
		String str1 = "�����";
		String str2 = "������";
		String str3 = "������";
		String str4 = "������";

		// myQue ��� Queue �ڷᱸ���� ������ �߰�
		// offer() �� ť�� �� ���ԵǸ� true��ȯ, �ƴϸ� false ��ȯ
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		boolean test = myQue.offer(str4);

		// �׽�Ʈ (Ȯ��)
		System.out.println(myQue);	//-- ���� ������
		//--==> [�����, ������, ������, ������]
		// ���빰 ���̱�� ������, ������ ��Ʈ�� ���� �̷��� �ϸ� �ȵ�
		// �̰� �����ͷν� �������� �� �ƴ϶�, 
		// �����͸� ��Ʈ���ϴ� ������ν� ����� �� �� �ƴ϶�,
		// ������ ���� �������̴�.

		// �׳� Ȯ������������ ���� ������!
		// '���� �ð������� Ȯ���ϰ� �����ٰ�'�ϰ� �������� ����
		// �̰ɷ� �ڷ� �߶� ��Ʈ�� �ϴ� �� X


		// Queue �ڷᱸ������ ��Ҹ� �������� �ʰ� head ��� ��ȯ
		System.out.println("��1 : " + (String)myQue.element());		// �����
		System.out.println("��2 : " + (String)myQue.element());		// �����
		System.out.println("��3 : " + (String)myQue.element());		// �����
		System.out.println("��4 : " + (String)myQue.element());		// �����

		System.out.println();

		String val;

		// ��

		// peek()
		//-- ť�� head ��� ��ȯ. ���� ����
		//   ť�� empty �� ��� null �� ��ȯ
/*		while (myQue.peek() != null)
		{
			// poll()
			//-- ť�� head ��� ��ȯ. ������
			//   ť�� empty �� ��� null �� ��ȯ
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		System.out.println();
*/
		/*
		��� : �����
		��� : ������
		��� : ������
		��� : ������
		*/

		// ��
/*		while (true)
		{
			val = (String)myQue.poll();

			if (val == null)
				break;
			else 
				System.out.println("��� : " + val);
		}
		System.out.println();
*/
		/*
		��� : �����
		��� : ������
		��� : ������
		��� : ������
		*/

		// ��
		while (!myQue.isEmpty())
		{
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}

		/*
		��� : �����
		��� : ������
		��� : ������
		��� : ������
		*/
	}
}

// ���� ���
/*

*/