package com.IO;

import org.apache.commons.lang3.time.StopWatch;

import java.io.*;

public class InputOutBuffered {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = null;
        BufferedWriter writer = null;
        StopWatch stopWatch = new StopWatch();

        System.out.println("Start time: ");
        stopWatch.start();
        stopWatch.split();
        System.out.println(stopWatch.getSplitTime());
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream("W:\\Lex\\Java\\hillelJava\\src\\main\\resources\\3.txt"), "CP1251"));
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("W:\\Lex\\Java\\hillelJava\\src\\main\\resources\\NewBook.txt"), "CP1251"));

            String stringRead = null;
            while ((stringRead = reader.readLine()) != null) {
                writer.write(stringRead);
                writer.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.flush();
            reader.close();
            writer.close();
        }
        stopWatch.split();
        System.out.println("Work time :" + stopWatch.toSplitString());
    }
}
