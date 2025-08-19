import java.util.Scanner;
public class transpose{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Rows & Columns:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int [][] matrix=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter The Elements:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Transpose:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matrix[j][i]+"\t");
			}
			System.out.println();
		}
	}
}
