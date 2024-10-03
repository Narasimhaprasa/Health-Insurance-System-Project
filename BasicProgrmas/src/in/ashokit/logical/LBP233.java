package in.ashokit.logical;

import java.util.Scanner;

/*swaping of two columns

Implement a program to swap two given columns

input -------> matrix and m and n values
con ---------> no
output ------> modified matrix*/
public class LBP233 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a row size ::");
		int row = sc.nextInt();
		System.out.println("Enter a column size ::");
		int column = sc.nextInt(), i, j, m, n;
		int a[][] = new int[row][column];
		System.out.println("Enter the values ::");
		if ((row >= 1 && row <= 5) && (column >= 1 && column <= 5)) {
			for (i = 0; i < row; i++) {
				for (j = 0; j < column; j++) {
					int value = sc.nextInt();
					a[i][j] = value;
				}
			}
		} else {
			System.out.println("Enter a row and column in between 1 to 5 ");
		}
		System.out.println("Enter a m value ::");
		m = sc.nextInt();
		System.out.println("Enter a n value::");
		n = sc.nextInt();
		swapArrayRow(a, row, column, m, n);
	}

	public static void swapArrayRow(int a[][], int row, int column, int m, int n) {
		int i, j, temp;
		for (i = 0; i < row; i++) {
			temp = a[i][m - 1];
			a[i][m - 1] = a[i][n - 1];
			a[i][n - 1] = temp;
		}

		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
