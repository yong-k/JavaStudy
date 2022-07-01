 /*========================================================
   ���� �÷��� �����ӿ�ũ(Collection Framework) ����
==========================================================*/
/*
Map �� Hashtable, HashMap
       ---------  --------
	   ����ȭ����  ����ȭ������
	   ==> ���� HashMap �� �� ����

   - java.util.Map �������̽���
     Ű(key)�� ��(value)�� ����(mapping)�ϸ�
	 ������ Ű�� ����� �� ����, �����ؾ� �ϸ�,
	 �� Ű�� �� ���� ������ �����ؾ� �Ѵ�.
	 ��, �ϳ��� Ű ���� �����ϴ� �ϳ��� ���� ���� �ڷᱸ���̴�.
*/ 
/*
�� HashMap<K, V> Ŭ����

   - Hashtable Ŭ������ ���������� Map �������̽����� ��ӹ���
     HashMap Ŭ������ ����� Hashtable �� ����������
	 Synchronization �� ���� ������ ���ü� ������ ���ٸ�
	 (��, ��Ƽ ������ ���α׷��� �ƴ� �����)
	 HashMap �� ����ϴ� ���� ������ ����ų �� �ִ�.

   - ����, HashMap �� Hashtable Ŭ�����ʹ� �޸� null �� ����Ѵ�.
*/

import java.util.HashMap;
import java.util.Map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test173
{
	public static void main(String[] args) throws IOException
	{
		// HashMap �ڷᱸ�� �ν��Ͻ� ����
		//  �� �Ʒ� �� �� ����
		//HashMap<String, String> map = new HashMap<String, String>();
		Map<String, String> map = new HashMap<String, String>();
		//						  -----------------------------
		//							   �ν��Ͻ� ����
		// Map �� ���� �ν��Ͻ� �����Ѱž�? HashMap �� ���� �ν��Ͻ� �����Ѱž�?
		// �� ���������� Map �ڷᱸ���� ��������, ������ ������ �ν��Ͻ��� HashMap 

		// map �̶�� HashMap �ڷᱸ���� ��� �߰�
		// �� put();
		map.put("���", "���¿�Ŭ��");
		map.put("��ȭ", "�����̴���");
		map.put("��ȭ", "������ũ");
		
		// ���� Ȯ��
		System.out.println(map);
		//--==> {���=���¿�Ŭ��, ��ȭ=�����̴���, ��ȭ=������ũ}

		// null �Է� �õ�
		map.put(null, null);
		map.put("�Ҽ�", null);
		System.out.println(map);
		//--==> {null=null, �Ҽ�=null, ���=���¿�Ŭ��, 
		//		 ��ȭ=�����̴���, ��ȭ=������ũ}

		map.put(null, "�����ϴ»��");
		System.out.println(map);
		//--==> {null=�����ϴ»��, �Ҽ�=null, ���=���¿�Ŭ��, 
		//		 ��ȭ=�����̴���, ��ȭ=������ũ}

		//-- ���� ������ �Է� ������ ���� ��� ������ ������ �Է��� ����������
		//   ������ null ��  key �� ���ε� "�����ϴ»��"��
		//   ���� null �� key �� �����ϴ� null �� ����� ��Ȳ�� �߻��ϰ� �ȴ�.
		//   ��, HashMap �� null �� �ϳ��� ������ key �� �����Ѵ�.(�ν��Ѵ�.)

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ī�װ�,Ÿ��Ʋ �Է�(�ĸ� ����) : ");
		String[] temp;

		// ���� ���°� null �� �ƴ� ������ �Է¹���
		// ���� �� �ִ� Ű => ctrl+z
		for (String str; ((str = br.readLine()) != null);)		
		{
			temp = str.split(",");
			if (temp.length < 2)
			{
				System.out.print("ī�װ�,Ÿ��Ʋ �Է�(�ĸ� ����) : ");
				continue;
			}

			map.put(temp[0].trim(), temp[1].trim());
			System.out.println(map);
		}

	}
}

// ���� ���
/*

*/