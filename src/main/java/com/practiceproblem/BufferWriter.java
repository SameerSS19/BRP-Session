package com.practiceproblem;
import java.io.*;
public class BufferWriter {
    public static void main(String[] args)throws IOException
    {
        FileWriter fw = new FileWriter("file.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fw);
        bufferedWriter.write("Sameer\n");
        bufferedWriter.write("Avi\n");
        bufferedWriter.write("Atul\n");
        bufferedWriter.write("Sairam\n");
        bufferedWriter.write("Tushyal");
        bufferedWriter.close();
    }
}
