/*===========================================
   ���� ���� �帧�� ��Ʈ�� (���) ����
============================================*/

// if ~ else �� �ǽ�

/*
1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
   �б� ������ ���ϱ� ���� ����ϴ� �������
   if��, if~else��, ���ǿ�����, ���� if��(if�� ��ø),

 2. if���� if ������ ������ ���� ���,
    Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.
*/

/*
������ �Է¹޾� Ȧ��/¦�� �Ǻ��ϴ� ���α׷��� �����Ѵ�.
��, ���� if ������ ����Ѵ�.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;
		String result;

		// ���� �� ó��
		System.out.print("���� �ϳ� �Է� : ");
		num = Integer.parseInt(br.readLine());

		if (num % 2 == 0)
			result = "¦��";
		else
			result = "Ȧ��";

/* ���� ���ߴ� ���� if ���� ���
		if (num % 2 == 0)
			result = "¦��";
		
		if (num %2 != 0)
			result = "Ȧ��";
*/

		// ���� ��� ���
		System.out.printf("[[���]] %d �� %s\n", num, result);
	}
}

// ���� ���
/*
���� �ϳ� �Է� : 1
[[���]] 1 �� Ȧ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

���� �ϳ� �Է� : 82
[[���]] 82 �� ¦��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/