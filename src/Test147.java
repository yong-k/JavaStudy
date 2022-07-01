 /*=======================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
=========================================*/

// Math Ŭ����
/*
�� java.lang.Math Ŭ������

   ����(Mathematics)�� ���õ� ������ �Ӽ��� �Լ����� �����ϴ� Ŭ������
   �����ڰ� �ֱ� ������... ��private�� ���� ����Ǿ� �ֱ� ������
   �ܺο��� ��ü(�ν��Ͻ�)�� ������ �� ����.
   ��, ��� �޼ҵ尡 ��static������ ���ǵǾ� �����Ƿ�
   ��ü�� �������� �ʰ� �ٷ� �����Ͽ� ����ϴ� ���� �����ϴ�.

�� java.lang.Math Ŭ������ �ֿ� ��� �� �޼ҵ�

   - public static final double E = 2.71...;
     : �ڿ� �α� ���

   - public static final double PI = 3.141592...;
     : ������(��)

   - public static final double sin(double a)
   - public static final double cos(double a)    
   - public static final double tan(double a)
     : sin(a), cos(a), tan(a) ���� ��ȯ�Ѵ�. (�ﰢ�Լ�)

   - public static final double asin(double a)
   - public static final double acos(double a)    
   - public static final double atan(double a)
     : asin(a), acos(a), atan(a) ���� ��ȯ�Ѵ�. (�ﰢ�Լ��� ���Լ�)

   - public static final double toRadians(double angdeg)
     : ����(angdeg)�� ����(radian)���� �ٲپ� ��ȯ�Ѵ�.
   - public static final double toDegrees(double angrad)
     : ����(angrad)�� ������ �ٲپ� ��ȯ�Ѵ�.

   - public static final double exp(double a)
     : e �� a ������ ���Ͽ� ��ȯ�Ѵ�.

   - public static final double log(double a)
     : �α�(log) ���� ���Ͽ� ��ȯ�Ѵ�.

   - public static final double sqrt(double a)
     : a �� �������� ���Ͽ� ��ȯ�Ѵ�.

   - public static final double ceil(double a)
     : a ���� ũ�ų� ���� ������ ��ȯ�Ѵ�. (�ø��� ����)

   - public static final double floor(double a)
     : a ���� �۰ų� ���� ������ ��ȯ�Ѵ�. (������ ����)

   - public static final double pow(double a, double b)
     : a �� b ������ ���Ͽ� ��ȯ�Ѵ�.

   - public static final int round(float a)
   - public static final long round(double a)
     : a �� �ݿø��Ͽ� ������� ��ȯ�Ѵ�.

   - public static final double random()
     : 0.0 ~ 1.0 ������ ����(������ �Ǽ�)�� �߻����� ��ȯ�Ѵ�.
*/

public class Test147
{
	public static void main(String[] args)
	{
		System.out.println("������ : " + Math.PI);
		System.out.println("2�� ������ : " + Math.sqrt(2));

		System.out.println("���̿� ���� Degree : " + Math.toDegrees(Math.PI));
		System.out.println("2���̿� ���� Degree : " + Math.toDegrees(2.0 * Math.PI));

		// ������ �������� ��ȯ~!!!
		double radian45 = Math.toRadians(45);

		System.out.println("����   45 : " + Math.sin(radian45));
		System.out.println("�ڽ��� 45 : " + Math.cos(radian45));
		System.out.println("ź��Ʈ 45 : " + Math.tan(radian45));

		System.out.println("�α� 25 : " + Math.log(25));

		System.out.println("2�� 4�� : " + Math.pow(2, 4));

		System.out.println("0.0 ~ 1.0 ������ ���� : " + Math.random());
		//-- 0.0 �̳� 1.0 �� ������ ����
		//	 �� ������ ������ ���� ! 
	}
}

// ���� ���
/*
������ : 3.141592653589793
2�� ������ : 1.4142135623730951
���̿� ���� Degree : 180.0
2���̿� ���� Degree : 360.0
����   45 : 0.7071067811865475
�ڽ��� 45 : 0.7071067811865476
ź��Ʈ 45 : 0.9999999999999999
�α� 25 : 3.2188758248682006
2�� 4�� : 16.0
0.0 ~ 1.0 ������ ���� : 0.6544570488132188
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/