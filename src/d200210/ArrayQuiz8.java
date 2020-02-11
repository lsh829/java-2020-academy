package d200210;

import java.util.Scanner;

public class ArrayQuiz8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;// �� ����(����, ����)�� �� ���� ���ڸ� ä���ִ���
		do {
			System.out.print("Ȧ�� ? ");
			size = sc.nextInt();
		} while ((size & 1) == 0);
		// 1~25������ �� ������ �׸���
		int[][] a = new int[size][size];
		int cnt = 1;

		int row = 0;// ���� ��ǥ
		int col = a.length / 2;// ���� ��ǥ
		// ����
		for (int i = 0; i < size * size; i++) {
			// ���
			a[row][col] = cnt++;

			// ��ǥ �̵�
			if (row - 1 < 0) {
				row = a.length - 1;
			} else {
				row--;
			}
			if (col + 1 >= a.length) {
				col = 0;
			} else {
				col++;
			}

			// ������ ��ǥ�� ���� �ִ��� �Ǵ��ϱ� (���� ������ ���� �� ĭ ������)
			if (a[row][col] > 0) {
				// �� �����ϱ�
				row += 2;
				col--;
			}

			// ��ġ�� ��ȿ���� ���� ������ �����̶�� �����ϱ�
			if (row >= a.length) {
				row = row - a.length;
			}
			if (col < 0) {
				col = size + col;
			}

		}

		// ���
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.printf("%3d\t", a[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}