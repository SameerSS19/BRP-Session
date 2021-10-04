package com.bridgelabz.Day21;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args){
        int i, j,row,column;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row and column:");
        row = sc.nextInt();
        column = sc.nextInt();
        int array[][]=new int[row][column];
        System.out.println("Enter the matrix elements");
        for (i=0;i<row;i++){
            for (j=0;j<column;j++){
                 array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Print Matrix:");
        for (i=0;i<row;i++){
            for (j=0;j<column;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix:");
        for (i=0;i<column;i++){
            for (j=0;j<row;j++){
                System.out.print(array[j][i]+" ");
            }
            System.out.println();
        }
    }
}
