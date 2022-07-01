 /*=======================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
=========================================*/

// StringBuffer Ŭ����
/*
�� StringBuffer Ŭ������
   ���ڿ��� ó���ϴ� Ŭ������ String Ŭ�������� ��������
   String Ŭ������ ���� ���ڿ� �������� ������ �Ұ���������
   StringBuffer Ŭ������ ���ڿ��� ����� ��
   ���� ���ڿ��� ���� �ܰ迡�� ������ �� �ִ�.

   ��, StringBuffer ��ü�� �������� ���̸� �����Ƿ�
   ��ü�� �����ϴ� �������� �̸� �� ũ�⳪ ���� �����ϰų�
   ���� ������ ������ ũ�⸦ �ٲ� �� �ִ� ����� �����Ѵ�.

   ����, JDK 1.5 ���ĺ��ʹ�
   ���ڿ��� ó���ϴ� StringBuilder ��� Ŭ������ �����Ѵ�.
   StringBuilder Ŭ������ ����� StringBuffer Ŭ������ ����������
   ���� ū �������� multi-thread unsafe ��� ���̴�.
   					------------------> (���� �۾��� ���� �������� ����)
   ��, Syncronization �� ���� ������
   StringBuffer ���� ������ ���ü�(����ȭ) ������ ���ٸ�
   StringBuilder �� ����ϴ� ���� ������ ����ų �� �ִ�.

   ����� StringBuffer  �� �� ����
   ������ StringBuilder �� �� ����

   StringBuilder�� StringBuilder ��ü
   StringBuffer �� StringBuffer  ��ü
   String ��       String ��ü
   ==> ��� �� ������ !!
*/

