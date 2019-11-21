package com.IO;

import org.apache.commons.lang3.time.StopWatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOut {
    public static void main(String[] args) throws IOException {

        FileInputStream reader = null;
        FileOutputStream writer = null;
        StopWatch stopWatch = new StopWatch();

        System.out.println("Start time: ");
        stopWatch.start();
        stopWatch.split();
        System.out.println(stopWatch.getSplitTime());
        try {
            reader = new FileInputStream("W:\\Lex\\Java\\hillelJava\\src\\main\\resources\\wap.txt");
            writer = new FileOutputStream("W:\\Lex\\Java\\hillelJava\\src\\main\\resources\\NewBook.txt");

            int stringRead;
            while ((stringRead = reader.read()) != -1) {
                writer.write(stringRead);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
            writer.close();
        }
        stopWatch.split();
        System.out.println("Work time :" + stopWatch.toSplitString());
    }
}
