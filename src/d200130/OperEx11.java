package d200130;

public class OperEx11 {
	public static void main(String[] args) {
		int x, y, z;
		boolean t;
		
		/*
		 ���ǻ���
			���������� &&�� false�� �߰��� �ϳ��� ������ �� ������ ���� ������ ���� �ʴ´�.
			���������� ||�� true�� �߰��� �ϳ��� ������ �� ������ ���� ������ ���� �ʴ´�.
		�� ��Ʈ ���� �����̶�� �ϴ� ���� ������ ���� ���ؾ� �ϴ� ���̹Ƿ� ������ ������ �ؾ� �Ѵ�.
		�ݸ�, ���������ڴ� ���ǿ��� true���� false������ �Ǻ��ϴ� �͸��� �����̹Ƿ� �߰��� ������ �����ϸ� ������ �ߴ��ϱ⵵ �Ѵ�.
		*/

		x = y = z = 1;
		t = ((++x != 0) || (++y != 0) || (++z != 0));
		//t = ((2!=0) || ���� �ߴ�)
		//t=true
		System.out.printf("%d, %d, %d, %b\n", x, y, z, t);//2,1,1,true

		x = y = z = 1;
		t = ((++x != 0) | (++y != 0) | (++z != 0));
		// t = ((2!=0) | (2!=0) | (2!=0));
		System.out.printf("%d, %d, %d, %b\n", x, y, z, t);
		//2,2,2,true

		x = y = z = -1;
		t = ((++x != 0) && (++y != 0) && (++z != 0));
		//t = ((0!=0) �� false�̹Ƿ� x���� ���� ���� ������ �ߴܵȴ�
		//t=false
		System.out.printf("%d, %d, %d, %b\n", x, y, z, t);//0,-1,-1,false

		x = y = z = -1;
		t = ((x++ != 0) && (++y != 0) && (++z != 0));
		//t = ((0!=0) && (0!=0)�� false�̹Ƿ� y���� ���� ���� ������ �ߴܵȴ�
		//t=false
		System.out.printf("%d, %d, %d, %b\n", x, y, z, t);//0,0,-1,false
		
		x = y = z = -1;
		t = ((++x != 0) & (++y != 0) & (++z != 0));
		//t = ((0!=0) & (0!=0) & (0!=0)); // false & false & false������ �����Ѵ�
		//t = false
		System.out.printf("%d, %d, %d, %b\n", x, y, z, t);//0,0,0,false
	}
}