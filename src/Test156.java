 /*========================================================
   ���� �÷��� �����ӿ�ũ(Collection Framework) ����
==========================================================*/
/*
�� �÷��� �����ӿ�ũ(Collection Framework)	=> �׳� [�÷���]���� ���� �θ�
   = �÷���(Collection) + �����ӿ�ũ(Framework)
     ------------------   -----------------------
			 |			      ȯ��, Ʋ, ���
			 |
	        ���� �� ����ǰ, ����ǰ, (����?�����?��) ����, ����, ����, ����
			        --------------------------------------------------------
					         ��Ƴ��� �͵�... ���ִ� �͵�...
   ==>> �ڷ� ����

�� �ڷ�
   ���� ����κ��� �ܼ��� �����̳� ������ ���� ������
   ����̳� ������ ���� �Ǵ� �� ������ ����

	  ��

�� �ڷᱸ��
   �ڷ� ó���� ���� �ڷ��� ǥ��, ����, ����, ���� ��
   �̿뿡 ���� ��� ���� ������ �����Ͽ� ���α׷��� ����ϰ�
   ��ǻ�Ϳ� ���� ó���Ǵ� �������� ������ �ڷ��� ǥ��, ����, ���� ��
   ó���� ���� �˰������� �ۼ� �� ���ð� �̿� ����� �����ϴ� �о�

      ��

�� �÷��� �����ӿ�ũ(Collection Framework)
   �÷���(��Ƴ��� �����͵�)�� ǥ���� ������ ���� ���ϵ� ��Ű��ó��
   �÷��� �����ӿ�ũ�� �����ϴ� ��Ҵ� ������ ����.

   1. �������̽�(Interface)
      �⺻������ �÷��ǿ� �ʿ��� ������ ���� ����� �����Ѵ�.
	  ���� ���, list �� �߰�, ����, �˻� ���� ����� �����ϴ� 
	  �÷��� �������̽��� �����ϸ�
	  �� �÷��Ǹ��� ������ �������̽��� ���ǵǾ� �ִ�.

   2. ����(Implement)
      �������̽��� ������ Ŭ������ �� �÷�����
	  ���� � �ڷᱸ���� �̿��Ͽ� ǥ���ߴ��Ŀ� ����
	  �÷����� ������ �޶����� �ȴ�.

   3. �˰�����(Algorithms)
      �� �÷��ǵ鸶�� �����ϰ� ����� �� �ִ� �޼ҵ带 �ǹ��Ѵ�.

�� �ڹ� �÷����� �߰��� �÷��� �����ӿ�ũ ��� ���� ���ǵǾ� �����Ƿ�
   �� �÷��� �������� �����Ǵ� �޼ҵ��� �ϰ����� �ֱ� ������
   �� ���� �÷����� �����θ� �ٸ� �÷����� ����ϴµ� �����ϴ�.
*/
/*
�� ���� (Stack)
  
   Stack Ŭ������ ������Ʈ ���Լ���(LIFO: Last Input First Output) ������ Stack �� ��Ÿ����.
   �̴� ����(Vector)�� �������� ó���ϴ� 5���� �޼ҵ��
   ����(Vector) Ŭ������ Ȯ���ϰ� �ȴ�.

   ����� push() �޼ҵ�� pop() �޼ҵ尡 �����Ǵ� �� �ܿ�
   ������ ���� �׸����� peek() �� �ǽ��ϴ� �޼ҵ�,
   ������ ����ִ����� ���θ� Ȯ���ϴ� �޼ҵ� isEmpty(),
   �������� �׸��� ã�Ƽ� ���ηκ��� �� ���������� ã�Ƴ��� �޼ҵ� ���� �����ȴ�.

   ������ ó������ �ۼ��Ǿ��� ��, �׸��� �������� �ʴ´�.

   - boolean empty()
     ������ ����ִ��� Ȯ���Ѵ�.
   - E object peek()
     ������ �� ���� ��ü�� ���ÿ��� �������� �ʰ� ��ȯ�Ѵ�.
   - E object pop()
     ������ �� ���� ��ü�� ��ȯ�ϰ� ���ÿ��� �����Ѵ�.
   - E object push(E item)
     ��ü�� ���� �ڷᱸ���� �����Ѵ�.
   - int search(Object o)
     ������ �� ���������� �Ķ���� ������ �Ѱܹ��� ��ü������ �Ÿ��� ��ȯ�Ѵ�.
	 �� ���� ��ü�� ��� 1�� ��ȯ�ϰ� �� �Ʒ� ��ü�� 2�� ��ȯ�ϴ� ����
*/

// �迭�� ������ ������ ���� �����͸� ó���ϴµ�,
// �÷����� ������ ������ ������ �ʾƵ� �ȴ�.
// �׷��ٰ� �ƹ��ų� �� ������, ó���ϱ� �����

//==> ���׸�, ���׸� ǥ����
//    '��� �� �ȿ� �� �־ ���ž�' ��� ���������� ǥ���� �δ°� 
//  ex) class �÷���Ŭ����<String>
//                        ---------> �̷���
import java.util.Stack;

public class Test156
{
	public static void main(String[] args)
	{
		// Stack �ڷᱸ�� ����
		Stack<Object> myStack = new Stack<Object>();
		//-- Object Ÿ���̶� ����� �� ���� �� ����

		String str1 = "ȫ����";
		String str2 = "�ֹ���";
		String str3 = "�̿���";
		String str4 = "�̽ÿ�";

		// myStack �̶�� Stack �ڷᱸ�� �ȿ� str1 ~ str4 ���� ��Ƴ���
		// add(), push()
		myStack.add(str1);
		myStack.add(str2);
		myStack.push(str3);
		myStack.push(str4);

		// peek() : ���� �� ���� ��ü ��ȯ. �������� �ʴ´�.
		String val1 =  (String)myStack.peek();	
		//                     --------------
		//                      Object ��ȯ��
		// �ٵ� ���� ������ String �̴ϱ� �ٿ�ĳ��������
		System.out.println("val1 : " + val1);
		//--==> val1 : �̽ÿ�

		String val2 = (String)myStack.peek();
		System.out.println("val2 : " + val2);
		//--==> val2 : �̽ÿ�

		System.out.println();

		String value = "";

		// myStack �̶�� �̸��� ���� Stack �ڷᱸ����
		// �����Ͱ� ������� ���� ���¶��... (��, ä���� �ִ� ���¶��...)
		// isEmpty()
		while ( !myStack.isEmpty() )
		{
			// pop() : ���� �� ���� ��ü ��ȯ. �����Ѵ�.
			value = (String)myStack.pop();
			System.out.println("value : " + value);
		}
	}
}

// ���� ���
/*
val1 : �̽ÿ�
val2 : �̽ÿ�

value : �̽ÿ�
value : �̿���
value : �ֹ���
value : ȫ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/