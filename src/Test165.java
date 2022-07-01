 /*========================================================
   ���� �÷��� �����ӿ�ũ(Collection Framework) ����
==========================================================*/
/*
Test 165 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�.

���� ��)
	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1 ~ 6) : 1

	1��° ��� �Է� : ������				 (�����ڰ� �Է�)
	1��° ��� �Է� ����~!!!
	��� �Է� ����Ͻðڽ��ϱ�? (Y/N) : y	 (��ҹ��� ���� X)

	2��° ��� �Է� : ���̻�				 (�����ڰ� �Է�)
	2��° ��� �Է� ����~!!!
	��� �Է� ����Ͻðڽ��ϱ�? (Y/N) : N

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1 ~ 6) : 2

	[���� ��ü ���]
		������
		���̻�
	���� ��ü ��� �Ϸ�~!!!

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1 ~ 6) : 3

	�˻��� ��� �Է� : ���̻�				 (�����ڰ� �Է�)

	[�˻� ��� ���]
	�׸��� �����մϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1 ~ 6) : 3

	�˻��� ��� �Է� : �Ӽҹ�

	[�˻� ��� ���]
	�׸��� �������� �ʽ��ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1 ~ 6) : 4

	������ ��� �Է� : ȫ����

	[���� ��� ���]
	�׸��� �������� �ʾ� ������ �� �����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1 ~ 6) : 4

	������ ��� �Է� : ������

	[���� ��� ���]
	������ �׸��� �����Ǿ����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1 ~ 6) : 5

	������ ��� �Է� : ��μ�

	[���� ��� ���]
	������ ����� �������� �ʽ��ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1 ~ 6) : 5

	������ ��� �Է� : ���̻�
	������ ���� �Է� : ������

	[���� ��� ���]
	������ �Ϸ�Ǿ����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1 ~ 6) : 2

	[���� ��ü ���]
		������
	���� ��ü ��� �Ϸ�~!!!
	
	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1 ~ 6) : 6
	
	���α׷� ����
	����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Menus	// �� �ϼ�
{
	public static final int E_ADD  = 1;		//-- ��� �߰�
	public static final int E_DISP = 2;		//-- ��� ��� 
	public static final int E_FIND = 3;		//-- ��� �˻�
	public static final int E_DEL  = 4;		//-- ��� ����
	public static final int E_CHA  = 5;		//-- ��� ����
	public static final int E_EXIT = 6;		//-- ����
}

public class Test165
{
	// �ֿ� �Ӽ� ���� �� �ϼ�
	private static final Vector<Object> vt;		//-- �ڷ� ���� �� Ȱ��(�ڷᱸ��)
	private static BufferedReader br;			//-- �Է� ���� �� Ȱ��
	private static Integer sel;					//-- ���� �� ó�� Ȱ��
	private static String con;					//-- ��� ���� ó�� 

	// static �ʱ�ȭ ��
	static
	{
		// Vector �ڷᱸ�� ����
		vt = new Vector<Object>();

		// BufferedReader Ŭ���� �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";
	}

	// �޴� ��� �޼ҵ�
	public static void menuDisp()
	{
		System.out.println("======== [�޴� ����] ========");
		System.out.println("\t1. ��� �߰�");
		System.out.println("\t2. ��� ���");
		System.out.println("\t3. ��� �˻�");
		System.out.println("\t4. ��� ����");
		System.out.println("\t5. ��� ����");
		System.out.println("\t6. ����");
		System.out.println("=============================");
	}

	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException, NumberFormatException
	{
		do
		{
			System.out.print(">> �޴� ����(1 ~ 6) : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel < 1 || sel > 6);
	}

	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException
	{
		if (sel == Menus.E_EXIT)		//-- 6. ����
			exit();
		else if (sel == Menus.E_ADD)	//-- 1. ��� �߰�
			addElement();
		else if (sel == Menus.E_DISP)	//-- 2. ��� ���
			dispElement();
		else if (sel == Menus.E_FIND)	//-- 3. ��� �˻�
			findElement();
		else if (sel == Menus.E_DEL)	//-- 4. ��� ����
			delElement();
		else if (sel == Menus.E_CHA)	//-- 5. ��� ����
			chaElement();
			
	}

	// 1) �ڷᱸ���� ��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{
		while (con.equalsIgnoreCase("y"))
		{
			System.out.printf("\n%d��° ��� �Է� : ", vt.size() + 1);
			vt.add(br.readLine());  
			
			System.out.printf("%d��° ��� �Է� ����~!!!\n", vt.size());

			System.out.print("��� �Է� ����Ͻðڽ��ϱ�?(Y/N) : ");
			con = br.readLine();
		}
		System.out.println();
	}
	
	// 2) �ڷᱸ�� ��ü ��� ��� �޼ҵ�
	public static void dispElement()
	{
		System.out.println("\n[���� ��ü ���]");
		for (Object ob : vt)
			System.out.print("     " + ob + "\n");
		System.out.println("���� ��ü ��� �Ϸ�~!!!\n");
	}

	// 3) �ڷᱸ�� �� ��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{
		int index;

		System.out.print("\n�˻��� ��� �Է� : ");
		index = vt.indexOf(br.readLine());

		System.out.println("\n[�˻� ��� ���]");
		if (index >= 0)
			System.out.println("�׸��� �����մϴ�.\n");
		else
			System.out.println("�׸��� �������� �ʽ��ϴ�.\n");		
	}

	// 4) �ڷᱸ�� �� ��� ���� �޼ҵ�
	public static void delElement() throws IOException
	{
		int index;

		System.out.print("\n������ ��� �Է� : ");
		index = vt.indexOf(br.readLine());

		System.out.println("\n[���� ��� ���]");
		if (index >= 0)
		{
			System.out.printf(vt.get(index) + " �׸��� �����Ǿ����ϴ�.\n\n");
			vt.remove(index);
		}
		else 
			System.out.println("�׸��� �������� �ʾ� ������ �� �����ϴ�.\n");	
	}

	// 5) �ڷᱸ�� �� ��� ���� �޼ҵ�
	public static void chaElement() throws IOException
	{
		int index;

		System.out.print("\n������ ��� �Է� : ");
		index = vt.indexOf(br.readLine());

		if (index >= 0)
		{
			System.out.print("������ ���� �Է� : ");
			vt.set(index, br.readLine());
		}
		
		System.out.println("\n[���� ��� ���]");
		if (index >= 0)
			System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");
		else
			System.out.println("������ ����� �������� �ʽ��ϴ�.\n");
	}

	// 6) ���α׷� ���� �޼ҵ� �� �ϼ�
	public static void exit()
	{
		System.out.println("\n���α׷� ����~!!!");
		System.exit(-1);
	}

	// main() �޼ҵ� �� �ϼ�
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}

// ���� ���
/*

*/