public class Test140
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		// ��==���� ��ü���ϸ� �ּҰ��� ������ ���ϰ� �ȴ�.
		//	new�� ���� �ٸ� �޸� �Ҵ��߱� ������ �ּҰ� ���� �ٸ���. => false
		System.out.println(sb1 == sb2);				// false

		// ��String.equals(s)���� equals()�� overriding �ؼ�
		//	�����Ͱ��� ���ϹǷ� true�� ���԰�����,
		// ��StringBuffer.equals(sb)���� false �� ���°ɷ� ���� overriding ���ߴ�.
		//	���⼭�� ��Object.equals()�� �޼ҵ带 �״�� ����ϰ� �ִ�.
		//	=> �� ��ü�� �ּҰ��� ���Ѵ�.
		System.out.println(sb1.equals(sb2));		// false

		System.out.println(sb1);					// korea

		System.out.println(sb1.toString());			// korea
		// ��Object.toString()�� �� Ŭ������@�ؽ��ڵ� �����µ�, �̰Ŵ� �׷��� ����
		//=> ��StringBuffer.toString()�� �� �װ� overriding �ؼ� String���� ��ȯ����


		// "korea" ��� ���ڿ��� "korea"��� ���ڿ��� ���ϰ� ��
		System.out.println(sb1.toString().equals(sb2.toString()));	// true
		//				   --------------        ----------------
		//						String				 String

		System.out.println("-------------------------------------");

		// StringBuffer�� String�� �޸� buffer�� �ް� �ִ�. 
		StringBuffer sb3 = new StringBuffer();
		//-- StringBuffer �⺻ ������ ȣ��(�ν��Ͻ� ���� ����)
		//   �⺻������ �����Ǵ� ������ ũ��� ��16��
		//   ���� ũ�� Ȯ�� �����ϴ�.

		System.out.println("���� ũ�� : " + sb3.capacity()); 
		//--==> ���� ũ�� : 16

		///////////////////////////////////////////////////////////////

		System.out.println(sb3);	// �ƹ��͵� �ȳ����� ����

		// String ���� ���ڿ� ���� ��
		String name = "ȫ�浿";
		name += "�̼���";
		name += "������";
		System.out.println(name);	// ȫ�浿�̼��Ű�����

		// StringBuffer ���� ���ڿ� ���� �� : ��StringBuffer.append(s);�� 
		sb3.append("seoul");
		sb3.append("korea");
		sb3.append("�츮����");
		sb3.append("���ѹα�");

		System.out.println(sb3);			// seoulkorea�츮������ѹα�

		System.out.println(sb3.toString());	// seoulkorea�츮������ѹα�
		//				  ----
		//			   StringBuffer 
		//				  ----------------
		//					    String 

		System.out.println("���� ũ�� : " + sb3.capacity()); 
		//--==> ���� ũ�� : 34
		// ���빰 �þ�ϱ� ���� ũ�� Ŀ��

		///////////////////////////////////////////////////////////////
		
		String temp1 = "java and oracle";

		// ��String.toUpperCase()�� : �ҹ��� �� �빮�ڷ� ��ȯ
		System.out.println(temp1.toUpperCase());	// JAVA AND ORACLE

		// ��String.toLowerCase()�� : �빮�� �� �ҹ��ڷ� ��ȯ
		System.out.println(temp1.toLowerCase());	// java and oracle

		// StringBuffer�� ������� toUpperCase(), toLowerCase() ���� �Ұ�
		// => String Ŭ�������� ������, StringBuffer Ŭ�������� �ش� �޼ҵ� ���� !
		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.toLowerCase());

		// StringBuffer �� buffer ������ ó�� �޼ҵ���� ����
		// �� �ܿ� �ٸ� �۾����� String�� ����
		// �׷��ٰ� StringBuffer���� �װ� ��� �Ұ�? NO!!
		// ���?
		// sb.toString()   ���� �ؼ� ����ϸ� String type �ȴ�.

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());	
		//--==> SEOULKOREA�츮������ѹα�

		System.out.println(sb3.toString().toUpperCase());	
		//--==> SEOULKOREA�츮������ѹα�

		// sb3 = "seoulkorea�츮������ѹα�";
		// ���� �۾��Ѵٰ� sb3 �ٲ�°� �ƴ� !!
		// ���� sb3�� �״�� �ְ�, sb3.toString() �� ���ڿ���
		// ������ �ٸ� �۾��� ����� ��ȯ���ִ� ����

		
		// �� ��� ���ڿ�(sb3) �� seoul �տ�
		//    "�ѱ�" �̶�� ���ڿ� �߰�
		//	  �� �ѱ�seoulkorea�츮������ѹα�
		//    ��StringBuffer.insert(����index, s)��
		sb3.insert(0, "�ѱ�");
		System.out.println("seoul �տ� ���ѱ��� �߰� : " + sb3.toString());
		//--==> seoul �տ� ���ѱ��� �߰� : �ѱ�seoulkorea�츮������ѹα�


		// �� ��� ���ڿ�(sb3) �� korea ���ڿ� �ڿ�
		//    "���" �̶�� ���ڿ� �߰�
		//	  �� �ѱ�seoulkorea����츮������ѹα�
		//	  ��, ��� ���ڿ��� �ε����� ������ ���� Ȯ������ ����...

		// ���� �� ��
		//sb3.insert(sb3.toString().indexOf("korea") + 5, "���");
		// => sb3.toString() �� �ʿ� ����
		//    StringBuffer���� indexOf() �޼ҵ� ���� !

		//sb3.insert(sb3.indexOf("korea") + 5, "���");
		sb3.insert(sb3.indexOf("korea") + "korea".length(), "���");

		//--(�׳� ���� �� ��)--> �� �� ��� �ǳ�..? ��
		//System.out.println("korea �ڿ� ������� �߰� : " + sb3.toString());
		System.out.println("korea �ڿ� ������� �߰� : " + sb3);
		//--==> korea �ڿ� ������� �߰� : �ѱ�seoulkorea����츮������ѹα�
		
		//--(�׳� ���� �� ��)--> �̰͵� �ǳ�
		// --> ��. StringBuffer Ÿ������ print�Ѱ���
		System.out.printf("%s\n", sb3);


		// �� ��� ���ڿ�(sb3) �� seoul �տ�
		//    ���츮���� ���ڿ� ����
		//    ��StringBuffer.delete(�����ҽ���index, �����Ҹ�����index + 1)��
		//sb3.delete(14, 18);
		//System.out.println(sb3);
		//--==> �ѱ�seoulkorea������ѹα�


		// �� ��� ���ڿ�(sb3) �� seoul �տ�
		//    ���츮���� ���ڿ� ����
		//	  ��, ��� ���ڿ��� �ε����� ������ ���� Ȯ������ ����...
		sb3.delete(sb3.indexOf("�츮����"), (sb3.indexOf("�츮����") + "�츮����".length()));
		System.out.println(sb3);
		//--==> �ѱ�seoulkorea������ѹα�


		// �� ��� ���ڿ�(sb3) ���� 
		//    ��korea�� ���� ���ڿ� ���� (korea ����)
		//sb3.delete(7, 18);
		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3);
		//--==> �ѱ�seoul	

		///////////////////////////////////////////////////////////////
	
		// ���� ũ�� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity()); 
		//--==> ���� ũ�� : 34

		// ���� ũ�� ó���� 16�̾��µ�, ���ڿ� ���̴ٺ��ϱ�
		// �ڱⰡ ȥ�� 34���� �þ���µ�, ���ݵ� ���� ũ�� 34
		// �ڱⰡ ȥ�� �þ��� ������, �پ������ �ʴ´�.

		// ���ڿ�(sb3)�� ���� Ȯ��
		System.out.println("���ڿ��� ���� : " + sb3.length());
		//--==> ���ڿ��� ���� : 7
		// StringBuffer ���� String ó�� length() �޼ҵ� ������


		// ���� ũ�� ����
		// �� ���� ���ڿ��� ��Ƶ� �� �ִ� ������ ũ���...
		// ��StringBuffer.trimToSize()��
		sb3.trimToSize();

		// ���� ũ�� ���� ���� ���� ũ�� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity()); 
		//--==> ���� ũ�� : 7 

		}
}

// ���� ���
/*
false
false
korea
korea
true
-------------------------------------
���� ũ�� : 16

ȫ�浿�̼��Ű�����
seoulkorea�츮������ѹα�
seoulkorea�츮������ѹα�
���� ũ�� : 34
JAVA AND ORACLE
java and oracle
SEOULKOREA�츮������ѹα�
SEOULKOREA�츮������ѹα�
seoul �տ� ���ѱ��� �߰� : �ѱ�seoulkorea�츮������ѹα�
korea �ڿ� ������� �߰� : �ѱ�seoulkorea����츮������ѹα�
�ѱ�seoulkorea����츮������ѹα�
�ѱ�seoulkorea������ѹα�
�ѱ�seoul
���� ũ�� : 34
���ڿ��� ���� : 7
���� ũ�� : 7
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/