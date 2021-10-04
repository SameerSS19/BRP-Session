package com.practiceproblem;
import java.io.*;
public class BufferWriter {
    public static void main(String[] args)throws IOException
    {
        FileWriter fw = new FileWriter("file.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Computer");
        bw.close();
    }
}
