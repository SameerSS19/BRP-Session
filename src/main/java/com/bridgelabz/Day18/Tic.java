package com.bridgelabz.Day18;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tic {
    public static void main(String[] args) {
        char[] board = createBoard();
        char UserLetter = chooseLetter();
        char SecondLetter;
        if (UserLetter == 'X')
        {
            SecondLetter = 'O';
        } else
        {
            SecondLetter = 'X';

        }
        System.out.println("First Second Letter is: " + UserLetter + " Second User Letter is : " + SecondLetter );
        System.out.println("Current Board:");
        showBoard(board);
        int first = toss();
        boolean win=false;
        String result=null;
        while (win==false)
        {
            if (first == 1)
            {
                getUserMove(board, UserLetter);
                first=2;
            }
            else
            {
                getUserMove(board, SecondLetter);
                first=1;
            }
            System.out.println("Current Board:");
            showBoard(board);
            result=iswin(board);
            if(result=="X")
            {
                System.out.println("X is winner");
                win=true;
            }
            else if(result=="O")
            {
                System.out.println("O is winner");
                win=true;
            }
            else if(isdraw(board))
            {
                System.out.println("Game is draw");
                win=true;
            }

        }
    }
    public static boolean isdraw(char[] board)
    {
        int counter=0;
        for(int i=1;i<10;i++)
        {
            if(board[i]!=' ')
            {
                counter=counter+1;
            }
        }
        if(counter==9)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static String iswin(char[] board)
    {
        String temp=null;
        for (int choice = 0; choice < 8; choice++)
        {
            String line=null;

            switch (choice)
            {
                case 0:
                    line = Character.toString(board[1]) + Character.toString(board[2]) + Character.toString(board[3]);
                    break;
                case 1:
                    line = Character.toString(board[4]) + Character.toString(board[5]) + Character.toString(board[6]);
                    break;
                case 2:
                    line =Character.toString(board[7]) + Character.toString(board[8]) + Character.toString(board[9]);
                    break;
                case 3:
                    line = Character.toString(board[1]) + Character.toString(board[4]) + Character.toString(board[7]);
                    break;
                case 4:
                    line = Character.toString(board[2]) + Character.toString(board[5]) + Character.toString(board[8]);
                    break;
                case 5:
                    line = Character.toString(board[3]) + Character.toString(board[6]) + Character.toString(board[9]);
                    break;
                case 6:
                    line = Character.toString(board[1]) + Character.toString(board[5]) + Character.toString(board[9]);
                    break;
                case 7:
                    line = Character.toString(board[3]) + Character.toString(board[5]) + Character.toString(board[7]);
                    break;
            }
            if (line.equals("XXX"))
            {
                temp= "X";
                break;
            }

            else if (line.equals("OOO"))
            {
                temp= "O";
                break;
            }
            else
            {
                temp= "Play";
            }
        }
        return  temp;
    }

    /*
      * its toss method
      * player who can play the first
      * use a random method
     */
    public static int toss()
    {

        Random random=new Random();
        int value = 1+random.nextInt(2-1+1);
        if(value==1)
        {
            System.out.println("First User will play first");
            return value;
        }
        else
        {
            System.out.println("Second User will play first ");
            return value;
        }
    }

    /*
     * method
     * user method
     * valid cell 1-9
     */
    public static void getUserMove(char[] board,char symbol)
    {
        Scanner sc = new Scanner(System.in);
        Integer[] validCells = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean occupied=false;
        while (occupied==false)
        {
            System.out.println("Enter your move (1-9)");
            int index = sc.nextInt();
            if (Arrays.asList(validCells).contains(index) && isSpaceFree(board, index))
            {
                board[index] = symbol;
                occupied=true;
            }
        }

    }
    private static boolean isSpaceFree(char[] board, int index)
    {
        return board[index] == ' ';
    }
    public static char chooseLetter()
    {
        char symbol;
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter your symbol");
        symbol = UserInput.next().toUpperCase().charAt(0);
        return symbol;
    }

    public static void showBoard(char[] board)
    {
        System.out.println("\n" + board[1] + "  |  "  + board[2] + "  |  " + board[3]);
        System.out.println("-------------");
        System.out.println(" " + board[4] + " |  "  + board[5] + "  |  " + board[6]);
        System.out.println("-------------");
        System.out.println(" " + board[7] + " |  "  +board[8] + "  |  " + board[9]);
    }
    public static char[] createBoard()
    {
        char[] board = new char[10];
        for(int index = 1; index < board.length; index++)
        {
            board[index] = ' ';
        }
        return  board;
    }
}
