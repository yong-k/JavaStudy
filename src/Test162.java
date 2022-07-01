 /*========================================================
   ���� �÷��� �����ӿ�ũ(Collection Framework) ����
==========================================================*/

import java.util.Vector;
import java.util.Collections;

public class Test162
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors
		= { "����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	public static void main(String[] args)
	{
		// ���� �ڷᱸ�� ����
		Vector<String> v = new Vector<String>();

		// ���� �ڷᱸ�� v �� colors �迭 �����͸� ��ҷ� �߰�
		for (String color : colors)
			v.add(color);

		System.out.println("ù ��° ��� : " + v.firstElement());
		System.out.println("�� ��° ��� : " + v.get(1));
		System.out.println("������  ��� : " + v.lastElement());
		System.out.println("�����  ���� : " + v.size());
		//--==>
		/*
		ù ��° ��� : ����
		�� ��° ��� : ���
		������  ��� : ����
		�����  ���� : 6
		*/

		// �� ù ��° ��Ҹ� "�Ͼ�"���� ��.��. �� set()
		v.set(0, "�Ͼ�");
		System.out.println("ù ��° ��� : " + v.firstElement());
		System.out.println("�� ��° ��� : " + v.get(1));
		System.out.println("�����  ���� : " + v.size());
		//--==> 
		/*
		ù ��° ��� : �Ͼ�
		�� ��° ��� : ���
		�����  ���� : 6
		*/


		// �� ù ��° ��ҿ� "��Ȳ" ��.��. �� insertElementAt()
		v.insertElementAt("��Ȳ", 0);

		
		// �� ��ü ���
		System.out.print("��ü ��� : ");
		for(String str : v)
			System.out.print(str + " ");
		System.out.println();
		//--==> ��ü ��� : �Ͼ� ��� �ʷ� �Ķ� ���� ����


		// �� �������� ���� (������ ��, �����Ĺ迭)
		Collections.sort(v);

		// �� �������� ���� �� ��ü ���
		System.out.print("�������� ���� �� ��ü ��� : ");
		for(String str : v)
			System.out.print(str + " ");
		System.out.println();
		//--==> �������� ���� �� ��ü ��� : ��� ���� ���� �ʷ� �Ķ� �Ͼ�


		// �� ������ ��Ҹ� �˻�
		// Collections.binarySearch();
		// �˻� ��� ���� ==> �ε����� ��ȯ��
		// *** ��, �������� ������ ����Ǿ� �ִ� �ڷῡ ���ؼ��� ����� �����ϴ�. *** check~!!!
		// �˻� ����� �������� ���� ��� ������ ��ȯ�Ѵ�.

		int idxBlue = Collections.binarySearch(v, "�Ķ�");
		System.out.printf("�Ķ� : %d ��° �ε����� ��ġ�ϰ� �ִ�.\n", idxBlue);
		//--==> �Ķ� : 4 ��° �ε����� ��ġ�ϰ� �ִ�.

		// "��Ȳ �߰� ��, ��� ���� ����
		/*
		48, 49 line ���� "��Ȳ" �߰��ϰ� �Ǹ�, ��³��뵵 �ٲ�
		��ü ��� : ��Ȳ �Ͼ� ��� �ʷ� �Ķ� ���� ����
		�������� ���� �� ��ü ��� : ��� ���� ���� ��Ȳ �ʷ� �Ķ� �Ͼ�
		�Ķ� : 5 ��° �ε����� ��ġ�ϰ� �ִ�.
		*/
		System.out.println();

		int idxNavi = Collections.binarySearch(v, "����");
		System.out.printf("���� : %d ��° �ε����� ��ġ�ϰ� �ִ�.\n", idxNavi);
		//--==> ���� : -1 ��° �ε����� ��ġ�ϰ� �ִ�.
		// -1 �̶�� ���´ٴ� �� �� '�˻� ��� ����' �ǹ�

		System.out.println();

		// �� �������� ���� �� �������� �����ϴ� �޼ҵ� ������ ����
		// �׷� �������� ��� ��?
		// 2��° �Ķ���� ������, Collections �� ������ �ִ� reverseOrder() �޼ҵ� ���
		Collections.sort(v, Collections.reverseOrder());

		// �� �������� ���� �� ��ü ���
		System.out.print("�������� ���� �� ��ü ��� : ");
		for(String str : v)
			System.out.print(str + " ");
		System.out.println();
		//--==> �������� ���� �� ��ü ��� : �Ͼ� �Ķ� �ʷ� ��Ȳ ���� ���� ���

		// �� �������� ���� �� �˻� �׽�Ʈ
		// *** �������� ������ ����Ǿ� �ִ� �ڷῡ ���ؼ��� �˻� �����ϴ�. *** 
		idxBlue = Collections.binarySearch(v, "�Ķ�");
		System.out.printf("�Ķ� : %d ��° �ε����� ��ġ�ϰ� �ִ�.\n", idxBlue);
		//--==> �Ķ� : -8 ��° �ε����� ��ġ�ϰ� �ִ�.
		// ���� ��ȯ �� �˻� ��� ���� !!
		// �Ķ� ���� �� �ȿ� ����? NO
		// �׷� ���� �� �ȿ��� �Ķ� ��ã�°ž�? No . ��� ����

		// Collections.binarySearch() ��
		// 3��° �Ķ���� ������, Collections.reverseOrder() �־��ָ� �˻� ���� !
		idxBlue = Collections.binarySearch(v, "�Ķ�", Collections.reverseOrder());
		System.out.printf("�Ķ� : %d ��° �ε����� ��ġ�ϰ� �ִ�.\n", idxBlue);
		System.out.println();
		//--==> �Ķ� : 1 ��° �ε����� ��ġ�ϰ� �ִ�.
	}
}

// ���� ���
/*

*/