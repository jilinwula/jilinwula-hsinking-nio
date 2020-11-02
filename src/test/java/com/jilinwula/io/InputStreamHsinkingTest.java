package com.jilinwula.io;


import org.junit.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InputStreamHsinkingTest {

    private static final String PATH = "/Users/jilinwula/IdeaProjects/jilinwula-linlangmall/jilinwula-hsinking-nio/src/main/resources";

    @Test
    public void inputStream() throws IOException {
        InputStream inputStream = new FileInputStream(PATH + "/txt.txt");
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        String str = new String(bytes);
        System.out.println(str);
    }

    @Test
    public void outputStream() throws IOException {
        OutputStream outputStream = new FileOutputStream(PATH + "/txt2.txt");
        outputStream.write("米带网络科技有限公司".getBytes());
    }

    @Test
    public void writer() throws IOException {
        Writer writer = new FileWriter(PATH + "/txt3.txt", false);
        writer.write("配骑网络科技有限公司");
        writer.close();
    }

    @Test
    public void reader() throws IOException {
        Reader reader = new FileReader(PATH + "/txt3.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuffer stringBuffer = new StringBuffer();
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            stringBuffer.append(str + "\n");
        }
        bufferedReader.close();
        reader.close();
        System.out.println(stringBuffer.toString());
    }

    @Test
    public void test(){
    }

}