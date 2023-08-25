import java.util.*;
public class serchingOn2dArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no. of rows and column");
        int rows = sc.nextInt();
        int col= sc.nextInt();
        int[][] matrices= new int[rows][col];

        System.out.println("enter the values of matrices");
        for(int i=0;i<rows;i++) {
            for(int j=0;j<col;j++){
                matrices[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the number you want to search on matrices");
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(matrices[i][j]== x){
                    System.out.println("x found at index" + i + " " + j);
                }
            }
        }
    }
}
