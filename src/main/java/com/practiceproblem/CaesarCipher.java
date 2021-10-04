package com.practiceproblem;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        System.out.println("Enter the key:");
        int key = sc.nextInt();
        String ciphertext = "";
        char text;
        for (int i = 0; i < str.length(); i++) {
            text = str.charAt(i);
            if (text >= 'a' && text <= 'z') {
                text = (char) (text + key);
                if (text > 'z') {
                    text = (char) (text + 'a' - 'z' - 1);
                }
                ciphertext = ciphertext + text;
            } else if (text >= 'A' && text <= 'Z') {
                text = (char) (text + key);
                if (text > 'Z') {
                    text = (char) (text + 'A' - 'Z' - 1);
                }
                ciphertext = ciphertext + text;
            }
        }
        System.out.println("Cipher text:" + ciphertext);
    }
}

