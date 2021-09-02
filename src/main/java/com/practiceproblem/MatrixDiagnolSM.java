package com.practiceproblem;

import java.util.Scanner;

public class MatrixDiagnolSM {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i, j, row, col, sum1 = 0,sum2=0 ,sum3=0;
        System.out.println("Enter the number of rows:");
        row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        col = sc.nextInt();

        int[][] mat = new int[row][col];

        System.out.println("Enter the elements of the matrix");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements of the matrix");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("");
        }

        for (i = 0; i < row; i++){
                    sum1 += mat[i][i];
                    sum2 += mat[i][row-i-1];
                    sum3 = sum1*sum2;
            }

        System.out.println("SUM of DIAGONAL 1 elements of the matrix = " + sum1);
        System.out.println("SUM of DIAGONAL 2 elements of the matrix = " + sum2);
        System.out.println("Multiplication of DIAGONAL elements of the matrix = " + sum3);


    }
}
